
package Vistas;

import BaseDatos.Conexion;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.net.URL;
import java.sql.Connection;
import javax.swing.ImageIcon;


public class IniciarSalon extends javax.swing.JFrame {

    private Connection con = null;
    private Point initialClick;
    public String nombre;
    public String apellido;
       
    public IniciarSalon() {
        
        getIconImage();
        setUndecorated(true); // Oculta la decoración (barra de título)
        initComponents();
        con = Conexion.getConexion();
        this.setLocationRelativeTo(null);  
    }
    
    // Método para recibir el nombre y apellido
    public void recibirDatos(String nombre, String apellido) {
       
        this.nombre = nombre;
        this.apellido = apellido;
        jMusuario.setText("                                                                   " + nombre +"  "+ apellido); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        URL imageUrl = getClass().getResource("/Recursos/Inicio1.jpg");
        ImageIcon icono = new ImageIcon(imageUrl);
        Image imagen = icono.getImage();
        escritorio = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){

                g.drawImage(imagen,0,0,getWidth(),getHeight(),this);

            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jmMenu = new javax.swing.JMenu();
        jmMenuInicio = new javax.swing.JMenuItem();
        jMgestsal = new javax.swing.JMenu();
        jmPedidos = new javax.swing.JMenuItem();
        jmMesas = new javax.swing.JMenuItem();
        jmMenus = new javax.swing.JMenuItem();
        jMgestpers = new javax.swing.JMenu();
        jMmozos = new javax.swing.JMenuItem();
        jMusuarios = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenu();
        jMusuario = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        escritorio.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                initialClick = e.getPoint();
            }
        });

        escritorio.addMouseMotionListener(new MouseMotionAdapter() {

            public void mouseDragged(MouseEvent e) {

                int thisX = getLocation().x;
                int thisY = getLocation().y;

                int xMoved = (thisX + e.getX()) - (thisX + initialClick.x);
                int yMoved = (thisY + e.getY()) - (thisY + initialClick.y);

                int X = thisX + xMoved;
                int Y = thisY + yMoved;
                setLocation(X, Y);

            }
        });

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1008, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 664, Short.MAX_VALUE)
        );

        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        jmMenu.setText("Salon");

        jmMenuInicio.setText("Iniciar Salon");
        jmMenuInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmMenuInicioActionPerformed(evt);
            }
        });
        jmMenu.add(jmMenuInicio);

        jMenuBar1.add(jmMenu);

        jMgestsal.setText("Gestionar Salon");
        jMgestsal.setName("Mozos"); // NOI18N

        jmPedidos.setText("Lista de Pedidos");
        jmPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPedidosActionPerformed(evt);
            }
        });
        jMgestsal.add(jmPedidos);

        jmMesas.setText("Mesas");
        jmMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmMesasActionPerformed(evt);
            }
        });
        jMgestsal.add(jmMesas);

        jmMenus.setText("Menus");
        jmMenus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmMenusActionPerformed(evt);
            }
        });
        jMgestsal.add(jmMenus);

        jMenuBar1.add(jMgestsal);

        jMgestpers.setText("Gestionar Personal");

        jMmozos.setText("Mozos");
        jMmozos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMmozosActionPerformed(evt);
            }
        });
        jMgestpers.add(jMmozos);

        jMusuarios.setText("Usuarios");
        jMusuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMusuariosActionPerformed(evt);
            }
        });
        jMgestpers.add(jMusuarios);

        jMenuBar1.add(jMgestpers);

        jmSalir.setText("Salir");
        jmSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmSalir);

        jMusuario.setText("USUARIO");
        jMenuBar1.add(jMusuario);

        setJMenuBar(jMenuBar1);

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public Image getIconImage() {
        
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Recursos/hamburguesa.png"));
        return retValue;
    }
    
    private void jmMenuInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmMenuInicioActionPerformed
        
        restoView rv = new restoView();
        rv.setVisible(true);
        escritorio.add(rv);
        escritorio.moveToFront(rv);
        
    }//GEN-LAST:event_jmMenuInicioActionPerformed

    private void jmSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmSalirMouseClicked
        
        System.exit(0);      
    }//GEN-LAST:event_jmSalirMouseClicked

    private void jmMenusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmMenusActionPerformed

        AdministraMenus am = new AdministraMenus();
        am.setVisible(true);
        escritorio.add(am);
        escritorio.moveToFront(am);
    }//GEN-LAST:event_jmMenusActionPerformed

    private void jmMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmMesasActionPerformed

        AdministraMesas me = new AdministraMesas();
        me.setVisible(true);
        escritorio.add(me);
        escritorio.moveToFront(me);
    }//GEN-LAST:event_jmMesasActionPerformed

    private void jmPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPedidosActionPerformed

        ListarPedidos ll = new ListarPedidos();
        ll.setVisible(true);
        escritorio.add(ll);
        escritorio.moveToFront(ll);
    }//GEN-LAST:event_jmPedidosActionPerformed

    private void jMusuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMusuariosActionPerformed

        AdministrarUsuario admUsu = new AdministrarUsuario();
        admUsu.setVisible(true);
        escritorio.add(admUsu);
        escritorio.moveToFront(admUsu);
    }//GEN-LAST:event_jMusuariosActionPerformed

    private void jMmozosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMmozosActionPerformed

        AdministrarMozos admMozo = new AdministrarMozos();
        admMozo.setVisible(true);
        escritorio.add(admMozo);
        escritorio.moveToFront(admMozo);
    }//GEN-LAST:event_jMmozosActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new IniciarSalon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMgestpers;
    private javax.swing.JMenu jMgestsal;
    private javax.swing.JMenuItem jMmozos;
    private javax.swing.JMenu jMusuario;
    private javax.swing.JMenuItem jMusuarios;
    private javax.swing.JMenu jmMenu;
    private javax.swing.JMenuItem jmMenuInicio;
    private javax.swing.JMenuItem jmMenus;
    private javax.swing.JMenuItem jmMesas;
    private javax.swing.JMenuItem jmPedidos;
    private javax.swing.JMenu jmSalir;
    // End of variables declaration//GEN-END:variables
}
