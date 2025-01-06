package Vistas;

import BaseDatos.UsuarioData;
import Entidades.Usuario;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class AdministrarUsuario extends JInternalFrame {

    Usuario usu = new Usuario();
    UsuarioData usuDat = new UsuarioData();

    public AdministrarUsuario() {

        initComponents();
        armarCabecera();
        cargarUsuarios();
        jBmodificar.setEnabled(false);
        jTid.setEditable(false);
        jBeliminar.setEnabled(false);

        // Desactiva la barra de título del JInternalFrame
        BasicInternalFrameUI ui = (BasicInternalFrameUI) getUI();
        ui.setNorthPane(null);

    }

    private DefaultTableModel modelo = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {

            return false;

        }
    };

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLnombre = new javax.swing.JLabel();
        jLedad = new javax.swing.JLabel();
        jLpassword = new javax.swing.JLabel();
        jLapellido = new javax.swing.JLabel();
        jLdni = new javax.swing.JLabel();
        jLid = new javax.swing.JLabel();
        jLusuario = new javax.swing.JLabel();
        jLtelefono = new javax.swing.JLabel();
        jRactivo = new javax.swing.JRadioButton();
        jDCfechaNac = new com.toedter.calendar.JDateChooser();
        jLfechaNac = new javax.swing.JLabel();
        jTdni = new javax.swing.JTextField();
        jTusuario = new javax.swing.JTextField();
        jTnombre = new javax.swing.JTextField();
        jTedad = new javax.swing.JTextField();
        jTid = new javax.swing.JTextField();
        jTpassword = new javax.swing.JTextField();
        jTapellido = new javax.swing.JTextField();
        jLactivo = new javax.swing.JLabel();
        jTtelefono = new javax.swing.JTextField();
        jBsalir = new javax.swing.JButton();
        jBcrear = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jBmodificar = new javax.swing.JButton();
        jBlimpiar = new javax.swing.JButton();
        jBrefrescar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTBusuario = new javax.swing.JTable();
        jLfondo = new javax.swing.JLabel();

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

        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Administrar Usuarios");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 232, 26));

        jLnombre.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLnombre.setForeground(new java.awt.Color(204, 204, 204));
        jLnombre.setText("Nombre");
        getContentPane().add(jLnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 60, 30));

        jLedad.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLedad.setForeground(new java.awt.Color(204, 204, 204));
        jLedad.setText("Edad");
        getContentPane().add(jLedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 60, 30));

        jLpassword.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLpassword.setForeground(new java.awt.Color(204, 204, 204));
        jLpassword.setText("Password");
        getContentPane().add(jLpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 70, 30));

        jLapellido.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLapellido.setForeground(new java.awt.Color(204, 204, 204));
        jLapellido.setText("Apellido");
        getContentPane().add(jLapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 60, 30));

        jLdni.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLdni.setForeground(new java.awt.Color(204, 204, 204));
        jLdni.setText("Dni");
        getContentPane().add(jLdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 60, 30));

        jLid.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLid.setForeground(new java.awt.Color(204, 204, 204));
        jLid.setText("Id");
        getContentPane().add(jLid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 30, 30));

        jLusuario.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLusuario.setForeground(new java.awt.Color(204, 204, 204));
        jLusuario.setText("Usuario");
        getContentPane().add(jLusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 60, 30));

        jLtelefono.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLtelefono.setForeground(new java.awt.Color(204, 204, 204));
        jLtelefono.setText("Telefono");
        getContentPane().add(jLtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 60, 30));

        jRactivo.setForeground(new java.awt.Color(51, 51, 51));
        jRactivo.setBorder(null);
        jRactivo.setBorderPainted(true);
        jRactivo.setContentAreaFilled(false);
        jRactivo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jRactivo.setFocusable(false);
        getContentPane().add(jRactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        jDCfechaNac.setBackground(new java.awt.Color(51, 51, 51));
        jDCfechaNac.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jDCfechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 120, 30));

        jLfechaNac.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLfechaNac.setForeground(new java.awt.Color(204, 204, 204));
        jLfechaNac.setText("Fecha de nacimiento");
        getContentPane().add(jLfechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 140, 30));

        jTdni.setBackground(new java.awt.Color(51, 51, 51));
        jTdni.setForeground(new java.awt.Color(255, 255, 255));
        jTdni.setBorder(null);
        jTdni.setCaretColor(new java.awt.Color(255, 255, 255));
        jTdni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTdniKeyTyped(evt);
            }
        });
        getContentPane().add(jTdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 120, 20));

        jTusuario.setBackground(new java.awt.Color(51, 51, 51));
        jTusuario.setForeground(new java.awt.Color(255, 255, 255));
        jTusuario.setBorder(null);
        jTusuario.setCaretColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 120, 20));

        jTnombre.setBackground(new java.awt.Color(51, 51, 51));
        jTnombre.setForeground(new java.awt.Color(255, 255, 255));
        jTnombre.setBorder(null);
        jTnombre.setCaretColor(new java.awt.Color(255, 255, 255));
        jTnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTnombreKeyTyped(evt);
            }
        });
        getContentPane().add(jTnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 120, 20));

        jTedad.setBackground(new java.awt.Color(51, 51, 51));
        jTedad.setForeground(new java.awt.Color(255, 255, 255));
        jTedad.setBorder(null);
        jTedad.setCaretColor(new java.awt.Color(255, 255, 255));
        jTedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTedadKeyTyped(evt);
            }
        });
        getContentPane().add(jTedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 120, 20));

        jTid.setBackground(new java.awt.Color(51, 51, 51));
        jTid.setForeground(new java.awt.Color(255, 255, 255));
        jTid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTid.setBorder(null);
        jTid.setCaretColor(new java.awt.Color(255, 255, 255));
        jTid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTidKeyTyped(evt);
            }
        });
        getContentPane().add(jTid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 30, 20));

        jTpassword.setBackground(new java.awt.Color(51, 51, 51));
        jTpassword.setForeground(new java.awt.Color(255, 255, 255));
        jTpassword.setBorder(null);
        jTpassword.setCaretColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 120, 20));

        jTapellido.setBackground(new java.awt.Color(51, 51, 51));
        jTapellido.setForeground(new java.awt.Color(255, 255, 255));
        jTapellido.setBorder(null);
        jTapellido.setCaretColor(new java.awt.Color(255, 255, 255));
        jTapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTapellidoKeyTyped(evt);
            }
        });
        getContentPane().add(jTapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 120, 20));

        jLactivo.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLactivo.setForeground(new java.awt.Color(204, 204, 204));
        jLactivo.setText("Activo");
        getContentPane().add(jLactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 50, 30));

        jTtelefono.setBackground(new java.awt.Color(51, 51, 51));
        jTtelefono.setForeground(new java.awt.Color(255, 255, 255));
        jTtelefono.setBorder(null);
        jTtelefono.setCaretColor(new java.awt.Color(255, 255, 255));
        jTtelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTtelefonoKeyTyped(evt);
            }
        });
        getContentPane().add(jTtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 120, 20));

        jBsalir.setBackground(new java.awt.Color(51, 51, 51));
        jBsalir.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jBsalir.setForeground(new java.awt.Color(204, 204, 204));
        jBsalir.setText("Salir");
        jBsalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jBsalir.setFocusTraversalPolicyProvider(true);
        jBsalir.setHideActionText(true);
        jBsalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });
        getContentPane().add(jBsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 80, 30));

        jBcrear.setBackground(new java.awt.Color(51, 51, 51));
        jBcrear.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jBcrear.setForeground(new java.awt.Color(204, 204, 204));
        jBcrear.setText("Crear");
        jBcrear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jBcrear.setFocusTraversalPolicyProvider(true);
        jBcrear.setHideActionText(true);
        jBcrear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBcrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcrearActionPerformed(evt);
            }
        });
        getContentPane().add(jBcrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 90, 30));

        jBeliminar.setBackground(new java.awt.Color(51, 51, 51));
        jBeliminar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jBeliminar.setForeground(new java.awt.Color(204, 204, 204));
        jBeliminar.setText("Eliminar");
        jBeliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jBeliminar.setFocusTraversalPolicyProvider(true);
        jBeliminar.setHideActionText(true);
        jBeliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jBeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 90, 30));

        jBmodificar.setBackground(new java.awt.Color(51, 51, 51));
        jBmodificar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jBmodificar.setForeground(new java.awt.Color(204, 204, 204));
        jBmodificar.setText("Modificar");
        jBmodificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jBmodificar.setFocusTraversalPolicyProvider(true);
        jBmodificar.setHideActionText(true);
        jBmodificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodificarActionPerformed(evt);
            }
        });
        getContentPane().add(jBmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 90, 30));

        jBlimpiar.setBackground(new java.awt.Color(51, 51, 51));
        jBlimpiar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jBlimpiar.setForeground(new java.awt.Color(204, 204, 204));
        jBlimpiar.setText("Limpiar");
        jBlimpiar.setToolTipText("");
        jBlimpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jBlimpiar.setFocusTraversalPolicyProvider(true);
        jBlimpiar.setHideActionText(true);
        jBlimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jBlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 90, 30));

        jBrefrescar.setBackground(new java.awt.Color(51, 51, 51));
        jBrefrescar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jBrefrescar.setForeground(new java.awt.Color(204, 204, 204));
        jBrefrescar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/refresh.png"))); // NOI18N
        jBrefrescar.setBorder(null);
        jBrefrescar.setContentAreaFilled(false);
        jBrefrescar.setFocusTraversalPolicyProvider(true);
        jBrefrescar.setHideActionText(true);
        jBrefrescar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBrefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBrefrescarActionPerformed(evt);
            }
        });
        getContentPane().add(jBrefrescar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 80, 60));

        jTBusuario.setBackground(new java.awt.Color(51, 51, 51));
        jTBusuario.setForeground(new java.awt.Color(255, 255, 255));
        jTBusuario.setModel(new javax.swing.table.DefaultTableModel(
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
        jTBusuario.setGridColor(new java.awt.Color(102, 102, 102));
        jTBusuario.setSelectionBackground(new java.awt.Color(0, 153, 0));
        jTBusuario.setSelectionForeground(new java.awt.Color(204, 204, 204));
        jTBusuario.setShowGrid(true);
        jTBusuario.setSurrendersFocusOnKeystroke(true);
        jTBusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTBusuarioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTBusuario);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 530, 170));

        jLfondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/AdministrarUsuario.jpg"))); // NOI18N
        jLfondo.setToolTipText("");
        jLfondo.setFocusable(false);
        jLfondo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLfondo.setRequestFocusEnabled(false);
        jLfondo.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jLfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBcrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcrearActionPerformed

        obtenerUsuarioDelForm();

    }//GEN-LAST:event_jBcrearActionPerformed

    private void jTnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTnombreKeyTyped

        soloLetras(evt);

    }//GEN-LAST:event_jTnombreKeyTyped

    private void jTapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTapellidoKeyTyped

        soloLetras(evt);

    }//GEN-LAST:event_jTapellidoKeyTyped

    private void jTedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTedadKeyTyped

        soloNumeros(evt);

    }//GEN-LAST:event_jTedadKeyTyped

    private void jTdniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTdniKeyTyped

        soloNumeros(evt);

    }//GEN-LAST:event_jTdniKeyTyped

    private void jTidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTidKeyTyped

        soloNumeros(evt);

    }//GEN-LAST:event_jTidKeyTyped

    private void jTBusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTBusuarioMouseClicked

        int fila = jTBusuario.getSelectedRow();
        jTid.setText(jTBusuario.getValueAt(fila, 0) + "");
        jTusuario.setText(jTBusuario.getValueAt(fila, 1) + "");
        jTpassword.setText(jTBusuario.getValueAt(fila, 2) + "");
        jTnombre.setText(jTBusuario.getValueAt(fila, 3) + "");
        jTapellido.setText(jTBusuario.getValueAt(fila, 4) + "");
        jTedad.setText(jTBusuario.getValueAt(fila, 5) + "");
        jTdni.setText(jTBusuario.getValueAt(fila, 6) + "");
        jTtelefono.setText(jTBusuario.getValueAt(fila, 7) + "");
        jDCfechaNac.setDate(Date.from(((LocalDate) jTBusuario.getValueAt(fila, 8))
                .atStartOfDay(ZoneId.systemDefault()).toInstant()));
        jRactivo.setSelected((boolean) jTBusuario.getValueAt(fila, 9));

        jBmodificar.setEnabled(true);
        jBcrear.setEnabled(false);
        jBeliminar.setEnabled(true);

    }//GEN-LAST:event_jTBusuarioMouseClicked

    private void jTtelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTtelefonoKeyTyped

        soloNumeros(evt);

    }//GEN-LAST:event_jTtelefonoKeyTyped

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed

        dispose();

    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed

        // Muestra un cuadro de diálogo de confirmación
        int confirmacion = JOptionPane.showConfirmDialog(
                null,
                "¿Estás seguro de que deseas eliminar este usuario?",
                "Confirmar eliminación",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        // Verifica la respuesta del usuario
        if (confirmacion == JOptionPane.YES_OPTION) {
            // Código para eliminar el usuario
            usuDat.eliminarUsuario(Integer.parseInt(jTid.getText()));

            Utilidades.mostrarDialogoTemporal("Base de datos", "Operacion completadaa.", 2000);

        }
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jBmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificarActionPerformed

        usuDat.modificarUsuario(obtenerUsuarioDelForm());
        cargarUsuarios();

    }//GEN-LAST:event_jBmodificarActionPerformed

    private void jBlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimpiarActionPerformed

        limpiarForm();
        cargarUsuarios();

    }//GEN-LAST:event_jBlimpiarActionPerformed

    private void jBrefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBrefrescarActionPerformed

        cargarUsuarios();
    }//GEN-LAST:event_jBrefrescarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcrear;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBlimpiar;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JButton jBrefrescar;
    private javax.swing.JButton jBsalir;
    private com.toedter.calendar.JDateChooser jDCfechaNac;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLactivo;
    private javax.swing.JLabel jLapellido;
    private javax.swing.JLabel jLdni;
    private javax.swing.JLabel jLedad;
    private javax.swing.JLabel jLfechaNac;
    private javax.swing.JLabel jLfondo;
    private javax.swing.JLabel jLid;
    private javax.swing.JLabel jLnombre;
    private javax.swing.JLabel jLpassword;
    private javax.swing.JLabel jLtelefono;
    private javax.swing.JLabel jLusuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRactivo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTBusuario;
    private javax.swing.JTextField jTapellido;
    private javax.swing.JTextField jTdni;
    private javax.swing.JTextField jTedad;
    private javax.swing.JTextField jTid;
    private javax.swing.JTextField jTnombre;
    private javax.swing.JTextField jTpassword;
    private javax.swing.JTextField jTtelefono;
    private javax.swing.JTextField jTusuario;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {

        modelo.addColumn("idUsuario");
        modelo.addColumn("usuario");
        modelo.addColumn("password");
        modelo.addColumn("nombre");
        modelo.addColumn("apellido");
        modelo.addColumn("edad");
        modelo.addColumn("dni");
        modelo.addColumn("telefono");
        modelo.addColumn("fechaNacimiento");
        modelo.addColumn("activo");
        jTBusuario.setModel(modelo);

    }

    private void cargarUsuarios() {

        modelo.setRowCount(0);
        List<Usuario> usuario = usuDat.listarUsuarios();

        for (Usuario usu : usuario) {

            modelo.addRow(new Object[]{usu.getIdUsuario(), usu.getUsuario(), usu.getPassword(),
                usu.getNombre(), usu.getApellido(), usu.getEdad(), usu.getDni(), usu.getTelefono(),
                usu.getFechaNacimiento(), usu.getActivo()});

        }
    }

    private void soloLetras(KeyEvent evt) {

        char validar = evt.getKeyChar();

        if (Character.isDigit(validar)) {

            getToolkit().beep();
            evt.consume();

            Utilidades.mostrarDialogoTemporal("Error", "Ingrese solo letras", 1000);

        }
    }

    private void soloNumeros(KeyEvent evt) {

        char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {

            getToolkit().beep();
            evt.consume();

            Utilidades.mostrarDialogoTemporal("Error", "Ingrese solo numeros", 1000);

        }
    }

    private Usuario obtenerUsuarioDelForm() {

        Usuario usu = new Usuario();

        if (!jTusuario.getText().isEmpty() && !jTpassword.getText().isEmpty() && !jTnombre.getText().isEmpty()
                && !jTapellido.getText().isEmpty() && !jTedad.getText().isEmpty() && !jTdni.getText().isEmpty()
                && !jTtelefono.getText().isEmpty() && jDCfechaNac.getDate() != null) {

            // Todos los campos están llenos y no son nulos, entonces crea y asigna los valores a 'usu'.
            if (!jTid.getText().isEmpty()) {
                usu.setIdUsuario(Integer.parseInt(jTid.getText()));
            }
            usu.setUsuario(jTusuario.getText());
            usu.setPassword(jTpassword.getText());
            usu.setNombre(jTnombre.getText());
            usu.setApellido(jTapellido.getText());
            usu.setEdad(Integer.parseInt(jTedad.getText()));
            usu.setDni(Integer.parseInt(jTdni.getText()));
            usu.setTelefono(Integer.parseInt(jTtelefono.getText()));
            usu.setFechaNacimiento(jDCfechaNac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            usu.setActivo(jRactivo.isSelected());

            return usu;

        } else {
            Utilidades.mostrarDialogoTemporal("Administrador de usuarios", "Se deben rellenar todos los campos", 2000);
        }

        return null;
    }

    private void limpiarForm() {

        jTid.setText(null);
        jTusuario.setText(null);
        jTpassword.setText(null);
        jTnombre.setText(null);
        jTapellido.setText(null);
        jTedad.setText(null);
        jTdni.setText(null);
        jTtelefono.setText(null);
        jDCfechaNac.setDate(null);
        jRactivo.setSelected(false);

        jBcrear.setEnabled(true);
        jBmodificar.setEnabled(false);
        jBeliminar.setEnabled(false);

    }
}
