-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 31-08-2016 a las 02:37:37
-- Versión del servidor: 5.6.20
-- Versión de PHP: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `loteria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `agencia`
--

CREATE TABLE IF NOT EXISTS `agencia` (
`id_agencia` int(15) NOT NULL,
  `id_banca` int(15) NOT NULL,
  `id_grupo` int(15) NOT NULL,
  `nombre_agencia` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `comision` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `estado` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `limite` int(11) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `agencia`
--

INSERT INTO `agencia` (`id_agencia`, `id_banca`, `id_grupo`, `nombre_agencia`, `comision`, `estado`, `limite`) VALUES
(1, 1, 0, 'Agencia 1', '16', 'Activa', 100);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `banca`
--

CREATE TABLE IF NOT EXISTS `banca` (
`id_banca` int(15) NOT NULL,
  `nombre_de_banca` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `pago` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `monto_minimo` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `monto_maximo` varchar(15) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `banca`
--

INSERT INTO `banca` (`id_banca`, `nombre_de_banca`, `pago`, `monto_minimo`, `monto_maximo`) VALUES
(1, 'Banca 1', '8000', '5', '500');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cierre_de_caja`
--

CREATE TABLE IF NOT EXISTS `cierre_de_caja` (
`id_cierre` int(15) NOT NULL,
  `id_usuario` int(15) NOT NULL,
  `id_agencia` int(11) NOT NULL,
  `total_diario` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `fecha` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `efectivo` double NOT NULL,
  `debito` double NOT NULL,
  `credito` double NOT NULL,
  `diferencia` float NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=7 ;

--
-- Volcado de datos para la tabla `cierre_de_caja`
--

INSERT INTO `cierre_de_caja` (`id_cierre`, `id_usuario`, `id_agencia`, `total_diario`, `fecha`, `efectivo`, `debito`, `credito`, `diferencia`) VALUES
(2, 1, 1, '239.0', '24/07/2016', 65, 37, 137, 0),
(5, 1, 1, '1390.0', '26/04/2016', 450, 500, 400, 40),
(6, 1, 1, '2431.0', '23/04/2016', 800, 900, 731, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_ticket`
--

CREATE TABLE IF NOT EXISTS `detalle_ticket` (
`id_detalle` int(15) NOT NULL,
  `id_loteria` int(15) NOT NULL,
  `id_ticket` int(15) NOT NULL,
  `numero` varchar(15) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `astral` varchar(6) CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci NOT NULL,
  `monto` varchar(15) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf32 COLLATE=utf32_spanish_ci AUTO_INCREMENT=132 ;

--
-- Volcado de datos para la tabla `detalle_ticket`
--

INSERT INTO `detalle_ticket` (`id_detalle`, `id_loteria`, `id_ticket`, `numero`, `astral`, `monto`) VALUES
(1, 1, 5, '123', '', '70'),
(2, 2, 5, '123', '', '70'),
(3, 3, 5, '123', '', '70'),
(4, 4, 5, '123', '', '70'),
(5, 5, 5, '123', '', '70'),
(6, 1, 6, '123', '', '50'),
(7, 2, 6, '123', '', '50'),
(8, 3, 6, '123', '', '50'),
(10, 1, 10, '234', '', '78'),
(11, 2, 10, '234', '', '78'),
(12, 3, 10, '234', '', '78'),
(13, 1, 11, '456', '', '9'),
(14, 2, 11, '456', '', '9'),
(15, 3, 11, '456', '', '9'),
(16, 4, 11, '456', '', '9'),
(17, 5, 11, '456', '', '9'),
(18, 6, 11, '456', '', '9'),
(19, 7, 11, '456', '', '9'),
(20, 8, 11, '456', '', '9'),
(21, 9, 11, '456', '', '9'),
(22, 10, 11, '876', 'ARIES', '9'),
(23, 10, 11, '876', 'TAURO', '9'),
(24, 1, 12, '123', '', '60'),
(25, 2, 12, '123', '', '20'),
(26, 3, 12, '123', '', '20'),
(27, 1, 13, '124', '', '5'),
(28, 2, 13, '124', '', '5'),
(29, 3, 13, '124', '', '5'),
(30, 1, 14, '123', '', '60'),
(31, 2, 14, '123', '', '60'),
(32, 3, 14, '123', '', '60'),
(33, 1, 15, '827', '', '89'),
(34, 2, 15, '827', '', '89'),
(35, 1, 15, '1', '', '89'),
(36, 2, 15, '1', '', '89'),
(37, 1, 15, '30', '', '89'),
(38, 2, 15, '30', '', '89'),
(39, 1, 15, '130', '', '89'),
(40, 2, 15, '130', '', '89'),
(41, 1, 15, '230', '', '89'),
(42, 2, 15, '230', '', '89'),
(43, 1, 15, '330', '', '89'),
(44, 2, 15, '330', '', '89'),
(45, 1, 15, '430', '', '89'),
(46, 2, 15, '430', '', '89'),
(47, 1, 15, '530', '', '89'),
(48, 2, 15, '530', '', '89'),
(49, 1, 15, '630', '', '89'),
(50, 2, 15, '630', '', '89'),
(51, 1, 15, '730', '', '89'),
(52, 2, 15, '730', '', '89'),
(53, 1, 15, '830', '', '89'),
(54, 2, 15, '830', '', '89'),
(55, 1, 15, '930', '', '89'),
(56, 2, 15, '930', '', '89'),
(57, 1, 16, '123', '', '50'),
(58, 2, 16, '123', '', '50'),
(59, 3, 16, '123', '', '50'),
(60, 1, 16, '135', '', '50'),
(61, 2, 16, '135', '', '50'),
(62, 3, 16, '135', '', '50'),
(63, 1, 17, '123', '', '60'),
(64, 2, 17, '123', '', '60'),
(65, 3, 17, '123', '', '60'),
(66, 1, 18, '123', '', '70'),
(67, 2, 18, '123', '', '70'),
(68, 3, 18, '123', '', '70'),
(69, 1, 19, '123', '', '70'),
(70, 2, 19, '123', '', '70'),
(71, 3, 19, '123', '', '70'),
(72, 1, 20, '123', '', '80'),
(73, 2, 20, '123', '', '80'),
(74, 3, 20, '123', '', '80'),
(75, 1, 20, '345', '', '70'),
(76, 2, 20, '345', '', '70'),
(77, 3, 20, '345', '', '70'),
(78, 1, 21, '123', '', '60'),
(79, 2, 21, '123', '', '40'),
(80, 1, 21, '176', '', '80'),
(81, 2, 21, '176', '', '80'),
(82, 3, 21, '176', '', '80'),
(83, 15, 22, '456', '', '45'),
(84, 16, 22, '456', '', '45'),
(85, 15, 23, '567', '', '87'),
(86, 16, 23, '567', '', '87'),
(87, 18, 24, '567', '', '5'),
(88, 18, 25, '678', '', '67'),
(89, 19, 25, '678', '', '67'),
(90, 20, 26, '934', '', '100'),
(91, 1, 27, '234', '', '5'),
(92, 2, 27, '234', '', '5'),
(93, 3, 27, '234', '', '5'),
(94, 1, 27, '876', '', '10'),
(95, 2, 27, '876', '', '10'),
(96, 3, 27, '876', '', '10'),
(97, 1, 27, '834', '', '10'),
(98, 2, 27, '834', '', '10'),
(99, 3, 27, '834', '', '10'),
(100, 1, 27, '89', '', '10'),
(101, 2, 27, '89', '', '10'),
(102, 3, 27, '89', '', '10'),
(103, 1, 27, '189', '', '10'),
(104, 2, 27, '189', '', '10'),
(105, 3, 27, '189', '', '10'),
(106, 1, 27, '289', '', '10'),
(107, 2, 27, '289', '', '10'),
(108, 3, 27, '289', '', '10'),
(109, 1, 27, '389', '', '10'),
(110, 2, 27, '389', '', '10'),
(111, 3, 27, '389', '', '10'),
(112, 1, 27, '489', '', '10'),
(113, 2, 27, '489', '', '10'),
(114, 3, 27, '489', '', '10'),
(115, 1, 27, '589', '', '10'),
(116, 2, 27, '589', '', '10'),
(117, 1, 28, '456', '', '10'),
(118, 2, 28, '456', '', '10'),
(119, 3, 28, '456', '', '10'),
(120, 1, 29, '56', '', '10'),
(121, 2, 29, '56', '', '10'),
(122, 3, 29, '56', '', '10'),
(123, 4, 29, '56', '', '10'),
(124, 5, 29, '56', '', '10'),
(125, 6, 29, '56', '', '10'),
(126, 1, 29, '65', '', '10'),
(127, 2, 29, '65', '', '10'),
(128, 3, 29, '65', '', '10'),
(129, 4, 29, '65', '', '10'),
(130, 5, 29, '65', '', '10'),
(131, 6, 29, '65', '', '10');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `grupo`
--

CREATE TABLE IF NOT EXISTS `grupo` (
`id_grupo` int(15) NOT NULL,
  `id_banca` int(15) NOT NULL,
  `nombre_grupo` varchar(15) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `loteria`
--

CREATE TABLE IF NOT EXISTS `loteria` (
`id_loteria` int(15) NOT NULL,
  `nombre` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `abreviacion` varchar(7) COLLATE utf8_spanish_ci NOT NULL,
  `hora` int(1) NOT NULL,
  `signo` tinyint(1) DEFAULT NULL,
  `activo` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=22 ;

--
-- Volcado de datos para la tabla `loteria`
--

INSERT INTO `loteria` (`id_loteria`, `nombre`, `abreviacion`, `hora`, `signo`, `activo`) VALUES
(1, 'TACHIRA A 12PM', 'TA-A-12', 1, 0, 1),
(2, 'TACHIRA B 12PM', 'TA-B-12', 1, 0, 1),
(3, 'TACHIRA C 12PM', 'TA-C-12', 1, 0, 1),
(4, 'LEON A 12:30PM', 'LE-A-12', 1, 0, 1),
(5, 'LEON B 12:30PM', 'LE-B-12', 1, 0, 1),
(6, 'LEON C 12:30PM', 'LE-C-12', 1, 0, 1),
(7, 'ZULIA A 12:45PM', 'ZU-A-12', 1, 0, 1),
(8, 'ZULIA B 12:45PM', 'ZU-B-12', 1, 0, 1),
(9, 'ZULIA C 12:45PM', 'ZU-C-12', 1, 0, 1),
(10, 'ZULIA ASTRAL 12:45PM', 'ZU-S-12', 1, 1, 1),
(11, 'CHANCE A 1:00PM', 'CH-A-01', 1, 0, 1),
(12, 'CHANCE B 1:00PM', 'CH-B-01', 1, 0, 1),
(13, 'CHANCE C 1:00PM', 'CH-C-01', 1, 0, 1),
(14, 'CHANCE ASTRAL 1:00PM', 'CH-S-01', 1, 1, 1),
(15, 'TACHIRA A 4:00PM', 'TA-A-04', 2, 0, 1),
(16, 'TACHIRA B 4:00PM', 'TA-B-04', 2, 0, 1),
(17, 'TACHIRA C 4:00PM', 'TA-C-04', 2, 0, 1),
(18, 'TACHIRA A 8:00PM', 'TA-A-08', 3, 0, 1),
(19, 'TACHIRA B 8:00PM', 'TA-C-08', 3, 0, 1),
(20, 'TACHIRA C 8:00PM', 'TA-C-08', 3, 0, 1),
(21, 'TACHIRA ASTRAL 8:00PM', 'TA-S-08', 2, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `nro_agotado`
--

CREATE TABLE IF NOT EXISTS `nro_agotado` (
`id_agotado` int(15) NOT NULL,
  `id_banca` int(15) NOT NULL,
  `id_loteria` int(11) NOT NULL,
  `numero` int(6) NOT NULL,
  `monto_max_total` int(6) NOT NULL,
  `monto_consumido` int(6) NOT NULL,
  `monto_max_jugada` int(11) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `nro_agotado`
--

INSERT INTO `nro_agotado` (`id_agotado`, `id_banca`, `id_loteria`, `numero`, `monto_max_total`, `monto_consumido`, `monto_max_jugada`) VALUES
(1, 1, 0, 123, 100, 100, 60);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `perfiles`
--

CREATE TABLE IF NOT EXISTS `perfiles` (
`id_perfiles` int(15) NOT NULL,
  `nombre_perfil` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `estado` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `tipo_acceso` varchar(15) CHARACTER SET utf8 COLLATE utf8_swedish_ci NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `perfiles`
--

INSERT INTO `perfiles` (`id_perfiles`, `nombre_perfil`, `estado`, `tipo_acceso`) VALUES
(1, 'Administrador', 'Activo', 'Total');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `premios`
--

CREATE TABLE IF NOT EXISTS `premios` (
`id_premio` int(15) NOT NULL,
  `id_agencia` int(11) NOT NULL,
  `id_ticket` int(15) NOT NULL,
  `id_resultado` int(15) NOT NULL,
  `fecha` varchar(10) COLLATE utf8_spanish_ci DEFAULT NULL,
  `id_loteria` int(11) NOT NULL,
  `numero` int(15) NOT NULL,
  `estado` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `monto` bigint(20) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `premios`
--

INSERT INTO `premios` (`id_premio`, `id_agencia`, `id_ticket`, `id_resultado`, `fecha`, `id_loteria`, `numero`, `estado`, `monto`) VALUES
(1, 1, 23, 1, '11/08/2016', 16, 567, 'Pagado', 8000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `resultado`
--

CREATE TABLE IF NOT EXISTS `resultado` (
`id_resultado` int(15) NOT NULL,
  `loteria` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `fecha` varchar(10) COLLATE utf8_spanish_ci NOT NULL,
  `signo` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `numero` varchar(15) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `resultado`
--

INSERT INTO `resultado` (`id_resultado`, `loteria`, `fecha`, `signo`, `numero`) VALUES
(1, '16', '11/08/2016', '', '567');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ticket`
--

CREATE TABLE IF NOT EXISTS `ticket` (
`id_ticket` int(15) NOT NULL,
  `numero_ticket` varchar(6) COLLATE utf8_spanish_ci NOT NULL,
  `id_usuario` int(15) NOT NULL,
  `id_agencia` int(15) NOT NULL,
  `clave` varchar(9) COLLATE utf8_spanish_ci NOT NULL,
  `fecha` varchar(10) COLLATE utf8_spanish_ci DEFAULT NULL,
  `hora` varchar(8) COLLATE utf8_spanish_ci NOT NULL,
  `anulado` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `estado` varchar(15) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=30 ;

--
-- Volcado de datos para la tabla `ticket`
--

INSERT INTO `ticket` (`id_ticket`, `numero_ticket`, `id_usuario`, `id_agencia`, `clave`, `fecha`, `hora`, `anulado`, `estado`) VALUES
(1, '0', 1, 1, '23454578', '0000-00-00', '0000-00-', 'SI', 'En Juego'),
(2, '123456', 1, 1, '123456', '0000-00-00', '2014-01-', 'No', 'En Juego'),
(3, '192272', 1, 1, '992769941', '0000-00-00', '0000-00-', 'No', 'En Juego'),
(4, '667775', 1, 1, '487912223', '31/03/2016', '14:42:2', 'No', 'En Juego'),
(5, '867056', 1, 1, '213210438', '31/03/2016', '14:43:23', 'No', 'En Juego'),
(6, '097164', 1, 1, '491640861', '05/04/2016', '08:59:58', 'No', 'En Juego'),
(10, '766624', 1, 1, '406098431', '05/04/2016', '09:18:35', 'No', 'En Juego'),
(11, '678032', 1, 1, '637442383', '05/04/2016', '14:37:4', 'No', 'En Juego'),
(12, '531804', 1, 1, '253539415', '23/04/2016', '11:20:16', 'No', 'En Juego'),
(13, '659132', 1, 1, '628049552', '23/04/2016', '11:31:37', 'No', 'En Juego'),
(14, '731862', 1, 1, '283970551', '23/04/2016', '12:38:59', 'No', 'En Juego'),
(15, '415394', 1, 1, '198710179', '23/04/2016', '13:11:32', 'No', 'En Juego'),
(16, '350725', 1, 1, '365307591', '25/04/2016', '18:30:27', 'No', 'En Juego'),
(17, '230015', 1, 1, '461204878', '26/04/2016', '19:39:14', 'No', 'En Juego'),
(18, '110672', 1, 1, '865335183', '26/04/2016', '19:45:56', 'No', 'En Juego'),
(19, '241947', 1, 1, '853465145', '26/04/2016', '19:48:04', 'No', 'En Juego'),
(20, '860988', 1, 1, '658698829', '26/04/2016', '19:58:30', 'No', 'En Juego'),
(21, '274274', 1, 1, '518127520', '26/04/2016', '19:59:42', 'No', 'En Juego'),
(22, '271029', 1, 1, '718347628', '24/07/2016', '14:34:22', 'Si', 'En Juego'),
(23, '664346', 1, 1, '356503993', '24/07/2016', '14:55:09', 'Si', 'Pagado'),
(24, '760595', 1, 1, '822091936', '24/07/2016', '19:48:41', 'No', 'En Juego'),
(25, '059755', 1, 1, '640285437', '24/07/2016', '19:48:49', 'No', 'En Juego'),
(26, '130461', 1, 1, '345444053', '24/07/2016', '19:49:03', 'No', 'En Juego'),
(27, '964358', 1, 1, '176397433', '11/08/2016', '09:55:23', 'No', 'En Juego'),
(28, '664077', 1, 1, '271467751', '11/08/2016', '09:57:19', 'No', 'En Juego'),
(29, '831690', 1, 1, '919650640', '11/08/2016', '09:57:50', 'No', 'En Juego');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_de_jugada`
--

CREATE TABLE IF NOT EXISTS `tipo_de_jugada` (
`id_tipo_jugada` int(15) NOT NULL,
  `nombre` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `letra` varchar(15) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE IF NOT EXISTS `usuarios` (
`id_usuario` int(15) NOT NULL,
  `id_banca` int(15) NOT NULL,
  `id_agencia` int(15) NOT NULL,
  `id_perfiles` int(15) NOT NULL,
  `nombre_usuario` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `contrasena` varchar(8) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_usuario`, `id_banca`, `id_agencia`, `id_perfiles`, `nombre_usuario`, `contrasena`) VALUES
(2, 1, 1, 1, 'ana', 'ana');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `agencia`
--
ALTER TABLE `agencia`
 ADD PRIMARY KEY (`id_agencia`), ADD KEY `id_banca` (`id_banca`), ADD KEY `id_grupo` (`id_grupo`), ADD KEY `nombre_agencia` (`nombre_agencia`);

--
-- Indices de la tabla `banca`
--
ALTER TABLE `banca`
 ADD PRIMARY KEY (`id_banca`);

--
-- Indices de la tabla `cierre_de_caja`
--
ALTER TABLE `cierre_de_caja`
 ADD PRIMARY KEY (`id_cierre`), ADD UNIQUE KEY `id_usuario` (`id_cierre`,`id_usuario`), ADD KEY `id_cierre` (`id_cierre`);

--
-- Indices de la tabla `detalle_ticket`
--
ALTER TABLE `detalle_ticket`
 ADD PRIMARY KEY (`id_detalle`), ADD UNIQUE KEY `id_loteria` (`id_detalle`,`id_loteria`), ADD KEY `id_ticket` (`id_ticket`);

--
-- Indices de la tabla `grupo`
--
ALTER TABLE `grupo`
 ADD PRIMARY KEY (`id_grupo`), ADD KEY `id_banca` (`id_banca`), ADD KEY `id_banca_2` (`id_banca`);

--
-- Indices de la tabla `loteria`
--
ALTER TABLE `loteria`
 ADD PRIMARY KEY (`id_loteria`);

--
-- Indices de la tabla `nro_agotado`
--
ALTER TABLE `nro_agotado`
 ADD PRIMARY KEY (`id_agotado`), ADD KEY `id_banca` (`id_banca`);

--
-- Indices de la tabla `perfiles`
--
ALTER TABLE `perfiles`
 ADD PRIMARY KEY (`id_perfiles`), ADD KEY `nombre_perfil` (`nombre_perfil`), ADD KEY `estado` (`estado`), ADD KEY `tipo_acceso` (`tipo_acceso`);

--
-- Indices de la tabla `premios`
--
ALTER TABLE `premios`
 ADD PRIMARY KEY (`id_premio`), ADD KEY `id_ticket` (`id_ticket`), ADD KEY `id_resultado` (`id_resultado`);

--
-- Indices de la tabla `resultado`
--
ALTER TABLE `resultado`
 ADD PRIMARY KEY (`id_resultado`);

--
-- Indices de la tabla `ticket`
--
ALTER TABLE `ticket`
 ADD PRIMARY KEY (`id_ticket`), ADD KEY `id_usuario` (`id_usuario`), ADD KEY `id_usuario_2` (`id_usuario`);

--
-- Indices de la tabla `tipo_de_jugada`
--
ALTER TABLE `tipo_de_jugada`
 ADD PRIMARY KEY (`id_tipo_jugada`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
 ADD PRIMARY KEY (`id_usuario`), ADD KEY `id_perfiles` (`id_perfiles`), ADD KEY `id_banca` (`id_banca`), ADD KEY `id_agencia` (`id_agencia`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `agencia`
--
ALTER TABLE `agencia`
MODIFY `id_agencia` int(15) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `banca`
--
ALTER TABLE `banca`
MODIFY `id_banca` int(15) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `cierre_de_caja`
--
ALTER TABLE `cierre_de_caja`
MODIFY `id_cierre` int(15) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de la tabla `detalle_ticket`
--
ALTER TABLE `detalle_ticket`
MODIFY `id_detalle` int(15) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=132;
--
-- AUTO_INCREMENT de la tabla `grupo`
--
ALTER TABLE `grupo`
MODIFY `id_grupo` int(15) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `loteria`
--
ALTER TABLE `loteria`
MODIFY `id_loteria` int(15) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=22;
--
-- AUTO_INCREMENT de la tabla `nro_agotado`
--
ALTER TABLE `nro_agotado`
MODIFY `id_agotado` int(15) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `perfiles`
--
ALTER TABLE `perfiles`
MODIFY `id_perfiles` int(15) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `premios`
--
ALTER TABLE `premios`
MODIFY `id_premio` int(15) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `resultado`
--
ALTER TABLE `resultado`
MODIFY `id_resultado` int(15) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `ticket`
--
ALTER TABLE `ticket`
MODIFY `id_ticket` int(15) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=30;
--
-- AUTO_INCREMENT de la tabla `tipo_de_jugada`
--
ALTER TABLE `tipo_de_jugada`
MODIFY `id_tipo_jugada` int(15) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
MODIFY `id_usuario` int(15) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
