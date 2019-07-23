/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eduardoecheverria
 */
public class Conexion {
    
    private String db   = "system_ventas";
    private String user = "root";
    private String pass = "";
    private String url  = "jdbc:mysql://localhost:3310/sga?useSSL=false";
    private Connection conn = null;

    public Conexion() {
        
        try {
            //Driver SQL
            Class.forName("com.mysql.jdbc.Driver");
            //Obtenemos la conexión
            conn = DriverManager.getConnection( this.url, this.user, this.pass);
            if(conn != null){
                //Imprimimos mensaje de conexión realizada con éxito
                System.out.println("Base de Datos Ok:" + this.db );
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error:" + ex);
        }      
    }  

    public Connection getConn() {
        return conn;
    }
   
}
