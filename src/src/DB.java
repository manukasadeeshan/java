
package src;

import java.sql.*;

public class DB {
  
    static Connection con = null;
    private static Statement st;
    public static Connection getConnection(){
        
        try {
           
            Class.forName("com.mysql.jdbc.driver");
            con =DriverManager.getConnection("jdbc:mysql://localhost:3306/bmi","sadeeshan","Manuka0328");
            st=con.createStatement();
            
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        return con;
        
    }

    
}
