
package Vistas;

import BaseDatos.MesaData;
import BaseDatos.PedidoData;
import BaseDatos.PedidoProductoData;
import BaseDatos.ProductoData;
import Entidades.Mesa;
import Entidades.Pedido;
import Entidades.PedidoProducto;
import Entidades.Producto;
import java.awt.Graphics;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class restoView extends javax.swing.JInternalFrame {

    MesaData md = new MesaData();
    PedidoData pd = new PedidoData();
    ProductoData pdat = new ProductoData();
    PedidoProductoData ppd = new PedidoProductoData();

    public restoView() {

        initComponents();
        cargarMesas();
        armarCabeceraProd();
        armarCabeceraProdPed();
        armarCabeceraPed();
        cargarProducto();
        armarCabeceraEstadoMesas();
        CargarEstadoMesas();
        ventanas.setEnabled(false);
        jtID.setEnabled(false);
        jbAgregarQuitar.setEnabled(false);
        jbEntregar.setEnabled(false); 
        jbCancelar.setEnabled(false);
        jbCobrar.setEnabled(false);
        
    }

    private DefaultTableModel modelo3 = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {

            return false;
        }

    };
 private DefaultTableModel modelo2 = new DefaultTableModel(){

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
 
  private DefaultTableModel modelo4 = new DefaultTableModel() {

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
        ImageIcon icono = new ImageIcon(getClass().getResource("/Recursos/INICIO.jpg"));
        Image imagen = icono.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){

                g.drawImage(imagen,0,0,getWidth(),getHeight(),this);

            }

        };
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbTomarPedido = new javax.swing.JButton();
        jbAgregarAPedido = new javax.swing.JButton();
        jbCobrarMesa = new javax.swing.JButton();
        jbEstadoMesas = new javax.swing.JButton();
        jpMesaMesero = new javax.swing.JPanel();
        ImageIcon icono2 = new ImageIcon(getClass().getResource("/Recursos/FONDO5.jpg"));
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
        jcMeseros = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jpProducto = new javax.swing.JPanel();
        ImageIcon icono3 = new ImageIcon(getClass().getResource("/Recursos/FONDO19.jpg"));
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
        jbIrPedidos = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jpPedidos = new javax.swing.JPanel();
        ImageIcon icono4 = new ImageIcon(getClass().getResource("/Recursos/PIZZA.jpg"));
        Image imagen4 = icono4.getImage();
        elegirpedido = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){

                g.drawImage(imagen4,0,0,getWidth(),getHeight(),this);

            }
        };
        jbAgregarQuitar = new javax.swing.JButton();
        jbEntregar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbCobrar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtPedidos = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jcMesasPedido = new javax.swing.JComboBox<>();
        jbInicio = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ImageIcon icono5 = new ImageIcon(getClass().getResource("/Recursos/FONDO4.jpg"));
        Image imagen5 = icono5.getImage();
        jDesktopPane2 = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){

                g.drawImage(imagen5,0,0,getWidth(),getHeight(),this);

            }

        };
        jLabel13 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtEstadoMesas = new javax.swing.JTable();
        jbInicio1 = new javax.swing.JButton();

        setClosable(true);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ventanas.setPreferredSize(new java.awt.Dimension(500, 600));

        jpInicio.setPreferredSize(new java.awt.Dimension(0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 153, 0));
        jLabel1.setText("BIENVENIDOS");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Logo Pizzería Ilustración Blanco Negro (1).png"))); // NOI18N

        jbTomarPedido.setBackground(new java.awt.Color(40, 40, 40));
        jbTomarPedido.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jbTomarPedido.setForeground(new java.awt.Color(255, 255, 255));
        jbTomarPedido.setText("TOMAR PEDIDO");
        jbTomarPedido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbTomarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTomarPedidoActionPerformed(evt);
            }
        });

        jbAgregarAPedido.setBackground(new java.awt.Color(40, 40, 40));
        jbAgregarAPedido.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jbAgregarAPedido.setForeground(new java.awt.Color(255, 255, 255));
        jbAgregarAPedido.setText("GESTIONAR PEDIDOS");
        jbAgregarAPedido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbAgregarAPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarAPedidoActionPerformed(evt);
            }
        });

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

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbTomarPedido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbAgregarAPedido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbCobrarMesa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbEstadoMesas, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(68, 68, 68))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbCobrarMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jbTomarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbAgregarAPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jbEstadoMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(419, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(jbTomarPedido)
                .addGap(13, 13, 13)
                .addComponent(jbAgregarAPedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbCobrarMesa)
                .addGap(18, 18, 18)
                .addComponent(jbEstadoMesas)
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout jpInicioLayout = new javax.swing.GroupLayout(jpInicio);
        jpInicio.setLayout(jpInicioLayout);
        jpInicioLayout.setHorizontalGroup(
            jpInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInicioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpInicioLayout.setVerticalGroup(
            jpInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        ventanas.addTab("Inicio", jpInicio);

        jpMesaMesero.setBackground(new java.awt.Color(153, 153, 153));

        jLabel12.setBackground(new java.awt.Color(102, 102, 102));
        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("SELECCIONAR");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jbACrearPedido.setBackground(new java.awt.Color(102, 102, 102));
        jbACrearPedido.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jbACrearPedido.setForeground(new java.awt.Color(255, 255, 255));
        jbACrearPedido.setText("CREAR PEDIDO");
        jbACrearPedido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbACrearPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbACrearPedidoActionPerformed(evt);
            }
        });

        jcMeseros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "CARLOS", "MARTIN", "FABIAN", "MARIA" }));

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mesa");

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CANCELAR PEDIDO");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(37, 37, 37)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcMeseros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jbACrearPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcMeseros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcMesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jbACrearPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        crearpedido.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        crearpedido.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout crearpedidoLayout = new javax.swing.GroupLayout(crearpedido);
        crearpedido.setLayout(crearpedidoLayout);
        crearpedidoLayout.setHorizontalGroup(
            crearpedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearpedidoLayout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addGroup(crearpedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(275, Short.MAX_VALUE))
        );
        crearpedidoLayout.setVerticalGroup(
            crearpedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearpedidoLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel12)
                .addGap(55, 55, 55)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(420, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpMesaMeseroLayout = new javax.swing.GroupLayout(jpMesaMesero);
        jpMesaMesero.setLayout(jpMesaMeseroLayout);
        jpMesaMeseroLayout.setHorizontalGroup(
            jpMesaMeseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(crearpedido, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jpMesaMeseroLayout.setVerticalGroup(
            jpMesaMeseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMesaMeseroLayout.createSequentialGroup()
                .addComponent(crearpedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        ventanas.addTab("Crear Pedido", jpMesaMesero);

        jpProducto.setBackground(new java.awt.Color(113, 113, 113));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PRODUCTOS EN PEDIDO");

        jtID.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jtID.setText("ID");

        jlMesa.setBackground(new java.awt.Color(51, 51, 51));
        jlMesa.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jlMesa.setForeground(new java.awt.Color(0, 255, 255));
        jlMesa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        jlMesa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

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

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ELEGI UN PRODUCTO");

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

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BuscarProductos.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("TOTAL");

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

        jbIrPedidos.setBackground(new java.awt.Color(102, 102, 102));
        jbIrPedidos.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jbIrPedidos.setForeground(new java.awt.Color(102, 255, 0));
        jbIrPedidos.setText("IR A PEDIDOS");
        jbIrPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIrPedidosActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("N° Mesa");

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ID Pedido");

        agregarproductos.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        agregarproductos.setLayer(jtID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        agregarproductos.setLayer(jlMesa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        agregarproductos.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        agregarproductos.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        agregarproductos.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        agregarproductos.setLayer(jtBProducto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        agregarproductos.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        agregarproductos.setLayer(jtTotal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        agregarproductos.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        agregarproductos.setLayer(jbVolverMenu, javax.swing.JLayeredPane.DEFAULT_LAYER);
        agregarproductos.setLayer(jbIrPedidos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        agregarproductos.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        agregarproductos.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout agregarproductosLayout = new javax.swing.GroupLayout(agregarproductos);
        agregarproductos.setLayout(agregarproductosLayout);
        agregarproductosLayout.setHorizontalGroup(
            agregarproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarproductosLayout.createSequentialGroup()
                .addGroup(agregarproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(agregarproductosLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel6))
                    .addGroup(agregarproductosLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jtBProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(agregarproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(agregarproductosLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(35, 35, 35))
                    .addGroup(agregarproductosLayout.createSequentialGroup()
                        .addGroup(agregarproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(agregarproductosLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(68, 68, 68))
                            .addGroup(agregarproductosLayout.createSequentialGroup()
                                .addComponent(jlMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)))
                        .addGroup(agregarproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agregarproductosLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(87, 87, 87))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agregarproductosLayout.createSequentialGroup()
                                .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(102, 102, 102))))))
            .addGroup(agregarproductosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(agregarproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agregarproductosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(44, 44, 44)
                        .addComponent(jtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(agregarproductosLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(9, Short.MAX_VALUE))))
            .addGroup(agregarproductosLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jbVolverMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbIrPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
        agregarproductosLayout.setVerticalGroup(
            agregarproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agregarproductosLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(agregarproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(26, 26, 26)
                .addGroup(agregarproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(agregarproductosLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(agregarproductosLayout.createSequentialGroup()
                        .addComponent(jtBProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(agregarproductosLayout.createSequentialGroup()
                        .addGroup(agregarproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(agregarproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMesa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)))
                .addGroup(agregarproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(agregarproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(8, 8, 8)
                .addGroup(agregarproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbVolverMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbIrPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout jpProductoLayout = new javax.swing.GroupLayout(jpProducto);
        jpProducto.setLayout(jpProductoLayout);
        jpProductoLayout.setHorizontalGroup(
            jpProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(agregarproductos)
        );
        jpProductoLayout.setVerticalGroup(
            jpProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(agregarproductos)
        );

        ventanas.addTab("Agregar Productos", jpProducto);

        jbAgregarQuitar.setBackground(new java.awt.Color(51, 51, 51));
        jbAgregarQuitar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jbAgregarQuitar.setForeground(new java.awt.Color(255, 255, 255));
        jbAgregarQuitar.setText("Productos del Pedido");
        jbAgregarQuitar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbAgregarQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarQuitarActionPerformed(evt);
            }
        });

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

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("ELEGI UN PEDIDO");

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("SELECIONA UNA MESA");

        jcMesasPedido.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcMesasPedidoItemStateChanged(evt);
            }
        });

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

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa60.png"))); // NOI18N

        elegirpedido.setLayer(jbAgregarQuitar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        elegirpedido.setLayer(jbEntregar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        elegirpedido.setLayer(jbCancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        elegirpedido.setLayer(jbCobrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        elegirpedido.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        elegirpedido.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        elegirpedido.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        elegirpedido.setLayer(jcMesasPedido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        elegirpedido.setLayer(jbInicio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        elegirpedido.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout elegirpedidoLayout = new javax.swing.GroupLayout(elegirpedido);
        elegirpedido.setLayout(elegirpedidoLayout);
        elegirpedidoLayout.setHorizontalGroup(
            elegirpedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(elegirpedidoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(elegirpedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(elegirpedidoLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel14))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(elegirpedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbEntregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAgregarQuitar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, elegirpedidoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(elegirpedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, elegirpedidoLayout.createSequentialGroup()
                        .addComponent(jbCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(412, 412, 412))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, elegirpedidoLayout.createSequentialGroup()
                        .addComponent(jbInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
            .addGroup(elegirpedidoLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(elegirpedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(elegirpedidoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jcMesasPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        elegirpedidoLayout.setVerticalGroup(
            elegirpedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(elegirpedidoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(elegirpedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(elegirpedidoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(elegirpedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(elegirpedidoLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jcMesasPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(elegirpedidoLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jbAgregarQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbEntregar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jbCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jbInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout jpPedidosLayout = new javax.swing.GroupLayout(jpPedidos);
        jpPedidos.setLayout(jpPedidosLayout);
        jpPedidosLayout.setHorizontalGroup(
            jpPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(elegirpedido)
        );
        jpPedidosLayout.setVerticalGroup(
            jpPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPedidosLayout.createSequentialGroup()
                .addComponent(elegirpedido)
                .addContainerGap())
        );

        ventanas.addTab("Elegir Pedido", jpPedidos);

        jLabel13.setBackground(new java.awt.Color(51, 51, 51));
        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 153));
        jLabel13.setText("ESTADO DE MESAS");
        jLabel13.setOpaque(true);

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
        jScrollPane4.setViewportView(jtEstadoMesas);

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

        jDesktopPane2.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jbInicio1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel13)))
                .addContainerGap(218, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );

        ventanas.addTab("Mesas", jPanel2);

        getContentPane().add(ventanas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcMesasPedidoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcMesasPedidoItemStateChanged

        pedidoxMesa();

    }//GEN-LAST:event_jcMesasPedidoItemStateChanged

    private void jtPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPedidosMouseClicked

    }//GEN-LAST:event_jtPedidosMouseClicked

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed

        int fila = jtPedidos.getSelectedRow();

        if (fila >= 0) {

            int idPedido = (int) jtPedidos.getValueAt(fila, 0);
            int idMesa = (int) jtPedidos.getValueAt(fila, 1);
            Pedido pedido = pd.obtenerPedidoId(idPedido);
            pedido.setEstado("CANCELADO");
            pd.modificarEstadoPedido(pedido);

            cargarPedidoPediente(idMesa);

        } else {

            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un pedido de la tabla");

        }
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbEntregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEntregarActionPerformed

        int fila = jtPedidos.getSelectedRow();

        if (fila >= 0) {

            int idPedido = (int) jtPedidos.getValueAt(fila, 0);
            int idMesa = (int) jtPedidos.getValueAt(fila, 1);
            Pedido pedido = pd.obtenerPedidoId(idPedido);
            pedido.setEstado("ENTREGADO");
            pd.modificarEstadoPedido(pedido);

            cargarPedidoPediente(idMesa);

        } else {

            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un pedido de la tabla");

        }
    }//GEN-LAST:event_jbEntregarActionPerformed

    private void jbAgregarQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarQuitarActionPerformed

        int fila = jtPedidos.getSelectedRow();

        if (fila >= 0) {
            int idPedido = (int) jtPedidos.getValueAt(fila, 0);

            int Nmesa = (int) jtPedidos.getValueAt(fila, 1);
            cargarPedidoProducto(idPedido);
            jtID.setText(idPedido + "");
            jlMesa.setText(Nmesa + "");

            ventanas.setSelectedIndex(2);
        } else {

            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un pedido de la tabla");

        }
    }//GEN-LAST:event_jbAgregarQuitarActionPerformed

    private void jbIrPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIrPedidosActionPerformed

        ventanas.setSelectedIndex(3);
        jbAgregarQuitar.setEnabled(true);
        jbEntregar.setEnabled(true); 
        jbCancelar.setEnabled(true);
        Mesa mesa = (Mesa) jcMesasPedido.getSelectedItem();
        int idMesa = mesa.getIdMesa();
        cargarPedidoPediente(idMesa);

    }//GEN-LAST:event_jbIrPedidosActionPerformed

    private void jbVolverMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverMenuActionPerformed

        ventanas.setSelectedIndex(0);

    }//GEN-LAST:event_jbVolverMenuActionPerformed

    private void jtBProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtBProductoKeyPressed

        modelo3.setRowCount(0);
        String buscar = jtBProducto.getText();
        List<Producto> buscarNombre = pdat.BuscarProductosNombre(buscar);

        for (Producto pro : buscarNombre) {

            modelo3.addRow(new Object[]{pro.getIdProducto(),
                pro.getNombre(), pro.getPrecio(), pro.getStock(), pro.isEstado(), pro.getCategoria()});

        }
    }//GEN-LAST:event_jtBProductoKeyPressed

    private void jtBProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtBProductoMouseClicked

        jtBProducto.setText("");

    }//GEN-LAST:event_jtBProductoMouseClicked

    private void jtProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProductoMouseClicked

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
            pepro.setCantidad(1);
            pepro.setImporte(prod.getPrecio());
            pepro.setEstado(true);

            int stock = prod.getStock() - 1;
            prod.setStock(stock);

            if (stock >= 0) {

                ppd.crearPedProd(pepro);
                pdat.ModificarProducto(prod);
                cargarPedidoProducto(idPe);
                pedi.setImporte(Double.parseDouble(jtTotal.getText()));
                pd.modificarPedido(pedi);
                cargarProducto();
                int nMesa = Integer.parseInt(jlMesa.getText());
                cargarPedido(nMesa);

            } else {

                JOptionPane.showMessageDialog(rootPane, "No hay stock del producto");

            }
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un producto");

        }

    }//GEN-LAST:event_jtProductoMouseClicked

    private void jtPedidoProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPedidoProdMouseClicked

        PedidoProductoData ppdd = new PedidoProductoData();
        ProductoData pdd = new ProductoData();
        Producto pro = new Producto();
        Pedido pedi = new Pedido();

        int fila = jtPedidoProd.getSelectedRow();

        try {

            int id = (int) jtPedidoProd.getValueAt(fila, 0);
            int idP = Integer.parseInt(jtID.getText());
            int idProducto = (int) jtPedidoProd.getValueAt(fila, 2);

            pedi = pd.obtenerPedidoId(idP);
            pedi.setImporte(Double.parseDouble(jtTotal.getText()));
            pd.modificarPedido(pedi);

            pro = pdat.ObtenerPrductoId(idProducto);
            int cantidad = (int) jtPedidoProd.getValueAt(fila, 5);
            int stockTotal = pro.getStock();
            pro.setStock(stockTotal + 1);
            pdd.ModificarProducto(pro);
            ppdd.eliminarPedidoProducto(id); //Elimina producto
            cargarPedidoProducto(idP);

            cargarProducto();
            cargarPedido(pedi.getMesa().getNumero());

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un producto");

        }
    }//GEN-LAST:event_jtPedidoProdMouseClicked

    private void jbACrearPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbACrearPedidoActionPerformed
        
        jbIrPedidos.setEnabled(false);
        
        if (jcMeseros.getSelectedIndex() != 0) {

            ventanas.setSelectedIndex(2);
            Pedido ped = new Pedido();
            Mesa mesa = (Mesa) jcMesas.getSelectedItem();
            ped.setMesa(mesa);
            ped.setNombreMesero(jcMeseros.getSelectedItem() + "");
            int idPedido = pd.GuardarPedidoID(ped);
            mesa.setEstadoMesa("OCUPADO");
            md.modificarMesa(mesa);
            jlMesa.setText(mesa.getNumero()+"");
            jtID.setText(idPedido + "");
            cargarPedidoProducto(idPedido);

        }else{

            JOptionPane.showMessageDialog(rootPane, "Debe elegir un mesero");

        }
    }//GEN-LAST:event_jbACrearPedidoActionPerformed

    private void jbInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInicioActionPerformed
       
        ventanas.setSelectedIndex(0);
    }//GEN-LAST:event_jbInicioActionPerformed

    private void jbCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCobrarActionPerformed

        int fila = jtPedidos.getSelectedRow();

        if (fila >= 0) {

            int idPedido = (int) jtPedidos.getValueAt(fila, 0);
            int idMesa = (int) jtPedidos.getValueAt(fila, 1);
            Mesa mesa = md.ObtenerMesasId(idMesa);
            Pedido pedido = pd.obtenerPedidoId(idPedido);
            JOptionPane.showMessageDialog(rootPane, pd.pasarAlibre(idMesa));
            pedido.setCobrada(true);
            pd.modificarEstadoPedido(pedido);
            
            if (!pd.pasarAlibre(idMesa)) {
                
                mesa.setEstadoMesa("LIBRE");
                md.modificarMesa(mesa);
                
            }
            
            
            cargarPedidoPediente(idMesa);
            String texto = idPedido + "";
            Ticket newframe = new Ticket(texto);
            newframe.setVisible(true);
            ventanas.setSelectedIndex(0);
            
        } else {

            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un pedido de la tabla");

        }
    }//GEN-LAST:event_jbCobrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        ventanas.setSelectedIndex(0);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbCobrarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCobrarMesaActionPerformed

        ventanas.setSelectedIndex(3);
        jbAgregarQuitar.setEnabled(false);
        jbEntregar.setEnabled(false);
        jbCancelar.setEnabled(false);
        jbCobrar.setEnabled(true);
        Mesa mesa = (Mesa) jcMesasPedido.getSelectedItem();
        cargarPedidoEntregado(mesa.getIdMesa());

    }//GEN-LAST:event_jbCobrarMesaActionPerformed

    private void jbAgregarAPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarAPedidoActionPerformed

        ventanas.setSelectedIndex(3);

        jbAgregarQuitar.setEnabled(true);
        jbEntregar.setEnabled(true);
        jbCancelar.setEnabled(true);
        jbCobrar.setEnabled(false);
        pedidoxMesa();
    }//GEN-LAST:event_jbAgregarAPedidoActionPerformed

    private void jbTomarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTomarPedidoActionPerformed

        ventanas.setSelectedIndex(1);

    }//GEN-LAST:event_jbTomarPedidoActionPerformed

    private void jbEstadoMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEstadoMesasActionPerformed
        
        ventanas.setSelectedIndex(4);
    }//GEN-LAST:event_jbEstadoMesasActionPerformed

    private void jbInicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInicio1ActionPerformed
       ventanas.setSelectedIndex(0);
    }//GEN-LAST:event_jbInicio1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane agregarproductos;
    private javax.swing.JDesktopPane crearpedido;
    private javax.swing.JDesktopPane elegirpedido;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jbACrearPedido;
    private javax.swing.JButton jbAgregarAPedido;
    private javax.swing.JButton jbAgregarQuitar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbCobrar;
    private javax.swing.JButton jbCobrarMesa;
    private javax.swing.JButton jbEntregar;
    private javax.swing.JButton jbEstadoMesas;
    private javax.swing.JButton jbInicio;
    private javax.swing.JButton jbInicio1;
    private javax.swing.JButton jbIrPedidos;
    private javax.swing.JButton jbTomarPedido;
    private javax.swing.JButton jbVolverMenu;
    private javax.swing.JComboBox<Mesa> jcMesas;
    private javax.swing.JComboBox<Mesa> jcMesasPedido;
    private javax.swing.JComboBox<String> jcMeseros;
    private javax.swing.JLabel jlMesa;
    private javax.swing.JPanel jpInicio;
    private javax.swing.JPanel jpMesaMesero;
    private javax.swing.JPanel jpPedidos;
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

    private void armarCabeceraPed() {

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
    
    private void armarCabeceraProd() {

        modelo3.addColumn("ID");
        modelo3.addColumn("Nombre");
        modelo3.addColumn("Precio");
        modelo3.addColumn("Categoria");
        modelo3.addColumn("Stock");
        jtProducto.setModel(modelo3);

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

        List<Mesa> cblistarMesas = md.listarMesas();

        for (int i = 0; i < cblistarMesas.size(); i++) {

            jcMesas.addItem(new Mesa(cblistarMesas.get(i).getIdMesa(), cblistarMesas.get(i).getNumero(), cblistarMesas.get(i).getEstadoMesa(), cblistarMesas.get(i).getCapacidad(),
                    cblistarMesas.get(i).getActivo()));

        }

        for (int i = 0; i < cblistarMesas.size(); i++) {

            jcMesasPedido.addItem(new Mesa(cblistarMesas.get(i).getIdMesa(), cblistarMesas.get(i).getNumero(), cblistarMesas.get(i).getEstadoMesa(), cblistarMesas.get(i).getCapacidad(),
                    cblistarMesas.get(i).getActivo()));

        }
    }

    private void cargarProducto() {

        modelo3.setRowCount(0);
        List<Producto> producto = pdat.listarProductos();

        for (Producto pro : producto) {

            modelo3.addRow(new Object[]{pro.getIdProducto(),pro.getNombre(), pro.getPrecio(), pro.getCategoria(), pro.getStock()});

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
    
    private void cargarPedido(int id) {

        modelo1.setRowCount(0);
        List<Pedido> pedido = pd.listarPedidosMesa(id);

        for (Pedido pe : pedido) {

            modelo1.addRow(new Object[]{pe.getIdPedido(), pe.getMesa().getNumero(),
                pe.getNombreMesero(), pe.getFechaHora(),pe.isCobrada(),pe.getImporte(), pe.getEstado()});

        }   
    }
    
    private void cargarPedidoPediente(int id) {

        modelo1.setRowCount(0);
        List<Pedido> pedido = pd.listarPedidosMesaPendientes(id);

        for (Pedido pe : pedido) {

            modelo1.addRow(new Object[]{pe.getIdPedido(), pe.getMesa().getNumero(),
                pe.getNombreMesero(), pe.getFechaHora(),pe.isCobrada(),pe.getImporte(), pe.getEstado()});

        }   
    }
    
    private void cargarPedidoEntregado(int id) {

        modelo1.setRowCount(0);
        List<Pedido> pedido = pd.listarPedidosMesaEntregadas(id);

        for (Pedido pe : pedido) {

            modelo1.addRow(new Object[]{pe.getIdPedido(), pe.getMesa().getNumero(),
                pe.getNombreMesero(), pe.getFechaHora(),pe.isCobrada(),pe.getImporte(), pe.getEstado()});

        }   
    }
    
    private void pedidoxMesa(){
    
        Mesa mesa = (Mesa) jcMesasPedido.getSelectedItem();
        int Nmesa = mesa.getIdMesa();
        cargarPedidoPediente(Nmesa);
    
    }
    
    private void CargarEstadoMesas() {

        modelo1.setRowCount(0);
        List<Mesa> mesas = md.listarMesas();

        for (Mesa me : mesas) {

            modelo4.addRow(new Object[]{me.getNumero(), me.getEstadoMesa()});

        }   
    }
}
