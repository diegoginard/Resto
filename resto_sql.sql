-- Activa las claves foráneas en SQLite
PRAGMA foreign_keys = ON;

--------------------------------------------------------------------------------
-- 1) Tabla Mozo (se crea primero para que Pedido pueda referenciarla)
--------------------------------------------------------------------------------
DROP TABLE IF EXISTS mozo;
CREATE TABLE mozo (
  idMozo INTEGER PRIMARY KEY AUTOINCREMENT,
  nombre TEXT,
  apellido TEXT,
  edad INTEGER NOT NULL,
  dni INTEGER NOT NULL UNIQUE,
  telefono TEXT NOT NULL,
  fechaNacimiento TEXT,      -- Usamos TEXT para almacenar fechas en SQLite
  activo INTEGER NOT NULL
);

--------------------------------------------------------------------------------
-- 2) Tabla Mesa
--------------------------------------------------------------------------------
DROP TABLE IF EXISTS mesa;
CREATE TABLE mesa (
  idMesa INTEGER PRIMARY KEY AUTOINCREMENT,
  numero INTEGER NOT NULL UNIQUE,
  -- Usamos TEXT con CHECK para simular enum('LIBRE','OCUPADO')
  estadoMesa TEXT NOT NULL CHECK (estadoMesa IN ('LIBRE','OCUPADO')) DEFAULT 'LIBRE',
  capacidad INTEGER NOT NULL,
  activo INTEGER NOT NULL
);

-- Inserciones (puede fallar en SQLite muy antiguo; si da error, usa inserciones individuales)
INSERT INTO mesa (idMesa, numero, estadoMesa, capacidad, activo) VALUES
(1, 1, 'OCUPADO', 2, 1),
(2, 2, 'LIBRE', 2, 1),
(3, 3, 'LIBRE', 2, 1),
(4, 4, 'LIBRE', 2, 1),
(5, 5, 'LIBRE', 2, 1),
(6, 6, 'LIBRE', 4, 1),
(7, 7, 'LIBRE', 4, 1),
(8, 8, 'LIBRE', 4, 1),
(9, 9, 'LIBRE', 4, 1),
(10, 10, 'LIBRE', 4, 1),
(11, 11, 'LIBRE', 4, 1),
(12, 12, 'LIBRE', 4, 1);

--------------------------------------------------------------------------------
-- 3) Tabla Pedido (referencia a mozo e idMesa)
--------------------------------------------------------------------------------
DROP TABLE IF EXISTS pedido;
CREATE TABLE pedido (
  idPedido INTEGER PRIMARY KEY AUTOINCREMENT,
  idMesa INTEGER NOT NULL,
  idMozo INTEGER NOT NULL,
  -- SQLite no soporta ON UPDATE CURRENT_TIMESTAMP directamente
  -- Usamos DEFAULT (datetime('now')) para la creación
  fechaHora TEXT NOT NULL DEFAULT (datetime('now')),
  cobrada INTEGER NOT NULL,
  importe INTEGER NOT NULL,
  estado TEXT CHECK (estado IN ('ENTREGADO','CANCELADO','PENDIENTE')) DEFAULT 'PENDIENTE',
  FOREIGN KEY (idMesa) REFERENCES mesa(idMesa),
  FOREIGN KEY (idMozo) REFERENCES mozo(idMozo)
);

--------------------------------------------------------------------------------
-- 4) Tabla PedidoProducto
--------------------------------------------------------------------------------
DROP TABLE IF EXISTS pedidoproducto;
CREATE TABLE pedidoproducto (
  idPedidoProducto INTEGER PRIMARY KEY AUTOINCREMENT,
  idPedido INTEGER NOT NULL,
  idProducto INTEGER NOT NULL,
  cantidad INTEGER NOT NULL,
  importe REAL NOT NULL,
  estado INTEGER NOT NULL,
  FOREIGN KEY (idPedido) REFERENCES pedido(idPedido),
  FOREIGN KEY (idProducto) REFERENCES producto(idProducto)
);

--------------------------------------------------------------------------------
-- 5) Tabla Producto
--------------------------------------------------------------------------------
DROP TABLE IF EXISTS producto;
CREATE TABLE producto (
  idProducto INTEGER PRIMARY KEY AUTOINCREMENT,
  nombreProducto TEXT NOT NULL,
  precio REAL NOT NULL,
  stock INTEGER NOT NULL,
  -- Simulamos enum('COMIDA','BEBIDA','POSTRE')
  categoria TEXT NOT NULL CHECK (categoria IN ('COMIDA','BEBIDA','POSTRE'))
);

-- Ajustamos las inserciones para 5 columnas
-- (quitamos el valor '1' intermedio que existía en MySQL y no coincide con la definición)
INSERT INTO producto (idProducto, nombreProducto, precio, stock, categoria) VALUES
(1, 'Hamburguesa simple', 1200, 40, 'COMIDA'),
(2, 'Hamburguesa completa', 2000, 30, 'COMIDA'),
(3, 'milanesa con pure', 2500, 136, 'COMIDA'),
(4, 'milanesa a caballo', 2800, 90, 'COMIDA'),
(6, 'Taco Mixto', 3000, 19, 'COMIDA'),
(7, 'Papas gratinadas', 2000, 8, 'COMIDA'),
(8, 'agua 500ml', 1000, 40, 'BEBIDA'),
(9, 'coca cola 600ml', 1500, 95, 'BEBIDA'),
(10, 'Heineken 1l', 2500, 7, 'BEBIDA'),
(11, 'Picada', 4500, 44, 'COMIDA'),
(12, 'Helado', 1200, 36, 'POSTRE'),
(13, 'Flan casero', 1000, 38, 'POSTRE'),
(14, 'Ensalada Cesar', 1500, 40, 'COMIDA'),
(15, 'Vino Tinto', 2500, 40, 'BEBIDA');

--------------------------------------------------------------------------------
-- 6) Tabla Usuario
--------------------------------------------------------------------------------
DROP TABLE IF EXISTS usuario;
CREATE TABLE usuario (
  idUsuario INTEGER PRIMARY KEY AUTOINCREMENT,
  usuario TEXT,
  password TEXT,
  nombre TEXT,
  apellido TEXT,
  edad INTEGER NOT NULL,
  dni INTEGER NOT NULL UNIQUE,
  telefono TEXT NOT NULL,
  fechaNacimiento TEXT,
  activo INTEGER NOT NULL
);

-- Insert (omitimos 'NULL' en idUsuario para que se asigne AUTOINCREMENT)
INSERT INTO usuario (usuario, password, nombre, apellido, edad, dni, telefono, fechaNacimiento, activo) VALUES
('admin', 'admin', 'user', 'pass', 30, 2222222, '370411111', '1978-11-27', 1);
