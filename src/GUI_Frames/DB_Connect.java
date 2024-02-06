/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI_Frames;
import java.sql.Connection ; 
import java.sql.DriverManager;


/**
 *
 * @author Ocean
 */
public class DB_Connect {
    
    static Connection con = null;
    
    public static Connection getConnection()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lbms","root","Magic#5493");
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
    
    
}
