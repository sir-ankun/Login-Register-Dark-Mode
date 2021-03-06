package login.register.dark.mode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;

/**
 *
 * @author ankun
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Register() {
        initComponents();
        mostrarRegister.setOnOff(false);
        lbAsteriscos.setForeground(new Color(255,255, 255));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorUserLogin = new javax.swing.JPanel();
        lbUserLogin = new javax.swing.JLabel();
        contenedorLogin = new javax.swing.JPanel();
        contenedorDatos = new LIB.JPanelRound();
        separador = new LIB.JPanelRound();
        lbIconPassword = new javax.swing.JLabel();
        lbIconUser = new javax.swing.JLabel();
        txtPassword = new LIB.FSPasswordFieldMD();
        separador2 = new LIB.JPanelRound();
        separador3 = new LIB.JPanelRound();
        txtUsername = new LIB.FSTexFieldMD();
        lbIconUser2 = new javax.swing.JLabel();
        lbIconUser3 = new javax.swing.JLabel();
        txtUsername4 = new LIB.FSTexFieldMD();
        txtUsername5 = new LIB.FSTexFieldMD();
        contenedorMostrar = new javax.swing.JPanel();
        fSButtonMD1 = new LIB.FSButtonMD();
        contenedorMostrar1 = new javax.swing.JPanel();
        lbAsteriscos = new javax.swing.JLabel();
        lbLetras = new javax.swing.JLabel();
        mostrarRegister = new diseños_tiktok.Switch();
        btnCrearCuenta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenedorUserLogin.setBackground(new java.awt.Color(29, 29, 29));
        contenedorUserLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbUserLogin.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lbUserLogin.setForeground(new java.awt.Color(255, 255, 255));
        lbUserLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUserLogin.setText("User Register");

        javax.swing.GroupLayout contenedorUserLoginLayout = new javax.swing.GroupLayout(contenedorUserLogin);
        contenedorUserLogin.setLayout(contenedorUserLoginLayout);
        contenedorUserLoginLayout.setHorizontalGroup(
            contenedorUserLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbUserLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
        );
        contenedorUserLoginLayout.setVerticalGroup(
            contenedorUserLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbUserLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        getContentPane().add(contenedorUserLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, -1));

        contenedorLogin.setBackground(new java.awt.Color(31, 31, 31));
        contenedorLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenedorDatos.setBackground(new java.awt.Color(20, 20, 20));
        contenedorDatos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        contenedorDatos.setColorPrimario(new java.awt.Color(20, 20, 20));
        contenedorDatos.setColorSecundario(new java.awt.Color(20, 20, 20));
        contenedorDatos.setOpaque(true);
        contenedorDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        separador.setColorPrimario(new java.awt.Color(20, 20, 20));

        javax.swing.GroupLayout separadorLayout = new javax.swing.GroupLayout(separador);
        separador.setLayout(separadorLayout);
        separadorLayout.setHorizontalGroup(
            separadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        separadorLayout.setVerticalGroup(
            separadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        contenedorDatos.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 350, 3));

        lbIconPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIconPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pass_32.png"))); // NOI18N
        contenedorDatos.add(lbIconPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 70, 60));

        lbIconUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/name_32.png"))); // NOI18N
        contenedorDatos.add(lbIconUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 70, 60));

        txtPassword.setBackground(new java.awt.Color(20, 20, 20));
        txtPassword.setForeground(new java.awt.Color(100, 100, 100));
        txtPassword.setBordeColorFocus(new java.awt.Color(20, 20, 20));
        txtPassword.setDisabledTextColor(new java.awt.Color(20, 20, 20));
        txtPassword.setPlaceholder("password");
        contenedorDatos.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        separador2.setColorPrimario(new java.awt.Color(20, 20, 20));

        javax.swing.GroupLayout separador2Layout = new javax.swing.GroupLayout(separador2);
        separador2.setLayout(separador2Layout);
        separador2Layout.setHorizontalGroup(
            separador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        separador2Layout.setVerticalGroup(
            separador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        contenedorDatos.add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 350, 3));

        separador3.setColorPrimario(new java.awt.Color(20, 20, 20));

        javax.swing.GroupLayout separador3Layout = new javax.swing.GroupLayout(separador3);
        separador3.setLayout(separador3Layout);
        separador3Layout.setHorizontalGroup(
            separador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        separador3Layout.setVerticalGroup(
            separador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        contenedorDatos.add(separador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 350, 3));

        txtUsername.setBackground(new java.awt.Color(20, 20, 20));
        txtUsername.setForeground(new java.awt.Color(100, 100, 100));
        txtUsername.setBordeColorFocus(new java.awt.Color(20, 20, 20));
        txtUsername.setBordeColorNoFocus(new java.awt.Color(20, 20, 20));
        txtUsername.setDisabledTextColor(new java.awt.Color(20, 20, 20));
        txtUsername.setPlaceholder("name");
        contenedorDatos.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        lbIconUser2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIconUser2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user_32.png"))); // NOI18N
        contenedorDatos.add(lbIconUser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 70, 60));

        lbIconUser3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIconUser3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/name_32.png"))); // NOI18N
        contenedorDatos.add(lbIconUser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 60));

        txtUsername4.setBackground(new java.awt.Color(20, 20, 20));
        txtUsername4.setForeground(new java.awt.Color(100, 100, 100));
        txtUsername4.setBordeColorFocus(new java.awt.Color(20, 20, 20));
        txtUsername4.setBordeColorNoFocus(new java.awt.Color(20, 20, 20));
        txtUsername4.setDisabledTextColor(new java.awt.Color(20, 20, 20));
        txtUsername4.setPlaceholder("username");
        contenedorDatos.add(txtUsername4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        txtUsername5.setBackground(new java.awt.Color(20, 20, 20));
        txtUsername5.setForeground(new java.awt.Color(100, 100, 100));
        txtUsername5.setBordeColorFocus(new java.awt.Color(20, 20, 20));
        txtUsername5.setBordeColorNoFocus(new java.awt.Color(20, 20, 20));
        txtUsername5.setDisabledTextColor(new java.awt.Color(20, 20, 20));
        txtUsername5.setPlaceholder("last name");
        contenedorDatos.add(txtUsername5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        contenedorLogin.add(contenedorDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 43, -1, 240));

        contenedorMostrar.setBackground(new java.awt.Color(31, 31, 31));
        contenedorMostrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        contenedorLogin.add(contenedorMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 140, 30));

        fSButtonMD1.setBackground(new java.awt.Color(50, 156, 143));
        fSButtonMD1.setText("Register");
        fSButtonMD1.setColorNormal(new java.awt.Color(50, 156, 143));
        fSButtonMD1.setColorPressed(new java.awt.Color(50, 156, 143));
        fSButtonMD1.setFont(new java.awt.Font("Segoe", 1, 18)); // NOI18N
        fSButtonMD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fSButtonMD1ActionPerformed(evt);
            }
        });
        contenedorLogin.add(fSButtonMD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 340, 50));

        contenedorMostrar1.setBackground(new java.awt.Color(31, 31, 31));
        contenedorMostrar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbAsteriscos.setFont(new java.awt.Font("Roboto Thin", 0, 24)); // NOI18N
        lbAsteriscos.setForeground(new java.awt.Color(126, 126, 126));
        lbAsteriscos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAsteriscos.setText("***");
        lbAsteriscos.setAlignmentY(0.0F);
        contenedorMostrar1.add(lbAsteriscos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 7, 40, 20));

        lbLetras.setFont(new java.awt.Font("Roboto Thin", 0, 18)); // NOI18N
        lbLetras.setForeground(new java.awt.Color(126, 126, 126));
        lbLetras.setText("ABC");
        contenedorMostrar1.add(lbLetras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        mostrarRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarRegisterMouseClicked(evt);
            }
        });
        contenedorMostrar1.add(mostrarRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 49, 31));

        contenedorLogin.add(contenedorMostrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 140, 30));

        btnCrearCuenta.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnCrearCuenta.setForeground(new java.awt.Color(126, 126, 126));
        btnCrearCuenta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnCrearCuenta.setText("User Login");
        btnCrearCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearCuentaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCrearCuentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCrearCuentaMouseExited(evt);
            }
        });
        contenedorLogin.add(btnCrearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 70, 30));

        getContentPane().add(contenedorLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 410, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fSButtonMD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fSButtonMD1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_fSButtonMD1ActionPerformed

    private void mostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarMouseClicked
        if (mostrarRegister.isOnOff()) {
            txtPassword.setEchoChar((char) 0);
            lbLetras.setForeground(new Color(255, 255, 255));
            lbAsteriscos.setForeground(new Color(126, 126, 126));
        } else {
            txtPassword.setEchoChar('*');
            lbLetras.setForeground(new Color(126, 126, 126));
            lbAsteriscos.setForeground(new Color(255, 255, 255));
        }
    }//GEN-LAST:event_mostrarMouseClicked

    private void btnCrearCuentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearCuentaMouseEntered
        btnCrearCuenta.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnCrearCuentaMouseEntered

    private void btnCrearCuentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearCuentaMouseExited
        btnCrearCuenta.setForeground(new Color(126, 126, 126));
    }//GEN-LAST:event_btnCrearCuentaMouseExited

    private void btnCrearCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearCuentaMouseClicked
       Login login = new Login();
       this.dispose();
       login.setVisible(true);
    }//GEN-LAST:event_btnCrearCuentaMouseClicked

    private void mostrarRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarRegisterMouseClicked
        if (mostrarRegister.isOnOff()) {
            txtPassword.setEchoChar((char) 0);
            lbLetras.setForeground(new Color(255, 255, 255));
            lbAsteriscos.setForeground(new Color(126, 126, 126));
        } else {
            txtPassword.setEchoChar('*');
            lbLetras.setForeground(new Color(126, 126, 126));
            lbAsteriscos.setForeground(new Color(255, 255, 255));
        }
    }//GEN-LAST:event_mostrarRegisterMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCrearCuenta;
    private LIB.JPanelRound contenedorDatos;
    private javax.swing.JPanel contenedorLogin;
    private javax.swing.JPanel contenedorMostrar;
    private javax.swing.JPanel contenedorMostrar1;
    private javax.swing.JPanel contenedorUserLogin;
    private LIB.FSButtonMD fSButtonMD1;
    private javax.swing.JLabel lbAsteriscos;
    private javax.swing.JLabel lbIconPassword;
    private javax.swing.JLabel lbIconUser;
    private javax.swing.JLabel lbIconUser2;
    private javax.swing.JLabel lbIconUser3;
    private javax.swing.JLabel lbLetras;
    private javax.swing.JLabel lbUserLogin;
    private diseños_tiktok.Switch mostrarRegister;
    private LIB.JPanelRound separador;
    private LIB.JPanelRound separador2;
    private LIB.JPanelRound separador3;
    private LIB.FSPasswordFieldMD txtPassword;
    private LIB.FSTexFieldMD txtUsername;
    private LIB.FSTexFieldMD txtUsername4;
    private LIB.FSTexFieldMD txtUsername5;
    // End of variables declaration//GEN-END:variables
}
