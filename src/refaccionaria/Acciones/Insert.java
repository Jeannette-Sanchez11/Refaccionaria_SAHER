
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
        //se prepara la insercion del dato de empleado
        sql="Insert into Empleado(nombre_Emp, ap_Pat, ap_Mat, status_Empleado, tel_Empleado, correo) values ('"+nombre_Emp+"','"+ap_Pat+"','"+ap_Mat+"',"+status_Empleado+",'"+tel_Empleado+"','"+correo+"');;";
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
    
    public boolean insertCliente(String nombre,String ap_Pat,String ap_Mat, String telefono){//metodo para insertar un cliente
        //se prepara la insercion del dato de proveedor
        sql="insert into cliente (nombre,Ap_pat,Ap_mat,Telefono)  values('"+nombre+"','"+ap_Pat+"','"+ap_Mat+"','"+telefono+"');";
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
    
    public boolean insertTipoDeMoto(String modelo,String nombre_TipoM,String marca, int anio){//metodo para insertar un tipo de moto
        //se prepara la insercion del dato de proveedor
        sql="insert into Tipo_De_Moto(modelo, nombre_TipoM, marca, anio) values('"+modelo+"','"+nombre_TipoM+"','"+marca+"',"+anio+");";
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
    
    public boolean insertArticulos(String codi_Barra,int id_Tipo,String nombre_Arti, String marca, float precio, int stock){//metodo para insertar un articulo
        //se prepara la insercion del dato de Articulos
        sql="insert into Articulos(codi_Barra, id_Tipo, nombre_Arti, marca, precio, stock) values('"+codi_Barra+"',"+id_Tipo+",'"+nombre_Arti+"','"+marca+"',"+precio+","+stock+");";
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
 
    public boolean insertServicios(String descripcion,float precio_Servi){//metodo para insertar un servicio
        //se prepara la insercion del dato de servicios
        sql="insert into Servicios(descripcion, precio_Servi) values('"+descripcion+"',"+precio_Servi+");";
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
    
    public boolean insertProveedor(String rfc,String nombre,String telefono){//metodo para insertar un proveedor
        //se prepara la insercion del dato de proveedor
        sql="insert into Proveedor(rfc_Proveedor, nombre, telefono) values('"+rfc+"','"+nombre+"','"+telefono+"');";
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

    public boolean insertUsuarios(String nombre_usuario,String contrasenia){//metodo para insertar un usuario
        //se prepara la insercion del dato de usuario
        sql="insert into usuarios(nombre_usuario, contrasenia) values('"+nombre_usuario+"','"+contrasenia+"');";
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
