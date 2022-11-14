/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package refaccionaria.Acciones;

import java.sql.*;

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
    int respu;

    public Update() {
        conex = c.ConectarBD();
    }

}
