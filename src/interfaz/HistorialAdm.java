
package interfaz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class HistorialAdm extends javax.swing.JFrame {
    private DefaultTableModel dtm;
    private listas agenda;
    File archivo = null;
    public HistorialAdm() {
        this.agenda = agenda; // Recibe la instancia de listas
        initComponents();
        this.setLocationRelativeTo(null);

        String titulos[] = {"Modalidad", "Tipo de pausa", "Hora"};
        dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(titulos);
        tbl_historial_adm.setModel(dtm);
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_historial_adm = new javax.swing.JTable();
        btnmostraradm = new javax.swing.JButton();
        botonAtrasHistorialAdm = new javax.swing.JButton();
        botonCerrarSesionHistorialAdm = new javax.swing.JButton();
        lbl_historialAdm = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(63, 129, 108));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_historial_adm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_historial_adm);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 128, 501, 270));

        btnmostraradm.setBackground(new java.awt.Color(94, 140, 137));
        btnmostraradm.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnmostraradm.setForeground(new java.awt.Color(255, 255, 255));
        btnmostraradm.setText("BUSCAR");
        btnmostraradm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostraradmActionPerformed(evt);
            }
        });
        jPanel1.add(btnmostraradm, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 241, -1, -1));

        botonAtrasHistorialAdm.setBackground(new java.awt.Color(186, 217, 211));
        botonAtrasHistorialAdm.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botonAtrasHistorialAdm.setText("Atras");
        botonAtrasHistorialAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasHistorialAdmActionPerformed(evt);
            }
        });
        jPanel1.add(botonAtrasHistorialAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, -1));

        botonCerrarSesionHistorialAdm.setBackground(new java.awt.Color(186, 217, 211));
        botonCerrarSesionHistorialAdm.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botonCerrarSesionHistorialAdm.setText("Cerrar Sesion");
        botonCerrarSesionHistorialAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarSesionHistorialAdmActionPerformed(evt);
            }
        });
        jPanel1.add(botonCerrarSesionHistorialAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 450, -1, -1));

        lbl_historialAdm.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl_historialAdm.setText("HISTORIAL DE PAUSAS");
        jPanel1.add(lbl_historialAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/WhatsApp Image 2024-04-06 at 16.34.56_ced7159b.jpg"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(80, 16));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 835, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmostraradmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostraradmActionPerformed
//        ArrayList<String> agendas = agenda.obtenerLista();
//        DefaultTableModel model = (DefaultTableModel) tbl_historial_adm.getModel();
//
//        // Limpiar la tabla antes de agregar nuevos datos
//        model.setRowCount(0);
//        for (String agendaPausa : agendas) {
//            String[] datos = agendaPausa.split("\n");
//            model.addRow(datos);
//        }

  dtm.setRowCount(0);
    
    try {
        archivo = new File("historial.txt");
        if (archivo.exists()) {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split("\t"); // Separar los datos por el delimitador tabulador
                dtm.addRow(datos); // Agregar cada conjunto de datos como una fila en la tabla
            }
            br.close();
        } else {
            JOptionPane.showMessageDialog(null, "El archivo no existe");
        }
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "ERROR");
    }
    }//GEN-LAST:event_btnmostraradmActionPerformed

    private void botonAtrasHistorialAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasHistorialAdmActionPerformed
        Ventana1 atras = new Ventana1(agenda);
        atras.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonAtrasHistorialAdmActionPerformed

    private void botonCerrarSesionHistorialAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarSesionHistorialAdmActionPerformed
        Principal principal = new Principal();
        principal.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_botonCerrarSesionHistorialAdmActionPerformed

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
            java.util.logging.Logger.getLogger(HistorialAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistorialAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistorialAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistorialAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistorialAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtrasHistorialAdm;
    private javax.swing.JButton botonCerrarSesionHistorialAdm;
    private javax.swing.JButton btnmostraradm;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_historialAdm;
    private javax.swing.JTable tbl_historial_adm;
    // End of variables declaration//GEN-END:variables
}
