package cpit305.chapter7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestSelect {

    public static void main(String[] args) {
        try {
            //Registration or loading for of the driver
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fcit", "root", "jK~1|Zoh7zg3");
            Statement stmt = con.createStatement();
            String query = "SELECT * FROM course;";
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()){
                String c = rs.getString("code");
                String n = rs.getString("name");
                int cr = rs.getInt("credits");
                
                System.out.println("CODE: " + c + ", NAME: " + n + ", CREDITS: " + cr);
            }
            
            rs.close();
            stmt.close();
            con.close();
        } catch (ClassNotFoundException ex) {
            System.out.println("Please check the driver class");
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
