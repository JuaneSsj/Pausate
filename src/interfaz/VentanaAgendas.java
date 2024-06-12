
package interfaz;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class VentanaAgendas extends javax.swing.JFrame {

    private listas agenda;    
    File archivo=null;
    public VentanaAgendas(listas agenda) {
        initComponents();
        this.agenda = agenda; // Recibe la instancia de listas
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        comboBoxModalidad = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btnAgendar = new javax.swing.JButton();
        comboBoxTipoPausa = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        comboBoxHora = new javax.swing.JComboBox<>();
        botonAtrasAgenda = new javax.swing.JButton();
        botonCerrarSesionAgendas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_nomb = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(63, 129, 108));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboBoxModalidad.setBackground(new java.awt.Color(0, 62, 58));
        comboBoxModalidad.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        comboBoxModalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Virtual", "Presencial" }));
        comboBoxModalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxModalidadActionPerformed(evt);
            }
        });
        jPanel1.add(comboBoxModalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 120, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("MODALIDAD");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, -1, -1));

        btnAgendar.setBackground(new java.awt.Color(0, 204, 153));
        btnAgendar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAgendar.setText("AGENDAR");
        btnAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 197, 36));

        comboBoxTipoPausa.setBackground(new java.awt.Color(0, 62, 58));
        comboBoxTipoPausa.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        comboBoxTipoPausa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estiramientos", "Masaje", "Juego interactivo" }));
        jPanel1.add(comboBoxTipoPausa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 200, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("SELECCIONA LA HORA ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, -1));

        comboBoxHora.setBackground(new java.awt.Color(0, 62, 58));
        comboBoxHora.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        comboBoxHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12 m", "1 pm", "2 pm", "3 pm" }));
        jPanel1.add(comboBoxHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));

        botonAtrasAgenda.setBackground(new java.awt.Color(186, 217, 211));
        botonAtrasAgenda.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botonAtrasAgenda.setText("ATRÁS");
        botonAtrasAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasAgendaActionPerformed(evt);
            }
        });
        jPanel1.add(botonAtrasAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        botonCerrarSesionAgendas.setBackground(new java.awt.Color(186, 217, 211));
        botonCerrarSesionAgendas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botonCerrarSesionAgendas.setText("CERRAR SESIÓN");
        botonCerrarSesionAgendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarSesionAgendasActionPerformed(evt);
            }
        });
        jPanel1.add(botonCerrarSesionAgendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 444, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("TIPO DE PAUSA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("AGENDA TU PAUSA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/WhatsApp Image 2024-04-06 at 16.34.56_ced7159b.jpg"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(80, 16));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 164, 124));

        jLabel6.setBackground(new java.awt.Color(63, 129, 108));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Historial.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, -1, -1));

        txt_nomb.setBackground(new java.awt.Color(0, 62, 58));
        txt_nomb.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txt_nomb.setText("Digite su nombre");
        txt_nomb.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_nombFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_nombFocusLost(evt);
            }
        });
        txt_nomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombActionPerformed(evt);
            }
        });
        jPanel1.add(txt_nomb, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 220, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 520));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 260));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 870, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCerrarSesionAgendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarSesionAgendasActionPerformed
        Principal principal = new Principal();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonCerrarSesionAgendasActionPerformed

    private void botonAtrasAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasAgendaActionPerformed
        Ventana1 atras = new Ventana1(agenda);
        atras.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonAtrasAgendaActionPerformed

    private void btnAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarActionPerformed
       String agendaPausa = "";

        agendaPausa += txt_nomb.getText()+"\n";
        agendaPausa += comboBoxModalidad.getSelectedItem() + "\n";
        agendaPausa += comboBoxTipoPausa.getSelectedItem() + "\n";
        agendaPausa += comboBoxHora.getSelectedItem();

        agenda.llenar(agendaPausa); // Agregar la pausa a la instancia existente de listas
        
        if(comboBoxModalidad.getSelectedItem().equals("Virtual") && comboBoxTipoPausa.getSelectedItem().equals("Estiramientos"))
        {
            String enlace = "https://www.youtube.com/watch?v=Jg6MHTqziPQ";
            JOptionPane.showMessageDialog(null, "Pausa activa agendada\nAcá el link para tu pausa\n" + enlace);

            // Copiar el enlace al portapapeles
            StringSelection selection = new StringSelection(enlace);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(selection, selection);

            JOptionPane.showMessageDialog(null, "Enlace copiado al portapapeles");
        }
        else if(comboBoxModalidad.getSelectedItem().equals("Virtual") && comboBoxTipoPausa.getSelectedItem().equals("Masaje"))
        {
            String enlace = "https://www.youtube.com/watch?v=WRPi81jgKN8";
            JOptionPane.showMessageDialog(null, "Pausa activa agendada\nAcá el link para tu pausa\n" + enlace);

            // Copiar el enlace al portapapeles
            StringSelection selection = new StringSelection(enlace);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(selection, selection);

            JOptionPane.showMessageDialog(null, "Enlace copiado al portapapeles");
        }
        else if (comboBoxModalidad.getSelectedItem().equals("Virtual") && comboBoxTipoPausa.getSelectedItem().equals("Juego interactivo"))
        {
            String enlace = "https://www.youtube.com/watch?v=DdED0CIRRS0";
            JOptionPane.showMessageDialog(null, "Pausa activa agendada\nAcá el link para tu pausa\n" + enlace);

            // Copiar el enlace al portapapeles
            StringSelection selection = new StringSelection(enlace);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(selection, selection);

            JOptionPane.showMessageDialog(null, "Enlace copiado al portapapeles");
        }
        else
            JOptionPane.showMessageDialog(null, "Pausa activa agendada, nos vemos en el patio a las "+comboBoxHora.getSelectedItem());
        
            // Guardar la información de la pausa en un archivo plano
    archivo = new File("historial.txt");
    try (FileWriter fw = new FileWriter(archivo, true); BufferedWriter bw = new BufferedWriter(fw)) {
        bw.write(txt_nomb.getText() + "\t");
        bw.write(comboBoxModalidad.getSelectedItem() + "\t");
        bw.write(comboBoxTipoPausa.getSelectedItem() + "\t");
        bw.write("" +comboBoxHora.getSelectedItem());
       
        JOptionPane.showMessageDialog(null, "Datos guardados correctamente en el archivo");
    } catch (IOException e) {
        System.out.println("Error al guardar: " + e.getMessage());
        JOptionPane.showMessageDialog(null, "Error al guardar los datos");
    }
    }//GEN-LAST:event_btnAgendarActionPerformed

    private void comboBoxModalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxModalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxModalidadActionPerformed

    private void txt_nombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombActionPerformed

    private void txt_nombFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_nombFocusGained
        // TODO add your handling code here:
         if(txt_nomb.getText().equals("Digite su nombre"))
        {
            txt_nomb.setText("");
            txt_nomb.setForeground(Color.BLACK);
           
        }
    }//GEN-LAST:event_txt_nombFocusGained

    private void txt_nombFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_nombFocusLost
        
         if(txt_nomb.getText().equals(""))
        {
            txt_nomb.setText("Digite su nombre");
            txt_nomb.setForeground(new java.awt.Color(0,0,0));
            
        }
    }//GEN-LAST:event_txt_nombFocusLost

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
            java.util.logging.Logger.getLogger(VentanaAgendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAgendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAgendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAgendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            listas agenda = new listas();
            new VentanaAgendas(agenda).setVisible(true);
            new VentanaHistorial(agenda).setVisible(true); // Usar la misma instancia
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtrasAgenda;
    private javax.swing.JButton botonCerrarSesionAgendas;
    private javax.swing.JButton btnAgendar;
    private javax.swing.JComboBox<String> comboBoxHora;
    private javax.swing.JComboBox<String> comboBoxModalidad;
    private javax.swing.JComboBox<String> comboBoxTipoPausa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField txt_nomb;
    // End of variables declaration//GEN-END:variables
}
