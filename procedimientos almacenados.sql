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
      				--Actualizar el total de compra
      				vreg.Monto_totalC:= vreg.Monto_totalC + (pCantidad * pprecio_compra_Arti);
      				update compraM set Monto_totalC = vreg.Monto_totalC where id_compra = pId_compra;
      				ptotal_compra_arti:= pCantidad * pprecio_compra_Arti;
      				--Insertar los datos a la tabla detalle venta

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

call Altadedetallecompraprove (1, 2, '00000000010', 'sex', 50.04,  10, 10.03, null);