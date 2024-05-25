
package interfaz;


public class Ventana1 extends javax.swing.JFrame {

    private listas agenda;
    
    public Ventana1(listas agenda) {
        this.agenda = agenda;
        initComponents();
        this.setLocationRelativeTo(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonHistorial = new javax.swing.JButton();
        botonAgendaPausas = new javax.swing.JButton();
        botonCerrarSesionVentana1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(63, 129, 108));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("BIENVENIDO");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 173, -1, -1));

        botonHistorial.setBackground(new java.awt.Color(0, 62, 58));
        botonHistorial.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botonHistorial.setText("HISTORIAL");
        botonHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonHistorialActionPerformed(evt);
            }
        });
        jPanel2.add(botonHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 281, 213, -1));

        botonAgendaPausas.setBackground(new java.awt.Color(0, 62, 58));
        botonAgendaPausas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botonAgendaPausas.setText("AGENDAR PAUSA");
        botonAgendaPausas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgendaPausasActionPerformed(evt);
            }
        });
        jPanel2.add(botonAgendaPausas, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 281, -1, -1));

        botonCerrarSesionVentana1.setBackground(new java.awt.Color(186, 217, 211));
        botonCerrarSesionVentana1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botonCerrarSesionVentana1.setForeground(new java.awt.Color(51, 51, 51));
        botonCerrarSesionVentana1.setText("CERRAR SESIÓN");
        botonCerrarSesionVentana1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarSesionVentana1ActionPerformed(evt);
            }
        });
        jPanel2.add(botonCerrarSesionVentana1, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 420, 217, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/WhatsApp Image 2024-04-06 at 16.34.56_ced7159b.jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(80, 16));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 31, 164, 124));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgendaPausasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgendaPausasActionPerformed
        VentanaAgendas agendas = new VentanaAgendas(agenda);
        Calendario ag = new Calendario();
        ag.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonAgendaPausasActionPerformed

    private void botonHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonHistorialActionPerformed
       VentanaHistorial historial = new VentanaHistorial(agenda);
        historial.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonHistorialActionPerformed

    private void botonCerrarSesionVentana1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarSesionVentana1ActionPerformed
        Principal principal = new Principal();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonCerrarSesionVentana1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(() -> {
            listas agenda = new listas(); // Crear una instancia de listas
            new Ventana1(agenda).setVisible(true); // Pasar la instancia de listas a Ventana1
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgendaPausas;
    private javax.swing.JButton botonCerrarSesionVentana1;
    private javax.swing.JButton botonHistorial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
