/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views;

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
public final class UsersView extends javax.swing.JPanel {

    public static DefaultTableModel model_table_users;
    boolean isAdmin;
    public static String user_name = System.getProperty("user.name");
    

    public UsersView(boolean isAdmin) {
        try {
            initComponents();
            this.setLocation(WIDTH, WIDTH);
            model_table_users = (DefaultTableModel) this.tbl_users.getModel();
            this.isAdmin = isAdmin;
            initializePopUpMenu();

            updateTable();
        } catch (SQLException ex) {
            Logger.getLogger(UsersView.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (!isAdmin) {
            btn_edit.setEnabled(false);
            btn_menu_add.setEnabled(false);
        }

    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pp_menu_table = new javax.swing.JPopupMenu();
        background = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_users = new javax.swing.JTable();
        btn_menu_add = new CustomComponents.KButton();
        book_search = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_edit = new CustomComponents.KButton();

        tbl_users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"El Principito", "Antoine de Saint-Exupery", "2016", null}
            },
            new String [] {
                "NUMERO CONTROL", "NOMBRE", "CONTRASEÑA", "EDAD"
            }
        ));
        tbl_users.setToolTipText("");
        tbl_users.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbl_users);

        btn_menu_add.setText("Nuevo Usuario");
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

        btn_edit.setText("Editar");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

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
                        .addGap(50, 50, 50)
                        .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jLabel1)
                    .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        model_table_users.setRowCount(0);
        try {
            MysqlConnection mysql = new MysqlConnection();

            String search = book_search.getText();
            String query = "SELECT * FROM users WHERE username LIKE '%" + search + "%' OR password LIKE '%" + search
                    + "%' OR full_name LIKE '%" + search + "%' OR age LIKE '%" + search + "%'";

            Statement st = mysql.conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                model_table_users.addRow(new Object[]{rs.getString("username"),
                rs.getString("full_name"),rs.getString("password") ,rs.getString("age")});
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsersView.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_book_searchKeyReleased

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        edit();
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_menu_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu_addActionPerformed
        AddUsersForm uf = new AddUsersForm();
        uf.setVisible(true);
    }//GEN-LAST:event_btn_menu_addActionPerformed

    public void initializePopUpMenu() {

        if (isAdmin) {
            JMenuItem deleteBook = new JMenuItem("Eliminar");
            pp_menu_table.add(deleteBook);
            deleteBook.addActionListener((ActionEvent e) -> {
                try {
                    String usernameSelected = tbl_users.getValueAt(tbl_users.getSelectedRow(), 0).toString();
                    User user = new User(usernameSelected, "");
                    user.delete();
                    MainView.showJpanel(new UsersView(true));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Selecciona el libro primero");
                }
            });
        }
        tbl_users.setComponentPopupMenu(pp_menu_table);

    }

    public static void updateTable() throws SQLException {
        model_table_users.setRowCount(0);

        User user = new User();
        ResultSet rs = user.getUsers();
        while (rs.next()) {
            model_table_users.addRow(new Object[]{rs.getString("username"),
                rs.getString("full_name"),rs.getString("password") ,rs.getString("age")});
        }

    }

    public void edit() {
        int selected = tbl_users.getSelectedRow();
        if (selected == -1) {
            System.out.println("Selecciona un registro");
            return;
        }

        int id = (int) tbl_users.getValueAt(selected, 0);
        String title = (String) tbl_users.getValueAt(selected, 1);
        int year = (int) tbl_users.getValueAt(selected, 2);
        String author = (String) tbl_users.getValueAt(selected, 3);
        String category = (String) tbl_users.getValueAt(selected, 4);
        int edition = (int) tbl_users.getValueAt(selected, 5);
        String language = (String) tbl_users.getValueAt(selected, 6);

        ModifyBookForm modifyBook = new ModifyBookForm(id, title, year, author, category, edition, language);
        modifyBook.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JTextField book_search;
    private CustomComponents.KButton btn_edit;
    public static CustomComponents.KButton btn_menu_add;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu pp_menu_table;
    public javax.swing.JTable tbl_users;
    // End of variables declaration//GEN-END:variables
}
