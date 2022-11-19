/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package refaccionaria.Acciones;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Noe Guillen Gerardo
 */
public class Update {

    Connection conex;
    Conexion c = new Conexion();
    Statement st;
    ResultSet rs = null;
    PreparedStatement ps = null;
    String sql;//variable para recibir las sentencias de insercion
    boolean respu;

    public Update() {
        conex = c.ConectarBD();
    }

    public boolean updateEmpleado(String id_Emp, String nombre_Emp, String ap_Pat, String ap_Mat, int status_Empleado, String tel_Empleado, String correo) {//metodo para actualizar un empleado
        //se prepara la actualizacion de un empleado
        sql = "update empleado set nombre_Emp='" + nombre_Emp + "', ap_Pat='" + ap_Pat + "', ap_Mat='" + ap_Mat + "', status_Empleado='" + status_Empleado + "', tel_Empleado='" + tel_Empleado + "', correo= '" + correo + "' where id_Emp='" + id_Emp + "'; ";

        respu = true;// nos devuelven el valor booleano despues de la insercion
        try {
            st = conex.createStatement();
            respu = st.execute(sql);
            System.out.println(respu);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            try {
                st.close();//cierra la conexion
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                System.out.println(ex.getMessage());
            }
        }
        return !respu;//retorno de respuesta
    }

    public boolean updateCliente(String id_Cliente, String nombre, String ap_Pat, String ap_Mat, String telefono) {//metodo para actualizar un Cliente
        //se prepara la actualizacion de un cliente
        sql = "update cliente set nombre='" + nombre + "', ap_Pat='" + ap_Pat + "', ap_Mat='" + ap_Mat + "', telefono='" + telefono + "' where id_Cliente='" + id_Cliente + "'; ";

        respu = true;// nos devuelven el valor booleano despues de la insercion
        try {
            st = conex.createStatement();
            respu = st.execute(sql);
            System.out.println(respu);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            try {
                st.close();//cierra la conexion
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                System.out.println(ex.getMessage());
            }
        }
        return !respu;//retorno de respuesta
    }

    public boolean updateVenta(int id_Ventas, int id_Cliente, int id_Emp, String fecha_venta, float monto_Final) {//metodo para actualizar una venta
        //se prepara la actualizacion de venta
        sql = "update venta set id_Cliente='" + id_Cliente + "', id_Emp='" + id_Emp + "', fecha_Venta='" + fecha_venta + "', monto_Final='" + monto_Final + "' where id_Ventas='" + id_Ventas + "'; ";

        respu = true;// nos devuelven el valor booleano despues de la insercion
        try {
            st = conex.createStatement();
            respu = st.execute(sql);
            System.out.println(respu);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            try {
                st.close();//cierra la conexion
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                System.out.println(ex.getMessage());
            }
        }

        return !respu;//retorno de respuesta

    }

    public boolean updateTipoDeMoto(int id_Tipo, String modelo, String nombre_TipoM, String marca, int anio) {//metodo para actualizar un TipoDeMoto
        //se prepara la actualiazacion tipo de moto
        sql = "update Tipo_De_Moto set modelo='" + modelo + "', nombre_TipoM='" + nombre_TipoM + "', marca='" + marca + "', anio='" + anio + "' where id_Tipo='" + id_Tipo + "'; ";

        respu = true;// nos devuelven el valor booleano despues de la insercion
        try {
            st = conex.createStatement();
            respu = st.execute(sql);
            System.out.println(respu);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            try {
                st.close();//cierra la conexion
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                System.out.println(ex.getMessage());
            }
        }

        return !respu;//retorno de respuesta

    }

    public boolean updateProductos(String codi_barra, int id_Tipo, String nombre_Arti, String marca, float precio, int stock) {//metodo para actualizar un articulo
        //se prepara la actualizacion de un articulo
        sql = "update Articulos set  id_Tipo='" + id_Tipo + "', nombre_Arti='" + nombre_Arti + "', marca='" + marca + "', precio='" + precio + "', stock='" + stock + "' where codi_Barra='" + codi_barra + "'; ";

        respu = true;// nos devuelven el valor booleano despues de la insercion
        try {
            st = conex.createStatement();
            respu = st.execute(sql);
            System.out.println(respu);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            try {
                st.close();//cierra la conexion
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                System.out.println(ex.getMessage());
            }
        }

        return !respu;//retorno de respuesta

    }

    public boolean updateServicios(int id_Servi, String descripcion, int precio_Servi) {//metodo para actualizar un servicio
        //se prepara la actualizacion de servicio
        sql = "update Servicios  set descripcion='" + descripcion + "', precio_Servi='" + precio_Servi + "' where id_Servi='" + id_Servi + "'; ";

        respu = true;// nos devuelven el valor booleano despues de la insercion
        try {
            st = conex.createStatement();
            respu = st.execute(sql);
            System.out.println(respu);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            try {
                st.close();//cierra la conexion
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                System.out.println(ex.getMessage());
            }
        }

        return !respu;//retorno de respuesta

    }

    public boolean updateProveedor(String rfc_Proveedor, String nombre, String telefono) {//metodo para actualizar un Proveedor
        //se prepara la actualizacion del dato del proveedor
        sql = "update Proveedor set nombre='" + nombre + "', telefono='" + telefono + "' where rfc_proveedor='" + rfc_Proveedor + "'; ";

        respu = true;// nos devuelven el valor booleano despues de la insercion
        try {
            st = conex.createStatement();
            respu = st.execute(sql);
            System.out.println(respu);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            try {
                st.close();//cierra la conexion
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                System.out.println(ex.getMessage());
            }
        }

        return !respu;//retorno de respuesta

    }

    public boolean updateUsuarios(int id_Usuario, String nombre_usuario, String contraseña) {//metodo para actualizar un Usuario
        //se prepara la actualizacion del dato de un Usuario
        sql = "update usuarios set nombre_usuario='" + nombre_usuario + "', contrasenia='" + contraseña + "' where id_usuario='" + id_Usuario + "'; ";

        respu = true;// nos devuelven el valor booleano despues de la insercion
        try {
            st = conex.createStatement();
            respu = st.execute(sql);
            System.out.println(respu);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            try {
                st.close();//cierra la conexion
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                System.out.println(ex.getMessage());
            }
        }

        return !respu;//retorno de respuesta

    }

}
