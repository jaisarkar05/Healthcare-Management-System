package com.healthcare.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    private static final String URL = "jdbc:mysql://localhost:3306/healthcare_db?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";  
    private static final String PASSWORD = "J@i$1000"; 

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("MySQL JDBC Driver not found!");
        }
    }

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Database Connection Failed!");
            e.printStackTrace();
        }
        return conn;
    }
}
