
package Vistas;

import BaseDatos.MesaData;
import Entidades.Mesa;
import java.awt.Graphics;
import java.awt.Image;
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
        
        jtBuscar.setEnabled(false);
        jtId.setEnabled(false);
        jBmodificar.setEnabled(false);
        
    }

    private DefaultTableModel modelo = new DefaultTableModel(){
        
        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
        
        }
    };
    
    MesaData md = new MesaData();
    Mesa mesa = new Mesa();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtListaMesas = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();
        jcEstado = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jrActivo = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jtNumero = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtCapacidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtBuscar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jcElegir = new javax.swing.JComboBox<>();
        jBmodificar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jBcrear = new javax.swing.JButton();
        javax.swing.JButton jBrefrescar = new javax.swing.JButton();
        jLfondo = new javax.swing.JLabel();

        setBorder(null);
        setTitle("Administra Salon");
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });
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

        jbSalir.setBackground(new java.awt.Color(51, 51, 51));
        jbSalir.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbSalir.setText("Salir");
        jbSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 90, 30));

        jcEstado.setBackground(new java.awt.Color(51, 51, 51));
        jcEstado.setForeground(new java.awt.Color(255, 255, 255));
        jcEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..........", "LIBRE", "OCUPADO", "PENDIENTE" }));
        getContentPane().add(jcEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 91, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Activo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 45, -1));

        jrActivo.setBackground(new java.awt.Color(51, 51, 51));
        jrActivo.setBorder(null);
        jrActivo.setContentAreaFilled(false);
        getContentPane().add(jrActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Numero");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jtNumero.setBackground(new java.awt.Color(51, 51, 51));
        jtNumero.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jtNumero.setForeground(new java.awt.Color(255, 255, 255));
        jtNumero.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtNumero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNumeroKeyTyped(evt);
            }
        });
        getContentPane().add(jtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 40, 30));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Estado ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        jtCapacidad.setBackground(new java.awt.Color(51, 51, 51));
        jtCapacidad.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jtCapacidad.setForeground(new java.awt.Color(255, 255, 255));
        jtCapacidad.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtCapacidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtCapacidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCapacidadKeyTyped(evt);
            }
        });
        getContentPane().add(jtCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 40, 30));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Capacidad");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        jtId.setBackground(new java.awt.Color(51, 51, 51));
        jtId.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jtId.setForeground(new java.awt.Color(255, 255, 255));
        jtId.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtIdKeyTyped(evt);
            }
        });
        getContentPane().add(jtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 40, 30));

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID Mesa");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ADMINISTRACION DE MESAS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jtBuscar.setBackground(new java.awt.Color(51, 51, 51));
        jtBuscar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jtBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jtBuscar.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtBuscarKeyReleased(evt);
            }
        });
        getContentPane().add(jtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 70, 20));

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Bucar");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        jcElegir.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jcElegir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...........", "idMesa", "Numero", "Estado", "Sillas", "Activas", " " }));
        jcElegir.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcElegirItemStateChanged(evt);
            }
        });
        getContentPane().add(jcElegir, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, -1, -1));

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
        getContentPane().add(jBmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 90, 30));

        jbBorrar.setBackground(new java.awt.Color(51, 51, 51));
        jbBorrar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jbBorrar.setForeground(new java.awt.Color(255, 255, 255));
        jbBorrar.setText("Borrar");
        jbBorrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbBorrar.setPreferredSize(new java.awt.Dimension(81, 23));
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(jbBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 90, 30));

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
        getContentPane().add(jBcrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 90, 30));

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

        jLfondo.setBackground(new java.awt.Color(51, 51, 51));
        jLfondo.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLfondo.setForeground(new java.awt.Color(255, 255, 255));
        jLfondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/AdministrarMesas.jpg"))); // NOI18N
        getContentPane().add(jLfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentAdded

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        
        dispose();
        
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        
        md.eliminarMesa(Integer.parseInt(jtId.getText()));
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jBcrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcrearActionPerformed

        mesa.setNumero(Integer.parseInt(jtNumero.getText()));
        mesa.setCapacidad(Integer.parseInt(jtCapacidad.getText()));
        mesa.setEstadoMesa(jcEstado.getSelectedItem()+"");
        md.crearMesa(mesa);
        cargarLista();
        limpiarForm();

    }//GEN-LAST:event_jBcrearActionPerformed

    private void jtListaMesasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtListaMesasMouseClicked

        jBcrear.setEnabled(false);
        int fila = jtListaMesas.getSelectedRow();
        jtId.setText(jtListaMesas.getValueAt(fila, 0)+"");
        jtNumero.setText(jtListaMesas.getValueAt(fila, 1)+"");
        jcEstado.setSelectedItem(jtListaMesas.getValueAt(fila, 2));
        jtCapacidad.setText(jtListaMesas.getValueAt(fila, 3)+"");
        jrActivo.setSelected((boolean) jtListaMesas.getValueAt(fila, 4));

    }//GEN-LAST:event_jtListaMesasMouseClicked

    private void jtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIdKeyTyped
       
        soloNumeros(evt);
        
    }//GEN-LAST:event_jtIdKeyTyped

    private void jtCapacidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCapacidadKeyTyped
        
        soloNumeros(evt);
        
    }//GEN-LAST:event_jtCapacidadKeyTyped

    private void jtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNumeroKeyTyped
        
        soloNumeros(evt);
        
    }//GEN-LAST:event_jtNumeroKeyTyped

    private void jBmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificarActionPerformed
        
        mesa.setIdMesa(Integer.parseInt(jtId.getText()));
        mesa.setNumero(Integer.parseInt(jtNumero.getText()));
        mesa.setEstadoMesa(jcEstado.getSelectedItem()+"");
        mesa.setCapacidad(Integer.parseInt(jtCapacidad.getText()));
        mesa.setActivo(jrActivo.isSelected());
        md.modificarMesa(mesa);
        cargarLista();
        
    }//GEN-LAST:event_jBmodificarActionPerformed

    private void jtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtBuscarKeyReleased

        String elegir = jcElegir.getSelectedItem() + "";
        String buscar = jtBuscar.getText();
        
        switch(elegir){
        
            case "idMesa":
                
//                modelo.setRowCount(0);
                mesasxId(buscar);
                break;
            
            case "Numero":
                
//                modelo.setRowCount(0);
                mesasxNumero(buscar);
                break;
            
            case "Sillas":
                
//                modelo.setRowCount(0);
                mesasxSillas(buscar);
                break;
                
            case "Activas":
                
//                modelo.setRowCount(0);
                mesasActivas(buscar);
                break;
                
            case "Estado":
                
//                modelo.setRowCount(0);
                mesasxEstado(buscar);
                break;
                
            default:
                
                cargarLista();
        
        }
    }//GEN-LAST:event_jtBuscarKeyReleased

    private void jcElegirItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcElegirItemStateChanged
        
        jtBuscar.setEnabled(true);
        
    }//GEN-LAST:event_jcElegirItemStateChanged

    private void jBrefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBrefrescarActionPerformed
        
        cargarLista();
        
    }//GEN-LAST:event_jBrefrescarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcrear;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLfondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcElegir;
    private javax.swing.JComboBox<String> jcEstado;
    private javax.swing.JRadioButton jrActivo;
    private javax.swing.JTextField jtBuscar;
    private javax.swing.JTextField jtCapacidad;
    private javax.swing.JTextField jtId;
    private javax.swing.JTable jtListaMesas;
    private javax.swing.JTextField jtNumero;
    // End of variables declaration//GEN-END:variables

    private void cargarLista() {

        List<Mesa> mesas = md.listarTodasLasMesas();
        modelo.setRowCount(0);

        for (Mesa me : mesas) {

            modelo.addRow(new Object[]{me.getIdMesa(),
                me.getNumero(), me.getEstadoMesa(), me.getCapacidad(), me.getActivo()});

        }
    }
    
    private void armarCabecera() {

        modelo.addColumn("IdMesa");
        modelo.addColumn("Numero");
        modelo.addColumn("EstadoMesa");
        modelo.addColumn("Capacidad");
        modelo.addColumn("Activo");
        jtListaMesas.setModel(modelo);

    }
    
       private void soloNumeros(KeyEvent evt){
        
        char validar = evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo numeros");
            
        }
    }
    
    private void limpiarForm() {
        
       jtId.setText(null);
       jtNumero.setText(null);
       jcEstado.setSelectedIndex(0);
       jtCapacidad.setText(null);
       jrActivo.setSelected(false);
       
    }
    
    private void mesasxId(String buscar){

        modelo.setRowCount(0);
        List<Mesa> mesa = md.BuscarMesasId(buscar);

        for (Mesa me : mesa) {

            modelo.addRow(new Object[]{me.getIdMesa(), me.getNumero(),
                me.getEstadoMesa(), me.getCapacidad(), me.getActivo() });

        }
    }
    
    private void mesasxNumero(String buscar){

        modelo.setRowCount(0);
        List<Mesa> mesa = md.BuscarMesasNumero(buscar);

        for (Mesa me : mesa) {

            modelo.addRow(new Object[]{me.getIdMesa(), me.getNumero(),
                me.getEstadoMesa(), me.getCapacidad(), me.getActivo() });

        }
    }
    
    private void mesasxSillas(String buscar){

        modelo.setRowCount(0);
        List<Mesa> mesa = md.BuscarMesasCapacidad(buscar);

        for (Mesa me : mesa) {

            modelo.addRow(new Object[]{me.getIdMesa(), me.getNumero(),
                me.getEstadoMesa(), me.getCapacidad(), me.getActivo() });

        }
    }
    
     private void mesasxEstado(String buscar){

        modelo.setRowCount(0);
        List<Mesa> mesa = md.BuscarMesasEstado(buscar);

        for (Mesa me : mesa) {

            modelo.addRow(new Object[]{me.getIdMesa(), me.getNumero(),
                me.getEstadoMesa(), me.getCapacidad(), me.getActivo() });

        }
    }
     
    private void mesasActivas(String buscar){

        modelo.setRowCount(0);
        List<Mesa> mesa = md.BuscarMesasActivo(buscar);

        for (Mesa me : mesa) {

            modelo.addRow(new Object[]{me.getIdMesa(), me.getNumero(),
                me.getEstadoMesa(), me.getCapacidad(), me.getActivo() });

        }
    }
}
