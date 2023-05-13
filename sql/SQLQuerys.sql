DROP DATABASE IF EXISTS library;


CREATE DATABASE library;
USE library;

CREATE TABLE Users(
	username VARCHAR(25) NOT NULL PRIMARY KEY,
	password VARCHAR(25) NOT NULL,
	full_name VARCHAR(32) NOT NULL,
	age int NOT NULL,
	role VARCHAR(10) NOT NULL,
);

CREATE TABLE Books(
	id INT PRIMARY key,
	title VARCHAR(45) NOT NULL,
	year INT NOT NULL,
	author VARCHAR(45) NOT NULL,
	category VARCHAR(45) NOT NULL,
	edition VARCHAR(10) NOT NULL,
	language VARCHAR(25) NOT NULL,
	stock INT NOT NULL
);

CREATE TABLE loans(
	idPrestamo INT PRIMARY KEY AUTO_INCREMENT,
	UserId INT,
	BookId INT,
	FOREIGN KEY(UserId) REFERENCES Users(username),
	FOREIGN KEY(BookId) REFERENCES Books(id),
	returned BOOLEAN NOT NULL DEFAULT FALSE
);

CREATE TABLE Devoluciones(
	idDevolucion INT PRIMARY KEY AUTO_INCREMENT,
	idPrestamo INT,
	FOREIGN KEY(idPrestamo) REFERENCES Prestamos(idPrestamo)
);

INSERT INTO Users VALUES('admin', 'admin', 'admin', 0, 'admin');
