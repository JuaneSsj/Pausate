
package interfaz;

import java.awt.Color;
import javax.swing.JOptionPane;

import java.awt.event.*;

public class Principal extends javax.swing.JFrame {

    listas agenda;
    public Principal() 
    {
        initComponents();
        txtContraseña.setEchoChar((char)0);
        this.setLocationRelativeTo(null);
        agregarKeyListener();
        this.agenda = new listas();
    }
    
    private void agregarKeyListener() {
        txtContraseña.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    BotonIngresarActionPerformed(null); // Simular clic en el botón Ingresar
                }
            }
        });
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BotonIngresar = new javax.swing.JButton();
        mostrarContra = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(63, 129, 108));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/WhatsApp Image 2024-04-06 at 16.34.56_ced7159b.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(80, 16));

        txtContraseña.setBackground(new java.awt.Color(186, 217, 211));
        txtContraseña.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtContraseña.setText("CONTRASEÑA");
        txtContraseña.setCaretColor(new java.awt.Color(51, 51, 51));
        txtContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContraseñaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContraseñaFocusLost(evt);
            }
        });
        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });

        txtUsuario.setBackground(new java.awt.Color(186, 217, 211));
        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtUsuario.setText("USUARIO");
        txtUsuario.setCaretColor(new java.awt.Color(51, 51, 51));
        txtUsuario.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel2.setText("INICIAR SESIÓN");

        BotonIngresar.setBackground(new java.awt.Color(0, 62, 58));
        BotonIngresar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        BotonIngresar.setForeground(new java.awt.Color(255, 255, 255));
        BotonIngresar.setText("INGRESAR");
        BotonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIngresarActionPerformed(evt);
            }
        });
        BotonIngresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BotonIngresarKeyTyped(evt);
            }
        });

        mostrarContra.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        mostrarContra.setText("MOSTRAR CONTRASEÑA");
        mostrarContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarContraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(BotonIngresar))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtUsuario)
                                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mostrarContra)
                            .addComponent(jLabel2))))
                .addContainerGap(269, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(335, 335, 335))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(mostrarContra)
                .addGap(28, 28, 28)
                .addComponent(BotonIngresar)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 520));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 280));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 830, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIngresarActionPerformed
        String usuario="poli";
        String contraseña="poli123";
        String admin="admin";
        String contraseñaAdmin="poli123";
        
        if(txtUsuario.getText().equals(usuario)&&(txtContraseña.getText().equals(contraseña)))
        {
            Ventana1 ingresar = new Ventana1(agenda);        
            ingresar.setVisible(true);
            this.dispose();
        }
        else if (txtUsuario.getText().equals(admin)&&(txtContraseña.getText().equals(contraseñaAdmin)))
        {
            ventanaAdmin ingresar = new ventanaAdmin();        
            ingresar.setVisible(true);
            this.dispose();
        }
        else
            JOptionPane.showMessageDialog(null,"El Usuario o contraseña son incorrectos");
    }//GEN-LAST:event_BotonIngresarActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        if(txtUsuario.getText().equals("USUARIO"))
        {
            txtUsuario.setText("");
            txtUsuario.setForeground(Color.BLACK);
           
        }
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void txtContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseñaFocusGained
      if(String.valueOf(txtContraseña.getPassword()).equals("CONTRASEÑA"))
      {
          txtContraseña.setText("");
          txtContraseña.setForeground(Color.BLACK);
          txtContraseña.setEchoChar(('•'));
      }
    }//GEN-LAST:event_txtContraseñaFocusGained

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
         if(txtUsuario.getText().equals(""))
        {
            txtUsuario.setText("USUARIO");
            txtUsuario.setForeground(new java.awt.Color(0,0,0));
            
        }
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void txtContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseñaFocusLost
        if(String.valueOf(txtContraseña.getPassword()).equals(""))
      {
          txtContraseña.setEchoChar((char)0);
          txtContraseña.setText("CONTRASEÑA");
          txtContraseña.setForeground(new java.awt.Color(0,0,0));
          
      }
    }//GEN-LAST:event_txtContraseñaFocusLost

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void mostrarContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarContraActionPerformed
        if(mostrarContra.isSelected())
            txtContraseña.setEchoChar((char)0);
        else
            txtContraseña.setEchoChar(('•'));
    }//GEN-LAST:event_mostrarContraActionPerformed

    private void BotonIngresarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BotonIngresarKeyTyped
        String usuario="poli";
        String contraseña="poli123";
        String admin="admin";
        String contraseñaAdmin="poli123";
        
        if(txtUsuario.getText().equals(usuario)&&(txtContraseña.getText().equals(contraseña)))
        {
            Ventana1 ingresar = new Ventana1(agenda);        
            ingresar.setVisible(true);
            this.dispose();
        }
        else if (txtUsuario.getText().equals(admin)&&(txtContraseña.getText().equals(contraseñaAdmin)))
        {
            ventanaAdmin ingresar = new ventanaAdmin();        
            ingresar.setVisible(true);
            this.dispose();
        }
        else
            JOptionPane.showMessageDialog(null,"El Usuario o contraseña son incorrectos");
    }//GEN-LAST:event_BotonIngresarKeyTyped

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() 
            {
                new Principal().setVisible(true);
                listas agenda = new listas(); // Crear una instancia de listas
           
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JCheckBox mostrarContra;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
