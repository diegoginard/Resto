
package Vistas;

import BaseDatos.MesaData;
import Entidades.Mesa;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;


public class AdministraSalon extends javax.swing.JInternalFrame {
    
   
    Icon icoR = new ImageIcon(getClass().getResource("/Recursos/mesa-rojo.png"));
    Icon icoV = new ImageIcon(getClass().getResource("/Recursos/mesa-verde.png"));
    Icon icoG = new ImageIcon(getClass().getResource("/Recursos/mesa-gris.png"));
    MesaData md = new MesaData();
    List<Mesa> mesas = md.listarMesas();
    Mesa mes = new Mesa();
    private boolean mesaOcupada = false;
    
       
    public AdministraSalon() {

        initComponents();
      //  mesa1.setIcon(icoG);
        List<Mesa> mesas = md.listarMesas();
//        ArrayList<JLabel> listarMesas = ListaMesaSalon();
        armarCabecera();
        cargarLista();

//        for (int i = 0; i < listarMesas.size(); i++) {
//            
//            if (i < mesas.size()) {
//
//                JLabel mesaLabel = listarMesas.get(i);
//                mesaLabel.setIcon(icoG);
//
//            Mesa mesa = mesas.get(i);
//            mesa.setEstadoMesa("ocupado");
//
//            }
//        }
    }
    
    private DefaultTableModel modelo = new DefaultTableModel(){
        
        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
        
        }
    };

//    public ArrayList<JLabel> ListaMesaSalon(){
//        
//        List<Mesa> mesas = md.listarMesas();
//        mesas.add(mes); 
//        ArrayList<JLabel> me = new ArrayList<>();
//        
//        me.add(mesa1);
//        me.add(mesa2);
//        me.add(mesa3);
//        me.add(mesa4);
//        me.add(mesa5);
//        me.add(mesa6);
//        me.add(mesa7);
//        me.add(mesa8);  
//        me.add(mesa9);  
//        me.add(mesa10);  
//        me.add(mesa11);
//        me.add(mesa12);
//        me.add(mesa13);
//        me.add(mesa14);
//        me.add(mesa15);
//        me.add(mesa16);
//        me.add(mesa17);
//        me.add(mesa18);  
//        me.add(mesa19);  
//        me.add(mesa20);  
//        me.add(mesa21);
//        me.add(mesa22);
//        me.add(mesa23);
//        me.add(mesa24);
//        me.add(mesa25);
//        me.add(mesa26);
//        me.add(mesa27);
//        me.add(mesa28);  
//        me.add(mesa29);  
//        me.add(mesa30);  
//        
//        return me;
//    }
     //Mesa mes = mesas.add(ListaMesaSalon());

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtListaMesas = new javax.swing.JTable();
        jbCrear = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jrActivo = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jcEstado = new javax.swing.JComboBox<>();
        jtCapacidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtID = new javax.swing.JTextField();
        jtNumero = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Administra Salon");
        setPreferredSize(new java.awt.Dimension(749, 661));
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(749, 661));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 690, 150));

        jbCrear.setText("Crear");
        jbCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearActionPerformed(evt);
            }
        });
        jPanel1.add(jbCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 64, -1));

        jbModificar.setText("Modificar");
        jPanel1.add(jbModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        jbBorrar.setText("Borrar");
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(jbBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 57, -1));

        jbBuscar.setText("Buscar");
        jPanel1.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, -1, -1));

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 230, 70, -1));

        jLabel1.setText("Activo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 45, -1));
        jPanel1.add(jrActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        jLabel5.setText("Estado ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

        jcEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LIBRE", "OCUPADO", "PENDIENTE" }));
        jPanel1.add(jcEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 91, -1));
        jPanel1.add(jtCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 99, -1));

        jLabel6.setText("Capacidad");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, -1, -1));

        jLabel3.setText("ID Mesa");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));
        jPanel1.add(jtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 93, -1));
        jPanel1.add(jtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 99, -1));

        jLabel4.setText("Numero");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("ADMINISTRACION DE MESAS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 882, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentAdded

    private void jbCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbCrearActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jtListaMesasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtListaMesasMouseClicked
        
        jbCrear.setEnabled(false);
        int fila = jtListaMesas.getSelectedRow();
        jtID.setText(jtListaMesas.getValueAt(fila, 0)+"");
        jtNumero.setText(jtListaMesas.getValueAt(fila, 1)+"");
        String estadoM = jtListaMesas.getValueAt(fila, 2)+"";
        jtCapacidad.setText(jtListaMesas.getValueAt(fila, 3)+"");
        jrActivo.setSelected((boolean) jtListaMesas.getValueAt(fila, 4));
        
        switch(estadoM){
        
            case "LIBRE":
                    
                jcEstado.setSelectedIndex(0);
                
                break;
                
            case "OCUPADO":
                
                jcEstado.setSelectedIndex(1);
        
                break;
                
            case "PENDIENTE":
                
                jcEstado.setSelectedIndex(2);
        
                break;
                
        }
    }//GEN-LAST:event_jtListaMesasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCrear;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcEstado;
    private javax.swing.JRadioButton jrActivo;
    private javax.swing.JTextField jtCapacidad;
    private javax.swing.JTextField jtID;
    private javax.swing.JTable jtListaMesas;
    private javax.swing.JTextField jtNumero;
    // End of variables declaration//GEN-END:variables

    private void cargarLista() {

        List<Mesa> mesas = md.listarMesas();
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
}
