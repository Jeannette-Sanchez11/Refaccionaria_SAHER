----------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------
----------------------------------PROCEDIMIENTOS ALMACENADOS----------------------------------------------

--1er procedimeinto para la alta de una compra
CREATE OR REPLACE PROCEDURE Altadedetallecompraprove (IN pid_compra INTEGER,IN pCNS_DC INTEGER,IN pcodi_barra varchar,IN pdescripcion varchar, IN pprecio_compra_arti numeric(10,2), IN pcantidad INTEGEr,IN ptotal_compra_arti numeric(10,2),INOUT pRes INTEGER) AS $$
DECLARE 
   vreg RECORD;
   vr   RECORD;
   vrproduc RECORD;
   vRes INTEGER;
BEGIN
    -- Validar si existe el idcompra
    Select into vreg * From compraM Where Id_compra = pId_compra FOR Update;
	IF FOUND THEN
       -- Validar si existe el articulo
       Select into vrproduc * From articulos where codi_barra = pcodi_barra FOR Update;
		IF FOUND THEN
      		Select into vr *from detalle_CompraM where id_compra= pId_compra and cns_DC = pCNS_DC;
				IF NOT FOUND THEN
					--Actualizar el stock de producto
      				vrproduc.Stock := vrproduc.Stock + pcantidad;
      				update articulos set Stock = vrproduc.Stock where codi_barra = pcodi_barra;
					--inserta el producto
      				insert into detalle_CompraM values( pId_compra, pCNS_DC, pcodi_barra, pdescripcion, pprecio_compra_Arti, pCantidad, ptotal_compra_arti );
      				vRes := 1;
      				Commit;
				ELSE
					vRes:=4;
				END IF; -- CNS YA REALIZADO if not found then
		ELSE
				vRes:=3;--VALIDAR SI PRODUCTO EXISTE  I FOUND THEN
		END IF;
	ELSE
			vRes:=2;--VALIDAR SI EL ID VENTA EXISTE IF FOUND THEN
	END IF;
    IF vRes > 1 THEN
       Rollback;
    END IF;
    pRes := vRes;
END;
$$ LANGUAGE plpgsql; --Ya dejo con el INOUT en el ultimo parametro de entrada
----
---ejemplos
--llamda del procedimiento
call Altadedetallecompraprove (2, 2, '00000000010', 'cable de frenos',800, 5, 4000, null);

call Altadedetallecompraprove (1, 2, '00000000010', 'Cable universal', 50.04,  10, 10.03, null);

-----------------------------------------------------------------------------------------------------------------------------
call AltadedetalleventaServicio (3, 2, 2, 100,1,100,null);--Llmar bien la alta del servicio
---Procedimiento a usar en java
CREATE OR REPLACE PROCEDURE AltadedetalleventaServicio (IN pIdVentas INTEGER,IN pCNS_DV INTEGER,IN pid_Servi INTEGER, pPrecio_Venta_Arti numeric(10,2), pCantidad INTEGER, pTotal_Venta_Arti NUMERIC(10,2), INOUT pRes INTEGER) AS $$
DECLARE 
    vreg RECORD;
   vr   RECORD;
   vrservicio RECORD;
   vRes INTEGER;
BEGIN
   -- Validar si existe el idventa
    Select into vreg * From venta Where Id_Ventas = pIdVentas FOR Update;
	IF FOUND THEN
       -- Validar si existe el Servicio
       Select into vrservicio * From servicios where id_Servi = pid_Servi FOR Update;
		IF FOUND THEN 
      		Select into vr *from detalle_venta where Id_Ventas = pIdVentas and cns_DV = pCNS_DV;
				IF NOT FOUND THEN
      				insert into detalle_Venta values( pIdVentas, pid_Servi ,pCNS_Dv, null, pPrecio_Venta_Arti, pCantidad, pTotal_Venta_Arti);
      				vRes := 1;
      				Commit;
				ELSE
					vRes:=5;
				END IF; -- CNS YA REALIZADO if not found then

		ELSE
				vRes:=3;--VALIDAR SI EL SERVICIO EXISTE  I FOUND THEN
		END IF;
	ELSE
			vRes:=2;--VALIDAR SI EL ID VENTA EXISTE IF FOUND THEN
	END IF;
    IF vRes > 1 THEN
       Rollback;
    END IF;
    pRes := vRes;
END;
$$ LANGUAGE plpgsql;

-------------------------------------------------------------------------------------------------------------------------------------------------
CREATE OR REPLACE PROCEDURE Altadedetalleventa (IN pIdVentas INTEGER,IN pCNS_DV INTEGER,IN pcodi_barra varchar, pPrecio_Venta_Arti numeric(10,2), pCantidad INTEGER, pTotal_Venta_Arti NUMERIC(10,2), INOUT pRes INTEGER) AS $$
DECLARE 
   vreg RECORD;
   vr   RECORD;
   vrproduc RECORD;
   vRes INTEGER;
BEGIN
    -- Validar si existe el idventa
    Select into vreg * From venta Where Id_Ventas = pIdVentas FOR Update;
	IF FOUND THEN
       -- Validar si existe el articulo
       Select into vrproduc * From articulos where codi_barra = pcodi_barra FOR Update;
		IF FOUND THEN 
      		IF vrproduc.Stock >= pCantidad THEN
      		Select into vr *from detalle_venta where Id_Ventas = pIdVentas and cns_DV = pCNS_DV;
				IF NOT FOUND THEN
					--Actualizar el stock del articulo
      				vrproduc.Stock := vrproduc.Stock - pCantidad;
      				update articulos set Stock = vrproduc.Stock where codi_barra = pcodi_barra;
      				insert into detalle_Venta values( pIdVentas, null,pCNS_Dv, pcodi_barra, pPrecio_Venta_Arti, pCantidad, pTotal_Venta_Arti);
      				vRes := 1;
      				Commit;
				ELSE
					vRes:=5;
				END IF; -- CNS YA REALIZADO if not found then

			ELSE
				vRes:=4;--VALIDAR SI STOCK ALCANZA -- if then
			END IF; 
		ELSE
				vRes:=3;--VALIDAR SI PRODUCTO EXISTE  I FOUND THEN
		END IF;
	ELSE
			vRes:=2;--VALIDAR SI EL ID VENTA EXISTE IF FOUND THEN
	END IF;
    IF vRes > 1 THEN
       Rollback;
    END IF;
    pRes := vRes;
END;
$$ LANGUAGE plpgsql;



