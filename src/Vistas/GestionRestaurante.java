
package Vistas;

import BaseDatos.Conexion;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import javax.swing.ImageIcon;

public class GestionRestaurante extends javax.swing.JFrame {
    
    private Connection con = null;
    
    public GestionRestaurante() {
        
        initComponents();
        con = Conexion.getConexion();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        ImageIcon icono = new ImageIcon(getClass().getResource("/Recursos/resto.jpg"));
        Image imagen = icono.getImage();
        escritorio = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){

                g.drawImage(imagen,0,0,getWidth(),getHeight(),this);

            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmPedidos = new javax.swing.JMenuItem();
        jmMesas = new javax.swing.JMenuItem();
        jmMenus = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 680));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1024, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
        );

        jMenu1.setText("Salon");

        jMenuItem1.setText("Iniciar");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Gestionar");

        jmPedidos.setText("Pedidos");
        jMenu2.add(jmPedidos);

        jmMesas.setText("Mesas");
        jmMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmMesasActionPerformed(evt);
            }
        });
        jMenu2.add(jmMesas);

        jmMenus.setText("Menus");
        jmMenus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmMenusActionPerformed(evt);
            }
        });
        jMenu2.add(jmMenus);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Salir");
        jMenuBar1.add(jMenu3);

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

    private void jmMenusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmMenusActionPerformed
        
        escritorio.removeAll();
        escritorio.repaint();
        AdministraMenus am = new AdministraMenus();
        am.setVisible(true);
        escritorio.add(am);
        escritorio.moveToFront(am);
        
    }//GEN-LAST:event_jmMenusActionPerformed

    private void jmMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmMesasActionPerformed
        
        escritorio.removeAll();
        escritorio.repaint();
        AdministraMesas me = new AdministraMesas();
        me.setVisible(true);
        escritorio.add(me);
        escritorio.moveToFront(me);
        
    }//GEN-LAST:event_jmMesasActionPerformed

   
    public static void main(String args[]) {
       
        
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
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jmMenus;
    private javax.swing.JMenuItem jmMesas;
    private javax.swing.JMenuItem jmPedidos;
    // End of variables declaration//GEN-END:variables
}
