/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Middlewares.FieldsValidator;
import Model.User;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ibarra
 */
public class AddUsersForm extends javax.swing.JFrame {

    /**
     * Creates new form AddUsersForm
     */
    FieldsValidator validate = new FieldsValidator();
    
    public AddUsersForm() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_num_control = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_full_name = new javax.swing.JTextField();
        txt_age = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        txt_confirm = new javax.swing.JPasswordField();
        btn_add_user = new CustomComponents.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CREA UN USUARIO :)");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Num. Control:");

        jLabel2.setText("Contraseña:");

        jLabel3.setText("Confirmar:");

        txt_num_control.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_num_controlKeyPressed(evt);
            }
        });

        jLabel4.setText("Nombre Completo:");

        jLabel6.setText("Edad:");

        txt_full_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_full_nameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_full_nameKeyTyped(evt);
            }
        });

        txt_age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_ageKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ageKeyTyped(evt);
            }
        });

        txt_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_passwordKeyPressed(evt);
            }
        });

        txt_confirm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_confirmKeyPressed(evt);
            }
        });

        btn_add_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_plus.png"))); // NOI18N
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
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_num_control)
                    .addComponent(txt_age, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(txt_full_name, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(txt_password)
                    .addComponent(txt_confirm))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_add_user, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_num_control, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_full_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_add_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_add_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_userActionPerformed
       save();
       
    }//GEN-LAST:event_btn_add_userActionPerformed

    private void txt_ageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ageKeyTyped
        validate.onlyNumbers(evt);
    }//GEN-LAST:event_txt_ageKeyTyped

    private void txt_full_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_full_nameKeyTyped
        validate.onlyLetters(evt);
    }//GEN-LAST:event_txt_full_nameKeyTyped

    private void txt_num_controlKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_num_controlKeyPressed
        if (evt.getKeyChar() == evt.VK_ENTER) {
            this.txt_password.requestFocus();
        }
    }//GEN-LAST:event_txt_num_controlKeyPressed

    private void txt_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passwordKeyPressed
       if (evt.getKeyChar() == evt.VK_ENTER) {
            this.txt_confirm.requestFocus();
        }
    }//GEN-LAST:event_txt_passwordKeyPressed

    private void txt_confirmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_confirmKeyPressed
        if (evt.getKeyChar() == evt.VK_ENTER) {
            this.txt_full_name.requestFocus();
        }
    }//GEN-LAST:event_txt_confirmKeyPressed

    private void txt_full_nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_full_nameKeyPressed
        if (evt.getKeyChar() == evt.VK_ENTER) {
            this.txt_age.requestFocus();
        }
    }//GEN-LAST:event_txt_full_nameKeyPressed

    private void txt_ageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ageKeyPressed
        if (evt.getKeyChar() == evt.VK_ENTER) {
            this.btn_add_user.requestFocus();
        }
    }//GEN-LAST:event_txt_ageKeyPressed

    private void btn_add_userKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_add_userKeyPressed
       if (evt.getKeyChar() == evt.VK_ENTER) {
            save();
        }
    }//GEN-LAST:event_btn_add_userKeyPressed

    void save(){
        Object[] array = {
           txt_num_control,
           txt_password,
           txt_confirm,
           txt_full_name,
           txt_age
       };
       
        if (!validate.validateBlank(array)) {
            JOptionPane.showMessageDialog(this, "Rellena todos los campos");
            return;
        }
        
        if (!(txt_password.getText().equals(this.txt_confirm.getText()))) {
            JOptionPane.showMessageDialog(this, "las contraseñas no coinciden");
            return;
        }
        
        
        User user = new User(
                this.txt_num_control.getText(),
                this.txt_password.getText(),
                this.txt_full_name.getText(),
                Integer.parseInt(this.txt_age.getText())
        );
        
        try {
            user.save();
            JOptionPane.showMessageDialog(this, "El usuario se creo correctamente");
            MainView.showJpanel(new UsersView(true));
            
        } catch (HeadlessException | SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "El numero de control "+ "'"+this.txt_num_control.getText()+"' ya existe");
        }
       
    }
    
    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private CustomComponents.KButton btn_add_user;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txt_age;
    private javax.swing.JPasswordField txt_confirm;
    private javax.swing.JTextField txt_full_name;
    private javax.swing.JTextField txt_num_control;
    private javax.swing.JPasswordField txt_password;
    // End of variables declaration//GEN-END:variables
}
