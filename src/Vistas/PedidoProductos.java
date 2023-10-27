
package Vistas;

import BaseDatos.*;
import Entidades.*;
import java.time.LocalDateTime;
import static java.time.LocalDateTime.now;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.*;
import javax.swing.table.*;

public class PedidoProductos extends javax.swing.JInternalFrame {

    Icon icoR = new ImageIcon(getClass().getResource("/Recursos/mesa-rojo.png"));
    Icon icoV = new ImageIcon(getClass().getResource("/Recursos/mesa-verde.png"));
    Icon icoG = new ImageIcon(getClass().getResource("/Recursos/mesa-gris.png"));
    Pedido ped = new Pedido();
    PedidoData pd = new PedidoData();
    ProductoData pdat = new ProductoData();
    Mesa mesa = new Mesa();
    MesaData md = new MesaData();
    PedidoProducto pp = new PedidoProducto();
    PedidoProductoData ppd = new PedidoProductoData();
    Producto pro = new Producto();

    private boolean mesaOcupada = false;
  
    public PedidoProductos() {

        initComponents();
        armarCabeceraPed();
        armarCabeceraProdPed();
        armarCabeceraProd();
        cargarProducto();
  
    }
 
    private DefaultTableModel modelo = new DefaultTableModel(){

        @Override
        public boolean  isCellEditable(int rowIndex, int columnIndex ){
            
            return false;
        }

    };
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlMesa5 = new javax.swing.JLabel();
        jlMesa7 = new javax.swing.JLabel();
        jlMesa6 = new javax.swing.JLabel();
        jlMesa8 = new javax.swing.JLabel();
        jlMesa1 = new javax.swing.JLabel();
        jlMesa3 = new javax.swing.JLabel();
        jlMesa2 = new javax.swing.JLabel();
        jlMesa4 = new javax.swing.JLabel();
        jlMesa9 = new javax.swing.JLabel();
        jlMesa11 = new javax.swing.JLabel();
        jlMesa10 = new javax.swing.JLabel();
        jlMesa12 = new javax.swing.JLabel();
        jlMesa14 = new javax.swing.JLabel();
        jlMesa13 = new javax.swing.JLabel();
        jlMesa15 = new javax.swing.JLabel();
        jlMesa16 = new javax.swing.JLabel();
        jlMesa18 = new javax.swing.JLabel();
        jlMesa17 = new javax.swing.JLabel();
        jlMesa19 = new javax.swing.JLabel();
        jlMesa20 = new javax.swing.JLabel();
        jlMesa22 = new javax.swing.JLabel();
        jlMesa21 = new javax.swing.JLabel();
        jlMesa23 = new javax.swing.JLabel();
        jlMesa24 = new javax.swing.JLabel();
        jlMesa26 = new javax.swing.JLabel();
        jlMesa25 = new javax.swing.JLabel();
        jlMesa27 = new javax.swing.JLabel();
        jlMesa28 = new javax.swing.JLabel();
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
        jLabel7 = new javax.swing.JLabel();
        jrCobrada = new javax.swing.JRadioButton();
        jbCrearPed = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jtID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jcMesero = new javax.swing.JComboBox<>();
        jbModificar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtProducto = new javax.swing.JTable();
        jbAgregar = new javax.swing.JButton();
        jbQuitar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jtBProducto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jcEstadoMesa = new javax.swing.JComboBox<>();
        jtSubtotal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtCantidad = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setBorder(null);
        setTitle("Gestion Pedidos");
        setPreferredSize(new java.awt.Dimension(1100, 660));

        jlMesa5.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jlMesa5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        jlMesa5.setText("5");
        jlMesa5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlMesa5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMesa5MouseClicked(evt);
            }
        });

        jlMesa7.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jlMesa7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        jlMesa7.setText("7");
        jlMesa7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlMesa7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMesa7MouseClicked(evt);
            }
        });

        jlMesa6.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jlMesa6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        jlMesa6.setText("6");
        jlMesa6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlMesa6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMesa6MouseClicked(evt);
            }
        });

        jlMesa8.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jlMesa8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        jlMesa8.setText("8");
        jlMesa8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlMesa8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMesa8MouseClicked(evt);
            }
        });

        jlMesa1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jlMesa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        jlMesa1.setText("1");
        jlMesa1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jlMesa1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlMesa1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMesa1MouseClicked(evt);
            }
        });

        jlMesa3.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jlMesa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        jlMesa3.setText("3");
        jlMesa3.setToolTipText("3");
        jlMesa3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlMesa3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMesa3MouseClicked(evt);
            }
        });

        jlMesa2.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jlMesa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        jlMesa2.setText("2");
        jlMesa2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlMesa2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMesa2MouseClicked(evt);
            }
        });

        jlMesa4.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jlMesa4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        jlMesa4.setText("4");
        jlMesa4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlMesa4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMesa4MouseClicked(evt);
            }
        });

        jlMesa9.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jlMesa9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        jlMesa9.setText("9");
        jlMesa9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlMesa9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMesa9MouseClicked(evt);
            }
        });

        jlMesa11.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jlMesa11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        jlMesa11.setText("11");
        jlMesa11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlMesa11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMesa11MouseClicked(evt);
            }
        });

        jlMesa10.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jlMesa10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        jlMesa10.setText("10");
        jlMesa10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlMesa10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMesa10MouseClicked(evt);
            }
        });

        jlMesa12.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jlMesa12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        jlMesa12.setText("12");
        jlMesa12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlMesa12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMesa12MouseClicked(evt);
            }
        });

        jlMesa14.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jlMesa14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        jlMesa14.setText("14");
        jlMesa14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlMesa14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMesa14MouseClicked(evt);
            }
        });

        jlMesa13.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jlMesa13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        jlMesa13.setText("13");
        jlMesa13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlMesa13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMesa13MouseClicked(evt);
            }
        });

        jlMesa15.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jlMesa15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        jlMesa15.setText("15");
        jlMesa15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlMesa15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMesa15MouseClicked(evt);
            }
        });

        jlMesa16.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jlMesa16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        jlMesa16.setText("16");
        jlMesa16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlMesa16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMesa16MouseClicked(evt);
            }
        });

        jlMesa18.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jlMesa18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        jlMesa18.setText("18");
        jlMesa18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlMesa18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMesa18MouseClicked(evt);
            }
        });

        jlMesa17.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jlMesa17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        jlMesa17.setText("17");
        jlMesa17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlMesa17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMesa17MouseClicked(evt);
            }
        });

        jlMesa19.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jlMesa19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        jlMesa19.setText("19");
        jlMesa19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlMesa19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMesa19MouseClicked(evt);
            }
        });

        jlMesa20.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jlMesa20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        jlMesa20.setText("20");
        jlMesa20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlMesa20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMesa20MouseClicked(evt);
            }
        });

        jlMesa22.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jlMesa22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        jlMesa22.setText("22");
        jlMesa22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlMesa22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMesa22MouseClicked(evt);
            }
        });

        jlMesa21.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jlMesa21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        jlMesa21.setText("21");
        jlMesa21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlMesa21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMesa21MouseClicked(evt);
            }
        });

        jlMesa23.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jlMesa23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        jlMesa23.setText("23");
        jlMesa23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlMesa23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMesa23MouseClicked(evt);
            }
        });

        jlMesa24.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jlMesa24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        jlMesa24.setText("24");
        jlMesa24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlMesa24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMesa24MouseClicked(evt);
            }
        });

        jlMesa26.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jlMesa26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        jlMesa26.setText("26");
        jlMesa26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlMesa26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMesa26MouseClicked(evt);
            }
        });

        jlMesa25.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jlMesa25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        jlMesa25.setText("25");
        jlMesa25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlMesa25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMesa25MouseClicked(evt);
            }
        });

        jlMesa27.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jlMesa27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        jlMesa27.setText("27");
        jlMesa27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlMesa27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMesa27MouseClicked(evt);
            }
        });

        jlMesa28.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jlMesa28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        jlMesa28.setText("28");
        jlMesa28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlMesa28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMesa28MouseClicked(evt);
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

        jLabel3.setText("Pedidos x Mesa");

        jLabel5.setText("Productos x Pedido");

        jLabel1.setText("Mesero");

        jLabel2.setText("Numero de Mesa");

        jLabel4.setText("Fecha y hora");

        jLabel6.setText("Estado pedido");

        jcEstadoPedido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PENDIENTE", "ENTREGADO", "CANCELADO" }));
        jcEstadoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcEstadoPedidoActionPerformed(evt);
            }
        });

        jLabel7.setText("Cobrada");

        jrCobrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrCobradaActionPerformed(evt);
            }
        });

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

        jLabel8.setText("ID Pedido");

        jcMesero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CARLOS", "MARTIN", "FABIAN", "MARIA" }));

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
        jScrollPane3.setViewportView(jtProducto);

        jbAgregar.setText("agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jbQuitar.setText("Quitar");

        jLabel10.setText("Buscar Producto");

        jtBProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtBProductoKeyReleased(evt);
            }
        });

        jLabel11.setText("Estado de Mesa");

        jcEstadoMesa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LIBRE", "OCUPADO" }));

        jLabel12.setText("SubTotal");

        jLabel13.setText("Cantidad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlMesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlMesa6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlMesa7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlMesa8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jlMesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlMesa2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlMesa3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlMesa4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlMesa9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlMesa10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlMesa11, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlMesa12, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlMesa25, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlMesa26, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlMesa27, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlMesa28, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlMesa21, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlMesa22, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlMesa23, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlMesa24, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlMesa13, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlMesa14, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlMesa15, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlMesa16, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlMesa17, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlMesa18, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlMesa19, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlMesa20, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(74, 74, 74)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jcMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jrCobrada)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8)
                                            .addComponent(jcEstadoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcEstadoMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jtNmesa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jtFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbCrearPed)
                                .addGap(30, 30, 30)
                                .addComponent(jbBorrar)
                                .addGap(18, 18, 18)
                                .addComponent(jbModificar))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(34, 34, 34))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbQuitar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(27, 27, 27)
                                .addComponent(jtBProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jrCobrada, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel1)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel11))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jcEstadoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jcMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jcEstadoMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel2)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel8)))
                                                .addGap(8, 8, 8)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jtNmesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(10, 10, 10)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)
                                        .addGap(12, 12, 12)
                                        .addComponent(jtFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jbCrearPed)
                                            .addComponent(jbBorrar)
                                            .addComponent(jbModificar))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jtBProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(jbAgregar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbQuitar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))))
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlMesa2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlMesa3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlMesa4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jlMesa1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlMesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMesa6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMesa7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMesa8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlMesa9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMesa10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMesa11, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMesa12, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlMesa13, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMesa14, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMesa15, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMesa16, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlMesa17, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMesa18, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMesa19, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMesa20, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlMesa21, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMesa22, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMesa23, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMesa24, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlMesa28, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMesa27, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMesa26, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMesa25, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlMesa1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa1MouseClicked
        
        
        modelo.setRowCount(0);
        cargarPedido(1);
        jtNmesa.setText(1+"");
        LocalDateTime now = LocalDateTime.now();
        String formattedDateTime = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        jtFechaHora.setText(formattedDateTime);
        jtNmesa.setEditable(false);
        
    }//GEN-LAST:event_jlMesa1MouseClicked

    private void jlMesa2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa2MouseClicked
      mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){

            jlMesa2.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa2= new Mesa();

        } else{

            jlMesa2.setIcon(icoV); // Cambia el color al libre

        }    }//GEN-LAST:event_jlMesa2MouseClicked

    private void jlMesa3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa3MouseClicked

              mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){

            jlMesa3.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa3= new Mesa();

        } else{

            jlMesa3.setIcon(icoV); // Cambia el color al libre

        }


    }//GEN-LAST:event_jlMesa3MouseClicked

    private void jlMesa4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa4MouseClicked

              mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){

            jlMesa4.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa4= new Mesa();

        } else{

            jlMesa4.setIcon(icoV); // Cambia el color al libre

        }


    }//GEN-LAST:event_jlMesa4MouseClicked

    private void jlMesa5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa5MouseClicked

              mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){

            jlMesa5.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa5= new Mesa();

        } else{

            jlMesa5.setIcon(icoV); // Cambia el color al libre

        }
    }//GEN-LAST:event_jlMesa5MouseClicked

    private void jlMesa6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa6MouseClicked

              mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){

            jlMesa6.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa6= new Mesa();

        } else{

            jlMesa6.setIcon(icoV); // Cambia el color al libre

        }

    }//GEN-LAST:event_jlMesa6MouseClicked

    private void jlMesa7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa7MouseClicked

              mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){

            jlMesa7.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa7= new Mesa();

        } else{

            jlMesa7.setIcon(icoV); // Cambia el color al libre

        }
    }//GEN-LAST:event_jlMesa7MouseClicked

    private void jlMesa8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa8MouseClicked

              mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){

            jlMesa8.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa8= new Mesa();

        } else{

            jlMesa8.setIcon(icoV); // Cambia el color al libre

        }
    }//GEN-LAST:event_jlMesa8MouseClicked

    private void jlMesa9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa9MouseClicked

              mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){

            jlMesa9.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa9= new Mesa();

        } else{

            jlMesa9.setIcon(icoV); // Cambia el color al libre

        }
    }//GEN-LAST:event_jlMesa9MouseClicked

    private void jlMesa10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa10MouseClicked

              mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){

            jlMesa10.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa10= new Mesa();

        } else{

            jlMesa10.setIcon(icoV); // Cambia el color al libre

        }
    }//GEN-LAST:event_jlMesa10MouseClicked

    private void jlMesa11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa11MouseClicked

              mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){

            jlMesa11.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa11= new Mesa();

        } else{

            jlMesa11.setIcon(icoV); // Cambia el color al libre

        }
    }//GEN-LAST:event_jlMesa11MouseClicked

    private void jlMesa12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa12MouseClicked

              mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){

            jlMesa12.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa12= new Mesa();

        } else{

            jlMesa12.setIcon(icoV); // Cambia el color al libre

        }
    }//GEN-LAST:event_jlMesa12MouseClicked

    private void jlMesa13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa13MouseClicked

              mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){

            jlMesa13.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa13= new Mesa();

        } else{

            jlMesa13.setIcon(icoV); // Cambia el color al libre

        }
    }//GEN-LAST:event_jlMesa13MouseClicked

    private void jlMesa14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa14MouseClicked

              mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){

            jlMesa14.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa14= new Mesa();

        } else{

            jlMesa14.setIcon(icoV); // Cambia el color al libre

        }
    }//GEN-LAST:event_jlMesa14MouseClicked

    private void jlMesa15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa15MouseClicked

              mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){

            jlMesa15.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa15= new Mesa();

        } else{

            jlMesa15.setIcon(icoV); // Cambia el color al libre

        }
    }//GEN-LAST:event_jlMesa15MouseClicked

    private void jlMesa16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa16MouseClicked

              mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){

            jlMesa16.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa16= new Mesa();

        } else{

            jlMesa16.setIcon(icoV); // Cambia el color al libre

        }
    }//GEN-LAST:event_jlMesa16MouseClicked

    private void jlMesa17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa17MouseClicked

              mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){

            jlMesa17.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa17= new Mesa();

        } else{

            jlMesa17.setIcon(icoV); // Cambia el color al libre

        }
    }//GEN-LAST:event_jlMesa17MouseClicked

    private void jlMesa18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa18MouseClicked

              mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){

            jlMesa18.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa18= new Mesa();

        } else{

            jlMesa18.setIcon(icoV); // Cambia el color al libre

        }
    }//GEN-LAST:event_jlMesa18MouseClicked

    private void jlMesa19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa19MouseClicked

              mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){

            jlMesa19.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesaa19= new Mesa();

        } else{

            jlMesa19.setIcon(icoV); // Cambia el color al libre

        }
    }//GEN-LAST:event_jlMesa19MouseClicked

    private void jlMesa20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa20MouseClicked

              mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){

            jlMesa20.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa20= new Mesa();

        } else{

            jlMesa20.setIcon(icoV); // Cambia el color al libre

        }
    }//GEN-LAST:event_jlMesa20MouseClicked

    private void jlMesa21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa21MouseClicked

              mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){

            jlMesa21.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa21= new Mesa();

        } else{

            jlMesa21.setIcon(icoV); // Cambia el color al libre

        }
    }//GEN-LAST:event_jlMesa21MouseClicked

    private void jlMesa22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa22MouseClicked

              mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){

            jlMesa22.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa22= new Mesa();

        } else{

            jlMesa22.setIcon(icoV); // Cambia el color al libre

        }
    }//GEN-LAST:event_jlMesa22MouseClicked

    private void jlMesa23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa23MouseClicked

              mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){

            jlMesa23.setIcon(icoR); // Cambia el color al ocupado
            //Mesa mesa23= new Mesa();

        } else{

            jlMesa23.setIcon(icoV); // Cambia el color al libre

        }
    }//GEN-LAST:event_jlMesa23MouseClicked

    private void jlMesa24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa24MouseClicked

              mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){

            jlMesa24.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa24= new Mesa();

        } else{

            jlMesa24.setIcon(icoV); // Cambia el color al libre

        }
    }//GEN-LAST:event_jlMesa24MouseClicked

    private void jlMesa25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa25MouseClicked

              mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){

            jlMesa25.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa25= new Mesa();

        } else{

            jlMesa25.setIcon(icoV); // Cambia el color al libre

        }
    }//GEN-LAST:event_jlMesa25MouseClicked

    private void jlMesa26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa26MouseClicked

              mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){

            jlMesa26.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa26= new Mesa();

        } else{

            jlMesa26.setIcon(icoV); // Cambia el color al libre

        }
    }//GEN-LAST:event_jlMesa26MouseClicked

    private void jlMesa27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa27MouseClicked

              mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){

            jlMesa27.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa27= new Mesa();

        } else{

            jlMesa27.setIcon(icoV); // Cambia el color al libre

        }
    }//GEN-LAST:event_jlMesa27MouseClicked

    private void jlMesa28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa28MouseClicked

              mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){

            jlMesa28.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa28= new Mesa();

        } else{

            jlMesa28.setIcon(icoV); // Cambia el color al libre

        }
    }//GEN-LAST:event_jlMesa28MouseClicked

    private void jrCobradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrCobradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrCobradaActionPerformed

    private void jbCrearPedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearPedActionPerformed

  
        ped.setNombreMesero(jcMesero.getSelectedItem()+"");
        String text = jtFechaHora.getText();
        LocalDateTime dateTime = LocalDateTime.parse(text, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        ped.setFechaHora(dateTime);
        mesa = md.ObtenerMesasId(Integer.parseInt(jtNmesa.getText()));
        ped.setMesa(mesa);
        ped.setEstado(jcEstadoPedido.getSelectedItem()+"");
        pd.guardarPedido(ped);
        cargarPedido(mesa.getIdMesa());
       
    }//GEN-LAST:event_jbCrearPedActionPerformed

    private void jtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIDActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
       
        int id = Integer.parseInt(jtID.getText());
       pd.eliminarPedido(id);
       cargarPedido(id);
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        
        int id =Integer.parseInt(jtNmesa.getText());
        ped.setIdPedido(Integer.parseInt(jtID.getText()));
        ped.setNombreMesero(jcMesero.getSelectedItem()+"");
        ped.setCobrada(jrCobrada.isSelected());
        ped.setEstado(jcEstadoPedido.getSelectedItem()+"");
        pd.modificarEstadoPedido(ped);
        cargarPedido(id);
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jtPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPedidosMouseClicked
      
      int fila = jtPedidos.getSelectedRow();
      jtID.setText(jtPedidos.getValueAt(fila, 0)+"");
      jcMesero.setSelectedItem(jtPedidos.getValueAt(fila,2 ));
      jrCobrada.setSelected((boolean)jtPedidos.getValueAt(fila,4));
      jcEstadoPedido.setSelectedItem(jtPedidos.getValueAt(fila, 5));
    }//GEN-LAST:event_jtPedidosMouseClicked

    private void jcEstadoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcEstadoPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcEstadoPedidoActionPerformed

    private void jtBProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtBProductoKeyReleased

        modelo2.setRowCount(0);
        String buscar = jtBProducto.getText();
        List<Producto> buscarNombre = pdat.BuscarProductosNombre(buscar);

        for (Producto pro : buscarNombre) {

            modelo2.addRow(new Object[]{pro.getIdProducto(),
                pro.getNombre(), pro.getPrecio(), pro.getStock(), pro.isEstado(), pro.getCategoria()});
            
        }
    }//GEN-LAST:event_jtBProductoKeyReleased

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        
        int fila = jtProducto.getSelectedRow();
        int idProducto = (int)jtProducto.getValueAt(fila, 0);
        pro = pdat.ObtenerPrductoId(idProducto);
        pp.setProducto(pro);
        int idPe =Integer.parseInt(jtID.getText());
        pp.setPedido(pd.obtenerPedidoId(idPe));
        pp.setCantidad(Integer.parseInt(jtCantidad.getText()));
        pp.setImporte(pro.getPrecio());
        pp.setEstado(true);
        ppd.crearPedProd(pp);
        
    }//GEN-LAST:event_jbAgregarActionPerformed
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbCrearPed;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbQuitar;
    private javax.swing.JComboBox<String> jcEstadoMesa;
    private javax.swing.JComboBox<String> jcEstadoPedido;
    private javax.swing.JComboBox<String> jcMesero;
    private javax.swing.JLabel jlMesa1;
    private javax.swing.JLabel jlMesa10;
    private javax.swing.JLabel jlMesa11;
    private javax.swing.JLabel jlMesa12;
    private javax.swing.JLabel jlMesa13;
    private javax.swing.JLabel jlMesa14;
    private javax.swing.JLabel jlMesa15;
    private javax.swing.JLabel jlMesa16;
    private javax.swing.JLabel jlMesa17;
    private javax.swing.JLabel jlMesa18;
    private javax.swing.JLabel jlMesa19;
    private javax.swing.JLabel jlMesa2;
    private javax.swing.JLabel jlMesa20;
    private javax.swing.JLabel jlMesa21;
    private javax.swing.JLabel jlMesa22;
    private javax.swing.JLabel jlMesa23;
    private javax.swing.JLabel jlMesa24;
    private javax.swing.JLabel jlMesa25;
    private javax.swing.JLabel jlMesa26;
    private javax.swing.JLabel jlMesa27;
    private javax.swing.JLabel jlMesa28;
    private javax.swing.JLabel jlMesa3;
    private javax.swing.JLabel jlMesa4;
    private javax.swing.JLabel jlMesa5;
    private javax.swing.JLabel jlMesa6;
    private javax.swing.JLabel jlMesa7;
    private javax.swing.JLabel jlMesa8;
    private javax.swing.JLabel jlMesa9;
    private javax.swing.JRadioButton jrCobrada;
    private javax.swing.JTextField jtBProducto;
    private javax.swing.JTextField jtCantidad;
    private javax.swing.JTextField jtFechaHora;
    private javax.swing.JTextField jtID;
    private javax.swing.JTextField jtNmesa;
    private javax.swing.JTable jtPedidoProd;
    private javax.swing.JTable jtPedidos;
    private javax.swing.JTable jtProducto;
    private javax.swing.JTextField jtSubtotal;
    // End of variables declaration//GEN-END:variables

    private void armarCabeceraPed(){
        
        modelo.addColumn("ID");
        modelo.addColumn("M");
        modelo.addColumn("Nombre");
        modelo.addColumn("Fecha y Hora");
        modelo.addColumn("Cobrada");
        modelo.addColumn("Importe");
        modelo.addColumn("Estado");
        jtPedidos.setModel(modelo);
        
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

        modelo1.addColumn("Nombre");
        modelo1.addColumn("Precio");
        modelo1.addColumn("Categoria");
        jtPedidoProd.setModel(modelo1);

    }

    private void armarCabeceraProd() {

        modelo2.addColumn("ID");
        modelo2.addColumn("Nombre");
        modelo2.addColumn("Precio");
        modelo2.addColumn("Categoria");
        modelo2.addColumn("Stock");
        jtProducto.setModel(modelo2);

    }

    private void cargarPedido(int id) {

        modelo.setRowCount(0);
        List<Pedido> pedido = pd.listarPedidosMesa(id);

        for (Pedido pe : pedido) {

            modelo.addRow(new Object[]{pe.getIdPedido(), pe.getMesa().getNumero(),
                pe.getNombreMesero(), pe.getFechaHora(),pe.isCobrada(),pe.getImporte(), pe.getEstado()});

        }   
    }
    
    private void cargarProducto() {

        modelo2.setRowCount(0);
        List<Producto> producto = pdat.listarProductos();

        for (Producto pro : producto) {

            modelo2.addRow(new Object[]{pro.getIdProducto(),pro.getNombre(), pro.getPrecio(), pro.getCategoria(), pro.getStock()});

        }   
    }
}