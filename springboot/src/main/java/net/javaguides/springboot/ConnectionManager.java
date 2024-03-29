package net.javaguides.springboot;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionManager {
	
	private static String url = "jdbc:postgresql://localhost:5432/poles";    
    private static String driverName = "org.postgresql.Driver";   
    private static String username = "postgres";   
    private static String password = "postgres";
    private static Connection con;

    public static Connection getConnection() {

        try {
            Class.forName(driverName);
            try {
                con = DriverManager.getConnection(url, username, password);
            } catch (SQLException ex) {
                System.out.println("Failed to create the database connection."); 
            }

        } catch (ClassNotFoundException ex) {
            System.out.println("Driver not found."); 
        }
        return con;
    }
}
