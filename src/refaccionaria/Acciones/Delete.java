package refaccionaria.Acciones;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Noe Guillen Gerardo
 */
public class Delete {
    Connection conex;
    Conexion c = new Conexion();
    Statement stElim;
    String sqlElim;
    boolean respElim;
    
    public Delete(){
        conex = c.ConectarBD();
    }
    // Eliminar Empleado
    public boolean deleteEmpleado(int id_Emp){
      
        //se prepara la eliminacion del dato de la tabla empleado
        sqlElim="delete from Empleado where id_Emp="+id_Emp+";";
        respElim=true;// nos devuelven el valor booleano despues de la insercion
        try{
            stElim=conex.createStatement();
            respElim=stElim.execute(sqlElim);
            System.out.println(respElim);
        }catch(Exception e)
        {
             JOptionPane.showMessageDialog(null,e.getMessage() );
        }finally{
            try{
                stElim.close();//cierra la conexion
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex.getMessage() );
                System.out.println(ex.getMessage());
            }
        }
       
        return !respElim;//retorno de respuesta
        
    }
    
    // Eliminar Cliente
    public boolean deleteCliente(int id_Cliente){
      
        //se prepara la eliminacion del dato de la tabla cliente
        sqlElim="delete from Cliente where id_Cliente="+id_Cliente+";";
        respElim=true;// nos devuelven el valor booleano despues de la insercion
        try{
            stElim=conex.createStatement();
            respElim=stElim.execute(sqlElim);
            System.out.println(respElim);
        }catch(Exception e)
        {
             JOptionPane.showMessageDialog(null,e.getMessage() );
        }finally{
            try{
                stElim.close();//cierra la conexion
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex.getMessage() );
                System.out.println(ex.getMessage());
            }
        }
       
        return !respElim;//retorno de respuesta
        
    }

    /*
        // Eliminar Venta
    public boolean deleteVenta(int id_Ventas){
      
        //se prepara la eliminacion del dato de la tabla venta
        sqlElim="delete from Venta where id_Ventas="+id_Ventas+";";
        respElim=true;// nos devuelven el valor booleano despues de la insercion
        try{
            stElim=conex.createStatement();
            respElim=stElim.execute(sqlElim);
            System.out.println(respElim);
        }catch(Exception e)
        {
             JOptionPane.showMessageDialog(null,e.getMessage() );
        }finally{
            try{
                stElim.close();//cierra la conexion
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex.getMessage() );
                System.out.println(ex.getMessage());
            }
        }
       
        return !respElim;//retorno de respuesta
        
    }
*/
    
    // Eliminar Empleado
    public boolean deleteTipoDeMoto(int id_Tipo){
      
        //se prepara la eliminacion del dato de la tabla tipo_de_moto
        sqlElim="delete from Tipo_De_Moto where id_Tipo="+id_Tipo+";";
        respElim=true;// nos devuelven el valor booleano despues de la insercion
        try{
            stElim=conex.createStatement();
            respElim=stElim.execute(sqlElim);
            System.out.println(respElim);
        }catch(Exception e)
        {
             JOptionPane.showMessageDialog(null,e.getMessage() );
        }finally{
            try{
                stElim.close();//cierra la conexion
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex.getMessage() );
                System.out.println(ex.getMessage());
            }
        }
       
        return !respElim;//retorno de respuesta
        
    }
   
    // Eliminar articulo
    public boolean deleteArticulo(String codi_Barra){
      
        //se prepara la eliminacion del dato de la tabla articulos
        sqlElim="delete from Articulos where codi_Barra='"+codi_Barra+"';";
        respElim=true;// nos devuelven el valor booleano despues de la insercion
        try{
            stElim=conex.createStatement();
            respElim=stElim.execute(sqlElim);
            System.out.println(respElim);
        }catch(Exception e)
        {
             JOptionPane.showMessageDialog(null,e.getMessage() );
        }finally{
            try{
                stElim.close();//cierra la conexion
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex.getMessage() );
                System.out.println(ex.getMessage());
            }
        }
       
        return !respElim;//retorno de respuesta
        
    }  
    
    // Eliminar servicio
    public boolean deleteServicio(int id_Servi){
      
        //se prepara la eliminacion del dato de la tabla servicios
        sqlElim="delete from Servicios where id_Servi="+id_Servi+";";
        respElim=true;// nos devuelven el valor booleano despues de la insercion
        try{
            stElim=conex.createStatement();
            respElim=stElim.execute(sqlElim);
            System.out.println(respElim);
        }catch(Exception e)
        {
             JOptionPane.showMessageDialog(null,e.getMessage() );
        }finally{
            try{
                stElim.close();//cierra la conexion
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex.getMessage() );
                System.out.println(ex.getMessage());
            }
        }
       
        return !respElim;//retorno de respuesta
        
    }
    
    // Eliminar Proveedor
    public boolean deleteProveedor(String rfc_Proveedor){
      
        //se prepara la eliminacion del dato de la tabla proveedor
        sqlElim="delete from Proveedor where rcf_Proveedor="+rfc_Proveedor+";";
        respElim=true;// nos devuelven el valor booleano despues de la insercion
        try{
            stElim=conex.createStatement();
            respElim=stElim.execute(sqlElim);
            System.out.println(respElim);
        }catch(Exception e)
        {
             JOptionPane.showMessageDialog(null,e.getMessage() );
        }finally{
            try{
                stElim.close();//cierra la conexion
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex.getMessage() );
                System.out.println(ex.getMessage());
            }
        }
       
        return !respElim;//retorno de respuesta
        
    }
    /*
    // Eliminar compraM
    public boolean deleteCompra(int id_compra){
      
        //se prepara la eliminacion del dato de la tabla compra
        sqlElim="delete from CompraM where id_compra="+id_compra+";";
        respElim=true;// nos devuelven el valor booleano despues de la insercion
        try{
            stElim=conex.createStatement();
            respElim=stElim.execute(sqlElim);
            System.out.println(respElim);
        }catch(Exception e)
        {
             JOptionPane.showMessageDialog(null,e.getMessage() );
        }finally{
            try{
                stElim.close();//cierra la conexion
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex.getMessage() );
                System.out.println(ex.getMessage());
            }
        }
       
        return !respElim;//retorno de respuesta
        
    }
    */
    
    // Eliminar usuario
    public boolean deleteUsuario(int id_usuario){
      
        //se prepara la eliminacion del dato de la tabla usuario
        sqlElim="delete from usuarios where id_usuario="+id_usuario+";";
        respElim=true;// nos devuelven el valor booleano despues de la insercion
        try{
            stElim=conex.createStatement();
            respElim=stElim.execute(sqlElim);
            System.out.println(respElim);
        }catch(Exception e)
        {
             JOptionPane.showMessageDialog(null,e.getMessage() );
        }finally{
            try{
                stElim.close();//cierra la conexion
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex.getMessage() );
                System.out.println(ex.getMessage());
            }
        }
       
        return !respElim;//retorno de respuesta
        
    }
/*    
    // Eliminar detalle compra
    public boolean deleteEmpleado(int id_Emp){
      
        //se prepara la eliminacion del dato de la tabla empleado
        sqlElim="delete from Empleado where id_Emp="+id_Emp+";";
        respElim=true;// nos devuelven el valor booleano despues de la insercion
        try{
            stElim=conex.createStatement();
            respElim=stElim.execute(sqlElim);
            System.out.println(respElim);
        }catch(Exception e)
        {
             JOptionPane.showMessageDialog(null,e.getMessage() );
        }finally{
            try{
                stElim.close();//cierra la conexion
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex.getMessage() );
                System.out.println(ex.getMessage());
            }
        }
       
        return !respElim;//retorno de respuesta
        
    }
    
    // Eliminar detalle venta
    public boolean deleteEmpleado(int id_Emp){
      
        //se prepara la eliminacion del dato de la tabla empleado
        sqlElim="delete from Empleado where id_Emp="+id_Emp+";";
        respElim=true;// nos devuelven el valor booleano despues de la insercion
        try{
            stElim=conex.createStatement();
            respElim=stElim.execute(sqlElim);
            System.out.println(respElim);
        }catch(Exception e)
        {
             JOptionPane.showMessageDialog(null,e.getMessage() );
        }finally{
            try{
                stElim.close();//cierra la conexion
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex.getMessage() );
                System.out.println(ex.getMessage());
            }
        }
       
        return !respElim;//retorno de respuesta
        
    }
*/
}
