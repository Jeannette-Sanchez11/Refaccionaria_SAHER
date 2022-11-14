package refaccionaria.Acciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jesanher
 */
public class Conexion {

    //variables para la conexioon a la base de datos en postgres
    public Connection conexion=null;
    public String driver="org.postgresql.Driver";
    public String user="postgres";
    public String contra="postgres135";
    public String link="jdbc:postgresql://localhost:5432/refaccionaria";
    
    //metodo conexion con usuario
    public Connection ConectarBD()
    {
        try
        {
            System.out.println("Conectando a la BDD...");
            Class.forName(driver);//driver para la conexion
            conexion=DriverManager.getConnection(link, user, contra);
            //JOptionPane.showMessageDialog(null, "Conexion exitosa");
              System.out.println("Conexion Exitosa!!");
        }catch(ClassNotFoundException | SQLException e)
        {//manda el error de conexion de la bd
             System.out.println("Error de conexion " + e.getMessage() );
        }
        return conexion;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Conexion c= new Conexion();
        c.ConectarBD();
    
    }
    
}
