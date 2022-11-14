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
    ResultSet rs=null;
    PreparedStatement ps=null;
    String sql;//variable para recibir las sentencias de insercion
    int respu;
    
    public Select(){
        conex = c.ConectarBD();
    }
    
    //seleccionar un empleado por medio del id (duda: status empleado se obtiene como un string o como un int )
     public String[] selectEmpleado(int id_Emp){        
        String sql="select * from usuarios where nombreUsu='"+id_Emp+"';";
        String []x=new String[1];
        try{
           st=conex.createStatement();
           rs=st.executeQuery(sql);
           while(rs.next()){
               x[0]=rs.getString("nombre_Emp");
               x[1]=rs.getString("ap_Pat");
               x[2]=rs.getString("ap_Mat");
               x[3]=rs.getString("status_Empleado");
               x[4]=rs.getString("tel_Empleado");
               x[5]=rs.getString("correo");
           }  
        }catch(Exception e){
           JOptionPane.showMessageDialog(null,e.getMessage() );
           System.out.println(e.getMessage());
        }finally{
            try {
                st.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage() );
            }
        }
        return x;
    }
    
}
