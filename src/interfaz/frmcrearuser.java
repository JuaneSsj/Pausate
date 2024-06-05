
package interfaz;

import javax.swing.table.DefaultTableModel;
import java.io.*;
import javax.swing.JOptionPane;

public class frmcrearuser extends javax.swing.JFrame {

    DefaultTableModel modelo;
    File archivo=null;//Para trabajar con archivos declaro de tipo File
    
    public frmcrearuser() {
        initComponents();
        modelo = new DefaultTableModel();
        
        modelo.addColumn("DOCUMENTO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("CARGO");
        modelo.addColumn("USUARIO");
        modelo.addColumn("CONTRASEÑA");
        tblTabla.setModel(modelo);        
        
        this.setLocationRelativeTo(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblnombre = new javax.swing.JLabel();
        lbdocumento = new javax.swing.JLabel();
        txtdocumento = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnMostrar = new javax.swing.JButton();
        btnatrastbl = new javax.swing.JButton();
        btncerrartbl = new javax.swing.JButton();
        lblcargo1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        btnregistrar1 = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        lblContraseña = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JTextField();
        txtusuario = new javax.swing.JTextField();
        lblusuario = new javax.swing.JLabel();
        lblcargo = new javax.swing.JLabel();
        txtcargo = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(63, 129, 108));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(63, 129, 108));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblnombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblnombre.setText("NOMBRE");
        jPanel2.add(lblnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 80, -1));

        lbdocumento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbdocumento.setText("DOCUMENTO");
        jPanel2.add(lbdocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 100, -1));

        txtdocumento.setBackground(new java.awt.Color(186, 217, 211));
        txtdocumento.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel2.add(txtdocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 160, 30));

        txtnombre.setBackground(new java.awt.Color(186, 217, 211));
        txtnombre.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel2.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 160, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/WhatsApp Image 2024-04-06 at 16.34.56_ced7159b.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(80, 16));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnMostrar.setBackground(new java.awt.Color(0, 62, 58));
        btnMostrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnMostrar.setText("MOSTRAR");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 450, -1, -1));

        btnatrastbl.setBackground(new java.awt.Color(186, 217, 211));
        btnatrastbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnatrastbl.setForeground(new java.awt.Color(102, 102, 102));
        btnatrastbl.setText("ATRÁS");
        btnatrastbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatrastblActionPerformed(evt);
            }
        });
        jPanel1.add(btnatrastbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, -1, -1));

        btncerrartbl.setBackground(new java.awt.Color(186, 217, 211));
        btncerrartbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btncerrartbl.setForeground(new java.awt.Color(102, 102, 102));
        btncerrartbl.setText("CERRAR SESIÓN");
        btncerrartbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrartblActionPerformed(evt);
            }
        });
        jPanel1.add(btncerrartbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 540, -1, -1));

        lblcargo1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblcargo1.setText("USUARIOS");
        jPanel1.add(lblcargo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 130, -1));

        tblTabla.setBackground(new java.awt.Color(0, 112, 79));
        tblTabla.setBorder(new javax.swing.border.MatteBorder(null));
        tblTabla.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        tblTabla.setForeground(new java.awt.Color(0, 0, 0));
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
        tblTabla.setGridColor(new java.awt.Color(63, 129, 108));
        tblTabla.setSelectionBackground(new java.awt.Color(29, 99, 81));
        tblTabla.setSelectionForeground(new java.awt.Color(32, 163, 70));
        jScrollPane1.setViewportView(tblTabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 540, 300));

        btnregistrar1.setBackground(new java.awt.Color(0, 62, 58));
        btnregistrar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnregistrar1.setText("CREAR");
        btnregistrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnregistrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(0, 62, 58));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, -1, -1));

        lblContraseña.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblContraseña.setText("CONTRASEÑA");
        jPanel1.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 110, -1));

        txtContraseña.setBackground(new java.awt.Color(186, 217, 211));
        txtContraseña.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 160, 30));

        txtusuario.setBackground(new java.awt.Color(186, 217, 211));
        txtusuario.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel1.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 160, 30));

        lblusuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblusuario.setText("USUARIO");
        jPanel1.add(lblusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 80, -1));

        lblcargo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblcargo.setText("CARGO");
        jPanel1.add(lblcargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 60, -1));

        txtcargo.setBackground(new java.awt.Color(186, 217, 211));
        txtcargo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel1.add(txtcargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 160, 30));

        btnEliminar.setBackground(new java.awt.Color(0, 62, 58));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, -1, -1));

        btnEditar.setBackground(new java.awt.Color(0, 62, 58));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnatrastblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatrastblActionPerformed
        ventanaAdmin atras = new ventanaAdmin();
        atras.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnatrastblActionPerformed

    private void btncerrartblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrartblActionPerformed
        Principal cerrar = new Principal();
        cerrar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btncerrartblActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
         // Limpiar la tabla antes de mostrar los datos del archivo
    modelo.setRowCount(0);
    
    try {
        archivo = new File("datos.txt");
        if (archivo.exists()) {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split("\t"); // Separar los datos por el delimitador tabulador
                modelo.addRow(datos); // Agregar cada conjunto de datos como una fila en la tabla
            }
            br.close();
        } else {
            JOptionPane.showMessageDialog(null, "El archivo no existe");
        }
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "ERROR");
    }
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnregistrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrar1ActionPerformed
        String datos[]=new String [5];
        datos[0]=txtdocumento.getText();
        txtdocumento.setText("");//Vacio las txtField
        datos[1]=txtnombre.getText();
        txtnombre.setText("");//Vacio las txtField
        datos[2]=txtcargo.getText();
        txtcargo.setText("");//Vacio las txtField
        datos[3]=txtusuario.getText();
        txtusuario.setText("");//Vacio las txtField
        datos[4]=txtContraseña.getText();
        txtContraseña.setText("");     
        
        modelo.addRow(datos);
    }//GEN-LAST:event_btnregistrar1ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
         archivo = new File("datos.txt");
    try {
        FileWriter fw = new FileWriter(archivo); // Sobrescribir el archivo
        BufferedWriter bw = new BufferedWriter(fw);
        
        for (int i = 0; i < modelo.getRowCount(); i++) {
            for (int j = 0; j < modelo.getColumnCount(); j++) {
                Object value = modelo.getValueAt(i, j);
                if (value != null) {
                    bw.write(value.toString());
                }
                if (j < modelo.getColumnCount() - 1) {
                    bw.write("\t");
                }
            }
            bw.newLine();
        }
        
        bw.close();
        JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
    } catch (IOException e) {
        System.out.println("Error al guardar: " + e.getMessage());
        JOptionPane.showMessageDialog(null, "Error al guardar los datos");
    }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
         int fila;
        fila=tblTabla.getSelectedRow();
        if (fila>=0)
        {
            modelo.removeRow(fila);
            btnGuardarActionPerformed(evt);
        }
        else
            JOptionPane.showMessageDialog(null, "Debe Seleccionar una fila");;
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int fila;
        fila=tblTabla.getSelectedRow();
        if (fila>=0)
        {
            if(txtdocumento.getText().equals("")||txtContraseña.getText().equals("")||txtnombre.getText().equals("")||txtcargo.getText().equals("")||txtusuario.getText().equals(""))
                JOptionPane.showMessageDialog(null,"por favor llene todos los campos y pulse de nuevo editar");
            else
            {
                modelo.removeRow(fila);
                String datos[]=new String [5];
                datos[0]=txtdocumento.getText();
                txtdocumento.setText("");//Vacio las txtField
                datos[1]=txtnombre.getText();
                txtnombre.setText("");//Vacio las txtField
                datos[2]=txtcargo.getText();
                txtcargo.setText("");//Vacio las txtField
                datos[3]=txtusuario.getText();
                txtusuario.setText("");//Vacio las txtField
                datos[4]=txtContraseña.getText();
                txtContraseña.setText("");     

                modelo.addRow(datos);
                btnGuardarActionPerformed(evt);
            }
        }
        else
            JOptionPane.showMessageDialog(null, "Debe Seleccionar una fila");;
    }//GEN-LAST:event_btnEditarActionPerformed

  
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
            java.util.logging.Logger.getLogger(frmcrearuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmcrearuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmcrearuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmcrearuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmcrearuser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnatrastbl;
    private javax.swing.JButton btncerrartbl;
    private javax.swing.JButton btnregistrar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbdocumento;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblcargo;
    private javax.swing.JLabel lblcargo1;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JTable tblTabla;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtcargo;
    private javax.swing.JTextField txtdocumento;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
