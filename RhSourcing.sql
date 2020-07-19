/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

DROP DATABASE IF EXISTS `applirecrutementdb`;
CREATE DATABASE IF NOT EXISTS `applirecrutementdb` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `applirecrutementdb`;

DROP TABLE IF EXISTS `candidats`;
CREATE TABLE IF NOT EXISTS `candidats` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `compte_status` bit(1) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `niveau` int(11) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `pseudo` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*!40000 ALTER TABLE `candidats` DISABLE KEYS */;
/*!40000 ALTER TABLE `candidats` ENABLE KEYS */;

DROP TABLE IF EXISTS `candidat_qcm`;
CREATE TABLE IF NOT EXISTS `candidat_qcm` (
  `user_id` bigint(20) NOT NULL,
  `questionnaire_id` bigint(20) NOT NULL,
  KEY `FKn5hdbs19gxtccck4ho6egaeve` (`questionnaire_id`),
  KEY `FKqbw0bn4rolwmv3wg7wxurqf36` (`user_id`),
  CONSTRAINT `FKn5hdbs19gxtccck4ho6egaeve` FOREIGN KEY (`questionnaire_id`) REFERENCES `questionnaire` (`id`),
  CONSTRAINT `FKqbw0bn4rolwmv3wg7wxurqf36` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*!40000 ALTER TABLE `candidat_qcm` DISABLE KEYS */;
/*!40000 ALTER TABLE `candidat_qcm` ENABLE KEYS */;

DROP TABLE IF EXISTS `questionnaire`;
CREATE TABLE IF NOT EXISTS `questionnaire` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `max_point` int(11) DEFAULT NULL,
  `nom_test` varchar(255) DEFAULT NULL,
  `temps` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*!40000 ALTER TABLE `questionnaire` DISABLE KEYS */;
/*!40000 ALTER TABLE `questionnaire` ENABLE KEYS */;

DROP TABLE IF EXISTS `roles`;
CREATE TABLE IF NOT EXISTS `roles` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_nb4h0p6txrmfc0xbrd1kglp9t` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
INSERT INTO `roles` (`id`, `name`) VALUES
	(1, 'ROLE_ADMIN'),
	(2, 'ROLE_CANDIDAT'),
	(3, 'ROLE_CORRECTEUR');
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `compte_status` bit(1) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `niveau` int(11) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `pseudo` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  `role_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UKr9i2upm423j62a0neosbc8ucq` (`pseudo`),
  KEY `FKp56c1712k691lhsyewcssf40f` (`role_id`),
  CONSTRAINT `FKp56c1712k691lhsyewcssf40f` FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` (`id`, `compte_status`, `email`, `niveau`, `nom`, `password`, `prenom`, `pseudo`, `telephone`, `role_id`) VALUES
	(1, b'1', 'bochkati.omar@gmail.com', 0, 'Admin', '$2a$10$OqbMazx9dO67qaw6L6z/DemIFsQGWHXNAXyOA5mMDGdcmhARg.KGm', 'admin', 'admin', '55313952', 1),
	(2, b'1', 'bochkati.omar@gmail.com', 0, 'Admin', '$2a$10$OqbMazx9dO67qaw6L6z/DemIFsQGWHXNAXyOA5mMDGdcmhARg.KGm', 'admin', 'correcteur', '55313952', 3),
	(3, b'1', 'bochkati.omar@gmail.com', 0, 'Admin', '$2a$10$OqbMazx9dO67qaw6L6z/DemIFsQGWHXNAXyOA5mMDGdcmhARg.KGm', 'admin', 'test', '55313952', 2);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
