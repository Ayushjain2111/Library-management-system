
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JAIN
 */
public class javaconnect {
   Connection con;
   
   public static Connection ConnectDb(){
        
        String host = "jdbc:mysql://localhost:3306/librarynew";
        String username = "root";
        String password = "1234";
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con= DriverManager.getConnection(host,username,password);
           return con;
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           return null;
       }
   }
}
