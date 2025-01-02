
package Vistas;

import BaseDatos.UsuarioData;
import Entidades.Usuario;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.ZoneId;
import static java.time.temporal.TemporalQueries.localDate;
import java.util.Date;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;


public class AdministrarUsuario extends JInternalFrame {
    
    UsuarioData usuDat = new UsuarioData();
    
    public AdministrarUsuario() {
        
        initComponents();
        armarCabecera();
        cargarPedidos();
        
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLnombre = new javax.swing.JLabel();
        jLedad = new javax.swing.JLabel();
        jLpassword = new javax.swing.JLabel();
        jLapellido = new javax.swing.JLabel();
        jLdni = new javax.swing.JLabel();
        jLid = new javax.swing.JLabel();
        jLusuario = new javax.swing.JLabel();
        jLtelefono = new javax.swing.JLabel();
        jBcrear = new javax.swing.JButton();
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

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Administrar Usuarios");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 232, 26));

        jLnombre.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLnombre.setForeground(new java.awt.Color(204, 204, 204));
        jLnombre.setText("Nombre");
        jPanel2.add(jLnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 60, 30));

        jLedad.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLedad.setForeground(new java.awt.Color(204, 204, 204));
        jLedad.setText("Edad");
        jPanel2.add(jLedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 60, 30));

        jLpassword.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLpassword.setForeground(new java.awt.Color(204, 204, 204));
        jLpassword.setText("Password");
        jPanel2.add(jLpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 70, 30));

        jLapellido.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLapellido.setForeground(new java.awt.Color(204, 204, 204));
        jLapellido.setText("Apellido");
        jPanel2.add(jLapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 60, 30));

        jLdni.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLdni.setForeground(new java.awt.Color(204, 204, 204));
        jLdni.setText("Dni");
        jPanel2.add(jLdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 60, 30));

        jLid.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLid.setForeground(new java.awt.Color(204, 204, 204));
        jLid.setText("Id");
        jPanel2.add(jLid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 30, 30));

        jLusuario.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLusuario.setForeground(new java.awt.Color(204, 204, 204));
        jLusuario.setText("Usuario");
        jPanel2.add(jLusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 60, 30));

        jLtelefono.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLtelefono.setForeground(new java.awt.Color(204, 204, 204));
        jLtelefono.setText("Telefono");
        jPanel2.add(jLtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 60, 30));

        jBcrear.setBackground(new java.awt.Color(51, 51, 51));
        jBcrear.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jBcrear.setForeground(new java.awt.Color(204, 204, 204));
        jBcrear.setText("Crear");
        jBcrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcrearActionPerformed(evt);
            }
        });
        jPanel2.add(jBcrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, 30));

        jRactivo.setForeground(new java.awt.Color(51, 51, 51));
        jRactivo.setBorder(null);
        jRactivo.setBorderPainted(true);
        jRactivo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jRactivo.setFocusable(false);
        jRactivo.setLabel("");
        jRactivo.setOpaque(true);
        jPanel2.add(jRactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        jDCfechaNac.setBackground(new java.awt.Color(51, 51, 51));
        jDCfechaNac.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jDCfechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 120, 30));

        jLfechaNac.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLfechaNac.setForeground(new java.awt.Color(204, 204, 204));
        jLfechaNac.setText("Fecha de nacimiento");
        jPanel2.add(jLfechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 140, 30));

        jTdni.setBackground(new java.awt.Color(51, 51, 51));
        jTdni.setForeground(new java.awt.Color(255, 255, 255));
        jTdni.setBorder(null);
        jTdni.setCaretColor(new java.awt.Color(255, 255, 255));
        jTdni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTdniKeyTyped(evt);
            }
        });
        jPanel2.add(jTdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 120, 20));

        jTusuario.setBackground(new java.awt.Color(51, 51, 51));
        jTusuario.setForeground(new java.awt.Color(255, 255, 255));
        jTusuario.setBorder(null);
        jTusuario.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(jTusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 120, 20));

        jTnombre.setBackground(new java.awt.Color(51, 51, 51));
        jTnombre.setForeground(new java.awt.Color(255, 255, 255));
        jTnombre.setBorder(null);
        jTnombre.setCaretColor(new java.awt.Color(255, 255, 255));
        jTnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTnombreKeyTyped(evt);
            }
        });
        jPanel2.add(jTnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 120, 20));

        jTedad.setBackground(new java.awt.Color(51, 51, 51));
        jTedad.setForeground(new java.awt.Color(255, 255, 255));
        jTedad.setBorder(null);
        jTedad.setCaretColor(new java.awt.Color(255, 255, 255));
        jTedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTedadKeyTyped(evt);
            }
        });
        jPanel2.add(jTedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 120, 20));

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
        jPanel2.add(jTid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 30, 20));

        jTpassword.setBackground(new java.awt.Color(51, 51, 51));
        jTpassword.setForeground(new java.awt.Color(255, 255, 255));
        jTpassword.setBorder(null);
        jTpassword.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(jTpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 120, 20));

        jTapellido.setBackground(new java.awt.Color(51, 51, 51));
        jTapellido.setForeground(new java.awt.Color(255, 255, 255));
        jTapellido.setBorder(null);
        jTapellido.setCaretColor(new java.awt.Color(255, 255, 255));
        jTapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTapellidoKeyTyped(evt);
            }
        });
        jPanel2.add(jTapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 120, 20));

        jLactivo.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLactivo.setForeground(new java.awt.Color(204, 204, 204));
        jLactivo.setText("Activo");
        jPanel2.add(jLactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 50, 30));

        jTtelefono.setBackground(new java.awt.Color(51, 51, 51));
        jTtelefono.setForeground(new java.awt.Color(255, 255, 255));
        jTtelefono.setBorder(null);
        jTtelefono.setCaretColor(new java.awt.Color(255, 255, 255));
        jTtelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTtelefonoKeyTyped(evt);
            }
        });
        jPanel2.add(jTtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 120, 20));

        jBsalir.setBackground(new java.awt.Color(51, 51, 51));
        jBsalir.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jBsalir.setForeground(new java.awt.Color(204, 204, 204));
        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });
        jPanel2.add(jBsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, 30));

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

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 307, 530, 190));

        jLfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/adm_usu.jpg"))); // NOI18N
        jLfondo.setToolTipText("");
        jPanel2.add(jLfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 550, 510));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBcrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcrearActionPerformed
        
        
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
        jTid.setText(jTBusuario.getValueAt(fila,0) + "");
        jTusuario.setText(jTBusuario.getValueAt(fila,1) + "");
        jTpassword.setText(jTBusuario.getValueAt(fila,2) + "");
        jTnombre.setText(jTBusuario.getValueAt(fila,3) + "");
        jTapellido.setText(jTBusuario.getValueAt(fila,4) + "");
        jTedad.setText(jTBusuario.getValueAt(fila,5) + "");
        jTdni.setText(jTBusuario.getValueAt(fila,6) + "");
        jTtelefono.setText(jTBusuario.getValueAt(fila,7) + "");

        // Convertir java.util.Date a java.sql.Date
        Object value = jTBusuario.getValueAt(fila, 8);
        // Convertir LocalDate a java.util.Date
        LocalDate localDate = (LocalDate) value;
        Date utilDate = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        // Asignar la fecha al JDateChooser
        jDCfechaNac.setDate(utilDate);
        
        jRactivo.setSelected((boolean)jTBusuario.getValueAt(fila,9));
        
    }//GEN-LAST:event_jTBusuarioMouseClicked

    private void jTtelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTtelefonoKeyTyped
        
        soloNumeros(evt);
        
    }//GEN-LAST:event_jTtelefonoKeyTyped

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        
        dispose();
        
    }//GEN-LAST:event_jBsalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcrear;
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
    private javax.swing.JPanel jPanel2;
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

    private void armarCabecera(){
    
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
    
    private void cargarPedidos(){
    
        
        modelo.setRowCount(0);
        List<Usuario> usuario = usuDat.listarUsuarios();

        for (Usuario usu : usuario) {

            modelo.addRow(new Object[]{usu.getIdUsuario(), usu.getUsuario(),usu.getPassword(),
               usu.getNombre(), usu.getApellido(),usu.getEdad(),usu.getDni(),usu.getTelefono(), 
               usu.getFechaNacimiento(), usu.isActivo()});

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
    
     private void soloNumeros(KeyEvent evt){
        
        char validar = evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            
            getToolkit().beep();
            evt.consume();
            
            Utilidades.mostrarDialogoTemporal("Error", "Ingrese solo numeros", 1000);
            
        }
    }
}
