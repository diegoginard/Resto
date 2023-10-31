
package Vistas;

import BaseDatos.*;
import Entidades.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.time.LocalDateTime;
import java.util.List;
import javax.swing.*;
import javax.swing.table.*;

public class PedidoProductos extends javax.swing.JInternalFrame {

    Icon icoR = new ImageIcon(getClass().getResource("/Recursos/mesa-rojo.png"));
    Icon icoV = new ImageIcon(getClass().getResource("/Recursos/mesa-verde.png"));
    
    Pedido ped = new Pedido();
    PedidoData pd = new PedidoData();
    ProductoData pdat = new ProductoData(); 
    MesaData md = new MesaData();
    PedidoProductoData ppd = new PedidoProductoData();

    private boolean mesaOcupada = false;
  
    public PedidoProductos() {

        initComponents();
        armarCabeceraPed();
        armarCabeceraProdPed();
        armarCabeceraProd();
        armarCabeceraMesa();
        cargarProducto();
        cargarMesa();
        TransparenciaBotones();
        jbCrearPed.setEnabled(false);
        jlMesa.setIcon(icoV);
        jtPedidoProd.setModel(modelo2);
    }
 
    private DefaultTableModel modelo1 = new DefaultTableModel(){

        @Override
        public boolean  isCellEditable(int rowIndex, int columnIndex ){
            
            return false;
        }

    };
    private DefaultTableModel modelo2 = new DefaultTableModel(){

        @Override
        public boolean  isCellEditable(int rowIndex, int columnIndex ){
            
            return false;
        }

    };

    private DefaultTableModel modelo3 = new DefaultTableModel(){

        @Override
        public boolean  isCellEditable(int rowIndex, int columnIndex ){
            
            return false;
        }

    };
    private DefaultTableModel modelo4 = new DefaultTableModel(){

        @Override
        public boolean  isCellEditable(int rowIndex, int columnIndex ){
            
            return false;
        }

    };
    
    private void TransparenciaBotones(){
        
        jbAgregar.setOpaque(false);
        jbAgregar.setContentAreaFilled(false);
        jbAgregar.setBorderPainted(false);         
        jbQuitar.setOpaque(false);
        jbQuitar.setContentAreaFilled(false);
        jbQuitar.setBorderPainted(false);
        jbCobrar.setOpaque(false);
        jbCobrar.setContentAreaFilled(false);
        jbCobrar.setBorderPainted(false);         
        
    }
    
    public void nuevatabla(){
        modelo2 = new DefaultTableModel();
        jtPedidoProd.setModel(modelo2);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono = new ImageIcon(getClass().getResource("/Recursos/iconos/FONDO5.jpg"));
        Image imagen = icono.getImage();
        escritorio2 = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){

                g.drawImage(imagen,0,0,getWidth(),getHeight(),this);

            }
        };
        jlMesa = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPedidos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtPedidoProd = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtNmesa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtFechaHora = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jcEstadoPedido = new javax.swing.JComboBox<>();
        jbCrearPed = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jtID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jbModificar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtProducto = new javax.swing.JTable();
        jbAgregar = new javax.swing.JButton();
        jbQuitar = new javax.swing.JButton();
        jlBuscar = new javax.swing.JLabel();
        jtBProducto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jcEstadoMesa = new javax.swing.JComboBox<>();
        jtTotal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jsCantidad = new javax.swing.JSpinner();
        jbCobrar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jtMesero = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtMesas = new javax.swing.JTable();

        setBorder(null);
        setTitle("Gestion Pedidos");

        jlMesa.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jlMesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        jlMesa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jlMesa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlMesa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMesaMouseClicked(evt);
            }
        });

        jtPedidos.setModel(new javax.swing.table.DefaultTableModel(
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
        jtPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtPedidosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtPedidos);

        jScrollPane2.setForeground(new java.awt.Color(102, 255, 102));

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

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pedidos x Mesa");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Productos x Pedido");

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mesero");

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("N° de Mesa");

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha y hora");

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Estado pedido");

        jcEstadoPedido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PENDIENTE", "ENTREGADO", "CANCELADO" }));

        jbCrearPed.setText("Crear Pedido");
        jbCrearPed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearPedActionPerformed(evt);
            }
        });

        jbBorrar.setText("Borrar Pedido");
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        jtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtIDActionPerformed(evt);
            }
        });
        jtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtIDKeyPressed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(102, 102, 102));
        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID Pedido");

        jbModificar.setText("Modificar Pedido");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

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
        jtProducto.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jScrollPane3.setViewportView(jtProducto);

        jbAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/flechaVerde.png"))); // NOI18N
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jbQuitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/flechaRoja.png"))); // NOI18N
        jbQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbQuitarActionPerformed(evt);
            }
        });

        jlBuscar.setBackground(new java.awt.Color(102, 102, 102));
        jlBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BuscarProductos.png"))); // NOI18N

        jtBProducto.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jtBProducto.setText("Ingrese nombre del producto");
        jtBProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtBProductoMouseClicked(evt);
            }
        });
        jtBProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtBProductoKeyReleased(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(102, 102, 102));
        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Estado de Mesa");

        jcEstadoMesa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LIBRE", "OCUPADO" }));

        jLabel12.setBackground(new java.awt.Color(102, 102, 102));
        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Total");

        jLabel13.setBackground(new java.awt.Color(102, 102, 102));
        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Cantidad");

        jsCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99, 1));

        jbCobrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbCobrar.setForeground(new java.awt.Color(255, 255, 255));
        jbCobrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iconos/icons8-dinero-64.png"))); // NOI18N
        jbCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCobrarActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("MESAS");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel14.setInheritsPopupMenu(false);

        jtMesero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtMeseroKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cobrar");

        jtMesas.setModel(new javax.swing.table.DefaultTableModel(
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
        jtMesas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtMesasMouseClicked(evt);
            }
        });
        jtMesas.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jtMesasPropertyChange(evt);
            }
        });
        jScrollPane4.setViewportView(jtMesas);

        escritorio2.setLayer(jlMesa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jtNmesa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jtFechaHora, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jcEstadoPedido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jbCrearPed, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jbBorrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jtID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jbModificar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jbAgregar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jbQuitar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jlBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jtBProducto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jcEstadoMesa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jtTotal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jsCantidad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jbCobrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jtMesero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorio2Layout = new javax.swing.GroupLayout(escritorio2);
        escritorio2.setLayout(escritorio2Layout);
        escritorio2Layout.setHorizontalGroup(
            escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorio2Layout.createSequentialGroup()
                .addGroup(escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorio2Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel14))
                    .addGroup(escritorio2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(escritorio2Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jlMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorio2Layout.createSequentialGroup()
                        .addGroup(escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorio2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(138, 138, 138))
                            .addGroup(escritorio2Layout.createSequentialGroup()
                                .addGroup(escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(escritorio2Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(escritorio2Layout.createSequentialGroup()
                                        .addGap(119, 119, 119)
                                        .addComponent(jLabel5)))
                                .addGap(21, 21, 21)))
                        .addGroup(escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(escritorio2Layout.createSequentialGroup()
                                .addGroup(escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(escritorio2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(jsCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jbQuitar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(escritorio2Layout.createSequentialGroup()
                                .addGroup(escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(escritorio2Layout.createSequentialGroup()
                                        .addGap(144, 144, 144)
                                        .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(84, 84, 84)
                                        .addComponent(jtNmesa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(escritorio2Layout.createSequentialGroup()
                                        .addGroup(escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jbCrearPed)
                                            .addComponent(jtFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jbBorrar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbModificar))
                                    .addGroup(escritorio2Layout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addComponent(jlBuscar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtBProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(escritorio2Layout.createSequentialGroup()
                                        .addGap(161, 161, 161)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(escritorio2Layout.createSequentialGroup()
                                        .addGroup(escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1))
                                        .addGroup(escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(escritorio2Layout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addComponent(jLabel8)
                                                .addGap(46, 46, 46))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorio2Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jcEstadoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(26, 26, 26)))
                                        .addGroup(escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                            .addComponent(jcEstadoMesa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(escritorio2Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        escritorio2Layout.setVerticalGroup(
            escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorio2Layout.createSequentialGroup()
                .addGroup(escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorio2Layout.createSequentialGroup()
                        .addGroup(escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(escritorio2Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorio2Layout.createSequentialGroup()
                                .addContainerGap(19, Short.MAX_VALUE)
                                .addGroup(escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jcEstadoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcEstadoMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel4))
                                .addGap(8, 8, 8)
                                .addGroup(escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtNmesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addGroup(escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jbBorrar)
                                    .addComponent(jbCrearPed)
                                    .addComponent(jbModificar))
                                .addGap(35, 35, 35)))
                        .addGroup(escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(escritorio2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addGroup(escritorio2Layout.createSequentialGroup()
                                        .addGroup(escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jbCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, escritorio2Layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addComponent(jLabel7)))
                                        .addGap(18, 18, 18)
                                        .addGroup(escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jlBuscar)
                                            .addGroup(escritorio2Layout.createSequentialGroup()
                                                .addComponent(jtBProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(escritorio2Layout.createSequentialGroup()
                                        .addComponent(jsCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbQuitar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbAgregar))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(escritorio2Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(escritorio2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorio2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159)))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio2)
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCobrarActionPerformed

        int fila = jtPedidos.getSelectedRow();
        int idM = (int) jtPedidos.getValueAt(fila, 1);
        int idP = (int) jtPedidos.getValueAt(fila, 0);

        Mesa mesa = md.ObtenerMesasId(idM);
        Pedido pedido = pd.obtenerPedidoId(idP);

        if (pedido.getEstado().equalsIgnoreCase("ENTREGADO")) {

            mesa.setEstadoMesa("LIBRE");
            md.modificarMesa(mesa);

            pedido.setCobrada(true);
            pedido.setImporte(Double.parseDouble(jtTotal.getText()));
            pd.modificarPedido(pedido);

            cargarPedido(idP);

            String texto = jtID.getText();
            Ticket newframe = new Ticket(texto);
            newframe.setVisible(true);

        }else {

            JOptionPane.showMessageDialog(rootPane, "No se puede cobrar, hay un pedido pendiente");

        }
    }//GEN-LAST:event_jbCobrarActionPerformed

    private void jtBProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtBProductoKeyReleased

        modelo3.setRowCount(0);
        String buscar = jtBProducto.getText();
        List<Producto> buscarNombre = pdat.BuscarProductosNombre(buscar);

        for (Producto pro : buscarNombre) {

            modelo3.addRow(new Object[]{pro.getIdProducto(),
                pro.getNombre(), pro.getPrecio(), pro.getStock(), pro.isEstado(), pro.getCategoria()});

        }
    }//GEN-LAST:event_jtBProductoKeyReleased

    private void jtBProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtBProductoMouseClicked

        jtBProducto.setText("");
    }//GEN-LAST:event_jtBProductoMouseClicked

    private void jbQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbQuitarActionPerformed

        PedidoProductoData ppdd = new PedidoProductoData();
        ProductoData pdd = new ProductoData();
        Producto pro = new Producto();
        Pedido pedi = new Pedido();

        int fila = jtPedidoProd.getSelectedRow();
        //        int filaP = jtPedidos.getSelectedRow();

        try {

            int id = (int) jtPedidoProd.getValueAt(fila, 0);
            int idP = Integer.parseInt(jtID.getText());
            int idProducto = (int) jtPedidoProd.getValueAt(fila, 2);
            ppdd.eliminarPedidoProducto(id); //Elimina producto
            cargarPedidoProducto(idP);

            pedi = pd.obtenerPedidoId(idP);
            pedi.setImporte(Double.parseDouble(jtTotal.getText()));
            pd.modificarPedido(pedi);

            pro = pdat.ObtenerPrductoId(idProducto);
            int cantidad = (int) jtPedidoProd.getValueAt(fila, 5);
            int stockTotal = pro.getStock();
            pro.setStock(stockTotal + cantidad);
            pdd.ModificarProducto(pro);

            cargarProducto();
            cargarPedido(pedi.getMesa().getNumero());

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un producto");

        }
    }//GEN-LAST:event_jbQuitarActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed

        Pedido pedi = new Pedido();
        PedidoProducto pepro = new PedidoProducto();
        Producto prod = new Producto();

        try {

            int fila = jtProducto.getSelectedRow();
            int idProducto = (int) jtProducto.getValueAt(fila, 0);
            int idPe = Integer.parseInt(jtID.getText());

            prod = pdat.ObtenerPrductoId(idProducto);

            pedi = pd.obtenerPedidoId(idPe);

            pepro.setProducto(prod);
            pepro.setPedido(pd.obtenerPedidoId(Integer.parseInt(jtID.getText())));
            pepro.setCantidad(Integer.parseInt(jsCantidad.getValue().toString()));
            pepro.setImporte(prod.getPrecio());
            pepro.setEstado(true);

            int stock = prod.getStock() - ((int)jsCantidad.getValue());
            prod.setStock(stock);

            if (stock >= 0) {

                ppd.crearPedProd(pepro);
                pdat.ModificarProducto(prod);
                cargarPedidoProducto(idPe);
                pedi.setImporte(Double.parseDouble(jtTotal.getText()));
                pd.modificarPedido(pedi);
                cargarProducto();
                cargarPedido(pedi.getMesa().getNumero());
                jsCantidad.setValue(1);

            } else {

                JOptionPane.showMessageDialog(rootPane, "No hay stock del producto");

            }
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un producto");

        }
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed

        int id = Integer.parseInt(jtNmesa.getText());
        ped.setIdPedido(Integer.parseInt(jtID.getText()));
        ped.setNombreMesero(jtMesero.getText());
        ped.setEstado(jcEstadoPedido.getSelectedItem() + "");
        pd.modificarEstadoPedido(ped);
        cargarPedido(id);
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed

        int id = Integer.parseInt(jtID.getText());
        pd.eliminarPedido(id);
        cargarPedido(id);
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbCrearPedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearPedActionPerformed

        Mesa mesa = new Mesa();
        ped.setNombreMesero(jtMesero.getText());
        mesa = md.ObtenerMesasId(Integer.parseInt(jtNmesa.getText()));
        mesa.setEstadoMesa("OCUPADO");
        ped.setMesa(mesa);
        ped.setEstado(jcEstadoPedido.getSelectedItem() + "");
        pd.guardarPedido(ped);
        md.modificarMesa(mesa);
        cargarPedido(mesa.getIdMesa());

        jlMesa.setIcon(icoR);
    }//GEN-LAST:event_jbCrearPedActionPerformed

    private void jtPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPedidosMouseClicked

        int fila = jtPedidos.getSelectedRow();
        jtID.setText(jtPedidos.getValueAt(fila, 0) + "");
        jtMesero.setText((String)jtPedidos.getValueAt(fila, 2));
        jcEstadoPedido.setSelectedItem(jtPedidos.getValueAt(fila, 5));
        jtFechaHora.setText(jtPedidos.getValueAt(fila, 3)+"");
        jcEstadoPedido.setSelectedItem(jtPedidos.getValueAt(fila, 6));
        cargarPedidoProducto(Integer.parseInt(jtID.getText()));
    }//GEN-LAST:event_jtPedidosMouseClicked

    private void jlMesaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesaMouseClicked
//
//        iniciarMesas();
//        Mesa mesa = md.ObtenerMesasId(1);
//        jcEstadoMesa.setSelectedItem(mesa.getEstadoMesa());
//        
//        if(mesa.getEstadoMesa().equalsIgnoreCase("OCUPADO")){
//
//            jlMesa.setIcon(icoR);
//
//        }else{
//
//            jlMesa.setIcon(icoV);
//
//        }
//        cargarPedido(1);
//        jtNmesa.setText(1+"");
//
    }//GEN-LAST:event_jlMesaMouseClicked

    private void jtMesasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMesasMouseClicked
        
        iniciarMesas();
        int fila = (int) jtMesas.getSelectedRow();
        int id = (int) jtMesas.getValueAt(fila, 0);
        Mesa mesa = md.ObtenerMesasId(id);
        jtNmesa.setText(mesa.getNumero()+"");
        jlMesa.setText(mesa.getNumero() + "");
        if (mesa.getEstadoMesa().equals("LIBRE")) {
            jlMesa.setIcon(icoV);
        } else {
            jlMesa.setIcon(icoR);
        }
        cargarPedido(mesa.getNumero());
    }//GEN-LAST:event_jtMesasMouseClicked

    private void jtMesasPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jtMesasPropertyChange
        
     
    }//GEN-LAST:event_jtMesasPropertyChange

    private void jtMeseroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtMeseroKeyPressed
        
        soloLetras(evt);
        
    }//GEN-LAST:event_jtMeseroKeyPressed

    private void jtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIDActionPerformed
       
    }//GEN-LAST:event_jtIDActionPerformed

    private void jtIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIDKeyPressed
       
        soloNumeros(evt);
        
    }//GEN-LAST:event_jtIDKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane escritorio2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbCobrar;
    private javax.swing.JButton jbCrearPed;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbQuitar;
    private javax.swing.JComboBox<String> jcEstadoMesa;
    private javax.swing.JComboBox<String> jcEstadoPedido;
    private javax.swing.JLabel jlBuscar;
    private javax.swing.JLabel jlMesa;
    private javax.swing.JSpinner jsCantidad;
    private javax.swing.JTextField jtBProducto;
    private javax.swing.JTextField jtFechaHora;
    private javax.swing.JTextField jtID;
    private javax.swing.JTable jtMesas;
    private javax.swing.JTextField jtMesero;
    private javax.swing.JTextField jtNmesa;
    private javax.swing.JTable jtPedidoProd;
    private javax.swing.JTable jtPedidos;
    private javax.swing.JTable jtProducto;
    private javax.swing.JTextField jtTotal;
    // End of variables declaration//GEN-END:variables

    private void armarCabeceraPed(){
        
        modelo1.addColumn("ID");
        modelo1.addColumn("M");
        modelo1.addColumn("Nombre");
        modelo1.addColumn("Fecha y Hora");
        modelo1.addColumn("Cobrada");
        modelo1.addColumn("Importe");
        modelo1.addColumn("Estado");
        jtPedidos.setModel(modelo1);
        
        TableColumn columnaID = jtPedidos.getColumnModel().getColumn(0);
        TableColumn columnaMesa = jtPedidos.getColumnModel().getColumn(1);
        TableColumn columnaNombre = jtPedidos.getColumnModel().getColumn(2);
        TableColumn columnaFechaHora = jtPedidos.getColumnModel().getColumn(3);
        TableColumn columnaCobrada = jtPedidos.getColumnModel().getColumn(4);
        TableColumn columnaImporte = jtPedidos.getColumnModel().getColumn(5);
        TableColumn columnaEstado = jtPedidos.getColumnModel().getColumn(6);

        columnaID.setPreferredWidth(30);
        columnaMesa.setPreferredWidth(30);
        columnaNombre.setPreferredWidth(95);
        columnaFechaHora.setPreferredWidth(200);
        columnaCobrada.setPreferredWidth(65);
        columnaImporte.setPreferredWidth(45);
        columnaEstado.setPreferredWidth(135);

    }
 
    private void armarCabeceraProdPed() {
        
        modelo2.addColumn("PP");
        modelo2.addColumn("PED");
        modelo2.addColumn("PRO");
        modelo2.addColumn("Nombre");
        modelo2.addColumn(" $ ");
        modelo2.addColumn("Cant");
        jtPedidoProd.setModel(modelo2);

    }

    private void armarCabeceraProd() {

        modelo3.addColumn("ID");
        modelo3.addColumn("Nombre");
        modelo3.addColumn("Precio");
        modelo3.addColumn("Categoria");
        modelo3.addColumn("Stock");
        jtProducto.setModel(modelo3);

    }
    private void armarCabeceraMesa() {

        modelo4.addColumn("ID");
        modelo4.addColumn("N°");
        modelo4.addColumn("Capacidad");
        modelo4.addColumn("Estado");
        jtMesas.setModel(modelo4);
    }

    private void cargarPedido(int id) {

        modelo1.setRowCount(0);
        List<Pedido> pedido = pd.listarPedidosMesa(id);

        for (Pedido pe : pedido) {

            modelo1.addRow(new Object[]{pe.getIdPedido(), pe.getMesa().getNumero(),
                pe.getNombreMesero(), pe.getFechaHora(),pe.isCobrada(),pe.getImporte(), pe.getEstado()});

        }   
    }
    
    private void cargarProducto() {

        modelo3.setRowCount(0);
        List<Producto> producto = pdat.listarProductos();

        for (Producto pro : producto) {

            modelo3.addRow(new Object[]{pro.getIdProducto(),pro.getNombre(), pro.getPrecio(), pro.getCategoria(), pro.getStock()});

        }
    }
    private void cargarMesa() {

        modelo4.setRowCount(0);
        List<Mesa> mesas = md.listarMesas();

        for (Mesa me : mesas) {

            modelo4.addRow(new Object[]{me.getIdMesa(),me.getNumero(),me.getCapacidad(),me.getEstadoMesa()});

        }
    }

    public void cargarPedidoProducto(int id) {

        modelo2.setRowCount(0);
        double total = 0.0;
        List<PedidoProducto> pedidoP = ppd.BuscarProductosxIdPedido(id);

        for (PedidoProducto pp : pedidoP) {

            modelo2.addRow(new Object[]{pp.getIdPedidoProducto(), pp.getPedido().getIdPedido(), pp.getProducto().getIdProducto(), pp.getProducto().getNombre(), pp.getImporte(), pp.getCantidad()});
            total += pp.getImporte();

        }
        
        jtTotal.setText(total + "");
    }
    
    private void iniciarMesas(){

        modelo1.setRowCount(0);
        jbCrearPed.setEnabled(true);   
        jtNmesa.setEditable(false);
        jtID.setEditable(false);

    }
    
     private void soloLetras(KeyEvent evt) {

        char validar = evt.getKeyChar();

        if (Character.isDigit(validar)) {

            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Ingrese solo letras");

        }
    }
     
     private void soloNumeros(KeyEvent evt){
        
        char validar = evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo numeros");
            
        }
    }
}
