
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

        ImageIcon icono = new ImageIcon(getClass().getResource("/Recursos/AdministrarMesas.jpg"));
        Image imagen = icono.getImage();
        escritorio = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){

                g.drawImage(imagen,0,0,getWidth(),getHeight(),this);

            }
        };
        jScrollPane1 = new javax.swing.JScrollPane();
        jtListaMesas = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jrActivo = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jtNumero = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jcEstado = new javax.swing.JComboBox<>();
        jtCapacidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtBuscar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jcElegir = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jbBorrar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbCrear = new javax.swing.JButton();

        setBorder(null);
        setTitle("Administra Salon");
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });

        escritorio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        escritorio.setForeground(new java.awt.Color(0, 0, 0));
        escritorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        escritorio.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 470, 180));

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        escritorio.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, 70, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Activo");
        escritorio.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 45, -1));
        escritorio.add(jrActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Numero");
        escritorio.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNumeroKeyTyped(evt);
            }
        });
        escritorio.add(jtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 40, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Estado ");
        escritorio.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        jcEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..........", "LIBRE", "OCUPADO", "PENDIENTE" }));
        escritorio.add(jcEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 91, -1));

        jtCapacidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCapacidadKeyTyped(evt);
            }
        });
        escritorio.add(jtCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 40, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Capacidad");
        escritorio.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        jtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtIdKeyTyped(evt);
            }
        });
        escritorio.add(jtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 40, -1));

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID Mesa");
        escritorio.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ADMINISTRACION DE MESAS");
        escritorio.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtBuscarKeyReleased(evt);
            }
        });
        escritorio.add(jtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 70, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Bucar");
        escritorio.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        jcElegir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...........", "idMesa", "Numero", "Estado", "Sillas", "Activas", " " }));
        jcElegir.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcElegirItemStateChanged(evt);
            }
        });
        escritorio.add(jcElegir, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, -1, -1));

        jPanel1.setBackground(new java.awt.Color(30, 30, 30));

        jbBorrar.setText("Borrar");
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbCrear.setText("Crear");
        jbCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jbCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jbBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(198, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbBorrar)
                    .addComponent(jbModificar)
                    .addComponent(jbCrear))
                .addGap(58, 58, 58))
        );

        escritorio.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 400, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );

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

    private void jbCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearActionPerformed

        mesa.setNumero(Integer.parseInt(jtNumero.getText()));
        mesa.setCapacidad(Integer.parseInt(jtCapacidad.getText()));
        mesa.setEstadoMesa(jcEstado.getSelectedItem()+"");
        md.crearMesa(mesa);
        cargarLista();

    }//GEN-LAST:event_jbCrearActionPerformed

    private void jtListaMesasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtListaMesasMouseClicked

        jbCrear.setEnabled(false);
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

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        
        mesa.setIdMesa(Integer.parseInt(jtId.getText()));
        mesa.setNumero(Integer.parseInt(jtNumero.getText()));
        mesa.setEstadoMesa(jcEstado.getSelectedItem()+"");
        mesa.setCapacidad(Integer.parseInt(jtCapacidad.getText()));
        mesa.setActivo(jrActivo.isSelected());
        md.modificarMesa(mesa);
        cargarLista();
        limpiar();
        
    }//GEN-LAST:event_jbModificarActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbCrear;
    private javax.swing.JButton jbModificar;
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
    
    private void limpiar() {
        
       jtId.setText("");
       jtNumero.setText("");
       jcEstado.setSelectedIndex(0);
       jtCapacidad.setText("");
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
