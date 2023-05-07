/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import MysqlConn.MysqlConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ibarra
 */
public class User {

    /*
    @Class Attributes
     */
    String username;
    String password;
    String role = null;
    String fullName;
    int age;
    String defaultRole = "user";
    

    MysqlConnection mysql = new MysqlConnection();

    public boolean exists() throws SQLException {
        String query = "SELECT username, password,role FROM users WHERE username = ? AND password = ?";
        PreparedStatement ps = mysql.conn.prepareStatement(query);
        ps.setString(1, this.username);
        ps.setString(2, this.password);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            this.role = rs.getString("role");
            return true;
        }

        return false;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public User() {
    }
    
    public  User(String username, String password, String name, int age){
        this.username = username;
        this.password = password;
        this.fullName = name;
        this.age = age;
    }
    
    public ResultSet getUsers() throws SQLException{
        String query = "SELECT username,full_name,age,password FROM Users WHERE role != 'admin'";
        Statement st = mysql.conn.createStatement();
        ResultSet rs = st.executeQuery(query);
        return  rs;
    }
    
    public void save() throws SQLException{
        String query = "INSERT INTO users(username,password,full_name,age,role)"
                + "VALUES('"+this.getUsername()+"','"+this.getPassword()+"','"+this.getFullName()+"','"+this.getAge()+"','"+this.getDefaultRole()+"')";
        Statement st = mysql.conn.createStatement();
        int rs = st.executeUpdate(query);
    }
    
    public void delete(){
        try {
            String query = "DELETE FROM users WHERE username = '"+this.getUsername()+"'";
            Statement st = mysql.conn.createStatement();
            st.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isAdmin() {

        return this.role.equals("admin");
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getDefaultRole() {
        return defaultRole;
    }
    

}
