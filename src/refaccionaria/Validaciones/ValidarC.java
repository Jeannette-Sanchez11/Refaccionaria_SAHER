
package refaccionaria.Validaciones;
import java.sql.*;
import javax.swing.*;
import refaccionaria.Acciones.Conexion;
/**
 *
 * @author Noe Guillen Gerardo
 */
public class ValidarC {
    Connection conex;
    Conexion c = new Conexion();
    Statement st;
    ResultSet rs=null;
    PreparedStatement ps=null;
    String sql;//variable para recibir las sentencias de insercion
    int respu;

    public ValidarC() {
        conex = c.ConectarBD();
    }
    
    public int ValidarCliente(String nombre, String ap_Pat, String ap_Mat)
    {//metodo que valida el dato antes de registrase en la base de datos
        respu=0;//bandera
        try
        {
            sql="select nombre, ap_Pat, ap_Mat from cliente where nombre='"+nombre+"' and ap_Pat='"+ap_Pat+"' and ap_Mat='"+ap_Mat+"';";
            st=conex.createStatement();
            rs=st.executeQuery(sql);
            if (rs.next()) 
            {
                System.out.println("El dato existe en la base de datos!!");
                respu=0;//si el dato fue encontado se da la bandera de 0
            }else
            {
                System.out.println("El dato no ha sido registrado");
                respu=1;//el dato NO fue encontrado asi que manda la bandera de 1
            }
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null,e.getMessage() );
           System.out.println(e.getMessage());
        }finally{
            try {
                st.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage() );
            }
        }
        return respu;
    }//metodo de validar categoria
     public int ValidarEmpleado(String nombre, String ap_Pat, String ap_Mat)
    {//metodo que valida el dato antes de registrase en la base de datos
        respu=0;//bandera
        try
        {
            sql="";
            st=conex.createStatement();
            rs=st.executeQuery(sql);
            if (rs.next()) 
            {
                System.out.println("El dato existe en la base de datos!!");
                respu=0;//si el dato fue encontado se da la bandera de 0
            }else
            {
                System.out.println("El dato no ha sido registrado");
                respu=1;//el dato NO fue encontrado asi que manda la bandera de 1
            }
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null,e.getMessage() );
           System.out.println(e.getMessage());
        }finally{
            try {
                st.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage() );
            }
        }
        return respu;
    }//metodo de validar categoria
    
    
}
