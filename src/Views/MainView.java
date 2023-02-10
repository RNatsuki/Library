
package Views;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author Ibarra
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    public MainView(String username) {
        initComponents();
    }

    public static void showJpanel(JPanel p){
        p.setSize(750,670);
        p.setLocation(0,0);
        
        content.removeAll();
        content.add(p,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_principal = new CustomComponents.KButton();
        btn_principal1 = new CustomComponents.KButton();
        PRESTAMOS = new CustomComponents.KButton();
        btn_principal3 = new CustomComponents.KButton();
        btn_principal2 = new CustomComponents.KButton();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(255, 255, 255));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Books.png"))); // NOI18N
        menu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 40, 50));

        btn_principal.setForeground(new java.awt.Color(0, 0, 0));
        btn_principal.setText("LIBROS");
        btn_principal.setkBackGroundColor(new java.awt.Color(204, 204, 204));
        btn_principal.setkEndColor(new java.awt.Color(204, 204, 204));
        btn_principal.setkForeGround(new java.awt.Color(0, 0, 0));
        btn_principal.setkHoverEndColor(new java.awt.Color(102, 153, 255));
        btn_principal.setkHoverForeGround(new java.awt.Color(153, 204, 255));
        btn_principal.setkHoverStartColor(new java.awt.Color(204, 204, 204));
        btn_principal.setkSelectedColor(new java.awt.Color(204, 204, 204));
        btn_principal.setkStartColor(new java.awt.Color(204, 204, 204));
        btn_principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_principalActionPerformed(evt);
            }
        });
        menu.add(btn_principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 220, -1));

        btn_principal1.setForeground(new java.awt.Color(0, 0, 0));
        btn_principal1.setText("PRINCIPAL");
        btn_principal1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_principal1.setkBackGroundColor(new java.awt.Color(204, 204, 204));
        btn_principal1.setkEndColor(new java.awt.Color(204, 204, 204));
        btn_principal1.setkForeGround(new java.awt.Color(0, 0, 0));
        btn_principal1.setkHoverEndColor(new java.awt.Color(102, 153, 255));
        btn_principal1.setkHoverForeGround(new java.awt.Color(153, 204, 255));
        btn_principal1.setkHoverStartColor(new java.awt.Color(204, 204, 204));
        btn_principal1.setkSelectedColor(new java.awt.Color(204, 204, 204));
        btn_principal1.setkStartColor(new java.awt.Color(204, 204, 204));
        btn_principal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_principal1ActionPerformed(evt);
            }
        });
        menu.add(btn_principal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 70, 220, -1));

        PRESTAMOS.setForeground(new java.awt.Color(0, 0, 0));
        PRESTAMOS.setText("PRESTAMOS");
        PRESTAMOS.setkBackGroundColor(new java.awt.Color(204, 204, 204));
        PRESTAMOS.setkEndColor(new java.awt.Color(204, 204, 204));
        PRESTAMOS.setkForeGround(new java.awt.Color(0, 0, 0));
        PRESTAMOS.setkHoverEndColor(new java.awt.Color(102, 153, 255));
        PRESTAMOS.setkHoverForeGround(new java.awt.Color(153, 204, 255));
        PRESTAMOS.setkHoverStartColor(new java.awt.Color(204, 204, 204));
        PRESTAMOS.setkSelectedColor(new java.awt.Color(204, 204, 204));
        PRESTAMOS.setkStartColor(new java.awt.Color(204, 204, 204));
        PRESTAMOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRESTAMOSActionPerformed(evt);
            }
        });
        menu.add(PRESTAMOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 220, -1));

        btn_principal3.setForeground(new java.awt.Color(0, 0, 0));
        btn_principal3.setText("DEVOLUCIONES");
        btn_principal3.setkBackGroundColor(new java.awt.Color(204, 204, 204));
        btn_principal3.setkEndColor(new java.awt.Color(204, 204, 204));
        btn_principal3.setkForeGround(new java.awt.Color(0, 0, 0));
        btn_principal3.setkHoverEndColor(new java.awt.Color(102, 153, 255));
        btn_principal3.setkHoverForeGround(new java.awt.Color(153, 204, 255));
        btn_principal3.setkHoverStartColor(new java.awt.Color(204, 204, 204));
        btn_principal3.setkSelectedColor(new java.awt.Color(204, 204, 204));
        btn_principal3.setkStartColor(new java.awt.Color(204, 204, 204));
        btn_principal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_principal3ActionPerformed(evt);
            }
        });
        menu.add(btn_principal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 220, -1));

        btn_principal2.setForeground(new java.awt.Color(0, 0, 0));
        btn_principal2.setText("USUARIOS");
        btn_principal2.setkBackGroundColor(new java.awt.Color(204, 204, 204));
        btn_principal2.setkEndColor(new java.awt.Color(204, 204, 204));
        btn_principal2.setkForeGround(new java.awt.Color(0, 0, 0));
        btn_principal2.setkHoverEndColor(new java.awt.Color(102, 153, 255));
        btn_principal2.setkHoverForeGround(new java.awt.Color(153, 204, 255));
        btn_principal2.setkHoverStartColor(new java.awt.Color(204, 204, 204));
        btn_principal2.setkSelectedColor(new java.awt.Color(204, 204, 204));
        btn_principal2.setkStartColor(new java.awt.Color(204, 204, 204));
        btn_principal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_principal2ActionPerformed(evt);
            }
        });
        menu.add(btn_principal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 220, -1));

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_principalActionPerformed
        showJpanel(new PrincipalView());
    }//GEN-LAST:event_btn_principalActionPerformed

    private void btn_principal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_principal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_principal1ActionPerformed

    private void PRESTAMOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRESTAMOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PRESTAMOSActionPerformed

    private void btn_principal3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_principal3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_principal3ActionPerformed

    private void btn_principal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_principal2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_principal2ActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private CustomComponents.KButton PRESTAMOS;
    private javax.swing.JPanel background;
    private CustomComponents.KButton btn_principal;
    private CustomComponents.KButton btn_principal1;
    private CustomComponents.KButton btn_principal2;
    private CustomComponents.KButton btn_principal3;
    private static javax.swing.JPanel content;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel menu;
    // End of variables declaration//GEN-END:variables
}
