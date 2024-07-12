CREATE DATABASE cac_proyecto_web;
USE cac_proyecto_web;registrousuarios
CREATE TABLE RegistroUsuarios(
	id INT AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(255) ,
	apellido VARCHAR(255) ,
	email VARCHAR(255) UNIQUE,
	password VARCHAR(255) ,
	fechaNacimiento DATE ,
	pais VARCHAR(255)
);