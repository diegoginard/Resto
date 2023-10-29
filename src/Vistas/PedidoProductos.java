
package Vistas;

import BaseDatos.*;
import Entidades.*;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.table.*;
import java.util.stream.Collectors;

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
        TransparenciaBotones();
        jbCrearPed.setEnabled(false);
        jlMesa1.setIcon(icoV);
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        ImageIcon icono = new ImageIcon(getClass().getResource("/Recursos/arqueo-de-caja.jpg"));
        Image imagen = icono.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){

                g.drawImage(imagen,0,0,getWidth(),getHeight(),this);

            }
        };
        jlMesa24 = new javax.swing.JLabel();
        jlMesa26 = new javax.swing.JLabel();
        jlMesa25 = new javax.swing.JLabel();
        jlMesa27 = new javax.swing.JLabel();
        jlMesa28 = new javax.swing.JLabel();
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
        jcMesero = new javax.swing.JComboBox<>();
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

        setBorder(null);
        setTitle("Gestion Pedidos");

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

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Pedidos x Mesa");

        jLabel5.setText("Productos x Pedido");

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Mesero");

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Numero de Mesa");

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Fecha y hora");

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
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

        jLabel8.setBackground(new java.awt.Color(102, 102, 102));
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

        jtBProducto.setText("Ingrese nombre del producto");
        jtBProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtBProductoMouseClicked(evt);
            }
        });
        jtBProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtBProductoActionPerformed(evt);
            }
        });
        jtBProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtBProductoKeyReleased(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Estado de Mesa");

        jcEstadoMesa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LIBRE", "OCUPADO" }));

        jLabel12.setBackground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Total");

        jLabel13.setBackground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Cantidad");

        jsCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99, 1));

        jbCobrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbCobrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/ico pedido/dinero_48.png"))); // NOI18N
        jbCobrar.setText("Cobrar Mesa");
        jbCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCobrarActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel14.setText("Mesas");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel14.setInheritsPopupMenu(false);

        jDesktopPane1.setLayer(jlMesa24, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlMesa26, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlMesa25, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlMesa27, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlMesa28, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlMesa5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlMesa7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlMesa6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlMesa8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlMesa1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlMesa3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlMesa2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlMesa4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlMesa9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlMesa11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlMesa10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlMesa12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlMesa14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlMesa13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlMesa15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlMesa16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlMesa18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlMesa17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlMesa19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlMesa20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlMesa22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlMesa21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlMesa23, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtNmesa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtFechaHora, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jcEstadoPedido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbCrearPed, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbBorrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jcMesero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbModificar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbAgregar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbQuitar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtBProducto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jcEstadoMesa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtTotal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jsCantidad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbCobrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addComponent(jlMesa25, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jlMesa26, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jlMesa27, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlMesa28, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addComponent(jlMesa21, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jlMesa22, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jlMesa23, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jlMesa24, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addComponent(jlMesa13, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jlMesa14, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jlMesa15, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jlMesa16, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addComponent(jlMesa17, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jlMesa18, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jlMesa19, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jlMesa20, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jlMesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlMesa6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlMesa7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlMesa8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jlMesa9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlMesa10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlMesa11, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlMesa12, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jlMesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jlMesa2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlMesa3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlMesa4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel14)))))
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGap(136, 136, 136)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(148, 148, 148)))
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(jsCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jbQuitar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jbCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                            .addGap(144, 144, 144)
                                            .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jtNmesa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(38, 130, Short.MAX_VALUE))
                                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                    .addGap(230, 230, 230)
                                                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jcEstadoMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                    .addGap(249, 249, 249)
                                                    .addComponent(jLabel2)))
                                            .addGap(8, 35, Short.MAX_VALUE)))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(74, 74, 74)
                                        .addComponent(jLabel6))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jcMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jcEstadoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addComponent(jLabel8))))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jbCrearPed)
                                            .addComponent(jtFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jbBorrar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbModificar))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addComponent(jlBuscar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtBProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel12)
                        .addGap(29, 29, 29)
                        .addComponent(jtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jcEstadoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcEstadoMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtNmesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jbBorrar)
                                    .addComponent(jbCrearPed)
                                    .addComponent(jbModificar))
                                .addGap(35, 35, 35)))
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addComponent(jLabel13))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jbCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jlBuscar)
                                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                .addComponent(jtBProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jsCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbQuitar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbAgregar))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlMesa2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMesa3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMesa4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlMesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMesa6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMesa7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMesa8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlMesa9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMesa10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMesa11, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMesa12, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlMesa13, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMesa14, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMesa15, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMesa16, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlMesa17, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMesa18, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMesa19, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMesa20, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlMesa21, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMesa22, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMesa23, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMesa24, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlMesa28, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMesa27, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMesa26, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMesa25, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9))
                    .addComponent(jDesktopPane1)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlMesa1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa1MouseClicked

        iniciarMesas();
        cargarPedido(1);
        jtNmesa.setText(1+"");
    
    }//GEN-LAST:event_jlMesa1MouseClicked

    private void jlMesa2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa2MouseClicked

    }//GEN-LAST:event_jlMesa2MouseClicked

    private void jlMesa3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa3MouseClicked

    }//GEN-LAST:event_jlMesa3MouseClicked

    private void jlMesa4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa4MouseClicked

    }//GEN-LAST:event_jlMesa4MouseClicked

    private void jlMesa5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa5MouseClicked

    }//GEN-LAST:event_jlMesa5MouseClicked

    private void jlMesa6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa6MouseClicked

    }//GEN-LAST:event_jlMesa6MouseClicked

    private void jlMesa7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa7MouseClicked

    }//GEN-LAST:event_jlMesa7MouseClicked

    private void jlMesa8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa8MouseClicked

    }//GEN-LAST:event_jlMesa8MouseClicked

    private void jlMesa9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa9MouseClicked

    }//GEN-LAST:event_jlMesa9MouseClicked

    private void jlMesa10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa10MouseClicked

    }//GEN-LAST:event_jlMesa10MouseClicked

    private void jlMesa11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa11MouseClicked

    }//GEN-LAST:event_jlMesa11MouseClicked

    private void jlMesa12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa12MouseClicked

    }//GEN-LAST:event_jlMesa12MouseClicked

    private void jlMesa13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa13MouseClicked

    }//GEN-LAST:event_jlMesa13MouseClicked

    private void jlMesa14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa14MouseClicked

    }//GEN-LAST:event_jlMesa14MouseClicked

    private void jlMesa15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa15MouseClicked

    }//GEN-LAST:event_jlMesa15MouseClicked

    private void jlMesa16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa16MouseClicked

    }//GEN-LAST:event_jlMesa16MouseClicked

    private void jlMesa17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa17MouseClicked

    }//GEN-LAST:event_jlMesa17MouseClicked

    private void jlMesa18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa18MouseClicked

    }//GEN-LAST:event_jlMesa18MouseClicked

    private void jlMesa19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa19MouseClicked

    }//GEN-LAST:event_jlMesa19MouseClicked

    private void jlMesa20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa20MouseClicked

    }//GEN-LAST:event_jlMesa20MouseClicked

    private void jlMesa21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa21MouseClicked

    }//GEN-LAST:event_jlMesa21MouseClicked

    private void jlMesa22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa22MouseClicked

    }//GEN-LAST:event_jlMesa22MouseClicked

    private void jlMesa23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa23MouseClicked

    }//GEN-LAST:event_jlMesa23MouseClicked

    private void jlMesa24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa24MouseClicked

    }//GEN-LAST:event_jlMesa24MouseClicked

    private void jlMesa25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa25MouseClicked

    }//GEN-LAST:event_jlMesa25MouseClicked

    private void jlMesa26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa26MouseClicked

    }//GEN-LAST:event_jlMesa26MouseClicked

    private void jlMesa27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa27MouseClicked

    }//GEN-LAST:event_jlMesa27MouseClicked

    private void jlMesa28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa28MouseClicked

    }//GEN-LAST:event_jlMesa28MouseClicked

    private void jbCrearPedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearPedActionPerformed

        ped.setNombreMesero(jcMesero.getSelectedItem() + "");
        String text = jtFechaHora.getText();
//        LocalDateTime dateTime = LocalDateTime.parse(text, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
//        ped.setFechaHora(dateTime);
        mesa = md.ObtenerMesasId(Integer.parseInt(jtNmesa.getText()));
        ped.setMesa(mesa);
        ped.setEstado(jcEstadoPedido.getSelectedItem() + "");
        pd.guardarPedido(ped);
        cargarPedido(mesa.getIdMesa());
        jlMesa1.setIcon(icoR);
    }//GEN-LAST:event_jbCrearPedActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed

        int id = Integer.parseInt(jtID.getText());
        pd.eliminarPedido(id);
        cargarPedido(id);
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed

        int id = Integer.parseInt(jtNmesa.getText());
        ped.setIdPedido(Integer.parseInt(jtID.getText()));
        ped.setNombreMesero(jcMesero.getSelectedItem() + "");
        ped.setEstado(jcEstadoPedido.getSelectedItem() + "");
        pd.modificarEstadoPedido(ped);
        cargarPedido(id);
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jtPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPedidosMouseClicked

        int fila = jtPedidos.getSelectedRow();
        jtID.setText(jtPedidos.getValueAt(fila, 0) + "");
        jcMesero.setSelectedItem(jtPedidos.getValueAt(fila, 2));
        jcEstadoPedido.setSelectedItem(jtPedidos.getValueAt(fila, 5));
        jtFechaHora.setText(jtPedidos.getValueAt(fila, 3)+"");
        jcEstadoPedido.setSelectedItem(jtPedidos.getValueAt(fila, 6));
        cargarPedidoProducto(Integer.parseInt(jtID.getText()));

    }//GEN-LAST:event_jtPedidosMouseClicked

    private void jtBProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtBProductoKeyReleased
        
        modelo3.setRowCount(0);
        String buscar = jtBProducto.getText();
        List<Producto> buscarNombre = pdat.BuscarProductosNombre(buscar);

        for (Producto pro : buscarNombre) {

            modelo3.addRow(new Object[]{pro.getIdProducto(),
                pro.getNombre(), pro.getPrecio(), pro.getStock(), pro.isEstado(), pro.getCategoria()});

        }
    }//GEN-LAST:event_jtBProductoKeyReleased

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

            int stock = prod.getStock() - pepro.getCantidad();
            prod.setStock(stock);

            if (stock > 0) {

                ppd.crearPedProd(pepro);
                pdat.ModificarProducto(prod);
                cargarPedidoProducto(idPe);
                pedi.setImporte(Double.parseDouble(jtTotal.getText()));
                pd.modificarPedido(pedi);
                cargarProducto();
                cargarPedido(pedi.getMesa().getNumero());

            } else {

                JOptionPane.showMessageDialog(rootPane, "No hay stock del producto");

            }
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un producto");

        }
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jtBProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtBProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtBProductoActionPerformed

    private void jbQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbQuitarActionPerformed

        PedidoProductoData ppdd = new PedidoProductoData();
        ProductoData pdd = new ProductoData();
        Producto pro = new Producto();
        Pedido pedi = new Pedido();

        int fila = jtPedidoProd.getSelectedRow();
        int filaP = jtPedidos.getSelectedRow();

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

    private void jbCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCobrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbCobrarActionPerformed

    private void jtBProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtBProductoMouseClicked
       
        jtBProducto.setText("");
        
    }//GEN-LAST:event_jtBProductoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbCobrar;
    private javax.swing.JButton jbCrearPed;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbQuitar;
    private javax.swing.JComboBox<String> jcEstadoMesa;
    private javax.swing.JComboBox<String> jcEstadoPedido;
    private javax.swing.JComboBox<String> jcMesero;
    private javax.swing.JLabel jlBuscar;
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
    private javax.swing.JSpinner jsCantidad;
    private javax.swing.JTextField jtBProducto;
    private javax.swing.JTextField jtFechaHora;
    private javax.swing.JTextField jtID;
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

    private void cargarPedidoProducto(int id) {

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
        LocalDateTime now = LocalDateTime.now();
//        String formattedDateTime = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
//        jtFechaHora.setText(formattedDateTime);
        jtNmesa.setEditable(false);
        jtID.setEditable(false);

    }
}
