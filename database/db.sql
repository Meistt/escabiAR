DROP SCHEMA IF EXISTS `proyecto-bebidas`;
CREATE SCHEMA IF NOT EXISTS `proyecto-bebidas`;
USE `proyecto-bebidas`;

insert into bebida(id,capacidad,precio,stock,nombre) values
(1,"750ml",965.00,20,"Fernet Branca"),
(2,"1l",460.16,6,"Oasis Sur Cabernet Sauvignon"),
(3,"1l",300.00,10,"Quilmes"),
(4,"1l",365.00,15,"Budweiser");


select * from bebida;