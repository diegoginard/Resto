package Vistas;

import BaseDatos.MesaData;
import BaseDatos.MozoData;
import BaseDatos.PedidoData;
import BaseDatos.PedidoProductoData;
import BaseDatos.ProductoData;
import Entidades.Mesa;
import Entidades.Mozo;
import Entidades.Pedido;
import Entidades.PedidoProducto;
import Entidades.Producto;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.util.List;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
import javax.swing.table.*;


public class restoView extends javax.swing.JInternalFrame {

    private PedidoProductoData ppDat = new PedidoProductoData();
    private ProductoData proDat = new ProductoData();
    private PedidoData pedidoDat = new PedidoData();
    private MesaData md = new MesaData();
    private MozoData mozoDat = new MozoData();
    private boolean estadoMesas = false;
    public restoView() {

        initComponents();
        cargarMesas();
        armarCabeceraProd();
        armarCabeceraProdPed();
        armarCabeceraPed(jtPedidos, modelo1);
        armarCabeceraPed(jTcobrarPedidos, modelo5);
        armarCabeceraEstadoMesas();
        armarCabeceraProdAcobrar();
        cargarProducto();
        cargarSpinerMozos(jCmozo);
        jbCobrar.setEnabled(false);
        jIFproductosDelPedido.setVisible(false);
        jbEntregar.setEnabled(false);
        jbCancelar.setEnabled(false);

        // Desactiva la barra de título del JInternalFrame
        BasicInternalFrameUI ui = (BasicInternalFrameUI) getUI();
        ui.setNorthPane(null);

        // Configura la altura de la zona de pestañas a 0 para ocultarlas
        ventanas.setUI(new BasicTabbedPaneUI() {
            
            @Override
            protected int calculateTabAreaHeight(int tabPlacement, int horizRunCount, int maxTabHeight) {
                return 0;
            }
        });

        ventanas.setEnabled(false);
        jtID.setEnabled(false);
    }

    private DefaultTableModel modelo1 = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {

            return false;
        }
    };

    private DefaultTableModel modelo2 = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {

            return false;
        }
    };

    private DefaultTableModel modelo3 = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {

            return false;
        }
    };

    private DefaultTableModel modelo4 = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {

            return false;
        }
    };

    private DefaultTableModel modelo5 = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {

            return false;
        }
    };

    private DefaultTableModel modelo6 = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {

            return false;
        }
    };

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventanas = new javax.swing.JTabbedPane();
        jpInicio = new javax.swing.JPanel();
        ImageIcon icono = new ImageIcon(getClass().getResource("/Recursos/Salon.jpg"));
        Image imagen = icono.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){

                g.drawImage(imagen,0,0,getWidth(),getHeight(),this);

            }

        };
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbTomarPedido = new javax.swing.JButton();
        jBgestionarPedido = new javax.swing.JButton();
        jbCobrarMesa = new javax.swing.JButton();
        jbEstadoMesas = new javax.swing.JButton();
        jBagregarPedido = new javax.swing.JButton();
        jpMesaMesero = new javax.swing.JPanel();
        ImageIcon icono2 = new ImageIcon(getClass().getResource("/Recursos/CrearPedido.jpg"));
        Image imagen2 = icono2.getImage();
        crearpedido = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){

                g.drawImage(imagen2,0,0,getWidth(),getHeight(),this);

            }

        };
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jcMesas = new javax.swing.JComboBox<>();
        jbACrearPedido = new javax.swing.JButton();
        jCmozo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbInicio3 = new javax.swing.JButton();
        jpProducto = new javax.swing.JPanel();
        ImageIcon icono3 = new ImageIcon(getClass().getResource("/Recursos/AgregarProducto.jpg"));
        Image imagen3 = icono3.getImage();
        agregarproductos = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){

                g.drawImage(imagen3,0,0,getWidth(),getHeight(),this);

            }
        }
        ;
        jLabel8 = new javax.swing.JLabel();
        jtID = new javax.swing.JTextField();
        jlMesa = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtPedidoProd = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProducto = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jtBProducto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtTotal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jbVolverMenu = new javax.swing.JButton();
        jBgestPedidos = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLmozo = new javax.swing.JLabel();
        jLnombMozo = new javax.swing.JLabel();
        jPcobrar = new javax.swing.JPanel();
        ImageIcon icono4 = new ImageIcon(getClass().getResource("/Recursos/AgregarPedido.jpg"));
        Image imagen4 = icono4.getImage();
        elegirpedido = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){

                g.drawImage(imagen4,0,0,getWidth(),getHeight(),this);

            }
        };
        jIFproductosDelPedido = new javax.swing.JInternalFrame();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTproductosDelPedido = new javax.swing.JTable();
        jbCobrar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jcMesasPedido = new javax.swing.JComboBox<>();
        jbInicio = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTcobrarPedidos = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jpMesas = new javax.swing.JPanel();
        ImageIcon icono5 = new ImageIcon(getClass().getResource("/Recursos/EstadoMesas.jpg"));
        Image imagen5 = icono5.getImage();
        jDesktopPane2 = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){

                g.drawImage(imagen5,0,0,getWidth(),getHeight(),this);

            }

        };
        jLestadoMesas = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtEstadoMesas = new javax.swing.JTable();
        jbInicio1 = new javax.swing.JButton();
        jPpedidos = new javax.swing.JPanel();
        ImageIcon icono6 = new ImageIcon(getClass().getResource("/Recursos/EstadoMesas.jpg"));
        Image imagen6 = icono6.getImage();
        jDesktopPane3 = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){

                g.drawImage(imagen6,0,0,getWidth(),getHeight(),this);

            }

        };
        jbEntregar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtPedidos = new javax.swing.JTable();
        jbInicio2 = new javax.swing.JButton();

        setBorder(null);
        setClosable(true);
        setRequestFocusEnabled(false);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpInicio.setPreferredSize(new java.awt.Dimension(0, 0));
        jpInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setMinimumSize(new java.awt.Dimension(710, 620));
        jDesktopPane1.setVerifyInputWhenFocusTarget(false);
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 153, 0));
        jLabel1.setText("BIENVENIDOS");
        jDesktopPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 34, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Logo.png"))); // NOI18N
        jDesktopPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 100, 100, 216));

        jbTomarPedido.setBackground(new java.awt.Color(40, 40, 40));
        jbTomarPedido.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jbTomarPedido.setForeground(new java.awt.Color(255, 255, 255));
        jbTomarPedido.setText("HABILITAR MESA");
        jbTomarPedido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbTomarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTomarPedidoActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jbTomarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 334, 277, -1));

        jBgestionarPedido.setBackground(new java.awt.Color(40, 40, 40));
        jBgestionarPedido.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jBgestionarPedido.setForeground(new java.awt.Color(255, 255, 255));
        jBgestionarPedido.setText("GESTIONAR PEDIDOS");
        jBgestionarPedido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBgestionarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBgestionarPedidoActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jBgestionarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 385, 277, -1));

        jbCobrarMesa.setBackground(new java.awt.Color(40, 40, 40));
        jbCobrarMesa.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jbCobrarMesa.setForeground(new java.awt.Color(255, 255, 255));
        jbCobrarMesa.setText("COBRAR MESA");
        jbCobrarMesa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbCobrarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCobrarMesaActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jbCobrarMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 277, -1));

        jbEstadoMesas.setBackground(new java.awt.Color(40, 40, 40));
        jbEstadoMesas.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jbEstadoMesas.setForeground(new java.awt.Color(255, 255, 255));
        jbEstadoMesas.setText("ESTADO DE MESAS");
        jbEstadoMesas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbEstadoMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEstadoMesasActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jbEstadoMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 277, -1));

        jBagregarPedido.setBackground(new java.awt.Color(40, 40, 40));
        jBagregarPedido.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jBagregarPedido.setForeground(new java.awt.Color(255, 255, 255));
        jBagregarPedido.setText("AGREGAR PEDIDO");
        jBagregarPedido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBagregarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBagregarPedidoActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jBagregarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 277, -1));

        jpInicio.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));

        ventanas.addTab("", jpInicio);

        jpMesaMesero.setBackground(new java.awt.Color(153, 153, 153));
        jpMesaMesero.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        crearpedido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setBackground(new java.awt.Color(102, 102, 102));
        jLabel12.setFont(new java.awt.Font("Slender", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("SELECCIONAR");
        crearpedido.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 270, -1));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jcMesas.setBorder(null);

        jbACrearPedido.setBackground(new java.awt.Color(102, 102, 102));
        jbACrearPedido.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jbACrearPedido.setForeground(new java.awt.Color(255, 255, 255));
        jbACrearPedido.setText("TOMAR PEDIDO");
        jbACrearPedido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbACrearPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbACrearPedidoActionPerformed(evt);
            }
        });

        jCmozo.setBorder(null);

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mesa");

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mesero");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(37, 37, 37)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcMesas, 0, 120, Short.MAX_VALUE)
                    .addComponent(jCmozo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbACrearPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jCmozo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcMesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jbACrearPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        crearpedido.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 174, -1, 230));

        jbInicio3.setBackground(new java.awt.Color(30, 30, 30));
        jbInicio3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jbInicio3.setForeground(new java.awt.Color(102, 255, 0));
        jbInicio3.setText("IR A INICIO");
        jbInicio3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbInicio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInicio3ActionPerformed(evt);
            }
        });
        crearpedido.add(jbInicio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 550, 126, 46));

        jpMesaMesero.add(crearpedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));

        ventanas.addTab("", jpMesaMesero);

        jpProducto.setBackground(new java.awt.Color(113, 113, 113));
        jpProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        agregarproductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Slender", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Agrega un Producto");
        agregarproductos.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 37, 293, 33));

        jtID.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jtID.setForeground(new java.awt.Color(153, 153, 153));
        jtID.setText("ID");
        jtID.setCaretColor(new java.awt.Color(51, 51, 51));
        agregarproductos.add(jtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 35, -1));

        jlMesa.setBackground(new java.awt.Color(51, 51, 51));
        jlMesa.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jlMesa.setForeground(new java.awt.Color(0, 0, 0));
        jlMesa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        jlMesa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        agregarproductos.add(jlMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 72, -1));

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
        jtPedidoProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtPedidoProdMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtPedidoProd);

        agregarproductos.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 227, 332, 261));

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
        jtProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtProducto);

        agregarproductos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 227, 345, 261));

        jLabel6.setFont(new java.awt.Font("Slender", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Elegi un Producto");
        agregarproductos.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 37, -1, -1));

        jtBProducto.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jtBProducto.setText("Ingrese el nombre del producto");
        jtBProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtBProductoMouseClicked(evt);
            }
        });
        jtBProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtBProductoKeyPressed(evt);
            }
        });
        agregarproductos.add(jtBProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 129, 207, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BuscarProductos.png"))); // NOI18N
        agregarproductos.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 115, -1, -1));
        agregarproductos.add(jtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 500, 104, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("TOTAL");
        agregarproductos.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, -1, -1));

        jbVolverMenu.setBackground(new java.awt.Color(102, 102, 102));
        jbVolverMenu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbVolverMenu.setForeground(new java.awt.Color(102, 255, 0));
        jbVolverMenu.setText("IR A INICIO");
        jbVolverMenu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbVolverMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverMenuActionPerformed(evt);
            }
        });
        agregarproductos.add(jbVolverMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 528, 141, 42));

        jBgestPedidos.setBackground(new java.awt.Color(102, 102, 102));
        jBgestPedidos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBgestPedidos.setForeground(new java.awt.Color(102, 255, 0));
        jBgestPedidos.setText("GESTIONAR PEDIDOS");
        jBgestPedidos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBgestPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBgestPedidosActionPerformed(evt);
            }
        });
        agregarproductos.add(jBgestPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, 220, 42));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("N° Mesa");
        agregarproductos.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ID Pedido");
        agregarproductos.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, -1, -1));

        jLmozo.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLmozo.setForeground(new java.awt.Color(255, 255, 255));
        jLmozo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agregarproductos.add(jLmozo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 110, 20));

        jLnombMozo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLnombMozo.setForeground(new java.awt.Color(255, 255, 255));
        jLnombMozo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLnombMozo.setText("Mozo/a:");
        agregarproductos.add(jLnombMozo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 60, 20));

        jpProducto.add(agregarproductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));

        ventanas.addTab("", jpProducto);

        jPcobrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        elegirpedido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jIFproductosDelPedido.setBackground(new java.awt.Color(51, 51, 51));
        jIFproductosDelPedido.setBorder(null);
        jIFproductosDelPedido.setClosable(true);
        jIFproductosDelPedido.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jIFproductosDelPedido.setTitle("Productos en el pedido");
        jIFproductosDelPedido.setVisible(true);
        jIFproductosDelPedido.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTproductosDelPedido.setBackground(new java.awt.Color(51, 51, 51));
        jTproductosDelPedido.setForeground(new java.awt.Color(255, 255, 255));
        jTproductosDelPedido.setModel(new javax.swing.table.DefaultTableModel(
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
        jTproductosDelPedido.setGridColor(new java.awt.Color(204, 204, 204));
        jTproductosDelPedido.setSelectionBackground(new java.awt.Color(0, 204, 51));
        jTproductosDelPedido.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane6.setViewportView(jTproductosDelPedido);

        jIFproductosDelPedido.getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 430));

        elegirpedido.add(jIFproductosDelPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 320, 350));

        jbCobrar.setBackground(new java.awt.Color(51, 51, 51));
        jbCobrar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jbCobrar.setForeground(new java.awt.Color(255, 255, 255));
        jbCobrar.setText("COBRAR PEDIDO");
        jbCobrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCobrarActionPerformed(evt);
            }
        });
        elegirpedido.add(jbCobrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 205, 64));

        jLabel15.setFont(new java.awt.Font("Slender", 1, 30)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("SELECIONA UNA MESA");
        elegirpedido.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 26, -1, 33));

        jcMesasPedido.setBorder(null);
        jcMesasPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcMesasPedidoActionPerformed(evt);
            }
        });
        elegirpedido.add(jcMesasPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 140, -1));

        jbInicio.setBackground(new java.awt.Color(30, 30, 30));
        jbInicio.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jbInicio.setForeground(new java.awt.Color(102, 255, 0));
        jbInicio.setText("IR A INICIO");
        jbInicio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInicioActionPerformed(evt);
            }
        });
        elegirpedido.add(jbInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 550, 126, 46));

        jTcobrarPedidos.setModel(new javax.swing.table.DefaultTableModel(
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
        jTcobrarPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTcobrarPedidosMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTcobrarPedidos);

        elegirpedido.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 470, 190));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa60.png"))); // NOI18N
        elegirpedido.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 100, -1, -1));

        jPcobrar.add(elegirpedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));

        ventanas.addTab("", jPcobrar);

        jpMesas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLestadoMesas.setBackground(new java.awt.Color(51, 51, 51));
        jLestadoMesas.setFont(new java.awt.Font("Slender", 1, 30)); // NOI18N
        jLestadoMesas.setForeground(new java.awt.Color(0, 153, 153));
        jLestadoMesas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLestadoMesas.setText("Estado de Mesas");
        jLestadoMesas.setOpaque(true);
        jDesktopPane2.add(jLestadoMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 260, -1));

        jScrollPane4.setVerifyInputWhenFocusTarget(false);

        jtEstadoMesas.setModel(new javax.swing.table.DefaultTableModel(
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
        jtEstadoMesas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtEstadoMesas.setName(""); // NOI18N
        jtEstadoMesas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtEstadoMesasMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jtEstadoMesas);

        jDesktopPane2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 153, 242, 331));

        jbInicio1.setBackground(new java.awt.Color(30, 30, 30));
        jbInicio1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jbInicio1.setForeground(new java.awt.Color(102, 255, 0));
        jbInicio1.setText("IR A INICIO");
        jbInicio1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbInicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInicio1ActionPerformed(evt);
            }
        });
        jDesktopPane2.add(jbInicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 493, 126, 46));

        jpMesas.add(jDesktopPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 710, 613));

        ventanas.addTab("", jpMesas);

        jPpedidos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbEntregar.setBackground(new java.awt.Color(51, 51, 51));
        jbEntregar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jbEntregar.setForeground(new java.awt.Color(255, 255, 255));
        jbEntregar.setText("Entregar Pedido");
        jbEntregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbEntregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEntregarActionPerformed(evt);
            }
        });
        jDesktopPane3.add(jbEntregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 205, 50));

        jbCancelar.setBackground(new java.awt.Color(51, 51, 51));
        jbCancelar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jbCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jbCancelar.setText("Cancelar Pedido");
        jbCancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        jDesktopPane3.add(jbCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 205, 50));

        jLabel14.setFont(new java.awt.Font("Slender", 1, 30)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Elegi un Pedido");
        jLabel14.setAutoscrolls(true);
        jLabel14.setInheritsPopupMenu(false);
        jDesktopPane3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 273, 33));

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
        jScrollPane3.setViewportView(jtPedidos);

        jDesktopPane3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 230, 450, 155));

        jbInicio2.setBackground(new java.awt.Color(30, 30, 30));
        jbInicio2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jbInicio2.setForeground(new java.awt.Color(102, 255, 0));
        jbInicio2.setText("IR A INICIO");
        jbInicio2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbInicio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInicio2ActionPerformed(evt);
            }
        });
        jDesktopPane3.add(jbInicio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, 126, 46));

        jPpedidos.add(jDesktopPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));

        ventanas.addTab("", jPpedidos);

        getContentPane().add(ventanas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 710, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed

        int fila = jtPedidos.getSelectedRow();

        if (fila >= 0) {

            int idPedido = (int) jtPedidos.getValueAt(fila, 0);
            String cancelado = "CANCELADO";
            pedidoDat.modificarEstadoPedido(cancelado, idPedido);

            cargarPedidoPediente();

        } else {

            Utilidades.mostrarDialogoTemporal("Error", "Debe seleccionar un pedido de la tabla", 2000);
        }
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbEntregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEntregarActionPerformed

        int fila = jtPedidos.getSelectedRow();

        if (fila >= 0) {

            int idPedido = (int) jtPedidos.getValueAt(fila, 0);
            String entregado = "ENTREGADO";
            pedidoDat.modificarEstadoPedido(entregado, idPedido);
            cargarPedidoPediente();

        } else {

            Utilidades.mostrarDialogoTemporal("Error", "Debe seleccionar un pedido de la tabla", 2000);
        }
    }//GEN-LAST:event_jbEntregarActionPerformed

    private void jBgestPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBgestPedidosActionPerformed

        cargarPedidoPediente();
        ventanas.setSelectedIndex(5);

    }//GEN-LAST:event_jBgestPedidosActionPerformed

    private void jbVolverMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverMenuActionPerformed

        ventanas.setSelectedIndex(0);
    }//GEN-LAST:event_jbVolverMenuActionPerformed

    private void jtBProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtBProductoKeyPressed

        modelo3.setRowCount(0);
        String buscar = jtBProducto.getText();
        List<Producto> buscarNombre = proDat.BuscarProductosNombre(buscar);

        for (Producto pro : buscarNombre) {

            modelo3.addRow(new Object[]{pro.getIdProducto(),
                pro.getNombre(), pro.getPrecio(), pro.getStock(), pro.getCategoria()});
        }
    }//GEN-LAST:event_jtBProductoKeyPressed

    private void jtBProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtBProductoMouseClicked

        jtBProducto.setText("");
    }//GEN-LAST:event_jtBProductoMouseClicked

    private void jtProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProductoMouseClicked

        Pedido pedido = new Pedido();
        PedidoProducto pepro = new PedidoProducto();
        Producto producto = new Producto();

        try {

            int fila = jtProducto.getSelectedRow();
            int idProducto = (int) jtProducto.getValueAt(fila, 0);
            int idPedido = Integer.parseInt(jtID.getText());

            producto = proDat.ObtenerPrductoId(idProducto);
            pedido = pedidoDat.obtenerPedidoId(idPedido);

            pepro.setProducto(producto);
            pepro.setPedido(pedido);
            pepro.setCantidad(1);
            pepro.setImporte(producto.getPrecio());
            pepro.setEstado(true);

            int stock = producto.getStock() - 1;
            producto.setStock(stock);

            if (stock >= 1) {

                ppDat.crearPedProd(pepro);
                proDat.ModificarProducto(producto);
                cargarPedidoProducto(idPedido);
                pedido.setImporte(Double.parseDouble(jtTotal.getText()));
                pedidoDat.modificarImportePedido(pedido);
                cargarProducto();
                int nMesa = Integer.parseInt(jlMesa.getText());
                cargarPedido(nMesa);

            } else {

                Utilidades.mostrarDialogoTemporal("Error", "No hay stock del producto", 2000);
            }

        } catch (Exception ex) {

            Utilidades.mostrarDialogoTemporal("Error", "Debe seleccionar un producto", 2000);
        }
    }//GEN-LAST:event_jtProductoMouseClicked

    private void jtPedidoProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPedidoProdMouseClicked

        Producto producto = new Producto();
        Pedido pedido = new Pedido();
        int fila = jtPedidoProd.getSelectedRow();

        try {

            int idPP = (int) jtPedidoProd.getValueAt(fila, 0);
            int idPedido = Integer.parseInt(jtID.getText());
            int idProducto = (int) jtPedidoProd.getValueAt(fila, 2);

            pedido = pedidoDat.obtenerPedidoId(idPedido);
            pedido.setImporte(Double.parseDouble(jtTotal.getText()));
            pedidoDat.modificarImportePedido(pedido);

            producto = proDat.ObtenerPrductoId(idProducto);
            int stockTotal = producto.getStock();
            producto.setStock(stockTotal + 1);
            proDat.ModificarProducto(producto);
            ppDat.eliminarPedidoProducto(idPP); //Elimina producto
            cargarPedidoProducto(idPedido);

            cargarProducto();
            cargarPedido(pedido.getMesa().getNumero());

        } catch (Exception ex) {

            Utilidades.mostrarDialogoTemporal("Error", "Debe seleccionar un producto", 2000);
        }
    }//GEN-LAST:event_jtPedidoProdMouseClicked

    private void jbACrearPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbACrearPedidoActionPerformed

        ventanas.setSelectedIndex(2);
        Pedido ped = new Pedido();
        Mesa mesa = (Mesa) jcMesas.getSelectedItem();
        ped.setMesa(mesa);
        Mozo mozo = (Mozo) jCmozo.getSelectedItem();
        ped.setMozo(mozo);
        int idPedido = pedidoDat.GuardarPedidoID(ped);
        md.modificarMesaEstado(mesa.getIdMesa(), 2);
        jlMesa.setText(mesa.getNumero() + "");
        jtID.setText(idPedido + "");
        jLmozo.setText(mozo.toString());
        cargarPedidoProducto(idPedido);
    }//GEN-LAST:event_jbACrearPedidoActionPerformed

    private void jbInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInicioActionPerformed

        ventanas.setSelectedIndex(0);
        jIFproductosDelPedido.setVisible(false);
        jbCobrar.setEnabled(false);
    }//GEN-LAST:event_jbInicioActionPerformed

    private void jbCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCobrarActionPerformed

        int fila = jTcobrarPedidos.getSelectedRow();

        if (jTcobrarPedidos.getSelectedRow() > -1) {

            int idPedido = (int) jTcobrarPedidos.getValueAt(fila, 0);
            int idMesa = (int) jTcobrarPedidos.getValueAt(fila, 1);
            boolean cobrada = true;
            pedidoDat.modificarPedidoCobrado(cobrada, idPedido);

            if (pedidoDat.mesaTieneMasDeUnPedidoNoCobrado(idMesa)) {
                System.out.println("Mesa libre");
                md.modificarMesaEstado(idMesa, 1);
            }

            String texto = idPedido + "";
            Ticket newframe = new Ticket(texto);
            newframe.setVisible(true);

            jcMesasPedido.removeAllItems();
            cargarSpinerMesasConPedidos(jcMesasPedido);
            cargarPedidoEntregado(idMesa);

        } else {

            Utilidades.mostrarDialogoTemporal("Error", "Debe seleccionar un pedido", 2000);
        }
    }//GEN-LAST:event_jbCobrarActionPerformed

    private void jbCobrarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCobrarMesaActionPerformed

        jcMesasPedido.removeAllItems();
        cargarSpinerMesasConPedidos(jcMesasPedido);
        ventanas.setSelectedIndex(3);
    }//GEN-LAST:event_jbCobrarMesaActionPerformed

    private void jBgestionarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBgestionarPedidoActionPerformed

        cargarPedidoPediente();
        ventanas.setSelectedIndex(5);
    }//GEN-LAST:event_jBgestionarPedidoActionPerformed

    private void jbTomarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTomarPedidoActionPerformed

        ventanas.setSelectedIndex(1);
        cargarMesas();

    }//GEN-LAST:event_jbTomarPedidoActionPerformed

    private void jbEstadoMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEstadoMesasActionPerformed

        ventanas.setSelectedIndex(4);
        jLestadoMesas.setText("Estado de Mesas");
        CargarEstadoMesas();

    }//GEN-LAST:event_jbEstadoMesasActionPerformed

    private void jbInicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInicio1ActionPerformed

        ventanas.setSelectedIndex(0);
        estadoMesas = false;
    }//GEN-LAST:event_jbInicio1ActionPerformed

    int clickCount = 0; // variable par acontar los clicks del mouse

    private void jtPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPedidosMouseClicked

        clickCount += 1;
        jbEntregar.setEnabled(true);
        jbCancelar.setEnabled(true);
        
        if (clickCount > 1) {

            ventanas.setSelectedIndex(2);

            int fila = jtPedidos.getSelectedRow();
            int idPedido = (int) jtPedidos.getValueAt(fila, 0);
            int numeroMesa = (int) jtPedidos.getValueAt(fila, 1);
            Mozo mozo = (Mozo) jtPedidos.getValueAt(fila, 2);
            jlMesa.setText(numeroMesa + "");
            jtID.setText(idPedido + "");
            jLmozo.setText(mozo.toString());
            cargarPedidoProducto(idPedido);
            clickCount = 0;
        }
    }//GEN-LAST:event_jtPedidosMouseClicked

    private void jbInicio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInicio2ActionPerformed

        ventanas.setSelectedIndex(0);
    }//GEN-LAST:event_jbInicio2ActionPerformed

    private void jbInicio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInicio3ActionPerformed

        ventanas.setSelectedIndex(0);
    }//GEN-LAST:event_jbInicio3ActionPerformed

    private void jcMesasPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcMesasPedidoActionPerformed

        try {
            
            Mesa mesa = (Mesa) jcMesasPedido.getSelectedItem();
            int idMesa = mesa.getIdMesa();
            cargarPedidoEntregado(idMesa);
            jbCobrar.setEnabled(false);
            
        } catch (NullPointerException e) {
            
//            Vistas.Utilidades.mostrarDialogoTemporal("Error", e.getMessage(), 2000);
        }
    }//GEN-LAST:event_jcMesasPedidoActionPerformed

    private void jTcobrarPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTcobrarPedidosMouseClicked

        clickCount += 1;
        int fila = jTcobrarPedidos.getSelectedRow();
        int idPedido = (int) jTcobrarPedidos.getValueAt(fila, 0);
        System.out.println(idPedido);
        jbCobrar.setEnabled(true);

        if (clickCount > 2) {

            jIFproductosDelPedido.setVisible(true);
            cargarProductoAcobrar(idPedido);
            jbCobrar.setEnabled(false);
            clickCount = 0;
        }
    }//GEN-LAST:event_jTcobrarPedidosMouseClicked

    private void jBagregarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagregarPedidoActionPerformed

        ventanas.setSelectedIndex(4);
        estadoMesas = true;
        jLestadoMesas.setText("Agregar Pedido");
        CargarMesasConPedido();
    }//GEN-LAST:event_jBagregarPedidoActionPerformed

    private void jtEstadoMesasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtEstadoMesasMouseClicked

        if (estadoMesas == true) {

            ventanas.setSelectedIndex(2);

            int fila = jtEstadoMesas.getSelectedRow();
            int numMesa = (int) jtEstadoMesas.getValueAt(fila, 0);

            Mesa mesa = md.ObtenerIdMesasXnumMesa(numMesa);
            Pedido pedido = pedidoDat.obtenerPedidoIdXmesa(mesa.getIdMesa());
            Mozo mozo = pedido.getMozo();
            Pedido ped = new Pedido();
            ped.setMesa(mesa);
            ped.setMozo(mozo);

            int idPedido = pedidoDat.GuardarPedidoID(ped);
            cargarPedidoProducto(idPedido);
            jlMesa.setText(mesa.getNumero() + "");
            jtID.setText(idPedido + "");
            jLmozo.setText(mozo.toString());
        }
    }//GEN-LAST:event_jtEstadoMesasMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane agregarproductos;
    private javax.swing.JDesktopPane crearpedido;
    private javax.swing.JDesktopPane elegirpedido;
    private javax.swing.JButton jBagregarPedido;
    private javax.swing.JButton jBgestPedidos;
    private javax.swing.JButton jBgestionarPedido;
    private javax.swing.JComboBox<Mozo> jCmozo;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JInternalFrame jIFproductosDelPedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLestadoMesas;
    private javax.swing.JLabel jLmozo;
    private javax.swing.JLabel jLnombMozo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPcobrar;
    private javax.swing.JPanel jPpedidos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTcobrarPedidos;
    private javax.swing.JTable jTproductosDelPedido;
    private javax.swing.JButton jbACrearPedido;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbCobrar;
    private javax.swing.JButton jbCobrarMesa;
    private javax.swing.JButton jbEntregar;
    private javax.swing.JButton jbEstadoMesas;
    private javax.swing.JButton jbInicio;
    private javax.swing.JButton jbInicio1;
    private javax.swing.JButton jbInicio2;
    private javax.swing.JButton jbInicio3;
    private javax.swing.JButton jbTomarPedido;
    private javax.swing.JButton jbVolverMenu;
    private javax.swing.JComboBox<Mesa> jcMesas;
    private javax.swing.JComboBox<Mesa> jcMesasPedido;
    private javax.swing.JLabel jlMesa;
    private javax.swing.JPanel jpInicio;
    private javax.swing.JPanel jpMesaMesero;
    private javax.swing.JPanel jpMesas;
    private javax.swing.JPanel jpProducto;
    private javax.swing.JTextField jtBProducto;
    private javax.swing.JTable jtEstadoMesas;
    private javax.swing.JTextField jtID;
    private javax.swing.JTable jtPedidoProd;
    private javax.swing.JTable jtPedidos;
    private javax.swing.JTable jtProducto;
    private javax.swing.JTextField jtTotal;
    private javax.swing.JTabbedPane ventanas;
    // End of variables declaration//GEN-END:variables

    private void armarCabeceraPed(JTable table, DefaultTableModel modelo) {

        modelo.addColumn("ID");
        modelo.addColumn("NºMeza");
        modelo.addColumn("Mozo");
        modelo.addColumn("Fecha/Hora");
        modelo.addColumn("Cobrada");
        modelo.addColumn("Importe");
        modelo.addColumn("Estado");
        table.setModel(modelo);
        
        TableColumn column = table.getColumnModel().getColumn(0);
        column.setMinWidth(0);
        column.setMaxWidth(0);
        column.setWidth(0);
        column.setResizable(false);
    }

    private void armarCabeceraProd() {

        modelo3.addColumn("ID");
        modelo3.addColumn("Nombre");
        modelo3.addColumn("Precio");
        modelo3.addColumn("Categoria");
        modelo3.addColumn("Stock");
        jtProducto.setModel(modelo3);
        
        // Ocultar la columna "idPedido" (índice 0)
        TableColumn column = jtProducto.getColumnModel().getColumn(0);
        column.setMinWidth(0);
        column.setMaxWidth(0);
        column.setWidth(0);
        column.setResizable(false);
    }

    private void armarCabeceraProdAcobrar() {

        modelo6.addColumn("Nombre");
        modelo6.addColumn("Precio");
        jTproductosDelPedido.setModel(modelo6);
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

    private void armarCabeceraEstadoMesas() {

        modelo4.addColumn("Numero");
        modelo4.addColumn("Estado");
        jtEstadoMesas.setModel(modelo4);
    }

    private void cargarMesas() {

        jcMesas.removeAllItems(); // Limpiar los elementos actuales del combo box
        List<Mesa> mesas = md.listarMesasLibres(); // Obtener la lista de mesas libres
        jcMesas.setRenderer(renderer); // Establecer el renderer personalizado

        // Iterar sobre la lista de mesas y agregar cada una al combo box
        for (Mesa mesa : mesas) {
            jcMesas.addItem(new Mesa(mesa.getIdMesa(), mesa.getNumero(), mesa.getEstadoMesa(),
                    mesa.getCapacidad(), mesa.isActivo()));
        }
    }

    private void cargarProducto() {

        modelo3.setRowCount(0);
        List<Producto> productos = proDat.listarProductos();

        for (Producto pro : productos) {

            modelo3.addRow(new Object[]{pro.getIdProducto(), pro.getNombre(), pro.getPrecio(),
                pro.getCategoria(), pro.getStock()});
        }
    }

    private void cargarProductoAcobrar(int id) {

        modelo6.setRowCount(0);
        System.out.println(id + "caragar producto a cobrar");
        List<PedidoProducto> pedidoP = ppDat.BuscarProductosxIdPedido(id);

        for (PedidoProducto pp : pedidoP) {

            modelo6.addRow(new Object[]{pp.getProducto().getNombre(), pp.getImporte()});
        }
    }

    public void cargarPedidoProducto(int id) {

        modelo2.setRowCount(0);
        double total = 0.0;
        List<PedidoProducto> pedidoP = ppDat.BuscarProductosxIdPedido(id);

        for (PedidoProducto pp : pedidoP) {

            modelo2.addRow(new Object[]{pp.getIdPedidoProducto(), pp.getPedido().getIdPedido(), pp.getProducto().getIdProducto(), pp.getProducto().getNombre(), pp.getImporte(), pp.getCantidad()});
            total += pp.getImporte();
        }

        jtTotal.setText(total + "");
    }

    private void cargarPedido(int id) {

        modelo1.setRowCount(0);
        List<Pedido> pedido = pedidoDat.listarPedidosMesa(id);

        for (Pedido pe : pedido) {

            modelo1.addRow(new Object[]{pe.getIdPedido(), pe.getMesa().getNumero(),
                pe.getMozo(), pe.getFechaHora(), pe.isCobrada(), pe.getImporte(), pe.getEstado()});
        }
    }

    private void cargarPedidoPediente() {

        modelo1.setRowCount(0);
        List<Pedido> pedido = pedidoDat.listarPedidosEstadoPendiente();

        for (Pedido pe : pedido) {

            modelo1.addRow(new Object[]{pe.getIdPedido(), pe.getMesa().getNumero(),
                pe.getMozo(), pe.getFechaHora(), pe.isCobrada(), pe.getImporte(), pe.getEstado()});
        }
    }

    private void cargarPedidoEntregado(int id) {

        modelo5.setRowCount(0);
        List<Pedido> pedido = pedidoDat.listarMesasPedidosEntregados(id);

        for (Pedido pe : pedido) {

            modelo5.addRow(new Object[]{pe.getIdPedido(), pe.getMesa().getNumero(),
                pe.getMozo(), pe.getFechaHora(), pe.isCobrada(), pe.getImporte(), pe.getEstado()});
        }
    }
    
     private void CargarEstadoMesas() {

        modelo4.setRowCount(0);
        List<Mesa> mesas = md.listarTodasLasMesas();

        for (Mesa me : mesas) {
            
            modelo4.addRow(new Object[]{me.getNumero(), me.getEstadoMesa()});
        }

        for (int i = 0; i < modelo4.getColumnCount(); i++) {
            
            jtEstadoMesas.getColumnModel().getColumn(i).setCellRenderer(new ajustarCeldas());
        }
    }

    private void CargarMesasConPedido() {

        modelo4.setRowCount(0);
        List<Mesa> mesas = md.listarMesasConPedido();

        for (Mesa me : mesas) {
            
            modelo4.addRow(new Object[]{me.getNumero(), me.getEstadoMesa()});
        }

        for (int i = 0; i < modelo4.getColumnCount(); i++) {
            
            jtEstadoMesas.getColumnModel().getColumn(i).setCellRenderer(new ajustarCeldas());
        }
    }

    // Define un renderizador personalizado para las celdas de la tabla mesa
    DefaultListCellRenderer renderer = new DefaultListCellRenderer() {

        public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            Component component = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

            if (value instanceof Mesa) {

                Mesa mesa = (Mesa) value;

                if (mesa.getEstadoMesa().equals("OCUPADO")) {

                    component.setBackground(Color.RED);
                    component.setForeground(Color.WHITE);

                } else {

                    component.setBackground(Color.GREEN);
                    component.setBackground(Color.WHITE);
                }
            }

            return component;
        }
    };

    // Esta clase extiende DefaultTableCellRenderer para personalizar la apariencia de las celdas de una JTable.
    public class ajustarCeldas extends DefaultTableCellRenderer {

        // Constructor de la clase ajustarCeldas
        public ajustarCeldas() {
            // Alinea el texto dentro de las celdas al centro.
            setHorizontalAlignment(JLabel.CENTER);
            // Establece el color de fondo de las celdas a verde por defecto.
            setBackground(Color.GREEN);
        }

        // Sobrescribe el método getTableCellRendererComponent para personalizar la apariencia de las celdas.
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

            // Llama al método de la superclase para obtener el componente por defecto.
            Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            // Obtiene el valor de la segunda columna de la fila actual, que se espera que sea el estado de la mesa.
            String Estado = (String) table.getValueAt(row, 1);

            // Si el estado de la mesa es "OCUPADO", cambia el fondo a rojo y el texto a blanco.
            if ("OCUPADO".equals(Estado)) {
                
                c.setBackground(Color.RED);
                c.setForeground(Color.WHITE);
            } // Si el estado no es "OCUPADO", establece el fondo a verde y el texto a blanco.
            else {
                
                c.setBackground(Color.GREEN);
                c.setForeground(Color.BLACK);
            }

            // Devuelve el componente con los cambios aplicados.
            return c;
        }
    }

    @SuppressWarnings("unchecked")
    private void cargarSpinerMozos(JComboBox jCombo) {

        List<Mozo> mozos = mozoDat.listarMozos();

        for (Mozo mozo : mozos) {
            jCombo.addItem(mozo);
        }
    }

    @SuppressWarnings("unchecked")
    private void cargarSpinerMesasConPedidos(JComboBox jCombo) {

        List<Mesa> mesas = md.listarMesasConPedidoEntregado();
        jCombo.removeAllItems();
        
        for (Mesa mesa : mesas) {
            
            jCombo.addItem(mesa);
        }
    }
}
