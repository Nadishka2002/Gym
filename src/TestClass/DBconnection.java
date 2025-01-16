/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestClass;
//import com.sun.jdi.connect.spi.Connection;
//import java.io.IOException;
//import javax.swing.JOptionPane;
//import java.sql.SQLException;
//import java.sql.*;
import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author warun
 */
public class DBconnection {
    static public final String DB_URL = "jdbc:mysql://localhost/gms";//JAVA DATABASE CONNECTIVITY(jdbc) , where the DB is.
    static public final String USERNAME = "root";
    static public final String PASSWORD = "";

    static Connection conn = null;
    static PreparedStatement pst;

    public static Connection getConn() {
        //is to create the connection and return

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            System.out.println("DB Connected..!!");

        } catch (Exception obj) {
            JOptionPane.showMessageDialog(null, obj.toString());
        };

        return conn;
    }

    public static void closeConn() throws SQLException {
        conn.close();
    }
}
