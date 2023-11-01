
package Vistas;

import BaseDatos.MesaData;
import BaseDatos.PedidoData;
import Entidades.Mesa;
import Entidades.Pedido;
import java.awt.Graphics;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;

public class restoView extends javax.swing.JInternalFrame {

    MesaData md = new MesaData();
    PedidoData pd = new PedidoData();
    
    public restoView() {
        initComponents();
        cargarMesas();
        
    }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono = new ImageIcon(getClass().getResource("/Recursos/FOODDRINKS.JPG"));
        Image imagen = icono.getImage();
        escritorio = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){

                g.drawImage(imagen,0,0,getWidth(),getHeight(),this);

            }
        };
        jPanel1 = new javax.swing.JPanel();
        jbTomarPedido = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbCancelarPedido = new javax.swing.JButton();
        jbCobrarMesa = new javax.swing.JButton();
        jbAgregarAPedido = new javax.swing.JButton();
        ventanas = new javax.swing.JTabbedPane();
        jpMesaMesero = new javax.swing.JPanel();
        jcMeseros = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jcMesas = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jbACrearPedido = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jpProducto = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jtBProducto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProducto = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtPedidoProd = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jtID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jbAgregar = new javax.swing.JButton();
        jbQuitar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setClosable(true);

        escritorio.setBackground(new java.awt.Color(35, 35, 35));

        jPanel1.setBackground(new java.awt.Color(21, 21, 21));

        jbTomarPedido.setBackground(new java.awt.Color(40, 40, 40));
        jbTomarPedido.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jbTomarPedido.setForeground(new java.awt.Color(255, 255, 255));
        jbTomarPedido.setText("TOMAR PEDIDO");
        jbTomarPedido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbTomarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTomarPedidoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 153, 0));
        jLabel1.setText("BIENVENIDOS");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Logo Pizzería Ilustración Blanco Negro (1).png"))); // NOI18N

        jbCancelarPedido.setBackground(new java.awt.Color(40, 40, 40));
        jbCancelarPedido.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jbCancelarPedido.setForeground(new java.awt.Color(255, 255, 255));
        jbCancelarPedido.setText("CANCELAR PEDIDO");
        jbCancelarPedido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbCancelarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarPedidoActionPerformed(evt);
            }
        });

        jbCobrarMesa.setBackground(new java.awt.Color(40, 40, 40));
        jbCobrarMesa.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jbCobrarMesa.setForeground(new java.awt.Color(255, 255, 255));
        jbCobrarMesa.setText("COBRAR MESA");
        jbCobrarMesa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbCobrarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCobrarMesaActionPerformed(evt);
            }
        });

        jbAgregarAPedido.setBackground(new java.awt.Color(40, 40, 40));
        jbAgregarAPedido.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jbAgregarAPedido.setForeground(new java.awt.Color(255, 255, 255));
        jbAgregarAPedido.setText("AGREGAR A PEDIDO");
        jbAgregarAPedido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbAgregarAPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarAPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbTomarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jbCobrarMesa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbCancelarPedido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbAgregarAPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(59, 59, 59)
                .addComponent(jbTomarPedido)
                .addGap(18, 18, 18)
                .addComponent(jbCancelarPedido)
                .addGap(18, 18, 18)
                .addComponent(jbCobrarMesa)
                .addGap(18, 18, 18)
                .addComponent(jbAgregarAPedido)
                .addContainerGap(264, Short.MAX_VALUE))
        );

        jpMesaMesero.setBackground(new java.awt.Color(153, 153, 153));

        jcMeseros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "CARLOS", "MARTIN", "FABIAN", "MARIA" }));

        jLabel3.setText("Mesero");

        jLabel4.setText("Mesas");

        jbACrearPedido.setText("Crear Pedido");
        jbACrearPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbACrearPedidoActionPerformed(evt);
            }
        });

        jLabel5.setText("Agregar Productos");

        javax.swing.GroupLayout jpMesaMeseroLayout = new javax.swing.GroupLayout(jpMesaMesero);
        jpMesaMesero.setLayout(jpMesaMeseroLayout);
        jpMesaMeseroLayout.setHorizontalGroup(
            jpMesaMeseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMesaMeseroLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(98, 98, 98)
                .addComponent(jcMeseros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpMesaMeseroLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addGap(104, 104, 104)
                .addComponent(jcMesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpMesaMeseroLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5))
            .addGroup(jpMesaMeseroLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jbACrearPedido))
        );
        jpMesaMeseroLayout.setVerticalGroup(
            jpMesaMeseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMesaMeseroLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jpMesaMeseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jcMeseros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpMesaMeseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpMesaMeseroLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(jcMesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jbACrearPedido))
        );

        ventanas.addTab("tab1", jpMesaMesero);

        jpProducto.setBackground(new java.awt.Color(113, 113, 113));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BuscarProductos.png"))); // NOI18N

        jtBProducto.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jtBProducto.setText("Ingrese el nombre del producto");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ELEGI UN PRODUCTO");

        jtProducto.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtProducto);

        jtPedidoProd.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jtPedidoProd);

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PRODUCTOS EN PEDIDO");

        jtID.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jtID.setText("ID");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/IDPedido.png"))); // NOI18N

        jbAgregar.setBackground(new java.awt.Color(82, 82, 82));
        jbAgregar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jbAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jbAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8-más-2-matemáticas-48.png"))); // NOI18N
        jbAgregar.setText("AGREGAR");
        jbAgregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbQuitar.setBackground(new java.awt.Color(82, 82, 82));
        jbQuitar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jbQuitar.setForeground(new java.awt.Color(255, 255, 255));
        jbQuitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8-menos-48.png"))); // NOI18N
        jbQuitar.setText("QUITAR");
        jbQuitar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbQuitarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpProductoLayout = new javax.swing.GroupLayout(jpProducto);
        jpProducto.setLayout(jpProductoLayout);
        jpProductoLayout.setHorizontalGroup(
            jpProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProductoLayout.createSequentialGroup()
                .addGroup(jpProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpProductoLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtBProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpProductoLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpProductoLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpProductoLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
            .addGroup(jpProductoLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(90, 90, 90))
            .addGroup(jpProductoLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jbAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
        );
        jpProductoLayout.setVerticalGroup(
            jpProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProductoLayout.createSequentialGroup()
                .addGroup(jpProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpProductoLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(jpProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addGroup(jpProductoLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jtBProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(jpProductoLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)))
                .addGroup(jpProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(53, 53, 53)
                .addGroup(jpProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbAgregar)
                    .addComponent(jbQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ventanas.addTab("tab2", jpProducto);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 632, Short.MAX_VALUE)
        );

        ventanas.addTab("tab3", jPanel2);

        escritorio.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(ventanas, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ventanas, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ventanas, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        escritorio.setPreferredSize(new java.awt.Dimension(1100, 657));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbTomarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTomarPedidoActionPerformed
     ventanas.setSelectedIndex(0);
        
    }//GEN-LAST:event_jbTomarPedidoActionPerformed

    private void jbCancelarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbCancelarPedidoActionPerformed

    private void jbCobrarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCobrarMesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbCobrarMesaActionPerformed

    private void jbAgregarAPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarAPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbAgregarAPedidoActionPerformed

    private void jbACrearPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbACrearPedidoActionPerformed
      ventanas.setSelectedIndex(1);
        
      Pedido ped = new Pedido();
      Mesa mesa = (Mesa) jcMesas.getSelectedItem();
      ped.setMesa(mesa);
      ped.setNombreMesero(jcMeseros.getSelectedItem()+"");
      
    }//GEN-LAST:event_jbACrearPedidoActionPerformed

    private void jbQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbQuitarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbQuitarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbACrearPedido;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbAgregarAPedido;
    private javax.swing.JButton jbCancelarPedido;
    private javax.swing.JButton jbCobrarMesa;
    private javax.swing.JButton jbQuitar;
    private javax.swing.JButton jbTomarPedido;
    private javax.swing.JComboBox<Mesa> jcMesas;
    private javax.swing.JComboBox<String> jcMeseros;
    private javax.swing.JPanel jpMesaMesero;
    private javax.swing.JPanel jpProducto;
    private javax.swing.JTextField jtBProducto;
    private javax.swing.JTextField jtID;
    private javax.swing.JTable jtPedidoProd;
    private javax.swing.JTable jtProducto;
    private javax.swing.JTabbedPane ventanas;
    // End of variables declaration//GEN-END:variables

    private void cargarMesas() {

        List<Mesa> cblistarMesas = md.listarMesas();

        for (int i = 0; i < cblistarMesas.size(); i++) {

            jcMesas.addItem(new Mesa(cblistarMesas.get(i).getIdMesa(),cblistarMesas.get(i).getNumero(),cblistarMesas.get(i).getEstadoMesa(),cblistarMesas.get(i).getCapacidad(),
                    cblistarMesas.get(i).getActivo()));

        }
    }

}
