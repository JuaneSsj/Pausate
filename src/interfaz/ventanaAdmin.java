/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

/**
 *
 * @author Alejo
 */
public class ventanaAdmin extends javax.swing.JFrame {

    /**
     * Creates new form ventanaAdmin
     */
    public ventanaAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        botonCerrarSesionVentana1 = new javax.swing.JButton();
        btncrearusuario = new javax.swing.JButton();
        btnHistorial = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblgestionemp = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(63, 129, 108));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonCerrarSesionVentana1.setBackground(new java.awt.Color(186, 217, 211));
        botonCerrarSesionVentana1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botonCerrarSesionVentana1.setForeground(new java.awt.Color(51, 51, 51));
        botonCerrarSesionVentana1.setText("CERRAR SESIÓN");
        botonCerrarSesionVentana1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarSesionVentana1ActionPerformed(evt);
            }
        });
        jPanel2.add(botonCerrarSesionVentana1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, -1, -1));

        btncrearusuario.setBackground(new java.awt.Color(0, 62, 58));
        btncrearusuario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btncrearusuario.setText("USUARIOS");
        btncrearusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrearusuarioActionPerformed(evt);
            }
        });
        jPanel2.add(btncrearusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 291, -1));

        btnHistorial.setBackground(new java.awt.Color(0, 62, 58));
        btnHistorial.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnHistorial.setText("HISTORIAL TRABAJADORES");
        jPanel2.add(btnHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/WhatsApp Image 2024-04-06 at 16.34.56_ced7159b.jpg"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(80, 16));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 160, 140));

        lblgestionemp.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblgestionemp.setText("GESTIÓN DE EMPLEADOS");
        jPanel2.add(lblgestionemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Gestion usuario_1.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Historial.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCerrarSesionVentana1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarSesionVentana1ActionPerformed
        Principal principal = new Principal();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonCerrarSesionVentana1ActionPerformed

    private void btncrearusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrearusuarioActionPerformed
        frmcrearuser crear = new frmcrearuser();
        crear.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btncrearusuarioActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCerrarSesionVentana1;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btncrearusuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblgestionemp;
    // End of variables declaration//GEN-END:variables
}
