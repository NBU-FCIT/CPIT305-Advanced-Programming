package cpit305.chapter7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {

    public static void main(String[] args) {
        try {
            //Registration or loading for of the driver
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fcit", "root", "jK~1|Zoh7zg3");
            if(con != null){
                System.out.println("Connection made succesfully");
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Please check the driver class");
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
