/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Middlewares.FieldsValidator;
import Model.Book;
import Model.User;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ibarra
 */
public class PrestamoForm extends javax.swing.JFrame {

    /**
     * Creates new form AddUsersForm
     */
    FieldsValidator validate = new FieldsValidator();
    
    public PrestamoForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        txt_num_control.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_num_control = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_book_id = new javax.swing.JTextField();
        btn_add_user = new CustomComponents.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Num. Control:");

        txt_num_control.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_num_controlKeyPressed(evt);
            }
        });

        jLabel6.setText("ID Libro");

        txt_book_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_book_idKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_book_idKeyTyped(evt);
            }
        });

        btn_add_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/book_plus.png"))); // NOI18N
        btn_add_user.setText("Agregar");
        btn_add_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_userActionPerformed(evt);
            }
        });
        btn_add_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_add_userKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_num_control)
                    .addComponent(txt_book_id, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                .addGap(20, 20, 20))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(btn_add_user, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_num_control, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_book_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_add_user, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 170));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_add_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_userActionPerformed
       save();
       
    }//GEN-LAST:event_btn_add_userActionPerformed

    private void txt_book_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_book_idKeyTyped
        validate.onlyNumbers(evt);
    }//GEN-LAST:event_txt_book_idKeyTyped

    private void txt_num_controlKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_num_controlKeyPressed
        
    }//GEN-LAST:event_txt_num_controlKeyPressed

    private void txt_book_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_book_idKeyPressed
        if (evt.getKeyChar() == evt.VK_ENTER) {
            this.btn_add_user.requestFocus();
        }
    }//GEN-LAST:event_txt_book_idKeyPressed

    private void btn_add_userKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_add_userKeyPressed
       if (evt.getKeyChar() == evt.VK_ENTER) {
            save();
        }
    }//GEN-LAST:event_btn_add_userKeyPressed

    void save(){
        Object[] array = {
           txt_num_control,
           txt_book_id
       };
       
        if (!validate.validateBlank(array)) {
            JOptionPane.showMessageDialog(this, "Rellena todos los campos");
            return;
        }
        
        Book book = new Book(Integer.parseInt(txt_book_id.getText()));
        
        book.loan(txt_num_control.getText());
        
        MainView.showJpanel(new PrestamosView(true));
       
    }
    
    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private CustomComponents.KButton btn_add_user;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txt_book_id;
    private javax.swing.JTextField txt_num_control;
    // End of variables declaration//GEN-END:variables
}
