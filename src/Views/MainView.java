package Views;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Ibarra
 */
public class MainView extends javax.swing.JFrame {

    //Attributo para saber si el usuario es adminstrador del sistema
    boolean isAdmin;

    public MainView(String username, boolean isAdmin) {
        initComponents();
        showJpanel(new PrincipalView());
        this.setLocationRelativeTo(null);
        this.isAdmin = isAdmin;
        if (!isAdmin) {
            this.btn_prestamos.setEnabled(false);
            this.btn_devoluciones.setEnabled(false);
            this.btn_usuarios.setEnabled(false);
        }
    }

    public static void showJpanel(JPanel p) {
        p.setSize(650, 430);
        p.setLocation(0, 0);

        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_libros = new CustomComponents.KButton();
        btn_principal = new CustomComponents.KButton();
        btn_prestamos = new CustomComponents.KButton();
        btn_devoluciones = new CustomComponents.KButton();
        btn_usuarios = new CustomComponents.KButton();
        title_login = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_logOut = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Library: Menu Principal");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(255, 255, 255));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/book_plus.png"))); // NOI18N
        menu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/House.png"))); // NOI18N
        menu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Books.png"))); // NOI18N
        menu.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/devolucion.png"))); // NOI18N
        menu.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        menu.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 40));

        btn_libros.setForeground(new java.awt.Color(0, 0, 0));
        btn_libros.setText("LIBROS");
        btn_libros.setkBackGroundColor(new java.awt.Color(204, 204, 204));
        btn_libros.setkEndColor(new java.awt.Color(204, 204, 204));
        btn_libros.setkForeGround(new java.awt.Color(0, 0, 0));
        btn_libros.setkHoverEndColor(new java.awt.Color(102, 153, 255));
        btn_libros.setkHoverForeGround(new java.awt.Color(153, 204, 255));
        btn_libros.setkHoverStartColor(new java.awt.Color(204, 204, 204));
        btn_libros.setkSelectedColor(new java.awt.Color(204, 204, 204));
        btn_libros.setkStartColor(new java.awt.Color(204, 204, 204));
        btn_libros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_librosActionPerformed(evt);
            }
        });
        menu.add(btn_libros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 220, -1));

        btn_principal.setBackground(new java.awt.Color(0, 0, 255));
        btn_principal.setForeground(new java.awt.Color(0, 0, 0));
        btn_principal.setText("PRINCIPAL");
        btn_principal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_principal.setkBackGroundColor(new java.awt.Color(204, 204, 204));
        btn_principal.setkEndColor(new java.awt.Color(204, 204, 204));
        btn_principal.setkForeGround(new java.awt.Color(0, 0, 0));
        btn_principal.setkHoverColor(new java.awt.Color(0, 0, 255));
        btn_principal.setkHoverEndColor(new java.awt.Color(102, 153, 255));
        btn_principal.setkHoverForeGround(new java.awt.Color(153, 204, 255));
        btn_principal.setkHoverStartColor(new java.awt.Color(204, 204, 204));
        btn_principal.setkIndicatorColor(new java.awt.Color(0, 0, 255));
        btn_principal.setkSelectedColor(new java.awt.Color(204, 204, 204));
        btn_principal.setkStartColor(new java.awt.Color(204, 204, 204));
        btn_principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_principalActionPerformed(evt);
            }
        });
        menu.add(btn_principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 70, 220, -1));

        btn_prestamos.setForeground(new java.awt.Color(0, 0, 0));
        btn_prestamos.setText("PRESTAMOS");
        btn_prestamos.setkBackGroundColor(new java.awt.Color(204, 204, 204));
        btn_prestamos.setkEndColor(new java.awt.Color(204, 204, 204));
        btn_prestamos.setkForeGround(new java.awt.Color(0, 0, 0));
        btn_prestamos.setkHoverEndColor(new java.awt.Color(102, 153, 255));
        btn_prestamos.setkHoverForeGround(new java.awt.Color(153, 204, 255));
        btn_prestamos.setkHoverStartColor(new java.awt.Color(204, 204, 204));
        btn_prestamos.setkSelectedColor(new java.awt.Color(204, 204, 204));
        btn_prestamos.setkStartColor(new java.awt.Color(204, 204, 204));
        btn_prestamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_prestamosMouseClicked(evt);
            }
        });
        menu.add(btn_prestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 220, -1));

        btn_devoluciones.setForeground(new java.awt.Color(0, 0, 0));
        btn_devoluciones.setText("DEVOLUCIONES");
        btn_devoluciones.setkBackGroundColor(new java.awt.Color(204, 204, 204));
        btn_devoluciones.setkEndColor(new java.awt.Color(204, 204, 204));
        btn_devoluciones.setkForeGround(new java.awt.Color(0, 0, 0));
        btn_devoluciones.setkHoverEndColor(new java.awt.Color(102, 153, 255));
        btn_devoluciones.setkHoverForeGround(new java.awt.Color(153, 204, 255));
        btn_devoluciones.setkHoverStartColor(new java.awt.Color(204, 204, 204));
        btn_devoluciones.setkSelectedColor(new java.awt.Color(204, 204, 204));
        btn_devoluciones.setkStartColor(new java.awt.Color(204, 204, 204));
        btn_devoluciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_devolucionesMouseClicked(evt);
            }
        });
        menu.add(btn_devoluciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 220, -1));

        btn_usuarios.setForeground(new java.awt.Color(0, 0, 0));
        btn_usuarios.setText("USUARIOS");
        btn_usuarios.setkBackGroundColor(new java.awt.Color(204, 204, 204));
        btn_usuarios.setkEndColor(new java.awt.Color(204, 204, 204));
        btn_usuarios.setkForeGround(new java.awt.Color(0, 0, 0));
        btn_usuarios.setkHoverEndColor(new java.awt.Color(102, 153, 255));
        btn_usuarios.setkHoverForeGround(new java.awt.Color(153, 204, 255));
        btn_usuarios.setkHoverStartColor(new java.awt.Color(204, 204, 204));
        btn_usuarios.setkSelectedColor(new java.awt.Color(204, 204, 204));
        btn_usuarios.setkStartColor(new java.awt.Color(204, 204, 204));
        btn_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_usuariosMouseClicked(evt);
            }
        });
        menu.add(btn_usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 220, -1));

        title_login.setFont(new java.awt.Font("Press Start 2P", 1, 12)); // NOI18N
        title_login.setText("MY LIBRARY");
        title_login.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menu.add(title_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        background.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 450));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        background.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 650, 450));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 450));

        jMenu1.setText("Menu");

        menu_logOut.setText("Cerrar Sesión");
        menu_logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_logOutActionPerformed(evt);
            }
        });
        jMenu1.add(menu_logOut);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_librosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_librosActionPerformed
        showJpanel(new BooksView(this.isAdmin));
    }//GEN-LAST:event_btn_librosActionPerformed

    private void btn_principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_principalActionPerformed
        showJpanel(new PrincipalView());
    }//GEN-LAST:event_btn_principalActionPerformed

    private void btn_prestamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_prestamosMouseClicked
        if (!isAdmin){JOptionPane.showMessageDialog(this, "No tienes Permiso Para Ver Ésto");return;}
    }//GEN-LAST:event_btn_prestamosMouseClicked

    private void btn_devolucionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_devolucionesMouseClicked
        if (!isAdmin){JOptionPane.showMessageDialog(this, "No tienes Permiso Para Ver Ésto");return;}
    }//GEN-LAST:event_btn_devolucionesMouseClicked

    private void btn_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usuariosMouseClicked
        if (!isAdmin){JOptionPane.showMessageDialog(this, "No tienes Permiso Para Ver Ésto");return;}
        showJpanel(new UsersView());
        
    }//GEN-LAST:event_btn_usuariosMouseClicked

    private void menu_logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_logOutActionPerformed
        LoginView lv = new LoginView();
        lv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menu_logOutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private CustomComponents.KButton btn_devoluciones;
    private CustomComponents.KButton btn_libros;
    private CustomComponents.KButton btn_prestamos;
    private CustomComponents.KButton btn_principal;
    private CustomComponents.KButton btn_usuarios;
    private static javax.swing.JPanel content;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel menu;
    private javax.swing.JMenuItem menu_logOut;
    private javax.swing.JLabel title_login;
    // End of variables declaration//GEN-END:variables
}
