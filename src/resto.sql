CREATE DATABASE IF NOT EXISTS `resto`;
USE `resto`;

DROP TABLE IF EXISTS `mesa`;

CREATE TABLE `mesa` (
  `idMesa` int NOT NULL AUTO_INCREMENT,
  `numero` int NOT NULL UNIQUE,
  `estadoMesa` enum('LIBRE','OCUPADO','PENDIENTE') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'LIBRE',
  `capacidad` int NOT NULL,
  `activo` tinyint NOT NULL,
  PRIMARY KEY (`idMesa`),
  UNIQUE KEY `numero` (`numero`)
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `mesa` VALUES (1,1,'OCUPADO',2,1),(2,2,'LIBRE',2,1),(3,3,'LIBRE',2,1),(4,4,'LIBRE',2,1),(5,5,'LIBRE',2,1),(6,6,'LIBRE',4,1),(7,7,'LIBRE',4,1),(8,8,'LIBRE',4,1),(9,9,'LIBRE',4,1),(10,10,'LIBRE',4,1),(11,11,'LIBRE',4,1),(12,12,'LIBRE',4,1);

DROP TABLE IF EXISTS `pedido`;

CREATE TABLE `pedido` (
  `idPedido` int NOT NULL AUTO_INCREMENT,
  `idMesa` int NOT NULL,
  `idMozo` int NOT NULL,
  `fechaHora` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `cobrada` tinyint NOT NULL,
  `importe` int NOT NULL,
  `estado` enum('ENTREGADO','CANCELADO','PENDIENTE') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT 'PENDIENTE',
  PRIMARY KEY (`idPedido`),
  KEY `idMesa` (`idMesa`),
  KEY `idMozo` (`idMozo`),
  CONSTRAINT `pedido_ibfk_1` FOREIGN KEY (`idMesa`) REFERENCES `mesa` (`idMesa`),
  CONSTRAINT `pedido_ibfk_2` FOREIGN KEY (`idMozo`) REFERENCES `mozo` (`idMozo`)
) ENGINE=InnoDB AUTO_INCREMENT=75 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


DROP TABLE IF EXISTS `pedidoproducto`;

CREATE TABLE `pedidoproducto` (
  `idPedidoProducto` int NOT NULL AUTO_INCREMENT,
  `idPedido` int NOT NULL,
  `idProducto` int NOT NULL,
  `cantidad` int NOT NULL,
  `importe` double NOT NULL,
  `estado` tinyint(1) NOT NULL,
  PRIMARY KEY (`idPedidoProducto`),
  KEY `idPedido` (`idPedido`),
  KEY `idProducto` (`idProducto`)
) ENGINE=InnoDB AUTO_INCREMENT=181 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;



DROP TABLE IF EXISTS `producto`;

CREATE TABLE `producto` (
  `idProducto` int NOT NULL AUTO_INCREMENT,
  `nombreProducto` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `precio` double NOT NULL,
  `stock` int NOT NULL,
  `estadoProducto` tinyint(1) NOT NULL,
  `categoria` enum('COMIDA','BEBIDA','POSTRE') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`idProducto`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `producto` VALUES (1,'Hamburguesa simple',1200,40,1,'COMIDA'),(2,'Hamburguesa completa',2000,30,1,'COMIDA'),(3,'milanesa con pure',2500,136,1,'COMIDA'),(4,'milanesa a caballo',2800,90,1,'COMIDA'),(6,'Taco Mixto',3000,19,1,'COMIDA'),(7,'Papas gratinadas',2000,8,1,'COMIDA'),(8,'agua 500ml',1000,40,1,'BEBIDA'),(9,'coca cola 600ml',1500,95,1,'BEBIDA'),(10,'Heineken 1l',2500,7,1,'BEBIDA'),(11,'Picada',4500,44,1,'COMIDA'),(12,'Helado',1200,36,1,'POSTRE'),(13,'Flan casero',1000,38,1,'POSTRE'),(14,'Ensalada Cesar',1500,40,1,'COMIDA'),(15,'Vino Tinto',2500,40,1,'BEBIDA');

DROP TABLE IF EXISTS `usuario`;

CREATE TABLE `usuario` (
  `idUsuario` int NOT NULL AUTO_INCREMENT,
  `usuario` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `apellido` varchar(50) DEFAULT NULL,
  `edad` int NOT NULL,
  `dni` int NOT NULL UNIQUE,
  `telefono` varchar(50) NOT NULL,
  `fechaNacimiento` DATE DEFAULT NULL,
  `activo` tinyint NOT NULL,
  PRIMARY KEY (`idUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `usuario` VALUES (NULL,'admin','admin','user','pass',30,2222222,'370411111','1978-11-27',1);

DROP TABLE IF EXISTS `mozo`;

CREATE TABLE `mozo` (
  `idMozo` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  `apellido` varchar(50) DEFAULT NULL,
  `edad` int NOT NULL,
  `dni` int NOT NULL UNIQUE,
  `telefono` varchar(50) NOT NULL,
  `fechaNacimiento` DATE DEFAULT NULL,
  `activo` tinyint NOT NULL,
  PRIMARY KEY (`idMozo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

SELECT *
FROM pr
join pedid p
JOIN pedidoproducto pp ON p.idPedido = pp.idPedido
JOIN producto pr ON pp.idProducto = pr.idProducto
WHERE p.idPedido = 81;

SELECT m.* FROM mesa m JOIN pedido p ON m.idMesa = p.idMesa WHERE p.estado = 'ENTREGADO' AND p.cobrada = 0