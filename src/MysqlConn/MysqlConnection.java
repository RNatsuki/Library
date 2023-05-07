/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MysqlConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ibarra
 */
public final class MysqlConnection {

    private final String DbName = "library";
    private final String uri = "jdbc:mysql://localhost:3306/";;
    private final String DbUser = "root";
    private final String Dbpassword = "";

    public Connection conn;

    public void getConnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(uri + DbName, DbUser, Dbpassword);
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Connection Failed" + e);
        }

    }

    public MysqlConnection() {
        this.getConnection();
    }

    public void close() throws SQLException {
        this.conn.close();
    }
   
}
