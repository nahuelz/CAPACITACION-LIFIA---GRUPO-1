-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-09-2018 a las 22:10:14
-- Versión del servidor: 10.1.32-MariaDB
-- Versión de PHP: 7.2.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `grupo01`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `address`
--

CREATE TABLE `address` (
  `id` bigint(20) NOT NULL,
  `altitude` int(11) DEFAULT NULL,
  `city` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `country` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `departament` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `state` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `street` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `address`
--

INSERT INTO `address` (`id`, `altitude`, `city`, `country`, `departament`, `state`, `street`) VALUES
(19, 356, 'La Plata', 'Argentina', 'A', 'Buenos Aires', 'Camino Gral Belgrano'),
(17, 4673, 'La Plata', 'Argentina', 'A', 'Buenos Aires', 'Calle 13'),
(11, 146, 'La Plata', 'Argentina', 'A', 'Buenos Aires', 'Plaza Paso'),
(15, 1943, 'La Plata', 'Argentina', 'A', 'Buenos Aires', 'Diagonal 74'),
(21, 123, 'La Plata', 'Argentina', 'A', 'Buenos Aires', 'Calle 12'),
(23, 123, 'La Plata', 'Argentina', 'A', 'Buenos Aires', 'Avenida 7'),
(25, 327, 'Buenos Aires', 'Argentina', 'A', 'Buenos Aires', 'Av. Corrientes'),
(27, 327, 'Buenos Aires', 'Argentina', 'A', 'Buenos Aires', 'Av. Corrientes'),
(29, 327, 'Buenos Aires', 'Argentina', 'A', 'Buenos Aires', 'Av. Corrientes'),
(31, 327, 'Buenos Aires', 'Argentina', 'A', 'Buenos Aires', 'Av. Corrientes');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comment`
--

CREATE TABLE `comment` (
  `id` bigint(20) NOT NULL,
  `date` datetime DEFAULT NULL,
  `text` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `voto` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dish`
--

CREATE TABLE `dish` (
  `id` bigint(20) NOT NULL,
  `description` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `name` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `photo` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `dish`
--

INSERT INTO `dish` (`id`, `description`, `name`, `photo`) VALUES
(36, 'Burrata con tomate, jamÃ³n crudo y mix de verdes', 'Burrata', 'http://zirkel.com.ar/fotos/platos/thumbs/platos_30_burrata.jpg');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(37);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `menu`
--

CREATE TABLE `menu` (
  `id` bigint(20) NOT NULL,
  `description` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `name` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `photo` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `menu`
--

INSERT INTO `menu` (`id`, `description`, `name`, `photo`) VALUES
(34, 'Entre las propuestas de la carta se pueden destacar entradas como la Burrata con tomate , jamÃ³n crudo y mix de verdes. Entre los platos principales es imposible perderse el Cordero braseado con humita y popcorn.', 'Principal', 'https://www.brasseriebridge.be/wp-content/uploads/2017/12/menu.png');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `menu_dish`
--

CREATE TABLE `menu_dish` (
  `Menu_id` bigint(20) NOT NULL,
  `dishes_id` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `menu_dish`
--

INSERT INTO `menu_dish` (`Menu_id`, `dishes_id`) VALUES
(34, 36);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `restaurant`
--

CREATE TABLE `restaurant` (
  `id` bigint(20) NOT NULL,
  `category` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `description` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `name` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `phone` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `address_id` bigint(20) DEFAULT NULL,
  `imagen` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `restaurant`
--

INSERT INTO `restaurant` (`id`, `category`, `description`, `name`, `phone`, `address_id`, `imagen`) VALUES
(18, 'Muy Bueno', 'Parrillada, Argentina, Sudamericana', 'La Terraza Bodegon', ' 54 221 437-3536', 19, 'https://media-cdn.tripadvisor.com/media/photo-s/12/c7/82/27/un-lugar-unico-en-gonnet.jpg'),
(16, 'Muy Bueno', ' Sushi, Japonesa', 'Sushi Club', ' 54 221 427-2020', 17, 'http://sushilaplata.com/images/sushi-club-city-bell.jpg'),
(10, 'Muy Bueno', 'Comida Italiana, Espanola, Argentina', 'Don Quijote', ' 54 221 583-3653', 11, 'https://media-cdn.tripadvisor.com/media/photo-s/0f/50/80/b8/salon-en-planta-alta.jpg'),
(14, 'Muy Bueno', 'Comida Internacional', 'Antica', ' 54 221 4278126', 15, 'http://www.viaresto.com/img/gbj0r0ubk2qasa45zy10wz2c635116643562500228.jpg'),
(20, 'Muy Bueno', 'Argentina Churrasqueria Mediterranea Espanola Fusion', 'El Angel Gris', ' 54 221 437-4512', 21, 'https://media-cdn.tripadvisor.com/media/photo-s/11/47/3b/d9/sentarse-afuera-en-la.jpg'),
(22, 'Muy Bueno', 'Argentina Sudamericana Apto para vegetarianos', 'Atelier', ' 54 221 437-5125', 23, 'http://www.ateliercocinaycava.com.ar/web/wp-content/uploads/photo-gallery/galeria-1.jpg'),
(30, 'Excelente', ' Restaurant And Bar - Club Aleman', 'Zirkel', ' 54 11 4311-3313', 31, 'https://media-cdn.tripadvisor.com/media/photo-s/07/e2/79/68/zirkel.jpg');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `restaurant_comment`
--

CREATE TABLE `restaurant_comment` (
  `Restaurant_id` bigint(20) NOT NULL,
  `comments_id` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `restaurant_menu`
--

CREATE TABLE `restaurant_menu` (
  `Restaurant_id` bigint(20) NOT NULL,
  `menues_id` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `restaurant_menu`
--

INSERT INTO `restaurant_menu` (`Restaurant_id`, `menues_id`) VALUES
(5, 7),
(30, 34);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `state`
--

CREATE TABLE `state` (
  `id` bigint(20) NOT NULL,
  `user_id` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user`
--

CREATE TABLE `user` (
  `user_type` varchar(31) COLLATE utf8_spanish_ci NOT NULL,
  `id` bigint(20) NOT NULL,
  `email` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `gender` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `name` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `password` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `username` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `address_id` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user_restaurant`
--

CREATE TABLE `user_restaurant` (
  `managers_id` bigint(20) NOT NULL,
  `restaurants_id` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user_user`
--

CREATE TABLE `user_user` (
  `User_id` bigint(20) NOT NULL,
  `friends_id` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `address`
--
ALTER TABLE `address`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `comment`
--
ALTER TABLE `comment`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `dish`
--
ALTER TABLE `dish`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `menu`
--
ALTER TABLE `menu`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `menu_dish`
--
ALTER TABLE `menu_dish`
  ADD PRIMARY KEY (`Menu_id`,`dishes_id`),
  ADD KEY `FKnuklo9t3dheui0vbms4fwahms` (`dishes_id`);

--
-- Indices de la tabla `restaurant`
--
ALTER TABLE `restaurant`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKggm3momemeke04br3yroi9dbg` (`address_id`);

--
-- Indices de la tabla `restaurant_comment`
--
ALTER TABLE `restaurant_comment`
  ADD PRIMARY KEY (`Restaurant_id`,`comments_id`),
  ADD UNIQUE KEY `UK_f6x3sukhqe6h49mk7hodviqc6` (`comments_id`);

--
-- Indices de la tabla `restaurant_menu`
--
ALTER TABLE `restaurant_menu`
  ADD PRIMARY KEY (`Restaurant_id`,`menues_id`),
  ADD UNIQUE KEY `UK_q6lr2lh1j3ie684k650mvsik7` (`menues_id`);

--
-- Indices de la tabla `state`
--
ALTER TABLE `state`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKmupwgw7aa7nutnhe7u6mccnx7` (`user_id`);

--
-- Indices de la tabla `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKlq0qkm58rh351bb84y4o5c447` (`address_id`);

--
-- Indices de la tabla `user_restaurant`
--
ALTER TABLE `user_restaurant`
  ADD PRIMARY KEY (`managers_id`,`restaurants_id`),
  ADD KEY `FKs92ljgm6r73d9d0if2xpqobyt` (`restaurants_id`);

--
-- Indices de la tabla `user_user`
--
ALTER TABLE `user_user`
  ADD PRIMARY KEY (`User_id`,`friends_id`),
  ADD KEY `FKkqs1wbvxrhxubyqpj62j9g2o4` (`friends_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
