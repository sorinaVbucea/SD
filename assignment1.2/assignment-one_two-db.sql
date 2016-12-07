DROP DATABASE IF EXISTS `assignment1.2`;
CREATE DATABASE `assignment1.2` /*!40100 DEFAULT CHARACTER SET utf8 */;

DROP TABLE IF EXISTS `city`;
CREATE TABLE `city` (
  `idCity` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `country` varchar(45) NOT NULL,
  `latitude` varchar(45) NOT NULL,
  `longitude` varchar(45) NOT NULL,
  PRIMARY KEY (`idCity`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `flight`;
CREATE TABLE `flight` (
  `idFlight` int(11) NOT NULL AUTO_INCREMENT,
  `number` int(11) NOT NULL,
  `airplaneType` varchar(45) NOT NULL,
  `departureCity` int(11) NOT NULL,
  `arrivalCity` int(11) NOT NULL,
  `departureDate` datetime NOT NULL,
  `arrivalDate` datetime NOT NULL,
  `UserIdUser` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`idFlight`),
  KEY `fk_Flight_User1_idx` (`UserIdUser`),
  KEY `fk_flight_city1_idx` (`departureCity`),
  KEY `fk_flight_city2_idx` (`arrivalCity`),
  CONSTRAINT `fk_Flight_User1` FOREIGN KEY (`UserIdUser`) REFERENCES `user` (`idUser`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_flight_city1` FOREIGN KEY (`departureCity`) REFERENCES `city` (`idCity`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_flight_city2` FOREIGN KEY (`arrivalCity`) REFERENCES `city` (`idCity`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `user` ;
CREATE TABLE `user` (
  `idUser` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `firstname` varchar(45) NOT NULL,
  `lastname` varchar(45) NOT NULL,
  `role` enum('client','admin') DEFAULT 'client',
  PRIMARY KEY (`idUser`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

INSERT INTO `city` VALUES (1,'Luton','United Kingdom','51.878671','-0.420026'),
							(2,'London','United Kingdom','51.507351','-0.127758'),
                            (3,'Cluj-Napoca','Romania','46.771210','23.623635'),
                            (4,'Timisoara','Romania','45.748872','21.208679'),
                            (5,'Sibiu','Romania','45.798327','24.125583'),
                            (7,'Bologna','Italy','44.494887','11.342616'),
                            (8,'Berlin','Germany','52.520007','13.404954');
                            
INSERT INTO `user` VALUES (1,'sorinaa','sorinaa','Bucea','Sorina','admin'),
							(2,'sorinac','sorinac','Bucea','Valentina','client'),
                            (4,'alex','alex','Birla','Alexandru','client'),
                            (6,'alina.avram','alina.avram.client','Avram','Alina','client');
                            
INSERT INTO `flight` VALUES (1,25,'Wizz Air',4,1,'2016-10-29 14:00:00','2016-10-29 15:00:00',1),
							(2,12,'Wizz Air',5,2,'2016-10-30 15:00:00','2016-10-30 16:00:00',2),
                            (3,14,'Wizz Air',2,1,'2016-12-24 18:00:00','2016-12-24 19:00:00',1),
                            (5,123,'Wizz',3,5,'2016-10-30 15:00:00','2016-10-30 15:30:00',1),
                            (7,7,'Wizz Air',3,7,'2016-11-02 14:00:00','2016-11-02 14:00:00',1),
                            (8,24,'Wizz',5,2,'2016-12-26 15:30:00','2016-12-26 16:30:00',1);



