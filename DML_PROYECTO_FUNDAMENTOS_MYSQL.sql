use bar_domicilio_db;

-------------- lectura general --------------
-- SELECT * FROM bara_domicilio_bd.sucursal;
-- SELECT * FROM bara_domicilio_bd.tipo_servicios;
-- SELECT * FROM bara_domicilio_bd.cliente;
-- SELECT * FROM bara_domicilio_bd.distribuidor;
-- SELECT * FROM bara_domicilio_bd.producto;
-- SELECT * FROM bara_domicilio_bd.registro_ventas;
-- SELECT * FROM bara_domicilio_bd.registro_servicios;
-- SELECT * FROM bara_domicilio_bd.empleado;
-- SELECT * FROM bara_domicilio_bd.distribuye;
-- SELECT * FROM bara_domicilio_bd.productos_facturados;

--------------------------------  INGRESO DE DATOS A  TABLA SUCURSAL  --------------------------------------------

INSERT INTO bar_domicilio_db.sucursal(id_sucursal, nombre_sucursal, seguridad_sucursal, atencion_presencial_sucursal, tiempo_espera_consultas_sucursal, soporte) 
VALUES(1000001,'FIESTERO ANDANTE SUBA',1000000051,'Domingo a Domingo', '00:05:00','Se aplica soporte general');

INSERT INTO bar_domicilio_db.sucursal (id_sucursal, nombre_sucursal, seguridad_sucursal, atencion_presencial_sucursal, tiempo_espera_consultas_sucursal, soporte) 
VALUES (1000002,'FIESTERO ANDANTE CHAPINERO',1000000052,'Domingo a Domingo', '00:06:00','Se aplica soporte general');

INSERT INTO bar_domicilio_db.sucursal(id_sucursal, nombre_sucursal, seguridad_sucursal, atencion_presencial_sucursal, tiempo_espera_consultas_sucursal, soporte) 
VALUES (1000003,'FIESTERO ANDANTE BOSA',1000000053,'Domingo a Domingo', '00:04:00','Se aplica soporte general');

INSERT INTO bar_domicilio_db.sucursal(id_sucursal, nombre_sucursal, seguridad_sucursal, atencion_presencial_sucursal, tiempo_espera_consultas_sucursal, soporte)  
VALUES (1000004,'FIESTERO ANDANTE USME',1000000054,'Domingo a Domingo', '00:05:00','Se aplica soporte general');

INSERT INTO bar_domicilio_db.sucursal(id_sucursal, nombre_sucursal, seguridad_sucursal, atencion_presencial_sucursal, tiempo_espera_consultas_sucursal, soporte)  
VALUES (1000005,'FIESTERO ANDANTE KENNEDY',1000000055,'Domingo a Domingo', '00:03:00','Se aplica soporte general');

INSERT INTO bar_domicilio_db.sucursal(id_sucursal, nombre_sucursal, seguridad_sucursal, atencion_presencial_sucursal, tiempo_espera_consultas_sucursal, soporte) 
VALUES (1000006,'FIESTERO ANDANTE USAQUEN',1000000056,'Domingo a Domingo', '00:04:00','Se aplica soporte general');

INSERT INTO bar_domicilio_db.sucursal(id_sucursal, nombre_sucursal, seguridad_sucursal, atencion_presencial_sucursal, tiempo_espera_consultas_sucursal, soporte) 
VALUES (1000007,'FIESTERO ANDANTE ENGATIVA',1000000057,'Domingo a Domingo', '00:05:00','Se aplica soporte general');

INSERT INTO bar_domicilio_db.sucursal(id_sucursal, nombre_sucursal, seguridad_sucursal, atencion_presencial_sucursal, tiempo_espera_consultas_sucursal, soporte)  
VALUES (1000008,'FIESTERO ANDANTE TEUSAQUILLO',1000000058,'Domingo a Domingo', '00:06:00','Se aplica soporte general');

INSERT INTO bar_domicilio_db.sucursal(id_sucursal, nombre_sucursal, seguridad_sucursal, atencion_presencial_sucursal, tiempo_espera_consultas_sucursal, soporte)  
VALUES (1000009,'FIESTERO ANDANTE FONTIBON',1000000059,'Domingo a Domingo', '00:04:00','Se aplica soporte general');

INSERT INTO bar_domicilio_db.sucursal(id_sucursal, nombre_sucursal, seguridad_sucursal, atencion_presencial_sucursal, tiempo_espera_consultas_sucursal, soporte)  
VALUES (1000010,'FIESTERO ANDANTE SAN CRISTOBAL',1000000060,'Domingo a Domingo', '00:03:00','Se aplica soporte general');

-------------------------------- INGRESO DE DATOS A  TABLA TIPO_SERVICIOS --------------------------------------

INSERT INTO bar_domicilio_db.tipo_servicios(id_servicios, nombre, descripcion)
VALUES(2000001,'cocteles','preparacion de todo tipo de cocteleria');

INSERT INTO bar_domicilio_db.tipo_servicios(id_servicios, nombre, descripcion)
VALUES(2000002,'comidas','preparacion de todo tipo de comidas');

INSERT INTO bar_domicilio_db.tipo_servicios(id_servicios, nombre, descripcion)
VALUES(2000003,'orquestas','presentacion de cualquir tipo de orquestas');

INSERT INTO bar_domicilio_db.tipo_servicios(id_servicios, nombre, descripcion)
VALUES(2000004,'reposicion','licores que esten en mal estado');

INSERT INTO bar_domicilio_db.tipo_servicios(id_servicios, nombre, descripcion)
VALUES(2000005,'domicilio','entrega de licor en a su hogar');

INSERT INTO bar_domicilio_db.tipo_servicios(id_servicios, nombre, descripcion)
VALUES(2000006,'agendar fiesta','fiesta en el lugar de su residencia');

INSERT INTO bar_domicilio_db.tipo_servicios(id_servicios, nombre, descripcion)
VALUES(2000007,'reparacion','utileria como platos, mesas, cubiertos, etc');

INSERT INTO bar_domicilio_db.tipo_servicios(id_servicios, nombre, descripcion)
VALUES(2000008,'aquilacion','equipos de sonido, mesas, etc');

INSERT INTO bar_domicilio_db.tipo_servicios(id_servicios, nombre, descripcion)
VALUES(2000009,'conductor personal','persona encargada para llevarlo a su casa');

INSERT INTO bar_domicilio_db.tipo_servicios(id_servicios, nombre, descripcion)
VALUES(2000010,'ventas al por mayor','venta de licores a otros negocios');

-------------------------------- INGRESO DE DATOS A TABLA CLIENTE ---------------------------------------------

INSERT INTO bar_domicilio_db.cliente(id_cliente, nombre_cliente, telefono_cliente, direccion_cliente, correo_electronico_cliente, medio_pago_cliente, historial_crediticio_cliente)
VALUES(300000001,'Carlos',316891215,'Carrera 9 16 - 3','carlos31@gmil.com','MasterCard','El cliente no reporta deudas pendientes');

INSERT INTO bar_domicilio_db.cliente(id_cliente, nombre_cliente, telefono_cliente, direccion_cliente, correo_electronico_cliente, medio_pago_cliente, historial_crediticio_cliente)
VALUES(300000002,'Oscar',311367249,'Carrera 6 14 - 5','oscar6@outlook.com','Visa','El cliente no reporta deudas pendientes');

INSERT INTO bar_domicilio_db.cliente(id_cliente, nombre_cliente, telefono_cliente, direccion_cliente, correo_electronico_cliente, medio_pago_cliente, historial_crediticio_cliente)
VALUES(300000003,'Laura',310146893,'Carrera 3 22 - 14','laura3@hotmail.com','Efectivo','El cliente no reporta deudas pendientes');

INSERT INTO bar_domicilio_db.cliente(id_cliente, nombre_cliente, telefono_cliente, direccion_cliente, correo_electronico_cliente, medio_pago_cliente, historial_crediticio_cliente)
VALUES(300000004,'Felipe',321469723,'Carrera 7 25 - 19','felipe7@yahoo.com.co','American Express','El cliente no reporta deudas pendientes');

INSERT INTO bar_domicilio_db.cliente(id_cliente, nombre_cliente, telefono_cliente, direccion_cliente, correo_electronico_cliente, medio_pago_cliente, historial_crediticio_cliente)
VALUES(300000005,'Mario',314236817,'Carrera 3 19 - 10','mario19@gmil.com','Visa','El cliente no reporta deudas pendientes');

INSERT INTO bar_domicilio_db.cliente(id_cliente, nombre_cliente, telefono_cliente, direccion_cliente, correo_electronico_cliente, medio_pago_cliente, historial_crediticio_cliente)
VALUES(300000006,'Santiago',320687513,'Carrera 11 28 - 14','santiago11@gmil.com','Efectivo','El cliente no reporta deudas pendientes');

INSERT INTO bar_domicilio_db.cliente(id_cliente, nombre_cliente, telefono_cliente, direccion_cliente, correo_electronico_cliente, medio_pago_cliente, historial_crediticio_cliente)
VALUES(300000007,'Valentina',316324972,'Carrera 5 14 - 2','valentina14@outlook.com','Mastercard','El cliente no reporta deudas pendientes');

INSERT INTO bar_domicilio_db.cliente(id_cliente, nombre_cliente, telefono_cliente, direccion_cliente, correo_electronico_cliente, medio_pago_cliente, historial_crediticio_cliente)
VALUES(300000008,'Camilo',310321468,'Carrera 4 10 - 7','camilo10@hotmail.com','American Express','El cliente no reporta deudas pendientes');

INSERT INTO bar_domicilio_db.cliente(id_cliente, nombre_cliente, telefono_cliente, direccion_cliente, correo_electronico_cliente, medio_pago_cliente, historial_crediticio_cliente)
VALUES(300000009,'Andres',311342681,'Carrera 8 16 - 7','andres16@gmil.com','Efectivo','El cliente no reporta deudas pendientes');

INSERT INTO bar_domicilio_db.cliente(id_cliente, nombre_cliente, telefono_cliente, direccion_cliente, correo_electronico_cliente, medio_pago_cliente, historial_crediticio_cliente)
VALUES(300000010,'Juliana',321364923,'Carrera 12 24 - 2','juliana12@yahoo.com','Visa','El cliente no reporta deudas pendientes');

-------------------------------- INGRESO DE DATOS A TABLA DISTRIBUIDOR ----------------------------------------

INSERT INTO bar_domicilio_db.distribuidor(id_distribuidor, nombre_distribuidor, apellido_distribuidor, reputacion_distribuidor, telefono_distribuidor)
VALUES(4000001, 'Jose', 'Beltran', 'Buena persona, no tiene ningun antecedente', 318538950);

INSERT INTO bar_domicilio_db.distribuidor(id_distribuidor, nombre_distribuidor, apellido_distribuidor, reputacion_distribuidor, telefono_distribuidor)
VALUES(4000002, 'Nicolas', 'Gomez', 'Buena persona, no tiene ningun antecedente', 310314875);

INSERT INTO bar_domicilio_db.distribuidor(id_distribuidor, nombre_distribuidor, apellido_distribuidor, reputacion_distribuidor, telefono_distribuidor)
VALUES(4000003, 'Hernan', 'Pineda', 'Buena persona, no tiene ningun antecedente', 321567892);

INSERT INTO bar_domicilio_db.distribuidor(id_distribuidor, nombre_distribuidor, apellido_distribuidor, reputacion_distribuidor, telefono_distribuidor)
VALUES(4000004, 'Ivan', 'Pulido', 'Buena persona, no tiene ningun antecedente', 310456789);

INSERT INTO bar_domicilio_db.distribuidor(id_distribuidor, nombre_distribuidor, apellido_distribuidor, reputacion_distribuidor, telefono_distribuidor)
VALUES(4000005, 'Mateo', 'Orjuela', 'Buena persona, no tiene ningun antecedente', 314362491);

INSERT INTO bar_domicilio_db.distribuidor(id_distribuidor, nombre_distribuidor, apellido_distribuidor, reputacion_distribuidor, telefono_distribuidor)
VALUES(4000006, 'Paula', 'Puentes', 'Buena persona, no tiene ningun antecedente', 315789123);

INSERT INTO bar_domicilio_db.distribuidor(id_distribuidor, nombre_distribuidor, apellido_distribuidor, reputacion_distribuidor, telefono_distribuidor)
VALUES(4000007, 'Esteban', 'Sanchez', 'Buena persona, no tiene ningun antecedente', 316532478);

INSERT INTO bar_domicilio_db.distribuidor(id_distribuidor, nombre_distribuidor, apellido_distribuidor, reputacion_distribuidor, telefono_distribuidor)
VALUES(4000008, 'Manuel', 'Silva', 'Buena persona, no tiene ningun antecedente', 312369147);

INSERT INTO bar_domicilio_db.distribuidor(id_distribuidor, nombre_distribuidor, apellido_distribuidor, reputacion_distribuidor, telefono_distribuidor)
VALUES(4000009, 'Daniela', 'Sierra', 'Buena persona, no tiene ningun antecedente', 316321589);

INSERT INTO bar_domicilio_db.distribuidor(id_distribuidor, nombre_distribuidor, apellido_distribuidor, reputacion_distribuidor, telefono_distribuidor)
VALUES(4000010, 'Juan', 'Rojas', 'Buena persona, no tiene ningun antecedente', 322478103);

-------------------------------- INGRESO DE DATOS A TABLA PRODUCTO --------------------------------------------

INSERT INTO bar_domicilio_db.producto(cod_producto, calidad_producto, precio_producto, fecha_caducidad, cantidad_producto, comida, orquesta,sucursal)
VALUES(5000001,'Buena', 448657, "2024-05-12", 8, 'aperitivos', 'Los corraleros',1000001);

INSERT INTO bar_domicilio_db.producto(cod_producto, calidad_producto, precio_producto, fecha_caducidad, cantidad_producto, comida, orquesta,sucursal)
VALUES(5000002,'Buena', 346920, "2025-02-25", 6, 'aperitivos', 'Son de moda', 1000002);

INSERT INTO bar_domicilio_db.producto(cod_producto, calidad_producto, precio_producto, fecha_caducidad, cantidad_producto, comida, orquesta,sucursal)
VALUES(5000003,'Buena', 284532, "2024-09-03", 5, 'aperitivos', 'Los ocho de colombia', 1000003);

INSERT INTO bar_domicilio_db.producto(cod_producto, calidad_producto, precio_producto, fecha_caducidad, cantidad_producto, comida, orquesta,sucursal)
VALUES(5000004,'Buena', 497562, "2025-01-04", 9, 'aperitivos', 'Tupamaros', 1000004);

INSERT INTO bar_domicilio_db.producto(cod_producto, calidad_producto, precio_producto, fecha_caducidad, cantidad_producto, comida, orquesta,sucursal)
VALUES(5000005,'Buena', 358545, "2024-12-23", 7, 'aperitivos', 'Alfa ocho', 1000005);

INSERT INTO bar_domicilio_db.producto(cod_producto, calidad_producto, precio_producto, fecha_caducidad, cantidad_producto, comida, orquesta,sucursal)
VALUES(5000006,'Buena', 545324, "2024-06-10", 10, 'aperitivos', 'Nelso y sus estrellas', 1000006);

INSERT INTO bar_domicilio_db.producto(cod_producto, calidad_producto, precio_producto, fecha_caducidad, cantidad_producto, comida, orquesta,sucursal)
VALUES(5000007,'Buena', 402356, "2024-07-01", 8,'aperitivos', 'Juan piña', 1000007);

INSERT INTO bar_domicilio_db.producto(cod_producto, calidad_producto, precio_producto, fecha_caducidad, cantidad_producto, comida, orquesta,sucursal)
VALUES(5000008,'Buena', 497563, "2025-04-18", 9, 'aperitivos', 'La rebelion', 1000008);

INSERT INTO bar_domicilio_db.producto(cod_producto, calidad_producto, precio_producto, fecha_caducidad, cantidad_producto, comida, orquesta,sucursal)
VALUES(5000009,'Buena', 316789, "2024-08-27", 6, 'aperitivos', 'Son del fuego', 1000009);

INSERT INTO bar_domicilio_db.producto(cod_producto, calidad_producto, precio_producto, fecha_caducidad, cantidad_producto, comida, orquesta,sucursal)
VALUES(5000010,'Buena', 436778, "2025-03-15", 8,'aperitivos', 'Fascinacion', 1000010);

-------------------------------- INGRESO DE DATOS A TABLA REGISTRO_VENTAS --------------------------------------

INSERT INTO bar_domicilio_db.registro_ventas(id_ventas, hora_ventas,fecha_venta, costo, cliente)
VALUES(6000001, '04:30:00', "2020-03-15", 78130, 300000001);

INSERT INTO bar_domicilio_db.registro_ventas(id_ventas, hora_ventas,fecha_venta, costo, cliente)
VALUES(6000002, '05:40:00', "2020-01-08", 56567, 300000002);

INSERT INTO bar_domicilio_db.registro_ventas(id_ventas, hora_ventas,fecha_venta, costo, cliente)
VALUES(6000003, '01:45:00', "2020-04-24", 48364, 300000003);

INSERT INTO bar_domicilio_db.registro_ventas(id_ventas, hora_ventas,fecha_venta, costo, cliente)
VALUES(6000004, '06:00:00', "2020-03-28", 36475, 300000004);

INSERT INTO bar_domicilio_db.registro_ventas(id_ventas, hora_ventas,fecha_venta, costo, cliente)
VALUES(6000005, '08:00:00', "2020-05-10", 62478, 300000005);

INSERT INTO bar_domicilio_db.registro_ventas(id_ventas, hora_ventas,fecha_venta, costo, cliente)
VALUES(6000006, '07:45:00', "2020-04-26", 71361, 300000006);

INSERT INTO bar_domicilio_db.registro_ventas(id_ventas, hora_ventas,fecha_venta, costo, cliente)
VALUES(6000007, '03:30:00', "2020-03-01", 43758, 300000007);

INSERT INTO bar_domicilio_db.registro_ventas(id_ventas, hora_ventas,fecha_venta, costo, cliente)
VALUES(6000008, '09:50:00', "2020-05-18", 68138, 300000008);

INSERT INTO bar_domicilio_db.registro_ventas(id_ventas, hora_ventas,fecha_venta, costo, cliente)
VALUES(6000009, '06:10:00', "2020-04-22", 57945, 300000009);

INSERT INTO bar_domicilio_db.registro_ventas(id_ventas, hora_ventas,fecha_venta, costo, cliente)
VALUES(6000010, '10:00:00', "2020-05-24", 74725, 300000010);

-------------------------------- INGRESO DE DATOS A TABLA REGISTRO SERVICIOS ----------------------------------

INSERT INTO bar_domicilio_db.registro_servicios(id_respaldo, nombre, fecha, descripcion, seguro_contra_riesgos, sucursal, tipo_servicios)
VALUES(700000001, 'servicio cocteles', "2020-03-15", 'preparacion de cualquier tipo de cocteles',700000051, 1000001, 2000001);

INSERT INTO bar_domicilio_db.registro_servicios(id_respaldo, nombre, fecha, descripcion, seguro_contra_riesgos, sucursal, tipo_servicios)
VALUES(700000002, 'servicio comidas', "2020-01-08", 'preparacion de cualquier tipo de comidas',700000051, 1000002, 2000002);

INSERT INTO bar_domicilio_db.registro_servicios(id_respaldo, nombre, fecha, descripcion, seguro_contra_riesgos, sucursal, tipo_servicios)
VALUES(700000003, 'servicio orquestas', "2020-04-24", 'presentacion de cualquir tipo de orquestas',700000053, 1000003, 2000003);

INSERT INTO bar_domicilio_db.registro_servicios(id_respaldo, nombre, fecha, descripcion, seguro_contra_riesgos, sucursal, tipo_servicios)
VALUES(700000004, 'servicio reposicion', "2020-03-28", 'reposicion de licores que esten en mal estado',700000054, 1000004, 2000004);

INSERT INTO bar_domicilio_db.registro_servicios(id_respaldo, nombre, fecha, descripcion, seguro_contra_riesgos, sucursal, tipo_servicios)
VALUES(700000005, 'servicio domicilio', "2020-05-10", 'entrega directa de licor en a su hogar',700000055, 1000005, 2000005);

INSERT INTO bar_domicilio_db.registro_servicios(id_respaldo, nombre, fecha, descripcion, seguro_contra_riesgos, sucursal, tipo_servicios)
VALUES(700000006, 'servicio agendar fiesta', "2020-04-26", 'reserva para diseñar una fiesta en el lugar de su residencia',700000056, 1000006, 2000006);

INSERT INTO bar_domicilio_db.registro_servicios(id_respaldo, nombre, fecha, descripcion, seguro_contra_riesgos, sucursal, tipo_servicios)
VALUES(700000007, 'servicio reparacion', "2020-03-01", 'reparacion en utileria como platos, mesas, cubiertos, etc',700000057, 1000007, 2000007);

INSERT INTO bar_domicilio_db.registro_servicios(id_respaldo, nombre, fecha, descripcion, seguro_contra_riesgos, sucursal, tipo_servicios)
VALUES(700000008, 'servicio aquilacion', "2020-05-18", 'prestamos de equipos de sonido, mesas, etc',700000058, 1000008, 2000008);

INSERT INTO bar_domicilio_db.registro_servicios(id_respaldo, nombre, fecha, descripcion, seguro_contra_riesgos, sucursal, tipo_servicios)
VALUES(700000009, 'servicio conductor personal', "2020-04-22", 'asignacion de una persona encargada para llevarlo a su casa',700000059, 1000009, 2000009);

INSERT INTO bar_domicilio_db.registro_servicios(id_respaldo, nombre, fecha, descripcion, seguro_contra_riesgos, sucursal, tipo_servicios)
VALUES(700000010, 'servicio ventas al por mayor', "2020-05-24", 'venta de licores a otros negocios minoritarios',700000060, 1000010, 2000010);

-------------------------------- INGRESO DE DATOS A TABLA EMPLEADO --------------------------------------------

INSERT INTO bar_domicilio_db.empleado(id_empleado, nombre_empleado, profesion_empleado, telefono_empleado, correo_empleado, salario_empleado, cargo, sucursal)
VALUES(8000001, 'Andres', 'Empleado', 314736874, 'andres80@gmail.com', 950000, 'Bartender', 1000001);

INSERT INTO bar_domicilio_db.empleado(id_empleado, nombre_empleado, profesion_empleado, telefono_empleado, correo_empleado, salario_empleado, cargo, sucursal)
VALUES(8000002, 'Carlos', 'Empleado', 311346728, 'carlos31@outlook.com', 857000, 'Mesero', 1000002);

INSERT INTO bar_domicilio_db.empleado(id_empleado, nombre_empleado, profesion_empleado, telefono_empleado, correo_empleado, salario_empleado, cargo, sucursal)
VALUES(8000003, 'Maria', 'Empleado', 313467513, 'maria03@yahoo.com', 110000, 'Chef', 1000003);

INSERT INTO bar_domicilio_db.empleado(id_empleado, nombre_empleado, profesion_empleado, telefono_empleado, correo_empleado, salario_empleado, cargo, sucursal)
VALUES(8000004, 'Julio', 'Empleado', 310643729, 'julio08@outlook.com', 100000, 'Seguridad', 1000004);

INSERT INTO bar_domicilio_db.empleado(id_empleado, nombre_empleado, profesion_empleado, telefono_empleado, correo_empleado, salario_empleado, cargo, sucursal)
VALUES(8000005, 'Arturo', 'Empleado', 312346172, 'arturo28@gmail.com', 135000, 'Dj', 1000005);

INSERT INTO bar_domicilio_db.empleado(id_empleado, nombre_empleado, profesion_empleado, telefono_empleado, correo_empleado, salario_empleado, cargo, sucursal)
VALUES(8000006, 'Pablo', 'Empleado', 317341627, 'pablo95@yahoo.com', 950000, 'Bartender', 1000006);

INSERT INTO bar_domicilio_db.empleado(id_empleado, nombre_empleado, profesion_empleado, telefono_empleado, correo_empleado, salario_empleado, cargo, sucursal)
VALUES(8000007, 'Luis', 'Empleado', 315013482, 'luis07@outlook.com', 950000, 'Mesero', 1000007);

INSERT INTO bar_domicilio_db.empleado(id_empleado, nombre_empleado, profesion_empleado, telefono_empleado, correo_empleado, salario_empleado,  cargo, sucursal)
VALUES(8000008, 'Antonio', 'Empleado', 319461253, 'antonio08@gmail.com', 100000, 'Seguridad', 1000008);

INSERT INTO bar_domicilio_db.empleado(id_empleado, nombre_empleado, profesion_empleado, telefono_empleado, correo_empleado, salario_empleado, cargo, sucursal)
VALUES(8000009, 'Yubert', 'Empleado', 324316279, 'yubert09@yahoo.com', 110000, 'Chef', 1000009);

INSERT INTO bar_domicilio_db.empleado(id_empleado, nombre_empleado, profesion_empleado, telefono_empleado, correo_empleado, salario_empleado, cargo, sucursal)
VALUES(8000010, 'Andrea', 'Empleado', 310236203, 'andra01@outlook.com', 120000, 'Dj', 1000010);

-------------------------------- INGRESO DE DATOS A TABLA (RELACION) DISTRIBUYE ------------------------------------------

INSERT INTO bar_domicilio_db.distribuye( producto, distribuidor, ventas_fecha_venta, hora_compra, fecha_compra, cantidad_comprada)
VALUES(5000001, 4000001,"2020-03-15", '06:10:00', "2020-03-16", 6);

INSERT INTO bar_domicilio_db.distribuye( producto, distribuidor, ventas_fecha_venta, hora_compra, fecha_compra, cantidad_comprada)
VALUES(5000002, 4000002,"2020-05-20", '08:45:00', "2020-05-21", 3);

INSERT INTO bar_domicilio_db.distribuye( producto, distribuidor, ventas_fecha_venta, hora_compra, fecha_compra, cantidad_comprada)
VALUES(5000003, 4000003,"2020-01-17", '03:00:00', "2020-01-18", 8);

INSERT INTO bar_domicilio_db.distribuye( producto, distribuidor, ventas_fecha_venta, hora_compra, fecha_compra, cantidad_comprada)
VALUES(5000004, 4000004,"2020-04-29", '01:00:00', "2020-04-30", 9);

INSERT INTO bar_domicilio_db.distribuye( producto, distribuidor, ventas_fecha_venta, hora_compra, fecha_compra, cantidad_comprada)
VALUES(5000005, 4000005,"2020-02-16", '04:30:00', "2020-02-17", 4);

INSERT INTO bar_domicilio_db.distribuye( producto, distribuidor, ventas_fecha_venta, hora_compra, fecha_compra, cantidad_comprada)
VALUES(5000006, 4000006,"2020-04-23", '09:20:00', "2020-04-24", 2);

INSERT INTO bar_domicilio_db.distribuye( producto, distribuidor, ventas_fecha_venta, hora_compra, fecha_compra, cantidad_comprada)
VALUES(5000007, 4000007,"2020-05-12", '06:50:00', "2020-05-13", 10);

INSERT INTO bar_domicilio_db.distribuye( producto, distribuidor, ventas_fecha_venta, hora_compra, fecha_compra, cantidad_comprada)
VALUES(5000008, 4000008,"2020-02-22", '02:40:00', "2020-02-23", 5);

INSERT INTO bar_domicilio_db.distribuye( producto, distribuidor, ventas_fecha_venta, hora_compra, fecha_compra, cantidad_comprada)
VALUES(5000009, 4000009,"2020-04-26", '07:20:00', "2020-04-27", 7);

INSERT INTO bar_domicilio_db.distribuye( producto, distribuidor, ventas_fecha_venta, hora_compra, fecha_compra, cantidad_comprada)
VALUES(5000010, 4000010,"2020-05-20", '10:15:00', "2020-05-21", 4);

-------------------------------- INGRESO DE DATOS A TABLA (RELACION) PRODUCTOS_FACTURADOS--------------------------------

INSERT INTO bar_domicilio_db.productos_facturados(producto, registro_ventas, cantidad)
VALUES(5000001, 6000001, 6);

INSERT INTO bar_domicilio_db.productos_facturados(producto, registro_ventas, cantidad)
VALUES(5000002, 6000002, 3);

INSERT INTO bar_domicilio_db.productos_facturados(producto, registro_ventas, cantidad)
VALUES(5000003, 6000003, 8);

INSERT INTO bar_domicilio_db.productos_facturados(producto, registro_ventas, cantidad)
VALUES(5000005, 6000004, 9);

INSERT INTO bar_domicilio_db.productos_facturados(producto, registro_ventas, cantidad)
VALUES(5000005, 6000005, 4);

INSERT INTO bar_domicilio_db.productos_facturados(producto, registro_ventas, cantidad)
VALUES(5000006, 6000006, 2);

INSERT INTO bar_domicilio_db.productos_facturados(producto, registro_ventas, cantidad)
VALUES(5000007, 6000007, 10);

INSERT INTO bar_domicilio_db.productos_facturados(producto, registro_ventas, cantidad)
VALUES(5000008, 6000008, 5);

INSERT INTO bar_domicilio_db.productos_facturados(producto, registro_ventas, cantidad)
VALUES(5000009, 6000009, 7);

INSERT INTO bar_domicilio_db.productos_facturados(producto, registro_ventas, cantidad)
VALUES(5000010, 6000010, 4);

-------------- borrar datos ------------------
-- DELETE FROM bara_domicilio_bd. WHERE  = ;
