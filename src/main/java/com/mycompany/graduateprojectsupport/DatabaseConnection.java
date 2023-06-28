
package com.mycompany.graduateprojectsupport;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection getConnection() {
        Connection con = null;
        try {
            final String url = "jdbc:mysql://localhost:3306/tgqd";
            Class.forName("com.mysql.cj.jdbc.Driver");
            String username = "root";
            String password = "conthino2210";
            con = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}
