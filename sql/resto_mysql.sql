CREATE DATABASE  IF NOT EXISTS `resto` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `resto`;
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: resto
-- ------------------------------------------------------
-- Server version	8.4.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `mesa`
--

DROP TABLE IF EXISTS `mesa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mesa` (
  `idMesa` int NOT NULL AUTO_INCREMENT,
  `numero` int NOT NULL,
  `estadoMesa` enum('LIBRE','OCUPADO','PENDIENTE') COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'LIBRE',
  `capacidad` int NOT NULL,
  `activo` tinyint NOT NULL,
  PRIMARY KEY (`idMesa`),
  UNIQUE KEY `numero` (`numero`)
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mesa`
--

LOCK TABLES `mesa` WRITE;
/*!40000 ALTER TABLE `mesa` DISABLE KEYS */;
INSERT INTO `mesa` VALUES (1,1,'LIBRE',2,1),(2,2,'LIBRE',2,1),(3,3,'OCUPADO',2,1),(4,4,'LIBRE',2,1),(5,5,'LIBRE',2,1),(6,6,'LIBRE',4,1),(7,7,'LIBRE',4,1),(8,8,'LIBRE',4,1),(9,9,'LIBRE',4,1),(10,10,'LIBRE',4,1),(11,11,'LIBRE',4,1),(12,12,'LIBRE',4,1);
/*!40000 ALTER TABLE `mesa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedido`
--

DROP TABLE IF EXISTS `pedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pedido` (
  `idPedido` int NOT NULL AUTO_INCREMENT,
  `idMesa` int NOT NULL,
  `nombreMesero` enum('CARLOS','MARTIN','FABIAN','MARIA') COLLATE utf8mb4_general_ci NOT NULL,
  `fechaHora` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `cobrada` tinyint NOT NULL,
  `importe` int NOT NULL,
  `estado` enum('ENTREGADO','CANCELADO','PENDIENTE') COLLATE utf8mb4_general_ci DEFAULT 'PENDIENTE',
  PRIMARY KEY (`idPedido`),
  KEY `idMesa` (`idMesa`),
  CONSTRAINT `pedido_ibfk_1` FOREIGN KEY (`idMesa`) REFERENCES `mesa` (`idMesa`)
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedido`
--

LOCK TABLES `pedido` WRITE;
/*!40000 ALTER TABLE `pedido` DISABLE KEYS */;
INSERT INTO `pedido` VALUES (36,1,'CARLOS','2023-11-02 01:24:40',1,8200,'ENTREGADO'),(37,1,'MARTIN','2023-11-02 01:25:57',1,6300,'ENTREGADO'),(38,2,'MARTIN','2023-11-02 01:32:45',1,9000,'ENTREGADO'),(39,2,'FABIAN','2023-11-02 01:33:27',1,4300,'ENTREGADO'),(40,1,'CARLOS','2023-11-02 01:47:09',1,4500,'ENTREGADO'),(41,1,'CARLOS','2023-11-02 01:47:42',1,7300,'ENTREGADO'),(42,1,'CARLOS','2023-11-02 01:49:27',1,3700,'ENTREGADO'),(43,1,'CARLOS','2023-11-02 01:49:48',1,4000,'ENTREGADO'),(44,1,'CARLOS','2023-11-02 02:05:14',1,2800,'ENTREGADO'),(45,1,'CARLOS','2023-11-02 01:59:16',1,6500,'ENTREGADO'),(46,1,'CARLOS','2023-11-02 02:00:57',1,3000,'ENTREGADO'),(47,1,'CARLOS','2023-11-02 02:02:43',1,6000,'ENTREGADO'),(48,1,'CARLOS','2023-11-02 02:03:43',1,2000,'ENTREGADO'),(49,1,'CARLOS','2023-11-02 02:04:09',1,1000,'ENTREGADO'),(50,1,'CARLOS','2023-11-02 02:08:57',1,5500,'ENTREGADO'),(51,1,'MARTIN','2023-11-02 02:08:13',1,5000,'ENTREGADO'),(52,1,'MARTIN','2023-11-02 02:09:30',1,5600,'ENTREGADO'),(53,1,'CARLOS','2023-11-02 02:21:30',1,4000,'ENTREGADO'),(54,1,'CARLOS','2023-11-02 02:17:16',1,6000,'ENTREGADO'),(55,1,'CARLOS','2023-11-02 02:22:28',1,7200,'ENTREGADO'),(56,1,'CARLOS','2023-11-02 02:22:44',1,7000,'ENTREGADO'),(57,1,'CARLOS','2023-11-02 02:23:10',1,5000,'ENTREGADO'),(58,1,'CARLOS','2023-11-03 15:44:58',1,6000,'ENTREGADO'),(59,1,'FABIAN','2023-11-03 15:45:29',1,6800,'ENTREGADO'),(60,1,'CARLOS','2023-11-03 18:02:25',1,5300,'ENTREGADO'),(61,1,'CARLOS','2023-11-03 18:14:37',1,1000,'ENTREGADO'),(62,2,'FABIAN','2023-11-03 18:14:08',1,4500,'ENTREGADO'),(63,1,'CARLOS','2023-11-03 18:19:40',1,8800,'ENTREGADO'),(64,1,'CARLOS','2023-11-03 18:19:49',1,7000,'ENTREGADO'),(65,1,'CARLOS','2023-11-03 18:21:12',1,4500,'ENTREGADO'),(66,1,'CARLOS','2023-11-03 18:21:21',1,8000,'ENTREGADO'),(67,4,'MARTIN','2024-10-11 18:34:36',1,6500,'ENTREGADO'),(68,3,'MARIA','2024-10-11 18:34:55',0,9400,'PENDIENTE');
/*!40000 ALTER TABLE `pedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedidoproducto`
--

DROP TABLE IF EXISTS `pedidoproducto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
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
) ENGINE=InnoDB AUTO_INCREMENT=172 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedidoproducto`
--

LOCK TABLES `pedidoproducto` WRITE;
/*!40000 ALTER TABLE `pedidoproducto` DISABLE KEYS */;
INSERT INTO `pedidoproducto` VALUES (90,36,1,1,1200,1),(91,36,6,1,3000,1),(92,36,10,1,2500,1),(93,36,9,1,1500,1),(94,37,4,1,2800,1),(95,37,7,1,2000,1),(96,37,9,1,1500,1),(97,38,11,1,4500,1),(98,38,9,1,1500,1),(99,38,6,1,3000,1),(100,39,9,1,1500,1),(101,39,4,1,2800,1),(102,40,7,1,2000,1),(103,40,10,1,2500,1),(104,41,11,1,4500,1),(105,41,4,1,2800,1),(106,42,1,1,1200,1),(107,42,10,1,2500,1),(108,43,7,1,2000,1),(109,43,7,1,2000,1),(110,44,4,1,2800,1),(111,45,2,1,2000,1),(112,45,11,1,4500,1),(113,46,6,1,3000,1),(114,47,6,1,3000,1),(115,47,9,1,1500,1),(116,47,9,1,1500,1),(117,48,7,1,2000,1),(118,49,8,1,1000,1),(119,50,6,1,3000,1),(120,50,10,1,2500,1),(121,51,10,1,2500,1),(122,51,10,1,2500,1),(123,52,4,1,2800,1),(124,52,4,1,2800,1),(125,53,9,1,1500,1),(126,53,3,1,2500,1),(127,54,6,1,3000,1),(128,54,6,1,3000,1),(129,55,1,1,1200,1),(130,55,2,1,2000,1),(131,55,2,1,2000,1),(132,55,7,1,2000,1),(133,56,8,1,1000,1),(134,56,8,1,1000,1),(135,56,3,1,2500,1),(136,56,3,1,2500,1),(137,57,3,1,2500,1),(138,57,3,1,2500,1),(139,58,6,1,3000,1),(140,58,6,1,3000,1),(141,59,7,1,2000,1),(142,59,4,1,2800,1),(143,59,7,1,2000,1),(144,60,4,1,2800,1),(145,60,9,1,1500,1),(146,60,8,1,1000,1),(147,61,8,1,1000,1),(148,62,7,1,2000,1),(149,62,10,1,2500,1),(150,63,6,1,3000,1),(151,63,9,1,1500,1),(152,63,9,1,1500,1),(153,63,4,1,2800,1),(154,64,11,1,4500,1),(155,64,3,1,2500,1),(156,65,7,1,2000,1),(157,65,9,1,1500,1),(158,65,13,1,1000,1),(159,66,7,1,2000,1),(160,66,7,1,2000,1),(161,66,7,1,2000,1),(162,66,7,1,2000,1),(163,67,2,1,2000,1),(164,67,2,1,2000,1),(165,67,9,1,1500,1),(166,67,13,1,1000,1),(167,68,6,1,3000,1),(168,68,12,1,1200,1),(169,68,12,1,1200,1),(170,68,7,1,2000,1),(171,68,7,1,2000,1);
/*!40000 ALTER TABLE `pedidoproducto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producto` (
  `idProducto` int NOT NULL AUTO_INCREMENT,
  `nombreProducto` varchar(40) COLLATE utf8mb4_general_ci NOT NULL,
  `precio` double NOT NULL,
  `stock` int NOT NULL,
  `estadoProducto` tinyint(1) NOT NULL,
  `categoria` enum('COMIDA','BEBIDA','POSTRE') COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`idProducto`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` VALUES (1,'Hamburguesa simple',1200,40,1,'COMIDA'),(2,'Hamburguesa completa',2000,30,1,'COMIDA'),(3,'milanesa con pure',2500,136,1,'COMIDA'),(4,'milanesa a caballo',2800,91,1,'COMIDA'),(6,'Taco Mixto',3000,22,1,'COMIDA'),(7,'Papas gratinadas',2000,8,1,'COMIDA'),(8,'agua 500ml',1000,42,1,'BEBIDA'),(9,'coca cola 600ml',1500,95,1,'BEBIDA'),(10,'Heineken 1l',2500,7,1,'BEBIDA'),(11,'Picada',4500,46,1,'COMIDA'),(12,'Helado',1200,37,1,'POSTRE'),(13,'Flan casero',1000,38,1,'POSTRE'),(14,'Ensalada Cesar',1500,40,1,'COMIDA'),(15,'Vino Tinto',2500,40,1,'BEBIDA');
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-10-11 18:47:13
