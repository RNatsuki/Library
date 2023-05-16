/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Middlewares.FieldsValidator;
import Model.User;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ibarra
 */
public class ModifyUserForm extends javax.swing.JFrame {

    FieldsValidator validator = new FieldsValidator();

    public ModifyUserForm(String num_control, String full_name, String password, String age) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.user_id.setText(num_control);
        this.user_full_name.setText(full_name);
        this.user_password.setText(password);
        this.user_confirm_password.setText(password);
        this.user_age.setText(age);

        this.user_password.requestFocus();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        background = new javax.swing.JPanel();
        user_id = new javax.swing.JTextField();
        user_password = new javax.swing.JTextField();
        user_confirm_password = new javax.swing.JTextField();
        user_full_name = new javax.swing.JTextField();
        user_age = new javax.swing.JTextField();
        lbl_Id = new javax.swing.JLabel();
        lbl_title = new javax.swing.JLabel();
        lbl_year = new javax.swing.JLabel();
        lbl_author = new javax.swing.JLabel();
        lbl_category = new javax.swing.JLabel();
        btn_submit = new CustomComponents.Button();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EDITAR USUARIO");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user_id.setEditable(false);
        user_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                user_idKeyTyped(evt);
            }
        });

        user_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                user_passwordKeyPressed(evt);
            }
        });

        user_confirm_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_confirm_passwordActionPerformed(evt);
            }
        });
        user_confirm_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                user_confirm_passwordKeyPressed(evt);
            }
        });

        user_full_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                user_full_nameKeyPressed(evt);
            }
        });

        user_age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                user_ageKeyPressed(evt);
            }
        });

        lbl_Id.setText("NUMERO CONTROL");

        lbl_title.setText("CONTRASEÑA");

        lbl_year.setText("CONFIRMAR CONTRASEÑA");

        lbl_author.setText("NOMBRE");

        lbl_category.setText("EDAD");

        btn_submit.setBackground(new java.awt.Color(153, 255, 255));
        btn_submit.setText("Editar");
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });
        btn_submit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_submitKeyPressed(evt);
            }
        });

        jLabel1.setText("Editar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_year)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lbl_category, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_author, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lbl_Id)
                    .addComponent(lbl_title))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(user_id, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_password, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_confirm_password, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_full_name, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_age, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(btn_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Id))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_title))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_confirm_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_year))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_full_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_author))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_category))
                .addGap(78, 78, 78)
                .addComponent(btn_submit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
        updateUser();

    }//GEN-LAST:event_btn_submitActionPerformed

    private void user_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_user_idKeyTyped
        validator.onlyNumbers(evt);
    }//GEN-LAST:event_user_idKeyTyped

    private void user_confirm_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_confirm_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_confirm_passwordActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void btn_submitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_submitKeyPressed
        if (evt.getKeyChar() == evt.VK_ENTER) {
            updateUser();

        }
    }//GEN-LAST:event_btn_submitKeyPressed

    private void user_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_user_passwordKeyPressed
        if (evt.getKeyChar() == evt.VK_ENTER) {
            this.user_confirm_password.requestFocus();

        }
    }//GEN-LAST:event_user_passwordKeyPressed

    private void user_confirm_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_user_confirm_passwordKeyPressed
        if (evt.getKeyChar() == evt.VK_ENTER) {
            this.user_full_name.requestFocus();

        }
    }//GEN-LAST:event_user_confirm_passwordKeyPressed

    private void user_full_nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_user_full_nameKeyPressed
        if (evt.getKeyChar() == evt.VK_ENTER) {
            this.user_age.requestFocus();

        }
    }//GEN-LAST:event_user_full_nameKeyPressed

    private void user_ageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_user_ageKeyPressed
        if (evt.getKeyChar() == evt.VK_ENTER) {
            this.btn_submit.requestFocus();

        }
    }//GEN-LAST:event_user_ageKeyPressed

    int getStockById(int id) {
        int stock = 0;
        for (int i = 0; i < BooksView.model_table_books.getRowCount(); i++) {

            try {

                int id_table = Integer.parseInt(BooksView.model_table_books.getValueAt(i, 0).toString());

                if (id == id_table) {
                    stock = Integer.parseInt(BooksView.model_table_books.getValueAt(i, 7).toString());
                }

                System.out.println(stock);
            } catch (NullPointerException e) {
                return 0;
            }

        }

        return stock;

    }

    void updateUser() {

        try {
            Object[] FIELDS = {
                this.user_id,
                this.user_full_name,
                this.user_age,
                this.user_password,
                this.user_confirm_password,};

            if (!validator.validateBlank(FIELDS)) {
                JOptionPane.showMessageDialog(this, "Rellene todos los campos");
                return;
            }

            if (!(this.user_password.getText().equals(this.user_confirm_password.getText()))) {
                JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden");
                return;
            }

            User user = new User(
                    this.user_id.getText(),
                    this.user_password.getText(),
                    this.user_full_name.getText(),
                    Integer.parseInt(this.user_age.getText())
            );

            user.update();
            MainView.showJpanel(new UsersView(true));

        } catch (SQLException ex) {
            Logger.getLogger(ModifyUserForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private CustomComponents.Button btn_submit;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_Id;
    private javax.swing.JLabel lbl_author;
    private javax.swing.JLabel lbl_category;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel lbl_year;
    private javax.swing.JTextField user_age;
    private javax.swing.JTextField user_confirm_password;
    private javax.swing.JTextField user_full_name;
    private javax.swing.JTextField user_id;
    private javax.swing.JTextField user_password;
    // End of variables declaration//GEN-END:variables
}
