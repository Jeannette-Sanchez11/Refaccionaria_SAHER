
--Creamos la base de datos
Create database refaccionaria; 

--cambiar de la bd postgres
\c refaccionaria

--Creacion de tablas

create table Empleado(
	id_Emp integer NOT NULL GENERATED ALWAYS AS IDENTITY, 
	nombre_Emp varchar NOT NULL,
	ap_Pat varchar NOT NULL,
	ap_Mat varchar NOT NULL,
	status_Empleado integer NOT NULL,
	tel_Empleado varchar NOT NULL,
	correo varchar NOT NULL,
	primary key(id_Emp)
);
--Insert into Empleado(nombre_Emp, ap_Pat, ap_Mat, status_Empleado, tel_Empleado, correo) values ('oscar','gutierrez','escobedo',1,'9621006472','asgev@gmail.com+');

--tabla cliente
create table Cliente(
	id_Cliente integer NOT NULL GENERATED ALWAYS AS IDENTITY,
	nombre varchar NOT NULL,
	ap_Pat varchar NOT NULL,
	ap_Mat varchar NOT NULL,
	telefono varchar NOT NULL,
	primary key(id_Cliente)
);
--insert into Cliente(nombre, ap_Pat, ap_Mat, telefono) values ('Julio','Velazquez','Merida','9622546985');

--tabla ventas
create table Venta(
	id_Ventas integer NOT NULL GENERATED ALWAYS AS IDENTITY,
	id_Cliente integer NOT NULL,
	id_Emp integer NOT NULL,
	fecha_Venta date NOT NULL,
	monto_Final numeric(10,2) NOT NULL constraint monto_Final_Invalido check(monto_Final > 0 ),
	primary key (id_Ventas),
	foreign key(id_Cliente)References Cliente,
	foreign key(id_Emp)References Empleado
);

--insert into Venta()values();

-- creacion de la tabla tipos de motos 
create table Tipo_De_Moto(
	id_Tipo integer NOT NULL GENERATED ALWAYS AS IDENTITY,
	modelo varchar NOT NULL,
	nombre_TipoM varchar NOT NULL,
	marca varchar NOT NULL,
	anio integer NOT NULL,
	primary key(id_Tipo)
);

--insert into Tipo_De_Moto()values();

--Creacion de tabla articulos 
create table Articulos(
	codi_Barra varchar NOT NULL,
	id_Tipo integer NOT NULL, 
	nombre_Arti varchar NOT NULL,
	marca varchar NOT NULL,
	precio numeric(10,2) NOT NULL constraint precio_Invalido check(precio > 0 ),
	stock integer NOT NULL,
	primary key(codi_Barra),
	foreign key (id_Tipo)References Tipo_De_Moto
);
--insert into Articulos()values();


--creacion de la tabla servicios
create table Servicios(
	id_Servi integer  NOT NULL GENERATED ALWAYS AS IDENTITY,
	descripcion varchar NOT NULL,
	precio_Servi numeric(10,2) NOT NULL constraint precio_Servi check(precio_Servi > 0 ),
	--hora_Entrada time NOT NULL,
	--hora_Salida time NOT NULL,
	primary key(id_Servi)
);
--insert into Servicios()values();

--Creacion de la tabla proveedor 
create table Proveedor(
	rfc_Proveedor varchar NOT NULL,
	nombre varchar NOT NULL,
	telefono varchar NOT NULL,
	primary key(rfc_Proveedor)
);
--insert into Proveedor() values();

--Creacion de la tabla compraM
create table CompraM(
	id_Compra integer  NOT NULL GENERATED ALWAYS AS IDENTITY,
	rfc_Proveedor varchar NOT NULL,
	monto_TotalC numeric(10,2) NOT NULL,
	fecha_Compra date NOT NULL,
	primary key(id_Compra),
	foreign key (rfc_Proveedor) References Proveedor
);

--insert into CompraM()values();

--Creacion de la tabla detalla compraM
create table detalle_CompraM(
	id_Compra integer NOT NULL,
	cns_DC integer NOT NULL,
	codi_Barra varchar NOT NULL, 
	descripcion varchar NOT NULL,
	precio_Compra_Arti numeric(10,2) NOT NULL,
	cantidad integer NOT NULL,
	total_Compra_Arti numeric(10,2) NOT NULL constraint total_Compra_Arti_Invalido check(total_Compra_Arti >= precio_Compra_Arti ),
	primary key (id_Compra,cns_DC),
	CONSTRAINT CompraM_Id_compra_fkey foreign key (id_Compra)
	References CompraM(Id_compra) MATCH SIMPLE ON UPDATE NO ACTION ON DELETE CASCADE,
	CONSTRAINT articulos_Codigo_barra_fkey foreign key (codi_Barra)
	References Articulos(codi_Barra) MATCH SIMPLE ON UPDATE NO ACTION ON DELETE NO ACTION 
);
--insert into detalle_Venta() values();

create table detalle_Venta(
	id_Ventas integer NOT NULL,
	id_servi integer ,
	cns_DV integer NOT NULL,
	codi_Barra varchar, 
	precio_Venta_Arti numeric(10,2) NOT NULL,
	cantidad integer NOT NULL,
	total_Venta_Arti numeric(10,2) NOT NULL constraint total_Venta_Arti_Invalido check(total_Venta_Arti > 0 ),
	primary key (id_Ventas, cns_DV),
	CONSTRAINT Venta_Id_venta_fkey foreign key (id_Ventas)
	References Venta(id_Ventas) MATCH SIMPLE ON UPDATE NO ACTION ON DELETE CASCADE,
	CONSTRAINT articulos_Codigo_barra_fkey foreign key (codi_Barra)
	References Articulos(codi_Barra) MATCH SIMPLE ON UPDATE NO ACTION ON DELETE NO ACTION,
	CONSTRAINT servicios_Id_servi_fkey foreign key (id_servi)
	References Servicios(id_servi) MATCH SIMPLE ON UPDATE NO ACTION ON DELETE NO ACTION 
);
--insert into detalle_Venta()values();

--tabla de usuarios
create table usuarios(
	id_usuario integer NOT NULL GENERATED ALWAYS AS IDENTITY,
	nombre_usuario varchar NOT NULL,
	contrasenia varchar NOT NULL,
	primary key (id_usuario)
);
--insert into usuarios()values();

--   controler entity service ;paquete de clases