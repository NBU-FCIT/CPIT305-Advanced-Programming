package cpit305.chapter7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsert {

    public static void main(String[] args) {
        try {
            //Registration or loading for of the driver
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fcit", "root", "jK~1|Zoh7zg3");
            Statement stmt = con.createStatement();
            String query = "INSERT INTO course VALUES('CPIT999', 'Math for Computer Science', 4);";
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
