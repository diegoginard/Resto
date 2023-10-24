
package Vistas;

import BaseDatos.MesaData;
import BaseDatos.PedidoData;
import BaseDatos.ProductoData;
import Entidades.Mesa;
import Entidades.Pedido;
import Entidades.PedidoProducto;
import Entidades.Producto;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class PedidoProductos extends javax.swing.JInternalFrame {

    Icon icoR = new ImageIcon(getClass().getResource("/Recursos/mesa-rojo.png"));
    Icon icoV = new ImageIcon(getClass().getResource("/Recursos/mesa-verde.png"));
    Icon icoG = new ImageIcon(getClass().getResource("/Recursos/mesa-gris.png"));
    MesaData md = new MesaData();
    Mesa mes = new Mesa();
    PedidoData pd = new PedidoData();

    ProductoData productoD = new ProductoData();
    PedidoData pedidoD = new PedidoData();

    private boolean mesaOcupada = false;

    public PedidoProductos() {

        initComponents();
        armarCabecera();
        cargarLista();
        
    }
 
    private DefaultTableModel modelo = new DefaultTableModel(){

        @Override
        public boolean  isCellEditable(int rowIndex, int columnIndex ){
            
            return false;
        }

    };

    public PedidoProductos(JLabel jLabel1, JLabel jLabel2, JLabel jLabel4, JScrollPane jScrollPane1, JButton jbAnular, JButton jbBorrar, JButton jbDescuento, JButton jbEfectivo, JButton jbMenos, JButton jbPunto, JButton jbSumar, JButton jbenter, JTextField jtMonto, JTable jtProductos, JTextField jtTotal, JButton n0, JButton n1, JButton n2, JButton n3, JButton n4, JButton n5, JButton n6, JButton n7, JButton n8, JButton n9, JPanel pProductos) {
        this.jLabel1 = jLabel1;
        this.jLabel2 = jLabel2;
        this.jLabel4 = jLabel4;
        this.jScrollPane1 = jScrollPane1;
        this.jbAnular = jbAnular;
        this.jbBorrar = jbBorrar;
        this.jbDescuento = jbDescuento;
        this.jbEfectivo = jbEfectivo;
        this.jbMenos = jbMenos;
        this.jbPunto = jbPunto;
        this.jbSumar = jbSumar;
        this.jbenter = jbenter;
        this.jtMonto = jtMonto;
        this.jtProductos = jtProductos;
        this.jtTotal = jtTotal;
        this.n0 = n0;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.n5 = n5;
        this.n6 = n6;
        this.n7 = n7;
        this.n8 = n8;
        this.n9 = n9;
        this.pProductos = pProductos;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pProductos = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        n9 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        n4 = new javax.swing.JButton();
        jtMonto = new javax.swing.JTextField();
        n5 = new javax.swing.JButton();
        jbAnular = new javax.swing.JButton();
        n6 = new javax.swing.JButton();
        jbMenos = new javax.swing.JButton();
        n7 = new javax.swing.JButton();
        jbSumar = new javax.swing.JButton();
        n8 = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbenter = new javax.swing.JButton();
        jbDescuento = new javax.swing.JButton();
        n0 = new javax.swing.JButton();
        jbEfectivo = new javax.swing.JButton();
        jbPunto = new javax.swing.JButton();
        n2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        n3 = new javax.swing.JButton();
        jtTotal = new javax.swing.JTextField();
        n1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
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

        setBorder(null);
        setTitle("Gestion Pedidos");
        setPreferredSize(new java.awt.Dimension(1100, 660));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Productos");

        n9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        n9.setText("9");
        n9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n9ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel2.setText("Monto");

        n4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        n4.setText("4");
        n4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n4ActionPerformed(evt);
            }
        });

        n5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        n5.setText("5");
        n5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n5ActionPerformed(evt);
            }
        });

        jbAnular.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbAnular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/ico pedido/anular_48.png"))); // NOI18N

        n6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        n6.setText("6");
        n6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n6ActionPerformed(evt);
            }
        });

        jbMenos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbMenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/ico pedido/menos_32.png"))); // NOI18N
        jbMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMenosActionPerformed(evt);
            }
        });

        n7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        n7.setText("7");
        n7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n7ActionPerformed(evt);
            }
        });

        jbSumar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbSumar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/ico pedido/mas1_48.png"))); // NOI18N
        jbSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSumarActionPerformed(evt);
            }
        });

        n8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        n8.setText("8");
        n8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n8ActionPerformed(evt);
            }
        });

        jbBorrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/ico pedido/borrar_48.png"))); // NOI18N

        jbenter.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbenter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/enter-5.png"))); // NOI18N
        jbenter.setMaximumSize(new java.awt.Dimension(40, 40));
        jbenter.setMinimumSize(new java.awt.Dimension(40, 40));
        jbenter.setPreferredSize(new java.awt.Dimension(40, 40));
        jbenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbenterActionPerformed(evt);
            }
        });

        jbDescuento.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbDescuento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/ico pedido/descuento2_48.png"))); // NOI18N
        jbDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDescuentoActionPerformed(evt);
            }
        });

        n0.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        n0.setText("0");
        n0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n0ActionPerformed(evt);
            }
        });

        jbEfectivo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbEfectivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/ico pedido/dinero_48.png"))); // NOI18N
        jbEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEfectivoActionPerformed(evt);
            }
        });

        jbPunto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbPunto.setText(".");
        jbPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPuntoActionPerformed(evt);
            }
        });

        n2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        n2.setText("2");
        n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel1.setText("Total");

        n3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        n3.setText("3");
        n3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n3ActionPerformed(evt);
            }
        });

        n1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        n1.setText("1");
        n1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n1MouseClicked(evt);
            }
        });
        n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1ActionPerformed(evt);
            }
        });

        jtProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtProductos);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/ico pedido/anular_48.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pProductosLayout = new javax.swing.GroupLayout(pProductos);
        pProductos.setLayout(pProductosLayout);
        pProductosLayout.setHorizontalGroup(
            pProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pProductosLayout.createSequentialGroup()
                .addContainerGap(180, Short.MAX_VALUE)
                .addGroup(pProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pProductosLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pProductosLayout.createSequentialGroup()
                        .addGroup(pProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pProductosLayout.createSequentialGroup()
                                .addGroup(pProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pProductosLayout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel1))
                                    .addComponent(jtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)
                                .addGroup(pProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pProductosLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(pProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pProductosLayout.createSequentialGroup()
                                        .addGroup(pProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jbBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jbSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(pProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jbMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jbAnular, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(pProductosLayout.createSequentialGroup()
                                        .addComponent(jbDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(84, 84, 84)
                                .addGroup(pProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pProductosLayout.createSequentialGroup()
                                        .addGroup(pProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pProductosLayout.createSequentialGroup()
                                                .addComponent(n1)
                                                .addGap(18, 18, 18)
                                                .addComponent(n2)
                                                .addGap(18, 18, 18)
                                                .addComponent(n3))
                                            .addGroup(pProductosLayout.createSequentialGroup()
                                                .addComponent(n4)
                                                .addGap(18, 18, 18)
                                                .addComponent(n5)
                                                .addGap(18, 18, 18)
                                                .addComponent(n6)))
                                        .addGap(18, 18, 18)
                                        .addGroup(pProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jbPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(n0, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(pProductosLayout.createSequentialGroup()
                                        .addComponent(n7)
                                        .addGap(18, 18, 18)
                                        .addComponent(n8)
                                        .addGap(18, 18, 18)
                                        .addComponent(n9)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(76, 76, 76))))
            .addComponent(jScrollPane1)
        );
        pProductosLayout.setVerticalGroup(
            pProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pProductosLayout.createSequentialGroup()
                .addGroup(pProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pProductosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(pProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(12, 12, 12)
                .addGroup(pProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pProductosLayout.createSequentialGroup()
                        .addGroup(pProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbAnular, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbMenos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbSumar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pProductosLayout.createSequentialGroup()
                        .addGroup(pProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(n1)
                                .addComponent(n2))
                            .addGroup(pProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(n3)
                                .addComponent(jbPunto)))
                        .addGap(18, 18, 18)
                        .addGroup(pProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(n0)
                            .addComponent(n4)
                            .addComponent(n5)
                            .addComponent(n6))))
                .addGroup(pProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pProductosLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(pProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(n7)
                                .addComponent(n8)
                                .addComponent(n9))
                            .addComponent(jbenter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pProductosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jbDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
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
                        .addComponent(jlMesa12, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(jlMesa20, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlMesa21, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlMesa22, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlMesa23, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlMesa24, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlMesa25, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlMesa26, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlMesa27, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlMesa28, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(188, 188, 188)
                .addComponent(pProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlMesa2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMesa3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMesa4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlMesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(jlMesa25, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlMesa26, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlMesa27, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlMesa28, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1ActionPerformed

        jtMonto.setText(jtMonto.getText()+"1");
    }//GEN-LAST:event_n1ActionPerformed

    private void n4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n4ActionPerformed
        
        jtMonto.setText(jtMonto.getText()+"4");

    }//GEN-LAST:event_n4ActionPerformed

    private void n7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n7ActionPerformed

        jtMonto.setText(jtMonto.getText()+"7");
    }//GEN-LAST:event_n7ActionPerformed

    private void n6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n6ActionPerformed

        jtMonto.setText(jtMonto.getText()+"6");
    }//GEN-LAST:event_n6ActionPerformed

    private void jbenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbenterActionPerformed

        
    }//GEN-LAST:event_jbenterActionPerformed

    private void n0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n0ActionPerformed

        jtMonto.setText(jtMonto.getText()+"0");
    }//GEN-LAST:event_n0ActionPerformed

    private void jbMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMenosActionPerformed

    }//GEN-LAST:event_jbMenosActionPerformed

    private void jbSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSumarActionPerformed

    }//GEN-LAST:event_jbSumarActionPerformed

    private void jbDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDescuentoActionPerformed

    }//GEN-LAST:event_jbDescuentoActionPerformed

    private void jbEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEfectivoActionPerformed

    }//GEN-LAST:event_jbEfectivoActionPerformed

    private void jlMesa1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMesa1MouseClicked
         mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){

            jlMesa1.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa2= new Mesa();

        } else{

            jlMesa1.setIcon(icoV); // Cambia el color al libre

        }
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

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void n1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_n1MouseClicked

    private void n5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n5ActionPerformed

        jtMonto.setText(jtMonto.getText()+"5");
    }//GEN-LAST:event_n5ActionPerformed

    private void jbPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPuntoActionPerformed

        jtMonto.setText(jtMonto.getText()+".");
    }//GEN-LAST:event_jbPuntoActionPerformed

    private void n8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n8ActionPerformed

        jtMonto.setText(jtMonto.getText()+"8");
    }//GEN-LAST:event_n8ActionPerformed

    private void n9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n9ActionPerformed

        jtMonto.setText(jtMonto.getText()+"9");
    }//GEN-LAST:event_n9ActionPerformed

    private void n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n2ActionPerformed

        jtMonto.setText(jtMonto.getText()+"2");
    }//GEN-LAST:event_n2ActionPerformed

    private void n3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n3ActionPerformed

        jtMonto.setText(jtMonto.getText()+"3");
    }//GEN-LAST:event_n3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAnular;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbDescuento;
    private javax.swing.JButton jbEfectivo;
    private javax.swing.JButton jbMenos;
    private javax.swing.JButton jbPunto;
    private javax.swing.JButton jbSumar;
    private javax.swing.JButton jbenter;
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
    private javax.swing.JTextField jtMonto;
    private javax.swing.JTable jtProductos;
    private javax.swing.JTextField jtTotal;
    private javax.swing.JButton n0;
    private javax.swing.JButton n1;
    private javax.swing.JButton n2;
    private javax.swing.JButton n3;
    private javax.swing.JButton n4;
    private javax.swing.JButton n5;
    private javax.swing.JButton n6;
    private javax.swing.JButton n7;
    private javax.swing.JButton n8;
    private javax.swing.JButton n9;
    private javax.swing.JPanel pProductos;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera(){
        modelo.addColumn("IdProducto");
        modelo.addColumn("Nombre");
        modelo.addColumn("Feche y Hora");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");
        jtProductos.setModel(modelo);
        
        
    }

    private void cargarLista(){

        }
        
}
