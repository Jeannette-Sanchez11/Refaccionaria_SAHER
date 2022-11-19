package refaccionaria.Acciones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Noe Guillen Gerardo
 */
public class Select {

    Connection conex;
    Conexion c = new Conexion();
    Statement st;
    ResultSet rs = null;
    PreparedStatement ps = null;
    String sql;//variable para recibir las sentencias de busqueda
    int respu;

    public Select() {
        conex = c.ConectarBD();
    }

    //seleccionar un empleado por medio del id (duda: status empleado se obtiene como un string o como un int )
    public String[] selectEmpleado(int id_Emp) {
        String sql = "select * from usuarios where nombreUsu='" + id_Emp + "';";
        String[] x = new String[1];
        try {
            st = conex.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                x[0] = rs.getString("nombre_Emp");
                x[1] = rs.getString("ap_Pat");
                x[2] = rs.getString("ap_Mat");
                x[3] = rs.getString("status_Empleado");
                x[4] = rs.getString("tel_Empleado");
                x[5] = rs.getString("correo");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e.getMessage());
        } finally {
            try {
                st.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        return x;
    }
    //Lista de los modelos de los tipos de moto

    public String[] verModelo() {
        String sql = "select modelo from Tipo_de_Moto;";
        String[] x = new String[1];
        try {
            st = conex.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = st.executeQuery(sql);
            rs.last();
            int filas = rs.getRow();
            rs.beforeFirst();
            x = new String[filas];
            filas = 0;
            while (rs.next()) {
                x[filas] = rs.getString("modelo");
                filas++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e.getMessage());
        } finally {
            try {
                st.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        return x;
    }

    //regresar el id del tipo de moto
    public String BuacarIDTM(String modelo) {
        String idtm = "";
        sql = "select id_Tipo from Tipo_de_Moto where modelo='" + modelo + "'";
        try {
            st = conex.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                idtm = rs.getString(1);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e.getMessage());
        } finally {
            try {
                st.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

        return idtm;
    }

    public String BuacarModelo(int id_tipo) {
        String modelo = "";
        sql = "select modelo from tipo_de_moto where id_Tipo=" + id_tipo + ";";
        try {
            st = conex.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                modelo = rs.getString(1);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e.getMessage());
        } finally {
            try {
                st.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

        return modelo;
    }

    public String[] verProveedor() {//Mostrar la lista de proveedores
        String sql = "select nombre from proveedor;";
        String[] x = new String[1];
        try {
            st = conex.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = st.executeQuery(sql);
            rs.last();
            int filas = rs.getRow();
            rs.beforeFirst();
            x = new String[filas];
            filas = 0;
            while (rs.next()) {
                x[filas] = rs.getString("nombre");
                filas++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e.getMessage());
        } finally {
            try {
                st.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        return x;
    }

    //regresar el id del tipo de moto
    public String BuacarIPr(String nombre) {
        String idtm = "";
        sql = "select rfc_Proveedor from proveedor where nombre='" + nombre + "';";
        try {
            st = conex.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                idtm = rs.getString(1);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e.getMessage());
        } finally {
            try {
                st.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

        return idtm;
    }

    public String BuscarNombre(String codi_Barra) {
        String Nombre = "";
        sql = "select nombre_Arti from articulos where codi_Barra='" + codi_Barra + "';";
        try {
            st = conex.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Nombre = rs.getString(1);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e.getMessage());
        } finally {
            try {
                st.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

        return Nombre;
    }

    public String buscarIdc() {//busca el id compra mas alto
        String idc = "";
        sql = "select max(id_compra) from compraM;";
        try {
            st = conex.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                idc = rs.getString(1);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e.getMessage());
        } finally {
            try {
                st.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

        return idc;
    }

}
