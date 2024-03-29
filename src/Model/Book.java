package Model;

import MysqlConn.MysqlConnection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ibarra
 */
public class Book {

    MysqlConnection mysql = new MysqlConnection();

    int BOOK_ID;
    String TITLE;
    int PUBLISHED_YEAR;
    String AUTHOR;
    String CATEGORY;
    int EDITION;
    String LANGUAJE;
    int STOCK;

    public Book(int BOOK_ID, String TITLE, int PUBLISHED_YEAR, String AUTHOR, String CATEGORY, int EDITION,
            String LANGUAJE, int stock) {
        this.BOOK_ID = BOOK_ID;
        this.TITLE = TITLE;
        this.PUBLISHED_YEAR = PUBLISHED_YEAR;
        this.AUTHOR = AUTHOR;
        this.CATEGORY = CATEGORY;
        this.EDITION = EDITION;
        this.LANGUAJE = LANGUAJE;
        this.STOCK = stock;

    }

    public Book() {

    }

    public Book(int BOOK_ID) {
        this.BOOK_ID = BOOK_ID;
    }

    public void loan(String userId) {
        try {

            User user = new User();

            if (!user.exists(userId)) {
                JOptionPane.showMessageDialog(null, "Id de usuario no existente");
                return;
            }

            if (!this.exists()) {
                JOptionPane.showMessageDialog(null, "Id de libro no existente");
                return;
            }

            if (!this.existsStock()) {
                JOptionPane.showMessageDialog(null, "El libro no está en existencia");
                return;
            }
            
            String query = "INSERT INTO loans(UserId,bookId) VALUES('" + userId + "','" + this.BOOK_ID + "')";
            Statement st = mysql.conn.createStatement();
            st.executeUpdate(query);

            String query2 = "UPDATE books set stock = stock-1 WHERE id = '" + this.BOOK_ID + "'";
            Statement st2 = mysql.conn.createStatement();
            st2.executeUpdate(query2);

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public boolean existsStock() throws SQLException {
        String query = "SELECT stock FROM books WHERE id = '" + this.getBOOK_ID() + "'";
        Statement st = mysql.conn.createStatement();
        ResultSet rs = st.executeQuery(query);

        int stock = 0;

        while (rs.next()) {
            stock = rs.getInt("stock");
        }

        return stock > 0;

    }

    public boolean exists() throws SQLException {
        String query = "SELECT id FROM books WHERE id = " + this.getBOOK_ID();
        Statement st = mysql.conn.createStatement();
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            return true;
        }
        return false;
    }

    public ResultSet getBooks() throws SQLException {
        String sql = "SELECT * FROM Books";
        Statement st = mysql.conn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        return rs;
    }

    public ResultSet getLoans() throws SQLException {
        String query = "SELECT idPrestamo,UserId,full_name,Books.id as BookId ,title,year,author,category,language "
                + "FROM Loans JOIN Users ON Loans.UserId = Users.username "
                + "JOIN books ON Loans.BookId = Books.id";
        Statement st = mysql.conn.createStatement();
        ResultSet rs = st.executeQuery(query);
        return rs;
    }

    public ResultSet getReturns() throws SQLException {
        String query = """
                       SELECT idPrestamo,UserId,full_name,Books.id as BookId ,title,year,author,category,language,returned FROM Loans JOIN Users ON Loans.UserId = Users.username JOIN books
                       ON Loans.BookId = Books.id WHERE returned = 1""";
        Statement st = mysql.conn.createStatement();
        ResultSet rs = st.executeQuery(query);
        return rs;
    }

    public void save() throws SQLException {
        String query = "INSERT INTO books(id,title,year,author,category,edition,language,stock)"
                + " VALUES('" + this.getBOOK_ID() + "','" + this.getTITLE() + "','" + this.getPUBLISHED_YEAR() + "','"
                + this.getAUTHOR() + "','" + this.getCATEGORY() + "','" + this.getEDITION() + "','" + this.getLANGUAJE()
                + "','" + this.getSTOCK() + "')";
        Statement st = mysql.conn.createStatement();
        st.executeUpdate(query);

    }

    public void update() throws SQLException {
        //update set stock = stock
        String query = "UPDATE books set title = '" + this.getTITLE() + "', year = '" + this.getPUBLISHED_YEAR() + "', author = '" + this.getAUTHOR() + "', category = '" + this.getCATEGORY() + "', edition = '" + this.getEDITION() + "', language = '" + this.getLANGUAJE() + "', stock = stock WHERE id = '" + this.getBOOK_ID() + "' ";
        Statement st = mysql.conn.createStatement();
        st.executeUpdate(query);
    }

    public int deleteById(int id) throws SQLException {
        String query = "DELETE FROM books WHERE id = '" + id + "' ";
        Statement st = mysql.conn.createStatement();
        int rows = st.executeUpdate(query);
        return rows;

    }

    public void returnBook(int idPrestamo) throws SQLException {

        //is returned
        String queryIsReturned = "SELECT returned FROM loans WHERE idPrestamo = '" + idPrestamo + "'";
        Statement stReturned = mysql.conn.createStatement();
        ResultSet rsReturned = stReturned.executeQuery(queryIsReturned);
        int returned = 0;
        while (rsReturned.next()) {
            returned = rsReturned.getInt("returned");
        }

        if (returned == 1) {
            JOptionPane.showMessageDialog(null, "Este prestamo ya ha sido devuelto");
            return;
        }

        String queryGetBookId = "SELECT BookId from loans WHERE idPrestamo = '" + idPrestamo + "'";
        Statement stSearch = mysql.conn.createStatement();
        ResultSet rs = stSearch.executeQuery(queryGetBookId);
        int bookid = 0;
        while (rs.next()) {
            bookid = rs.getInt("BookId");

        }

        String query = "UPDATE books SET stock = stock+1 WHERE id = '" + bookid + "'";
        Statement st = mysql.conn.createStatement();
        st.executeUpdate(query);

        String query2 = "UPDATE loans set returned = 1 WHERE idPrestamo = '" + idPrestamo + "'";
        Statement st2 = mysql.conn.createStatement();
        st2.executeUpdate(query2);

    }

    public int getBOOK_ID() {
        return BOOK_ID;
    }

    public void setBOOK_ID(int BOOK_ID) {
        this.BOOK_ID = BOOK_ID;
    }

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }

    public int getPUBLISHED_YEAR() {
        return PUBLISHED_YEAR;
    }

    public void setPUBLISHED_YEAR(int PUBLISHED_YEAR) {
        this.PUBLISHED_YEAR = PUBLISHED_YEAR;
    }

    public String getAUTHOR() {
        return AUTHOR;
    }

    public void setAUTHOR(String AUTHOR) {
        this.AUTHOR = AUTHOR;
    }

    public String getCATEGORY() {
        return CATEGORY;
    }

    public void setCATEGORY(String CATEGORY) {
        this.CATEGORY = CATEGORY;
    }

    public int getEDITION() {
        return EDITION;
    }

    public void setEDITION(int EDITION) {
        this.EDITION = EDITION;
    }

    public String getLANGUAJE() {
        return LANGUAJE;
    }

    public void setLANGUAJE(String LANGUAJE) {
        this.LANGUAJE = LANGUAJE;
    }

    public int getSTOCK() {
        return STOCK;
    }

    public void setSTOCK(int STOCK) {
        this.STOCK = STOCK;
    }

}
