
package interfaz;


public class Calendario extends javax.swing.JFrame {

    listas agenda;
    public Calendario() {
        initComponents();
        agenda = new listas(); // Inicialización de la variable agenda
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        lblCalendario = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botonAtrasHistorial = new javax.swing.JButton();
        botonCerrarSesionHistorial = new javax.swing.JButton();
        btnSeleccionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(63, 129, 108));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jCalendar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 440, 193));

        lblCalendario.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblCalendario.setText("SELECCIONE EL DIA");
        jPanel1.add(lblCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/WhatsApp Image 2024-04-06 at 16.34.56_ced7159b.jpg"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(80, 16));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 164, 124));

        botonAtrasHistorial.setBackground(new java.awt.Color(186, 217, 211));
        botonAtrasHistorial.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botonAtrasHistorial.setText("Atras");
        botonAtrasHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasHistorialActionPerformed(evt);
            }
        });
        jPanel1.add(botonAtrasHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 120, 50));

        botonCerrarSesionHistorial.setBackground(new java.awt.Color(186, 217, 211));
        botonCerrarSesionHistorial.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botonCerrarSesionHistorial.setText("Cerrar Sesion");
        botonCerrarSesionHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarSesionHistorialActionPerformed(evt);
            }
        });
        jPanel1.add(botonCerrarSesionHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, -1, 50));

        btnSeleccionar.setBackground(new java.awt.Color(94, 140, 137));
        btnSeleccionar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSeleccionar.setForeground(new java.awt.Color(255, 255, 255));
        btnSeleccionar.setText("SELECCIONAR");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtrasHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasHistorialActionPerformed
        Ventana1 atras = new Ventana1(agenda);
        atras.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonAtrasHistorialActionPerformed

    private void botonCerrarSesionHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarSesionHistorialActionPerformed
        Principal principal = new Principal();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonCerrarSesionHistorialActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        VentanaAgendas p = new VentanaAgendas(agenda);
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSeleccionarActionPerformed

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
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calendario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtrasHistorial;
    private javax.swing.JButton botonCerrarSesionHistorial;
    private javax.swing.JButton btnSeleccionar;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCalendario;
    // End of variables declaration//GEN-END:variables
}
