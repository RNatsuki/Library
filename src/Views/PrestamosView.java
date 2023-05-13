/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views;

import Model.Book;
import Model.User;
import java.awt.event.ActionEvent;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import MysqlConn.MysqlConnection;

/**
 *
 * @author Ibarra
 */
public final class PrestamosView extends javax.swing.JPanel {

    public static DefaultTableModel model_table_loans;
    boolean isAdmin;
    public static String user_name = System.getProperty("user.name");
    

    public PrestamosView(boolean isAdmin) {
        try {
            initComponents();
            this.setLocation(WIDTH, WIDTH);
            model_table_loans = (DefaultTableModel) this.tbl_loans.getModel();
            this.isAdmin = isAdmin;
            initializePopUpMenu();

            updateTable();
        } catch (SQLException ex) {
            Logger.getLogger(PrestamosView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pp_menu_table = new javax.swing.JPopupMenu();
        background = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_loans = new javax.swing.JTable();
        btn_menu_add = new CustomComponents.KButton();
        book_search = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        tbl_loans.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"El Principito", "Antoine de Saint-Exupery", null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NUM CONTROL", "NOMBRE", "LIBRO ID", "TITULO", "AÑO", "AUTOR", "CATEGORIA", "IDIOMA"
            }
        ));
        tbl_loans.setToolTipText("");
        tbl_loans.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbl_loans);

        btn_menu_add.setText("Nuevo Prestamo");
        btn_menu_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menu_addActionPerformed(evt);
            }
        });

        book_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                book_searchKeyReleased(evt);
            }
        });

        jLabel1.setText("Buscar:");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(btn_menu_add, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(book_search, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_menu_add, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(book_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void book_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_book_searchKeyReleased
        model_table_loans.setRowCount(0);
        try {
            MysqlConnection mysql = new MysqlConnection();

            String search = book_search.getText();
            String query = "SELECT idPrestamo,UserId,full_name,Books.id as BookId ,title,year,author,category,language "
                + "FROM Loans JOIN Users ON Loans.UserId = Users.username "
                + "JOIN books ON Loans.BookId = Books.id WHERE idPrestamo  LIKE '%"+search+"%' OR  UserId LIKE '%"+search+"%' OR full_name  LIKE '%"+search+"%' ";

            Statement st = mysql.conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                model_table_loans.addRow(new Object[]{
                rs.getInt("idPrestamo"),
                rs.getInt("UserId"),
                rs.getString("full_name") ,
                rs.getString("BookId"),
                rs.getString("title"),
                rs.getInt("year"),
                rs.getString("author"),
                rs.getString("category"),
                rs.getString("language"),
                
            });
            }

        } catch (SQLException ex) {
            Logger.getLogger(PrestamosView.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_book_searchKeyReleased

    private void btn_menu_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu_addActionPerformed
        PrestamoForm pf = new PrestamoForm();
        pf.setVisible(true);
    }//GEN-LAST:event_btn_menu_addActionPerformed

    public void initializePopUpMenu() {

        if (isAdmin) {
            JMenuItem deleteBook = new JMenuItem("Eliminar");
            pp_menu_table.add(deleteBook);
            deleteBook.addActionListener((ActionEvent e) -> {
                try {
                    String usernameSelected = tbl_loans.getValueAt(tbl_loans.getSelectedRow(), 0).toString();
                    User user = new User(usernameSelected, "");
                    user.delete();
                    MainView.showJpanel(new PrestamosView(true));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Selecciona el usuario primero");
                }
            });
        }
        tbl_loans.setComponentPopupMenu(pp_menu_table);

    }

    public static void updateTable() throws SQLException {
        model_table_loans.setRowCount(0);

        Book book = new Book();
        ResultSet rs = book.getLoans();
        while (rs.next()) {
            model_table_loans.addRow(new Object[]{
                rs.getInt("idPrestamo"),
                rs.getInt("UserId"),
                rs.getString("full_name") ,
                rs.getString("BookId"),
                rs.getString("title"),
                rs.getInt("year"),
                rs.getString("author"),
                rs.getString("category"),
                rs.getString("language"),
                
            });
        }

    }

    public void edit() {
        int selected = tbl_loans.getSelectedRow();
        if (selected == -1) {
            JOptionPane.showMessageDialog(this, "Selecciona un registro de la tabla");
            return;
        }

        String num_control = (String) tbl_loans.getValueAt(selected, 0);
        String full_name = (String) tbl_loans.getValueAt(selected,1);
        String password = (String) tbl_loans.getValueAt(selected,2);
        String age = (String) tbl_loans.getValueAt(selected,3);
       
        ModifyUserForm muf = new ModifyUserForm(num_control, full_name, password, age);
        muf.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JTextField book_search;
    public static CustomComponents.KButton btn_menu_add;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu pp_menu_table;
    public javax.swing.JTable tbl_loans;
    // End of variables declaration//GEN-END:variables
}
