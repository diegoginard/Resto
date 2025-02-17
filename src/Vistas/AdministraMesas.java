
package Vistas;

import BaseDatos.MesaData;
import Entidades.Mesa;
import java.awt.event.KeyEvent;
import java.util.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.*;


public class AdministraMesas extends JInternalFrame {
    
    public AdministraMesas(){
    
        initComponents();
        armarCabecera();
        cargarLista();
         
        // Desactiva la barra de título del JInternalFrame
        BasicInternalFrameUI ui = (BasicInternalFrameUI)getUI();
        ui.setNorthPane(null);
        
        jTbuscar.setEnabled(false);
        jBmodificar.setEnabled(false);
        jBeliminar.setEnabled(false);   
    }

    private DefaultTableModel modelo = new DefaultTableModel(){
        
        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;  
        }
    };
    
    MesaData md = new MesaData();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtListaMesas = new javax.swing.JTable();
        jBsalir = new javax.swing.JButton();
        jCestado = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jRactivo = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jTnumero = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTcapacidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTbuscar = new javax.swing.JTextField();
        jLbuscar = new javax.swing.JLabel();
        jCelegir = new javax.swing.JComboBox<>();
        jBmodificar = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jBcrear = new javax.swing.JButton();
        javax.swing.JButton jBrefrescar = new javax.swing.JButton();
        jBlimpiar = new javax.swing.JButton();
        jLfondo = new javax.swing.JLabel();

        setBorder(null);
        setTitle("Administra Salon");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtListaMesas.setModel(new javax.swing.table.DefaultTableModel(
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
        jtListaMesas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtListaMesasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtListaMesas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 470, 170));

        jBsalir.setBackground(new java.awt.Color(179, 36, 36));
        jBsalir.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jBsalir.setForeground(new java.awt.Color(255, 255, 255));
        jBsalir.setText("Salir");
        jBsalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jBsalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });
        getContentPane().add(jBsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 90, 30));

        jCestado.setBackground(new java.awt.Color(51, 51, 51));
        jCestado.setForeground(new java.awt.Color(255, 255, 255));
        jCestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..........", "LIBRE", "OCUPADO", "" }));
        getContentPane().add(jCestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 91, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Activo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 45, -1));

        jRactivo.setBackground(new java.awt.Color(51, 51, 51));
        jRactivo.setBorder(null);
        jRactivo.setContentAreaFilled(false);
        getContentPane().add(jRactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Numero");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jTnumero.setBackground(new java.awt.Color(51, 51, 51));
        jTnumero.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jTnumero.setForeground(new java.awt.Color(255, 255, 255));
        jTnumero.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTnumero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTnumero.setCaretColor(new java.awt.Color(255, 255, 255));
        jTnumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTnumeroKeyTyped(evt);
            }
        });
        getContentPane().add(jTnumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 40, 30));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Estado ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        jTcapacidad.setBackground(new java.awt.Color(51, 51, 51));
        jTcapacidad.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jTcapacidad.setForeground(new java.awt.Color(255, 255, 255));
        jTcapacidad.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTcapacidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTcapacidad.setCaretColor(new java.awt.Color(255, 255, 255));
        jTcapacidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTcapacidadKeyTyped(evt);
            }
        });
        getContentPane().add(jTcapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 40, 30));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Capacidad");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ADMINISTRACION DE MESAS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jTbuscar.setBackground(new java.awt.Color(51, 51, 51));
        jTbuscar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jTbuscar.setForeground(new java.awt.Color(255, 255, 255));
        jTbuscar.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTbuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTbuscar.setCaretColor(new java.awt.Color(255, 255, 255));
        jTbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTbuscarKeyReleased(evt);
            }
        });
        getContentPane().add(jTbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 70, 20));

        jLbuscar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLbuscar.setForeground(new java.awt.Color(255, 255, 255));
        jLbuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbuscar.setText("Buscar");
        getContentPane().add(jLbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 60, 20));

        jCelegir.setBackground(new java.awt.Color(51, 51, 51));
        jCelegir.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jCelegir.setForeground(new java.awt.Color(255, 255, 255));
        jCelegir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...........", "Numero", "Estado", "Sillas", " ", " " }));
        jCelegir.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCelegirItemStateChanged(evt);
            }
        });
        getContentPane().add(jCelegir, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, -1, -1));

        jBmodificar.setBackground(new java.awt.Color(51, 51, 51));
        jBmodificar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jBmodificar.setForeground(new java.awt.Color(255, 255, 255));
        jBmodificar.setText("Modificar");
        jBmodificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jBmodificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodificarActionPerformed(evt);
            }
        });
        getContentPane().add(jBmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 90, 30));

        jBeliminar.setBackground(new java.awt.Color(51, 51, 51));
        jBeliminar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jBeliminar.setForeground(new java.awt.Color(255, 255, 255));
        jBeliminar.setText("Eliminar");
        jBeliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jBeliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBeliminar.setPreferredSize(new java.awt.Dimension(81, 23));
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jBeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 90, 30));

        jBcrear.setBackground(new java.awt.Color(51, 51, 51));
        jBcrear.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jBcrear.setForeground(new java.awt.Color(255, 255, 255));
        jBcrear.setText("Crear");
        jBcrear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jBcrear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBcrear.setPreferredSize(new java.awt.Dimension(81, 23));
        jBcrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcrearActionPerformed(evt);
            }
        });
        getContentPane().add(jBcrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 90, 30));

        jBrefrescar.setBackground(new java.awt.Color(51, 51, 51));
        jBrefrescar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jBrefrescar.setForeground(new java.awt.Color(255, 255, 255));
        jBrefrescar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/refresh.png"))); // NOI18N
        jBrefrescar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jBrefrescar.setContentAreaFilled(false);
        jBrefrescar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBrefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBrefrescarActionPerformed(evt);
            }
        });
        getContentPane().add(jBrefrescar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, 90, 50));

        jBlimpiar.setBackground(new java.awt.Color(51, 51, 51));
        jBlimpiar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jBlimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jBlimpiar.setText("Limpiar");
        jBlimpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jBlimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBlimpiar.setPreferredSize(new java.awt.Dimension(81, 23));
        jBlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jBlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 90, 30));

        jLfondo.setBackground(new java.awt.Color(51, 51, 51));
        jLfondo.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLfondo.setForeground(new java.awt.Color(255, 255, 255));
        jLfondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/AdministrarMesas.jpg"))); // NOI18N
        getContentPane().add(jLfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        
        dispose();    
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        
        // Muestra un cuadro de diálogo de confirmación
        int confirmacion = JOptionPane.showConfirmDialog(
                null,
                "¿Estás seguro de que deseas eliminar esta mesa?",
                "Confirmar eliminación",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        // Verifica la respuesta del usuario
        if (confirmacion == JOptionPane.YES_OPTION) {
            
            // Código para eliminar la mesa
             md.eliminarMesa(Integer.parseInt(jTnumero.getText()));
           
            Utilidades.mostrarDialogoTemporal("Base de datos", "Operacion completada.",2000);
            limpiarForm();
            cargarLista();
        }
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jBcrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcrearActionPerformed

        if(obtenerMesaDelForm() != null){
            
            md.crearMesa(obtenerMesaDelForm());
            cargarLista();
            limpiarForm();        
        }
    }//GEN-LAST:event_jBcrearActionPerformed

    private void jtListaMesasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtListaMesasMouseClicked

        int fila = jtListaMesas.getSelectedRow();

        jTnumero.setText(jtListaMesas.getValueAt(fila, 1)+"");
        jCestado.setSelectedItem(jtListaMesas.getValueAt(fila, 2));
        jTcapacidad.setText(jtListaMesas.getValueAt(fila, 3)+"");
        jRactivo.setSelected((boolean) jtListaMesas.getValueAt(fila, 4));
        
        jBcrear.setEnabled(false);
        jBmodificar.setEnabled(true);
        jBeliminar.setEnabled(true);
    }//GEN-LAST:event_jtListaMesasMouseClicked

    private void jTcapacidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTcapacidadKeyTyped
        
        soloNumeros(evt);       
    }//GEN-LAST:event_jTcapacidadKeyTyped

    private void jTnumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTnumeroKeyTyped
        
        soloNumeros(evt);        
    }//GEN-LAST:event_jTnumeroKeyTyped

    private void jBmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificarActionPerformed

        Mesa mesa = obtenerMesaDelForm();
        
        if (mesa != null) {
            
            md.modificarMesa(mesa);
            limpiarForm();
            cargarLista();
        }
    }//GEN-LAST:event_jBmodificarActionPerformed

    private void jTbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTbuscarKeyReleased

        String elegir = jCelegir.getSelectedItem() + "";
        String buscar = jTbuscar.getText();
        
        switch(elegir){
       
            case "Numero":
                
                mesasxNumero(buscar);
                break;
            
            case "Sillas":
                
                mesasxSillas(buscar);
                break;
                
            case "Estado":
                
                mesasxEstado(buscar);
                break;
                
            default:
                
                cargarLista();
        }
    }//GEN-LAST:event_jTbuscarKeyReleased

    private void jCelegirItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCelegirItemStateChanged
        
        if(jCelegir.getSelectedIndex()!= 0){
            
            jTbuscar.setEnabled(true);  
            
        }else{
            
            jTbuscar.setEnabled(false);
        }
    }//GEN-LAST:event_jCelegirItemStateChanged

    private void jBrefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBrefrescarActionPerformed
        
        cargarLista();    
    }//GEN-LAST:event_jBrefrescarActionPerformed

    private void jBlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimpiarActionPerformed
        
        limpiarForm();              
    }//GEN-LAST:event_jBlimpiarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcrear;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBlimpiar;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<String> jCelegir;
    private javax.swing.JComboBox<String> jCestado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLbuscar;
    private javax.swing.JLabel jLfondo;
    private javax.swing.JRadioButton jRactivo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTbuscar;
    private javax.swing.JTextField jTcapacidad;
    private javax.swing.JTextField jTnumero;
    private javax.swing.JTable jtListaMesas;
    // End of variables declaration//GEN-END:variables

    private void cargarLista() {

        List<Mesa> mesa = md.listarTodasLasMesas();
        modelo.setRowCount(0);

        cargarTablaMesa(mesa);
    }
   
    private void armarCabecera() {
        
        modelo.addColumn("idMesa");
        modelo.addColumn("Numero");
        modelo.addColumn("EstadoMesa");
        modelo.addColumn("Capacidad");
        modelo.addColumn("Activo");
        jtListaMesas.setModel(modelo);

        // Ocultar la columna "idMesa" (índice 0)
        TableColumn column = jtListaMesas.getColumnModel().getColumn(0);
        column.setMinWidth(0);
        column.setMaxWidth(0);
        column.setWidth(0);
        column.setResizable(false);
    }

    private void soloNumeros(KeyEvent evt) {

        char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {

            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Ingrese solo numeros");
        }
    }

    private void limpiarForm() {
   
        jTnumero.setText(null);
        jCestado.setSelectedIndex(0);
        jTcapacidad.setText(null);
        jRactivo.setSelected(false);
        jBcrear.setEnabled(true);
        jBmodificar.setEnabled(false);
        jBeliminar.setEnabled(false);
    }

    private void mesasxNumero(String buscar) {

        modelo.setRowCount(0);
        List<Mesa> mesa = md.BuscarMesasNumero(buscar);

        cargarTablaMesa(mesa);
    }

    private void mesasxSillas(String buscar) {

        modelo.setRowCount(0);
        List<Mesa> mesa = md.BuscarMesasCapacidad(buscar);

        cargarTablaMesa(mesa);
    }

    private void mesasxEstado(String buscar) {

        modelo.setRowCount(0);
        List<Mesa> mesa = md.BuscarMesasEstado(buscar);

        cargarTablaMesa(mesa);
    }

    private Mesa obtenerMesaDelForm() {

        Mesa mesa = new Mesa();

        if (!jTcapacidad.getText().isEmpty() && !jTnumero.getText().isEmpty() && jCestado.getSelectedIndex() != 0) {
            
            int fila = jtListaMesas.getSelectedRow();
            int id = (int) jtListaMesas.getValueAt(fila, 0);
            mesa.setIdMesa(id);
            mesa.setCapacidad(Integer.parseInt(jTcapacidad.getText()));
            mesa.setNumero(Integer.parseInt(jTnumero.getText()));
            mesa.setEstadoMesa(jCestado.getSelectedIndex() + "");
            mesa.setActivo(jRactivo.isSelected());

            return mesa;

        } else {

            Utilidades.mostrarDialogoTemporal("Administrador de Mesas", "Se deben rellenar todos los campos", 2000);
        }

        return null;
    }

    private void cargarTablaMesa(List<Mesa> mesa) {

        if (mesa != null) {

            for (Mesa me : mesa) {

                modelo.addRow(new Object[]{me.getIdMesa(), me.getNumero(),
                    me.getEstadoMesa(), me.getCapacidad(), me.isActivo()});
            }

        } else {

            Utilidades.mostrarDialogoTemporal("Administrador de Mesas", "No se encontraron mesas", 2000);
        }
    }
}
