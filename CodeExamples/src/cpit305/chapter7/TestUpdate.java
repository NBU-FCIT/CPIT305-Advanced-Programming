package cpit305.chapter7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestUpdate {

    public static void main(String[] args) {
        try {
            //Registration or loading for of the driver
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fcit", "root", "jK~1|Zoh7zg3");
            Statement stmt = con.createStatement();
            String query = "UPDATE course SET code = 'CPIT499' WHERE code = 'CPIT555';";
            int num = stmt.executeUpdate(query);
            System.out.println(num + " row(s) affected.");
            stmt.close();
            con.close();
        } catch (ClassNotFoundException ex) {
            System.out.println("Please check the driver class");
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
