
package interfaz;

import java.awt.Color;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaHistorial extends javax.swing.JFrame {

//    private javax.swing.JTable tblTabla;
//    private javax.swing.JScrollPane jScrollPane2;
    private DefaultTableModel dtm;
    private listas agenda;
    File archivo =null;
   
    
    public VentanaHistorial(listas agenda) {
        this.agenda = agenda; // Recibe la instancia de listas
        initComponents();
        this.setLocationRelativeTo(null);

        String titulos[] = {"Nombre", "Modalidad", "Tipo de pausa", "Hora"};
        dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(titulos);
        tblTabla.setModel(dtm);        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonBuscarHistorial = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botonCerrarSesionHistorial = new javax.swing.JButton();
        botonAtrasHistorial = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(63, 128, 108));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonBuscarHistorial.setBackground(new java.awt.Color(94, 140, 137));
        botonBuscarHistorial.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botonBuscarHistorial.setForeground(new java.awt.Color(255, 255, 255));
        botonBuscarHistorial.setText("BUSCAR");
        botonBuscarHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarHistorialActionPerformed(evt);
            }
        });
        jPanel1.add(botonBuscarHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("HISTORIAL DE PAUSAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 6, -1, -1));

        botonCerrarSesionHistorial.setBackground(new java.awt.Color(186, 217, 211));
        botonCerrarSesionHistorial.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botonCerrarSesionHistorial.setText("Cerrar Sesion");
        botonCerrarSesionHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarSesionHistorialActionPerformed(evt);
            }
        });
        jPanel1.add(botonCerrarSesionHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, -1, -1));

        botonAtrasHistorial.setBackground(new java.awt.Color(186, 217, 211));
        botonAtrasHistorial.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botonAtrasHistorial.setText("Atras");
        botonAtrasHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasHistorialActionPerformed(evt);
            }
        });
        jPanel1.add(botonAtrasHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/WhatsApp Image 2024-04-06 at 16.34.56_ced7159b.jpg"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(80, 16));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 14, 164, 124));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jScrollPane2.setBackground(new java.awt.Color(63, 128, 108));

        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblTabla);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, 210));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 550));

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

    private void botonBuscarHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarHistorialActionPerformed
        //        ArrayList<String> agendas = agenda.obtenerLista();
        //        DefaultTableModel model = (DefaultTableModel) tblTabla.getModel();
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
    }//GEN-LAST:event_botonBuscarHistorialActionPerformed

    
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
            java.util.logging.Logger.getLogger(VentanaHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                listas agenda = new listas();
                new VentanaAgendas(agenda).setVisible(true);
                new VentanaHistorial(agenda).setVisible(true); // Usar la misma instancia
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtrasHistorial;
    private javax.swing.JButton botonBuscarHistorial;
    private javax.swing.JButton botonCerrarSesionHistorial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTabla;
    // End of variables declaration//GEN-END:variables
}
