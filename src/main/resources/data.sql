DROP TABLE IF EXISTS movies;

CREATE TABLE movies (
	movie_id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	title VARCHAR(100),
	image VARCHAR(300),
	year INT,
	video_id VARCHAR(100)
);

INSERT INTO movies VALUES (1, 'System', './img/movies/system.jpg', 1995, '46qKHq7REI4');
INSERT INTO movies VALUES (2, 'Piraci z Krzemowej Doliny', './img/movies/pirates.jpg', 1999, 'lEyrivrjAuU');
INSERT INTO movies VALUES (3, 'Kontrola absolutna', './img/movies/controll.jpg', 2016, '_W_1dmcSthE');
INSERT INTO movies VALUES (4, 'Kod nieśmiertelności', './img/movies/sourcecode.jpg', 2011, 'yG4omp0xO6o');
INSERT INTO movies VALUES (5, 'Ex Machina', './img/movies/exmachina.jpg', 2015, 'OD_vO9-Ztr8');
INSERT INTO movies VALUES (6, 'Hakerzy', './img/movies/hackers.jpg', 1995, 'Rn2cf_wJ4f4');
INSERT INTO movies VALUES (7, 'Tron', './img/movies/tronclassic.jpg', 1992, '3efV2wqEjEY');
INSERT INTO movies VALUES (8, 'Tron: Dziedzictwo', './img/movies/tron.jpg', 2010, 'L9szn1QQfas');
INSERT INTO movies VALUES (9, 'Ja, robot', './img/movies/robot.jpg', 2004, 's0f3JeDVeEo');
