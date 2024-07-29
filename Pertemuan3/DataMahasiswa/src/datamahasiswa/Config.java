/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datamahasiswa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Lenovo
 */
public class Config {
    public static Connection getConnection() {
        Connection conn = null;
        String url
                = "jdbc:mysql://localhost:3306/data_mahasiswa";
        String user = "root";
        String password = "";
        try {
            conn = DriverManager.getConnection(url, user,
                    password);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return conn;
    }

    public static void main(String[] args) {
        try {
            Connection c = Config.getConnection();
            System.out.println(String.format("Connected todatabase % s " + "successfully.", c.getCatalog()));
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
