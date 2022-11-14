
package refaccionaria.Acciones;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Noe Guillen Gerardo
 */
public class Insert {
 
    Connection conex;
    Conexion c = new Conexion();
    Statement st;
    String sql;//variable para recibir las sentencias de insercion
    boolean respuesta;
    
    public Insert(){
        conex = c.ConectarBD();
    }
    
    public boolean insertEmpleado(String nombre_Emp,String ap_Pat,String ap_Mat, int status_Empleado, String tel_Empleado, String correo){//metodo para insertar un proveedor
        //se prepara la insercion del dato de proveedor
        sql="insert into materiales values('"+nombre_Emp+"','"+ap_Pat+"',"+ap_Mat+"',"+status_Empleado+",'"+tel_Empleado+"','"+correo+"');";
        respuesta=true;// nos devuelven el valor booleano despues de la insercion
        try{
            st=conex.createStatement();
            respuesta=st.execute(sql);
            System.out.println(respuesta);
        }catch(Exception e)
        {
             JOptionPane.showMessageDialog(null,e.getMessage() );
        }finally{
            try{
                st.close();//cierra la conexion
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex.getMessage() );
                System.out.println(ex.getMessage());
            }
        }
       
        return !respuesta;//retorno de respuesta
        
    }
 
}
