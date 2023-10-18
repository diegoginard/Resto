
package Vistas;

import BaseDatos.Conexion;
import BaseDatos.MesaData;
import Entidades.Mesa;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.*;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class GestionRestaurante extends javax.swing.JFrame {

    private Connection con = null;
  
        Icon icoR = new ImageIcon(getClass().getResource("/Recursos/mesa-rojo.png"));
    Icon icoV = new ImageIcon(getClass().getResource("/Recursos/mesa-verde.png"));
    Icon icoG = new ImageIcon(getClass().getResource("/Recursos/mesa-gris.png"));
            MesaData md = new MesaData();
    List<Mesa> mesas = md.listarMesas();
    Mesa mes = new Mesa();
        private boolean mesaOcupada = false;
    
    
    
    public GestionRestaurante() {
        
        initComponents();
        con = Conexion.getConexion();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Recursos/meal_500px.png")).getImage());
        //setIconImage(new ImageIcon(getClass().getResource("/universidadejemplo/Recursos/colegio.png")).getImage());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ImageIcon icono = new ImageIcon(getClass().getResource("/Recursos/resto.jpg"));
        Image imagen = icono.getImage();
        escritorio = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){

                g.drawImage(imagen,0,0,getWidth(),getHeight(),this);

            }

        };
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
        mesa23 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        escritorio.setName(""); // NOI18N
        escritorio.setPreferredSize(new java.awt.Dimension(1200, 680));

        mesa9.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa9.setText("9");
        mesa9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa9MouseClicked(evt);
            }
        });

        mesa29.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa29.setText("29");
        mesa29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa29MouseClicked(evt);
            }
        });

        mesa3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa3.setText("3");
        mesa3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa3MouseClicked(evt);
            }
        });

        mesa8.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa8.setText("8");
        mesa8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa8MouseClicked(evt);
            }
        });

        mesa22.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa22.setText("22");
        mesa22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa22MouseClicked(evt);
            }
        });

        mesa24.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa24.setText("24");
        mesa24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa24MouseClicked(evt);
            }
        });

        mesa6.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa6.setText("6");
        mesa6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa6MouseClicked(evt);
            }
        });

        mesa20.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa20.setText("20");
        mesa20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa20MouseClicked(evt);
            }
        });

        mesa30.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa30.setText("30");
        mesa30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa30MouseClicked(evt);
            }
        });

        mesa2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa2.setText("2");
        mesa2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa2MouseClicked(evt);
            }
        });

        mesa21.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa21.setText("21");
        mesa21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa21MouseClicked(evt);
            }
        });

        mesa14.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa14.setText("14");
        mesa14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa14MouseClicked(evt);
            }
        });

        mesa13.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa13.setText("13");
        mesa13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa13MouseClicked(evt);
            }
        });

        mesa27.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa27.setText("27");
        mesa27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa27MouseClicked(evt);
            }
        });

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

        mesa7.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa7.setText("7");
        mesa7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa7MouseClicked(evt);
            }
        });

        mesa26.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa26.setText("26");
        mesa26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa26MouseClicked(evt);
            }
        });

        mesa16.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa16.setText("16");
        mesa16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa16MouseClicked(evt);
            }
        });

        mesa28.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa28.setText("28");
        mesa28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa28MouseClicked(evt);
            }
        });

        mesa25.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa25.setText("25");
        mesa25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa25MouseClicked(evt);
            }
        });

        mesa4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa4.setText("4");
        mesa4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa4MouseClicked(evt);
            }
        });

        mesa11.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa11.setText("11");
        mesa11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa11MouseClicked(evt);
            }
        });

        mesa18.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa18.setText("18");
        mesa18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa18MouseClicked(evt);
            }
        });

        mesa19.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa19.setText("19");
        mesa19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa19MouseClicked(evt);
            }
        });

        mesa10.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa10.setText("10");
        mesa10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa10MouseClicked(evt);
            }
        });

        mesa17.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa17.setText("17");
        mesa17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa17MouseClicked(evt);
            }
        });

        mesa5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa5.setText("5");
        mesa5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa5MouseClicked(evt);
            }
        });

        mesa15.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa15.setText("15");
        mesa15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa15MouseClicked(evt);
            }
        });

        mesa12.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa12.setText("12");
        mesa12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa12MouseClicked(evt);
            }
        });

        mesa23.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa23.setText("23");
        mesa23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa23MouseClicked(evt);
            }
        });

        escritorio.setLayer(mesa9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(mesa29, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(mesa3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(mesa8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(mesa22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(mesa24, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(mesa6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(mesa20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(mesa30, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(mesa2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(mesa21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(mesa14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(mesa13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(mesa27, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(mesa1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(mesa7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(mesa26, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(mesa16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(mesa28, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(mesa25, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(mesa4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(mesa11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(mesa18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(mesa19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(mesa10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(mesa17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(mesa5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(mesa15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(mesa12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(mesa23, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addComponent(mesa1)
                        .addGap(50, 50, 50)
                        .addComponent(mesa2)
                        .addGap(60, 60, 60)
                        .addComponent(mesa3)
                        .addGap(50, 50, 50)
                        .addComponent(mesa4)
                        .addGap(70, 70, 70)
                        .addComponent(mesa5)
                        .addGap(50, 50, 50)
                        .addComponent(mesa6))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addComponent(mesa7)
                        .addGap(50, 50, 50)
                        .addComponent(mesa8)
                        .addGap(60, 60, 60)
                        .addComponent(mesa9)
                        .addGap(50, 50, 50)
                        .addComponent(mesa10)
                        .addGap(70, 70, 70)
                        .addComponent(mesa11)
                        .addGap(50, 50, 50)
                        .addComponent(mesa12))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addComponent(mesa13)
                        .addGap(50, 50, 50)
                        .addComponent(mesa14)
                        .addGap(60, 60, 60)
                        .addComponent(mesa15)
                        .addGap(50, 50, 50)
                        .addComponent(mesa16)
                        .addGap(70, 70, 70)
                        .addComponent(mesa17)
                        .addGap(50, 50, 50)
                        .addComponent(mesa18))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addComponent(mesa19)
                        .addGap(50, 50, 50)
                        .addComponent(mesa20)
                        .addGap(50, 50, 50)
                        .addComponent(mesa21)
                        .addGap(60, 60, 60)
                        .addComponent(mesa22)
                        .addGap(70, 70, 70)
                        .addComponent(mesa23)
                        .addGap(50, 50, 50)
                        .addComponent(mesa24))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addComponent(mesa25)
                        .addGap(50, 50, 50)
                        .addComponent(mesa26)
                        .addGap(60, 60, 60)
                        .addComponent(mesa27)
                        .addGap(50, 50, 50)
                        .addComponent(mesa28)
                        .addGap(70, 70, 70)
                        .addComponent(mesa29)
                        .addGap(50, 50, 50)
                        .addComponent(mesa30)))
                .addContainerGap(523, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addContainerGap(171, Short.MAX_VALUE)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mesa1)
                    .addComponent(mesa2)
                    .addComponent(mesa3)
                    .addComponent(mesa4)
                    .addComponent(mesa5)
                    .addComponent(mesa6))
                .addGap(18, 18, 18)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mesa7)
                    .addComponent(mesa8)
                    .addComponent(mesa9)
                    .addComponent(mesa10)
                    .addComponent(mesa11)
                    .addComponent(mesa12))
                .addGap(8, 8, 8)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mesa15)
                    .addComponent(mesa16)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mesa13)
                            .addComponent(mesa14)
                            .addComponent(mesa17)
                            .addComponent(mesa18))))
                .addGap(18, 18, 18)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mesa19)
                    .addComponent(mesa20)
                    .addComponent(mesa21)
                    .addComponent(mesa22)
                    .addComponent(mesa23)
                    .addComponent(mesa24))
                .addGap(18, 18, 18)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mesa25)
                    .addComponent(mesa26)
                    .addComponent(mesa27)
                    .addComponent(mesa28)
                    .addComponent(mesa29)
                    .addComponent(mesa30))
                .addGap(127, 127, 127))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jMenu1.setText("Gestor Restaurante");

        jMenuItem1.setText("Pedidos");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Productos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Adminitrar Pedidos");

        jMenuItem3.setText("Administra salon");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       
        escritorio.removeAll();
        escritorio.repaint();
        AdministraSalon as = new AdministraSalon();
        as.setVisible(true);
        escritorio.add(as);
        escritorio.moveToFront(as);
       
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        escritorio.removeAll();
        escritorio.repaint();
        AdministracionProductos ap = new AdministracionProductos();
        ap.setVisible(true);
        escritorio.add(ap);
        escritorio.moveToFront(ap);
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionRestaurante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
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
}
