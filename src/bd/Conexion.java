/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Yo
 */
public class Conexion {
    
    String url = "jdbc:mysql://localhost:3306/productosdb";
    String nombre = "root";
    String contraseña = "admin";

    Connection conexionBD = null;

    public Connection conexionToDB(){
        
        try{
            conexionBD = DriverManager.getConnection(url, nombre, contraseña);

            if(conexionBD != null){
            }
            
        }catch(SQLException ex){
            
            System.out.println("Error: "+ex);
            
        }
        
        return conexionBD;
        
    }
    
    
}
