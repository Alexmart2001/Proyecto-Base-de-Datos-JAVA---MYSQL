CREATE DATABASE bar_domicilio_db;
Use bar_domicilio_db;

-- ROBER MARTINEZ - MICHAEL BETANCOURT - KAREN NARANJO ---------------- PROYECTO FINAL DESARROLLO BASES DE DATOS

-- ------------------ INICIAMOS CON LA CREACION DE TABLAS POR GRADO DE DEPENDENCIA ---------------------

-- GRADO DE DEPENDENCIA CERO

CREATE TABLE sucursal(
id_sucursal INT (7) NOT NULL,
nombre_sucursal VARCHAR (60) NOT NULL,
seguridad_sucursal INT(10) NOT NULL,
atencion_presencial_sucursal VARCHAR(60) NOT NULL,
tiempo_espera_consultas_sucursal TIME NOT NULL,
reporte_tiempo_espera_sucursal TIME,
soporte VARCHAR(60) NOT NULL,
CONSTRAINT pk_sucursal PRIMARY KEY (id_sucursal)
);

CREATE TABLE tipo_servicios(
id_servicios INT (7) NOT NULL,
nombre VARCHAR(45) NOT NULL, 
descripcion VARCHAR (45) NOT NULL,
CONSTRAINT pk_tipo_servicios PRIMARY KEY(id_servicios)
);

CREATE TABLE cliente (
id_cliente INT(10) NOT NULL,
nombre_cliente VARCHAR (60) NOT NULL,
telefono_cliente INT (12) NOT NULL,
direccion_cliente VARCHAR (60) NOT NULL,
correo_electronico_cliente VARCHAR (60) NOT NULL,
medio_pago_cliente VARCHAR (45)NOT NULL,
historial_crediticio_cliente VARCHAR (200)NOT NULL,
UNIQUE INDEX telefono_cliente_UNIQUE (telefono_cliente),
CONSTRAINT pk_cliente PRIMARY KEY (id_cliente)
);

CREATE TABLE distribuidor(
id_distribuidor INT (7) NOT NULL,
nombre_distribuidor VARCHAR (80) NOT NULL,
apellido_distribuidor VARCHAR (60) NOT NULL,
reputacion_distribuidor VARCHAR (45) NOT NULL,
telefono_distribuidor INT (12) NOT NULL, 
UNIQUE INDEX telefono_distribuidor_UNIQUE (telefono_distribuidor),
CONSTRAINT pk_distribuidor PRIMARY KEY (id_distribuidor)
);
--                INICIO CON EL PROCESO DE CRACION DE TABLAS CON GRADO DE DEPENDENCIA 1 --

CREATE TABLE producto(
sucursal INT (7) NOT NULL,
cod_producto INT(7) NOT NULL,
calidad_producto VARCHAR (10) NOT NULL, 
precio_producto DECIMAL (9,3) NOT NULL,
fecha_caducidad DATE NOT NULL,
aniejamiento_del_producto DATE,
cantidad_producto INT (10) NOT NULL,
tipo VARCHAR (60),
comida VARCHAR (60) NOT NULL,
orquesta VARCHAR (45) NOT NULL,
CONSTRAINT pk_producto PRIMARY KEY (cod_producto),
CONSTRAINT fk_producto_sucursal FOREIGN KEY (sucursal) REFERENCES sucursal (id_sucursal) ON UPDATE CASCADE ON DELETE RESTRICT
);

CREATE TABLE registro_ventas (
cliente INT(10) NOT NULL,
id_ventas INT (7) NOT NULL, 
hora_ventas TIME NOT NULL,
fecha_venta DATE NOT NULL,
costo DOUBLE (9,3) NOT NULL,
CONSTRAINT pk_registro_ventas PRIMARY KEY (id_ventas),
CONSTRAINT fk_registro_ventas_cliente FOREIGN KEY (cliente) REFERENCES cliente (id_cliente) ON UPDATE CASCADE ON DELETE RESTRICT
);

CREATE TABLE registro_servicios(
id_respaldo INT (10) NOT NULL,
nombre VARCHAR (45) NOT NULL,
fecha DATE NOT NULL,
descripcion VARCHAR (100)NOT NULL,
sucursal INT (7) NOT NULL,
tipo_servicios INT (7) NOT NULL,
seguro_contra_riesgos INT (10) NOT NULL, 
CONSTRAINT pk_registro_servicios PRIMARY KEY (id_respaldo),
CONSTRAINT fk_registro_servicios_sucursal FOREIGN KEY (sucursal) REFERENCES sucursal(id_sucursal) ON UPDATE CASCADE ON DELETE RESTRICT,
CONSTRAINT fk_registro_servicios_tipo_servicios FOREIGN KEY (tipo_servicios) REFERENCES tipo_servicios (id_servicios) ON UPDATE CASCADE ON DELETE RESTRICT
);

CREATE TABLE empleado (
id_empleado INT(7)NOT NULL,
nombre_empleado VARCHAR (60) NOT NULL,
profesion_empleado VARCHAR (60) NOT NULL,
telefono_empleado INT (12) NOT NULL,
correo_empleado VARCHAR (80) NOT NULL,
salario_empleado DECIMAL (9,3)NOT NULL,
cargo VARCHAR (45)NOT NULL,
sucursal INT (7) NOT NULL,
UNIQUE INDEX telefono_empleado_UNIQUE (telefono_empleado),
CONSTRAINT pk_empleado PRIMARY KEY (id_empleado),
CONSTRAINT fk_empleado_sucursal FOREIGN KEY (sucursal) REFERENCES sucursal(id_sucursal)ON UPDATE CASCADE ON DELETE RESTRICT
);

-- ------------------------ INICIAMOS CON LA CREACION DE LAS TABLAS CON GRADO DE DEPENDENCIA 2 ------------

CREATE TABLE distribuye (
distribuidor INT (7) NOT NULL,
producto INT (7) NOT NULL,
horario_atencion DATETIME,
ventas_fecha_venta DATE NOT NULL, 
hora_compra TIME NOT NULL,
fecha_compra DATE NOT NULL,
cantidad_comprada INT(10) NOT NULL,
INDEX fk_producto_distribuidor_idx (distribuidor),
INDEX fk_distribuidor_producto_idx (producto),
CONSTRAINT pk_distribuye PRIMARY KEY (producto,distribuidor),
CONSTRAINT fk_producto_distribuidor FOREIGN KEY (distribuidor) REFERENCES distribuidor (id_distribuidor) ON UPDATE CASCADE ON DELETE RESTRICT,
CONSTRAINT fk_distribuidor_producto FOREIGN KEY (producto) REFERENCES producto (cod_producto) ON UPDATE CASCADE ON DELETE RESTRICT
);
CREATE TABLE productos_facturados(
producto INT (7)NOT NULL,
registro_ventas INT(7) NOT NULL,
cantidad INT (10) NOT NULL,
INDEX fk_producto_registro_ventas_idx (registro_ventas),
INDEX fk_registro_ventas_producto_idx(producto),
CONSTRAINT pk_productos_facturados PRIMARY KEY (registro_ventas, producto),
CONSTRAINT fk_producto_registro_ventas FOREIGN KEY (registro_ventas) REFERENCES registro_ventas (id_ventas) ON UPDATE CASCADE ON DELETE RESTRICT,
CONSTRAINT fk_registro_ventas_producto FOREIGN KEY (producto) REFERENCES producto (cod_producto) ON UPDATE CASCADE ON DELETE RESTRICT
);

CREATE TABLE  Registro_Articulos_Personal (
  id INT(6) NOT NULL AUTO_INCREMENT,
  fecha TIMESTAMP NOT NULL,
  descripcion VARCHAR(200) NOT NULL,
 CONSTRAINT pk_Registro_Articulos_Personal PRIMARY KEY (id)
 );

-- ------------------------------- DISPARADORES PERTENECIENTES AL PROYECTO ' FIESTERO ANDANTE ' -------------------------------------------------------

-- DISPARADOR NUMERO 1

DELIMITER $$
CREATE TRIGGER Ingresar_Articulos 
AFTER INSERT ON producto FOR EACH ROW
BEGIN 
INSERT INTO Registro_Articulos_Personal (id,fecha,descripcion) VALUES (id,sysdate(),concat('Se ha registrado
un nuevo producto de codigo: ',new.cod_producto,' y precio --> ', new.precio_producto ));
END$$

-- DISPARADOR NUMERO 2 

DELIMITER $$
CREATE TRIGGER Eliminacion_Personal 
AFTER DELETE ON empleado FOR EACH ROW
BEGIN
INSERT INTO Registro_Articulos_Personal (id,fecha,descripcion) values (id,sysdate(),concat('Se ha eliminado 
el registro de un empleado con id: ',old.id_empleado,' y nombre --> ',old.nombre_empleado));
END$$


-- --------------------------------------- FUNCION DISEÑADA PARA EL PROYECTO --------------------------------------------------------------


DELIMITER $$
CREATE DEFINER= CURRENT_USER FUNCTION incremento_10(v_cod_producto int(7),v_precio_producto DECIMAL (9,3)) RETURNS int(11)
BEGIN
DECLARE v_incremento int;
select precio_producto into v_incremento from producto where cod_producto = v_cod_producto ;
set v_incremento= v_incremento + ( v_precio_producto *0.1);
return v_incremento;
END
$$
-- --------------------------- FORMA DE PROBAR LA FUNCIÓN ---------------------------------------------------
select incremento_10(5000002,457999) as 'Se ha modificado' ;
Select*from producto;
-- ------------------------------------- FUNCION DISMINUCIÓN 15 % POR CLIENTE REGULAR --------------------------------------
DELIMITER $$ 
CREATE DEFINER = CURRENT_USER FUNCTION disminucion_15(v_cod_producto int(7), v_precio_producto DECIMAL (9,3)) RETURNS int (11)
BEGIN 
DECLARE v_disminucion int;
select precio_producto into v_disminucion from producto where cod_producto = v_cod_producto;
set v_disminucion = v_disminucion - (v_precio_producto*0.15);
return v_disminucion;
END
$$
-- ----------------------------------- FORMA DE LLAMAR Y PROBAR LA FUNCIÓN -----------------------------------------------------
select disminucion_15(5000002,346920) as 'Se ha modificado' ;
Select*from producto;

-- --------------------------------------- INICIO PROCEDIMIENTO ----------------------------------------

DELIMITER $$
CREATE DEFINER = CURRENT_USER PROCEDURE actualizar_precio_producto (v_cod_producto int, v_nuevo_precio int)
BEGIN
DECLARE codigo int;
SELECT 
    cod_producto
INTO codigo FROM
    producto
WHERE
    cod_producto = v_cod_producto;
    
if codigo is null then 
    signal sqlstate '45000' set message_text = 'No se a modificado debido a codigo inexistente'; 
    else 
        UPDATE producto
SET 
    precio_producto = v_nuevo_precio
WHERE
    cod_producto = v_cod_producto;
     select 'Se ha actualizado';
    end if;
END
$$

-- -------------------------------------- FORMA DE PROBAR EL PROCEDIMIENTO ---------------------------------------------------

call actualizar_precio_producto (5000001,107999);
select*from producto;

-- -------------------------------------------------------



-- -------------------------------------------- BORRAR BASE DE DATOS -----------------------------------------

-- drop database bara_domicilio_bd;

