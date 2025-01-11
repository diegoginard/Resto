
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
    List<Mesa> mesas = md.listarMesasLibres();
    Mesa mes = new Mesa();
    private boolean mesaOcupada = false;
    
       
    public AdministraSalon() {

        initComponents();
        mesa1.setIcon(icoG);
        List<Mesa> mesas = md.listarMesasLibres();
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
        mesa9 = new javax.swing.JLabel();
        mesa29 = new javax.swing.JLabel();
        mesa3 = new javax.swing.JLabel();
        mesa8 = new javax.swing.JLabel();
        mesa22 = new javax.swing.JLabel();
        mesa24 = new javax.swing.JLabel();
        mesa6 = new javax.swing.JLabel();
        mesa20 = new javax.swing.JLabel();
        mesa30 = new javax.swing.JLabel();
        mesa2 = new javax.swing.JLabel();
        mesa21 = new javax.swing.JLabel();
        mesa14 = new javax.swing.JLabel();
        mesa13 = new javax.swing.JLabel();
        mesa27 = new javax.swing.JLabel();
        mesa1 = new javax.swing.JLabel();
        mesa7 = new javax.swing.JLabel();
        mesa26 = new javax.swing.JLabel();
        mesa16 = new javax.swing.JLabel();
        mesa28 = new javax.swing.JLabel();
        mesa25 = new javax.swing.JLabel();
        mesa4 = new javax.swing.JLabel();
        mesa11 = new javax.swing.JLabel();
        mesa18 = new javax.swing.JLabel();
        mesa19 = new javax.swing.JLabel();
        mesa10 = new javax.swing.JLabel();
        mesa17 = new javax.swing.JLabel();
        mesa5 = new javax.swing.JLabel();
        mesa15 = new javax.swing.JLabel();
        mesa12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtListaMesas = new javax.swing.JTable();
        mesa23 = new javax.swing.JLabel();
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

        mesa9.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa9.setText("9");
        mesa9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa9MouseClicked(evt);
            }
        });
        jPanel1.add(mesa9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 560, -1, -1));

        mesa29.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa29.setText("29");
        mesa29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa29MouseClicked(evt);
            }
        });
        jPanel1.add(mesa29, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 800, -1, -1));

        mesa3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa3.setText("3");
        mesa3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa3MouseClicked(evt);
            }
        });
        jPanel1.add(mesa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, -1, -1));

        mesa8.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa8.setText("8");
        mesa8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa8MouseClicked(evt);
            }
        });
        jPanel1.add(mesa8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 560, -1, -1));

        mesa22.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa22.setText("22");
        mesa22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa22MouseClicked(evt);
            }
        });
        jPanel1.add(mesa22, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 720, -1, -1));

        mesa24.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa24.setText("24");
        mesa24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa24MouseClicked(evt);
            }
        });
        jPanel1.add(mesa24, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 720, -1, -1));

        mesa6.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa6.setText("6");
        mesa6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa6MouseClicked(evt);
            }
        });
        jPanel1.add(mesa6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 480, -1, -1));

        mesa20.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa20.setText("20");
        mesa20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa20MouseClicked(evt);
            }
        });
        jPanel1.add(mesa20, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 720, -1, -1));

        mesa30.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa30.setText("30");
        mesa30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa30MouseClicked(evt);
            }
        });
        jPanel1.add(mesa30, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 800, -1, -1));

        mesa2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa2.setText("2");
        mesa2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa2MouseClicked(evt);
            }
        });
        jPanel1.add(mesa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, -1, -1));

        mesa21.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa21.setText("21");
        mesa21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa21MouseClicked(evt);
            }
        });
        jPanel1.add(mesa21, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 720, -1, -1));

        mesa14.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa14.setText("14");
        mesa14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa14MouseClicked(evt);
            }
        });
        jPanel1.add(mesa14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 640, -1, -1));

        mesa13.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa13.setText("13");
        mesa13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa13MouseClicked(evt);
            }
        });
        jPanel1.add(mesa13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, -1, -1));

        mesa27.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa27.setText("27");
        mesa27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa27MouseClicked(evt);
            }
        });
        jPanel1.add(mesa27, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 800, -1, -1));

        mesa1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa1.setText("1");
        mesa1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa1.setOpaque(true);
        mesa1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa1MouseClicked(evt);
            }
        });
        jPanel1.add(mesa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));

        mesa7.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa7.setText("7");
        mesa7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa7MouseClicked(evt);
            }
        });
        jPanel1.add(mesa7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, -1, -1));

        mesa26.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa26.setText("26");
        mesa26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa26MouseClicked(evt);
            }
        });
        jPanel1.add(mesa26, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 800, -1, -1));

        mesa16.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa16.setText("16");
        mesa16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa16MouseClicked(evt);
            }
        });
        jPanel1.add(mesa16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 630, -1, -1));

        mesa28.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa28.setText("28");
        mesa28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa28MouseClicked(evt);
            }
        });
        jPanel1.add(mesa28, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 800, -1, -1));

        mesa25.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa25.setText("25");
        mesa25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa25MouseClicked(evt);
            }
        });
        jPanel1.add(mesa25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 800, -1, -1));

        mesa4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa4.setText("4");
        mesa4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa4MouseClicked(evt);
            }
        });
        jPanel1.add(mesa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, -1, -1));

        mesa11.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa11.setText("11");
        mesa11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa11MouseClicked(evt);
            }
        });
        jPanel1.add(mesa11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 560, -1, -1));

        mesa18.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa18.setText("18");
        mesa18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa18MouseClicked(evt);
            }
        });
        jPanel1.add(mesa18, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 640, -1, -1));

        mesa19.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa19.setText("19");
        mesa19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa19MouseClicked(evt);
            }
        });
        jPanel1.add(mesa19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 720, -1, -1));

        mesa10.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa10.setText("10");
        mesa10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa10MouseClicked(evt);
            }
        });
        jPanel1.add(mesa10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 560, -1, -1));

        mesa17.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa17.setText("17");
        mesa17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa17MouseClicked(evt);
            }
        });
        jPanel1.add(mesa17, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 640, -1, -1));

        mesa5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa5.setText("5");
        mesa5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa5MouseClicked(evt);
            }
        });
        jPanel1.add(mesa5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, -1, -1));

        mesa15.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa15.setText("15");
        mesa15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa15MouseClicked(evt);
            }
        });
        jPanel1.add(mesa15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 630, -1, -1));

        mesa12.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa12.setText("12");
        mesa12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa12MouseClicked(evt);
            }
        });
        jPanel1.add(mesa12, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 560, -1, -1));

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

        mesa23.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa23.setText("23");
        mesa23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa23MouseClicked(evt);
            }
        });
        jPanel1.add(mesa23, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 720, -1, -1));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
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

    private void mesa1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesa1MouseClicked
        
        
        
        
        // Cambia el estado de la mesa
        mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){
              
            mesa1.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa1 = new Mesa();
    
        } else{
                
            mesa1.setIcon(icoG); // Cambia el color al libre
            
        }
    }//GEN-LAST:event_mesa1MouseClicked

    private void mesa2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesa2MouseClicked
                // Cambia el estado de la mesa
        mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){
              
            mesa2.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa2 = new Mesa();
   
        } else{
                
            mesa2.setIcon(icoG); // Cambia el color al libre
            
        }
    }//GEN-LAST:event_mesa2MouseClicked

    private void mesa3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesa3MouseClicked
        // Cambia el estado de la mesa
        mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){
              
            mesa3.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa3= new Mesa();
  
        } else{
                
            mesa3.setIcon(icoG); // Cambia el color al libre
            
        }
    }//GEN-LAST:event_mesa3MouseClicked

    private void mesa4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesa4MouseClicked
        
        // Cambia el estado de la mesa
        mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){
              
            mesa4.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa4= new Mesa();
 
        } else{
                
            mesa4.setIcon(icoG); // Cambia el color al libre
            
        }
    }//GEN-LAST:event_mesa4MouseClicked

    private void mesa5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesa5MouseClicked

        mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){
              
            mesa5.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa5= new Mesa();
 
        } else{
                
            mesa5.setIcon(icoG); // Cambia el color al libre
            
        }
    }//GEN-LAST:event_mesa5MouseClicked

    private void mesa6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesa6MouseClicked
        // TODO add your handling code here:
                mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){
              
            mesa6.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa6= new Mesa();
 
        } else{
                
            mesa6.setIcon(icoG); // Cambia el color al libre
            
        }
        
        
        
        
    }//GEN-LAST:event_mesa6MouseClicked

    private void mesa7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesa7MouseClicked
                mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){
              
            mesa7.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa7= new Mesa();
 
        } else{
                
            mesa7.setIcon(icoG); // Cambia el color al libre
            
        }
    }//GEN-LAST:event_mesa7MouseClicked

    private void mesa8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesa8MouseClicked
                mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){
              
            mesa8.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa8= new Mesa();
 
        } else{
                
            mesa8.setIcon(icoG); // Cambia el color al libre
            
        }
    }//GEN-LAST:event_mesa8MouseClicked

    private void mesa9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesa9MouseClicked
                mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){
              
            mesa9.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa9= new Mesa();
 
        } else{
                
            mesa9.setIcon(icoG); // Cambia el color al libre
            
        }
    }//GEN-LAST:event_mesa9MouseClicked

    private void mesa10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesa10MouseClicked
             mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){
              
            mesa10.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa10Mesa= new Mesa();
 
        } else{
                
            mesa10.setIcon(icoG); // Cambia el color al libre
            
        }
    }//GEN-LAST:event_mesa10MouseClicked

    private void mesa11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesa11MouseClicked
          mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){
              
            mesa11.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa11= new Mesa();
 
        } else{
                
            mesa11.setIcon(icoG); // Cambia el color al libre
            
        }
    }//GEN-LAST:event_mesa11MouseClicked

    private void mesa12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesa12MouseClicked
                mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){
              
            mesa12.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa12= new Mesa();
 
        } else{
                
            mesa12.setIcon(icoG); // Cambia el color al libre
            
        }
    }//GEN-LAST:event_mesa12MouseClicked

    private void mesa13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesa13MouseClicked
                mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){
              
            mesa13.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa13= new Mesa();
 
        } else{
                
            mesa13.setIcon(icoG); // Cambia el color al libre
            
        }
    }//GEN-LAST:event_mesa13MouseClicked

    private void mesa14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesa14MouseClicked
                mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){
              
            mesa14.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa14= new Mesa();
 
        } else{
                
            mesa14.setIcon(icoG); // Cambia el color al libre
            
        }
    }//GEN-LAST:event_mesa14MouseClicked

    private void mesa15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesa15MouseClicked
                mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){
              
            mesa15.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa15= new Mesa();
 
        } else{
                
            mesa15.setIcon(icoG); // Cambia el color al libre
            
        }
    }//GEN-LAST:event_mesa15MouseClicked

    private void mesa16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesa16MouseClicked
                mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){
              
            mesa16.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa16= new Mesa();
 
        } else{
                
            mesa16.setIcon(icoG); // Cambia el color al libre
            
        }
    }//GEN-LAST:event_mesa16MouseClicked

    private void mesa17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesa17MouseClicked
                mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){
              
            mesa17.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa17= new Mesa();
 
        } else{
                
            mesa17.setIcon(icoG); // Cambia el color al libre
            
        }
    }//GEN-LAST:event_mesa17MouseClicked

    private void mesa18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesa18MouseClicked
                mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){
              
            mesa18.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa18= new Mesa();
 
        } else{
                
            mesa18.setIcon(icoG); // Cambia el color al libre
            
        }
    }//GEN-LAST:event_mesa18MouseClicked

    private void mesa19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesa19MouseClicked
              mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){
              
            mesa19.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa19= new Mesa();
 
        } else{
                
            mesa19.setIcon(icoG); // Cambia el color al libre
            
        }
    }//GEN-LAST:event_mesa19MouseClicked

    private void mesa20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesa20MouseClicked
                mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){
              
            mesa20.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa20= new Mesa();
 
        } else{
                
            mesa20.setIcon(icoG); // Cambia el color al libre
            
        }
    }//GEN-LAST:event_mesa20MouseClicked

    private void mesa21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesa21MouseClicked
                mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){
              
            mesa21.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa21= new Mesa();
 
        } else{
                
            mesa21.setIcon(icoG); // Cambia el color al libre
            
        }
    }//GEN-LAST:event_mesa21MouseClicked

    private void mesa22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesa22MouseClicked
               mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){
              
            mesa22.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa22= new Mesa();
 
        } else{
                
            mesa22.setIcon(icoG); // Cambia el color al libre
            
        }
    }//GEN-LAST:event_mesa22MouseClicked

    private void mesa23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesa23MouseClicked
                mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){
              
            mesa23.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa23= new Mesa();
 
        } else{
                
            mesa23.setIcon(icoG); // Cambia el color al libre
            
        }
    }//GEN-LAST:event_mesa23MouseClicked

    private void mesa24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesa24MouseClicked
                mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){
              
            mesa24.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa24= new Mesa();
 
        } else{
                
            mesa24.setIcon(icoG); // Cambia el color al libre
            
        }
    }//GEN-LAST:event_mesa24MouseClicked

    private void mesa25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesa25MouseClicked
                mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){
              
            mesa25.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa25= new Mesa();
 
        } else{
                
            mesa25.setIcon(icoG); // Cambia el color al libre
            
        }
    }//GEN-LAST:event_mesa25MouseClicked

    private void mesa26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesa26MouseClicked
                mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){
              
            mesa26.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa26= new Mesa();
 
        } else{
                
            mesa26.setIcon(icoG); // Cambia el color al libre
            
        }
    }//GEN-LAST:event_mesa26MouseClicked

    private void mesa27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesa27MouseClicked
                mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){
              
            mesa27.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa27= new Mesa();
 
        } else{
                
            mesa27.setIcon(icoG); // Cambia el color al libre
            
        }
    }//GEN-LAST:event_mesa27MouseClicked

    private void mesa28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesa28MouseClicked
                mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){
              
            mesa28.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa28= new Mesa();
 
        } else{
                
            mesa28.setIcon(icoG); // Cambia el color al libre
            
        }
    }//GEN-LAST:event_mesa28MouseClicked

    private void mesa29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesa29MouseClicked
                mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){
              
            mesa29.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa29= new Mesa();
 
        } else{
                
            mesa29.setIcon(icoG); // Cambia el color al libre
            
        }
    }//GEN-LAST:event_mesa29MouseClicked

    private void mesa30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesa30MouseClicked
               mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){
              
            mesa30.setIcon(icoR); // Cambia el color al ocupado
            Mesa mesa30= new Mesa();
 
        } else{
                
            mesa30.setIcon(icoG); // Cambia el color al libre
            
        }
    }//GEN-LAST:event_mesa30MouseClicked

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
    private javax.swing.JLabel mesa1;
    private javax.swing.JLabel mesa10;
    private javax.swing.JLabel mesa11;
    private javax.swing.JLabel mesa12;
    private javax.swing.JLabel mesa13;
    private javax.swing.JLabel mesa14;
    private javax.swing.JLabel mesa15;
    private javax.swing.JLabel mesa16;
    private javax.swing.JLabel mesa17;
    private javax.swing.JLabel mesa18;
    private javax.swing.JLabel mesa19;
    private javax.swing.JLabel mesa2;
    private javax.swing.JLabel mesa20;
    private javax.swing.JLabel mesa21;
    private javax.swing.JLabel mesa22;
    private javax.swing.JLabel mesa23;
    private javax.swing.JLabel mesa24;
    private javax.swing.JLabel mesa25;
    private javax.swing.JLabel mesa26;
    private javax.swing.JLabel mesa27;
    private javax.swing.JLabel mesa28;
    private javax.swing.JLabel mesa29;
    private javax.swing.JLabel mesa3;
    private javax.swing.JLabel mesa30;
    private javax.swing.JLabel mesa4;
    private javax.swing.JLabel mesa5;
    private javax.swing.JLabel mesa6;
    private javax.swing.JLabel mesa7;
    private javax.swing.JLabel mesa8;
    private javax.swing.JLabel mesa9;
    // End of variables declaration//GEN-END:variables

    private void cargarLista() {

        List<Mesa> mesas = md.listarTodasLasMesas();
        modelo.setRowCount(0);

        for (Mesa me : mesas) {

            modelo.addRow(new Object[]{me.getIdMesa(),
                me.getNumero(), me.getEstadoMesa(), me.getCapacidad(), me.isActivo()});

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
