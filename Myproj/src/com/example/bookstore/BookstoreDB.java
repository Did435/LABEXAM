package com.example.bookstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class BookstoreDB {

    public static void main(String[] args) {
        // JDBC URL, username and password of MySQL server
        String url = "jdbc:mysql://localhost:3306/BookstoreDB"; // Assumes DB already created
        String user = "root";
        String password = "!Bp0.91..%&"; // Replace with your actual password

        // SQL to create the Books table
        String sql = "CREATE TABLE IF NOT EXISTS Books ("
                   + "id INT AUTO_INCREMENT PRIMARY KEY, "
                   + "title VARCHAR(255), "
                   + "author VARCHAR(255), "
                   + "price DOUBLE)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            // Execute SQL statement
            stmt.executeUpdate(sql);
            System.out.println("Books table created successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
