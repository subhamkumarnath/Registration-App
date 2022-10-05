package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/RegisterApp", "root", "system");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
