/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author links
 */
public class Conexion {
    
    public Connection con;
    
    public Conexion(){
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdprometeus", "root", "12345");
        } catch (Exception e) {
            
            System.out.println("Error: "+e);
        }
    
    }
    
    
}
