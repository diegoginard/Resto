-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-11-2023 a las 16:06:34
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `resto`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mesa`
--

CREATE TABLE `mesa` (
  `idMesa` int(11) NOT NULL,
  `numero` int(11) NOT NULL,
  `estadoMesa` enum('LIBRE','OCUPADO','PENDIENTE') NOT NULL DEFAULT 'LIBRE',
  `capacidad` int(11) NOT NULL,
  `activo` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `mesa`
--

INSERT INTO `mesa` (`idMesa`, `numero`, `estadoMesa`, `capacidad`, `activo`) VALUES
(1, 1, 'LIBRE', 2, 1),
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

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `idPedido` int(11) NOT NULL,
  `idMesa` int(11) NOT NULL,
  `nombreMesero` enum('CARLOS','MARTIN','FABIAN','MARIA') NOT NULL,
  `fechaHora` datetime NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `cobrada` tinyint(4) NOT NULL,
  `importe` int(11) NOT NULL,
  `estado` enum('ENTREGADO','CANCELADO','PENDIENTE') DEFAULT 'PENDIENTE'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `pedido`
--

INSERT INTO `pedido` (`idPedido`, `idMesa`, `nombreMesero`, `fechaHora`, `cobrada`, `importe`, `estado`) VALUES
(36, 1, 'CARLOS', '2023-11-02 01:24:40', 1, 8200, 'ENTREGADO'),
(37, 1, 'MARTIN', '2023-11-02 01:25:57', 1, 6300, 'ENTREGADO'),
(38, 2, 'MARTIN', '2023-11-02 01:32:45', 1, 9000, 'ENTREGADO'),
(39, 2, 'FABIAN', '2023-11-02 01:33:27', 1, 4300, 'ENTREGADO'),
(40, 1, 'CARLOS', '2023-11-02 01:47:09', 1, 4500, 'ENTREGADO'),
(41, 1, 'CARLOS', '2023-11-02 01:47:42', 1, 7300, 'ENTREGADO'),
(42, 1, 'CARLOS', '2023-11-02 01:49:27', 1, 3700, 'ENTREGADO'),
(43, 1, 'CARLOS', '2023-11-02 01:49:48', 1, 4000, 'ENTREGADO'),
(44, 1, 'CARLOS', '2023-11-02 02:05:14', 1, 2800, 'ENTREGADO'),
(45, 1, 'CARLOS', '2023-11-02 01:59:16', 1, 6500, 'ENTREGADO'),
(46, 1, 'CARLOS', '2023-11-02 02:00:57', 1, 3000, 'ENTREGADO'),
(47, 1, 'CARLOS', '2023-11-02 02:02:43', 1, 6000, 'ENTREGADO'),
(48, 1, 'CARLOS', '2023-11-02 02:03:43', 1, 2000, 'ENTREGADO'),
(49, 1, 'CARLOS', '2023-11-02 02:04:09', 1, 1000, 'ENTREGADO'),
(50, 1, 'CARLOS', '2023-11-02 02:08:57', 1, 5500, 'ENTREGADO'),
(51, 1, 'MARTIN', '2023-11-02 02:08:13', 1, 5000, 'ENTREGADO'),
(52, 1, 'MARTIN', '2023-11-02 02:09:30', 1, 5600, 'ENTREGADO'),
(53, 1, 'CARLOS', '2023-11-02 02:21:30', 1, 4000, 'ENTREGADO'),
(54, 1, 'CARLOS', '2023-11-02 02:17:16', 1, 6000, 'ENTREGADO'),
(55, 1, 'CARLOS', '2023-11-02 02:22:28', 1, 7200, 'ENTREGADO'),
(56, 1, 'CARLOS', '2023-11-02 02:22:44', 1, 7000, 'ENTREGADO'),
(57, 1, 'CARLOS', '2023-11-02 02:23:10', 1, 5000, 'ENTREGADO'),
(58, 1, 'CARLOS', '2023-11-03 15:44:58', 1, 6000, 'ENTREGADO'),
(59, 1, 'FABIAN', '2023-11-03 15:45:29', 1, 6800, 'ENTREGADO'),
(60, 1, 'CARLOS', '2023-11-03 18:02:25', 1, 5300, 'ENTREGADO'),
(61, 1, 'CARLOS', '2023-11-03 18:14:37', 1, 1000, 'ENTREGADO'),
(62, 2, 'FABIAN', '2023-11-03 18:14:08', 1, 4500, 'ENTREGADO'),
(63, 1, 'CARLOS', '2023-11-03 18:19:40', 1, 8800, 'ENTREGADO'),
(64, 1, 'CARLOS', '2023-11-03 18:19:49', 1, 7000, 'ENTREGADO'),
(65, 1, 'CARLOS', '2023-11-03 18:21:12', 1, 4500, 'ENTREGADO'),
(66, 1, 'CARLOS', '2023-11-03 18:21:21', 1, 8000, 'ENTREGADO');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedidoproducto`
--

CREATE TABLE `pedidoproducto` (
  `idPedidoProducto` int(11) NOT NULL,
  `idPedido` int(11) NOT NULL,
  `idProducto` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `importe` double NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `pedidoproducto`
--

INSERT INTO `pedidoproducto` (`idPedidoProducto`, `idPedido`, `idProducto`, `cantidad`, `importe`, `estado`) VALUES
(90, 36, 1, 1, 1200, 1),
(91, 36, 6, 1, 3000, 1),
(92, 36, 10, 1, 2500, 1),
(93, 36, 9, 1, 1500, 1),
(94, 37, 4, 1, 2800, 1),
(95, 37, 7, 1, 2000, 1),
(96, 37, 9, 1, 1500, 1),
(97, 38, 11, 1, 4500, 1),
(98, 38, 9, 1, 1500, 1),
(99, 38, 6, 1, 3000, 1),
(100, 39, 9, 1, 1500, 1),
(101, 39, 4, 1, 2800, 1),
(102, 40, 7, 1, 2000, 1),
(103, 40, 10, 1, 2500, 1),
(104, 41, 11, 1, 4500, 1),
(105, 41, 4, 1, 2800, 1),
(106, 42, 1, 1, 1200, 1),
(107, 42, 10, 1, 2500, 1),
(108, 43, 7, 1, 2000, 1),
(109, 43, 7, 1, 2000, 1),
(110, 44, 4, 1, 2800, 1),
(111, 45, 2, 1, 2000, 1),
(112, 45, 11, 1, 4500, 1),
(113, 46, 6, 1, 3000, 1),
(114, 47, 6, 1, 3000, 1),
(115, 47, 9, 1, 1500, 1),
(116, 47, 9, 1, 1500, 1),
(117, 48, 7, 1, 2000, 1),
(118, 49, 8, 1, 1000, 1),
(119, 50, 6, 1, 3000, 1),
(120, 50, 10, 1, 2500, 1),
(121, 51, 10, 1, 2500, 1),
(122, 51, 10, 1, 2500, 1),
(123, 52, 4, 1, 2800, 1),
(124, 52, 4, 1, 2800, 1),
(125, 53, 9, 1, 1500, 1),
(126, 53, 3, 1, 2500, 1),
(127, 54, 6, 1, 3000, 1),
(128, 54, 6, 1, 3000, 1),
(129, 55, 1, 1, 1200, 1),
(130, 55, 2, 1, 2000, 1),
(131, 55, 2, 1, 2000, 1),
(132, 55, 7, 1, 2000, 1),
(133, 56, 8, 1, 1000, 1),
(134, 56, 8, 1, 1000, 1),
(135, 56, 3, 1, 2500, 1),
(136, 56, 3, 1, 2500, 1),
(137, 57, 3, 1, 2500, 1),
(138, 57, 3, 1, 2500, 1),
(139, 58, 6, 1, 3000, 1),
(140, 58, 6, 1, 3000, 1),
(141, 59, 7, 1, 2000, 1),
(142, 59, 4, 1, 2800, 1),
(143, 59, 7, 1, 2000, 1),
(144, 60, 4, 1, 2800, 1),
(145, 60, 9, 1, 1500, 1),
(146, 60, 8, 1, 1000, 1),
(147, 61, 8, 1, 1000, 1),
(148, 62, 7, 1, 2000, 1),
(149, 62, 10, 1, 2500, 1),
(150, 63, 6, 1, 3000, 1),
(151, 63, 9, 1, 1500, 1),
(152, 63, 9, 1, 1500, 1),
(153, 63, 4, 1, 2800, 1),
(154, 64, 11, 1, 4500, 1),
(155, 64, 3, 1, 2500, 1),
(156, 65, 7, 1, 2000, 1),
(157, 65, 9, 1, 1500, 1),
(158, 65, 13, 1, 1000, 1),
(159, 66, 7, 1, 2000, 1),
(160, 66, 7, 1, 2000, 1),
(161, 66, 7, 1, 2000, 1),
(162, 66, 7, 1, 2000, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `idProducto` int(11) NOT NULL,
  `nombreProducto` varchar(40) NOT NULL,
  `precio` double NOT NULL,
  `stock` int(11) NOT NULL,
  `estadoProducto` tinyint(1) NOT NULL,
  `categoria` enum('COMIDA','BEBIDA','POSTRE') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idProducto`, `nombreProducto`, `precio`, `stock`, `estadoProducto`, `categoria`) VALUES
(1, 'Hamburguesa simple', 1200, 40, 1, 'COMIDA'),
(2, 'Hamburguesa completa', 2000, 32, 1, 'COMIDA'),
(3, 'milanesa con pure', 2500, 136, 1, 'COMIDA'),
(4, 'milanesa a caballo', 2800, 91, 1, 'COMIDA'),
(6, 'Taco Mixto', 3000, 23, 1, 'COMIDA'),
(7, 'Papas gratinadas', 2000, 10, 1, 'COMIDA'),
(8, 'agua 500ml', 1000, 42, 1, 'BEBIDA'),
(9, 'coca cola 600ml', 1500, 96, 1, 'BEBIDA'),
(10, 'Heineken 1l', 2500, 7, 1, 'BEBIDA'),
(11, 'Picada', 4500, 46, 1, 'COMIDA'),
(12, 'Helado', 1200, 39, 1, 'POSTRE'),
(13, 'Flan casero', 1000, 39, 1, 'POSTRE'),
(14, 'Ensalada Cesar', 1500, 40, 1, 'COMIDA'),
(15, 'Vino Tinto', 2500, 40, 1, 'BEBIDA');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `mesa`
--
ALTER TABLE `mesa`
  ADD PRIMARY KEY (`idMesa`),
  ADD UNIQUE KEY `numero` (`numero`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`idPedido`),
  ADD KEY `idMesa` (`idMesa`);

--
-- Indices de la tabla `pedidoproducto`
--
ALTER TABLE `pedidoproducto`
  ADD PRIMARY KEY (`idPedidoProducto`),
  ADD KEY `idPedido` (`idPedido`),
  ADD KEY `idProducto` (`idProducto`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`idProducto`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `mesa`
--
ALTER TABLE `mesa`
  MODIFY `idMesa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=53;

--
-- AUTO_INCREMENT de la tabla `pedido`
--
ALTER TABLE `pedido`
  MODIFY `idPedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=67;

--
-- AUTO_INCREMENT de la tabla `pedidoproducto`
--
ALTER TABLE `pedidoproducto`
  MODIFY `idPedidoProducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=163;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `idProducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `pedido_ibfk_1` FOREIGN KEY (`idMesa`) REFERENCES `mesa` (`idMesa`);

--
-- Filtros para la tabla `pedidoproducto`
--
ALTER TABLE `pedidoproducto`
  ADD CONSTRAINT `pedidoproducto_ibfk_1` FOREIGN KEY (`idPedido`) REFERENCES `pedido` (`idPedido`),
  ADD CONSTRAINT `pedidoproducto_ibfk_2` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
