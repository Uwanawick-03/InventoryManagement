/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import java.sql.*;
public class DBConnection {
    private static DBConnection instance;
    private Connection con;
    String url = "jdbc:mysql://localhost/sales_management";
    String user = "root";
    String password = "";
    
    private DBConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,user,password);
            
        }catch(Exception e){
            System.out.println(e);
            
        }
    }
    
    public static DBConnection getInstance(){
        if (instance==null){
            instance = new DBConnection();
        }
        return instance;
    }
    Connection getConnection(){
        return con;
}
    public class DBHelper {
    public static Connection getConnection() {
        return DBConnection.getInstance().getConnection();
    }
}

    
}
