
package Vistas;

import Entidades.Mesa;
import java.util.*;
import javax.swing.*;

public class AdministraSalon extends javax.swing.JInternalFrame {
    
    Icon icoG = new ImageIcon(getClass().getResource("/Recursos/mesa-gris.png"));
    Icon ico = new ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"));
    List <Mesa> mesas = new ArrayList();
    
    public AdministraSalon(){
        
        initComponents();
        mesa1.setIcon(icoG);
    }
   
    private boolean mesaOcupada = false;

    
    public ArrayList<JLabel> ListaMesaSalon(){
        
        ArrayList<JLabel> me = new ArrayList<>();
        
        me.add(mesa1);
        me.add(mesa2);
        me.add(mesa3);
        me.add(mesa4);
        me.add(mesa5);
        me.add(mesa6);
        me.add(mesa7);
        me.add(mesa8);  
        me.add(mesa9);  
        me.add(mesa10);  
        me.add(mesa11);
        me.add(mesa12);
        me.add(mesa13);
        me.add(mesa14);
        me.add(mesa15);
        me.add(mesa16);
        me.add(mesa17);
        me.add(mesa18);  
        me.add(mesa19);  
        me.add(mesa20);  
        me.add(mesa21);
        me.add(mesa22);
        me.add(mesa23);
        me.add(mesa24);
        me.add(mesa25);
        me.add(mesa26);
        me.add(mesa27);
        me.add(mesa28);  
        me.add(mesa29);  
        me.add(mesa30);  
        
        return me;
    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mesa1 = new javax.swing.JLabel();
        mesa2 = new javax.swing.JLabel();
        mesa3 = new javax.swing.JLabel();
        mesa4 = new javax.swing.JLabel();
        mesa5 = new javax.swing.JLabel();
        mesa6 = new javax.swing.JLabel();
        mesa7 = new javax.swing.JLabel();
        mesa8 = new javax.swing.JLabel();
        mesa9 = new javax.swing.JLabel();
        mesa10 = new javax.swing.JLabel();
        mesa11 = new javax.swing.JLabel();
        mesa12 = new javax.swing.JLabel();
        mesa13 = new javax.swing.JLabel();
        mesa14 = new javax.swing.JLabel();
        mesa15 = new javax.swing.JLabel();
        mesa16 = new javax.swing.JLabel();
        mesa17 = new javax.swing.JLabel();
        mesa18 = new javax.swing.JLabel();
        mesa19 = new javax.swing.JLabel();
        mesa20 = new javax.swing.JLabel();
        mesa21 = new javax.swing.JLabel();
        mesa22 = new javax.swing.JLabel();
        mesa23 = new javax.swing.JLabel();
        mesa24 = new javax.swing.JLabel();
        mesa25 = new javax.swing.JLabel();
        mesa26 = new javax.swing.JLabel();
        mesa27 = new javax.swing.JLabel();
        mesa28 = new javax.swing.JLabel();
        mesa29 = new javax.swing.JLabel();
        mesa30 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Administra Salon");
        setPreferredSize(new java.awt.Dimension(670, 600));
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });

        mesa1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa1.setForeground(new java.awt.Color(0, 0, 0));
        mesa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa1.setText("1");
        mesa1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa1MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                mesa1MouseReleased(evt);
            }
        });
        mesa1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mesa1KeyReleased(evt);
            }
        });

        mesa2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa2.setForeground(new java.awt.Color(0, 0, 0));
        mesa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa2.setText("2");
        mesa2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        mesa3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa3.setForeground(new java.awt.Color(0, 0, 0));
        mesa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa3.setText("3");
        mesa3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        mesa4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa4.setForeground(new java.awt.Color(0, 0, 0));
        mesa4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa4.setText("4");
        mesa4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        mesa5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa5.setForeground(new java.awt.Color(0, 0, 0));
        mesa5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa5.setText("5");
        mesa5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        mesa6.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa6.setForeground(new java.awt.Color(0, 0, 0));
        mesa6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa6.setText("6");
        mesa6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        mesa7.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa7.setForeground(new java.awt.Color(0, 0, 0));
        mesa7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa7.setText("7");
        mesa7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        mesa8.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa8.setForeground(new java.awt.Color(0, 0, 0));
        mesa8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa8.setText("8");
        mesa8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        mesa9.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa9.setForeground(new java.awt.Color(0, 0, 0));
        mesa9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa9.setText("9");
        mesa9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        mesa10.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa10.setForeground(new java.awt.Color(0, 0, 0));
        mesa10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa10.setText("10");
        mesa10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        mesa11.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa11.setForeground(new java.awt.Color(0, 0, 0));
        mesa11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa11.setText("11");
        mesa11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        mesa12.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa12.setForeground(new java.awt.Color(0, 0, 0));
        mesa12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa12.setText("12");
        mesa12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        mesa13.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa13.setForeground(new java.awt.Color(0, 0, 0));
        mesa13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa13.setText("13");
        mesa13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        mesa14.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa14.setForeground(new java.awt.Color(0, 0, 0));
        mesa14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa14.setText("14");
        mesa14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        mesa15.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa15.setForeground(new java.awt.Color(0, 0, 0));
        mesa15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa15.setText("15");
        mesa15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        mesa16.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa16.setForeground(new java.awt.Color(0, 0, 0));
        mesa16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa16.setText("16");
        mesa16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        mesa17.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa17.setForeground(new java.awt.Color(0, 0, 0));
        mesa17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa17.setText("17");
        mesa17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        mesa18.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa18.setForeground(new java.awt.Color(0, 0, 0));
        mesa18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa18.setText("18");
        mesa18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        mesa19.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa19.setForeground(new java.awt.Color(0, 0, 0));
        mesa19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa19.setText("19");
        mesa19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        mesa20.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa20.setForeground(new java.awt.Color(0, 0, 0));
        mesa20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa20.setText("20");
        mesa20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        mesa21.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa21.setForeground(new java.awt.Color(0, 0, 0));
        mesa21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa21.setText("21");
        mesa21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        mesa22.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa22.setForeground(new java.awt.Color(0, 0, 0));
        mesa22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa22.setText("22");
        mesa22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        mesa23.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa23.setForeground(new java.awt.Color(0, 0, 0));
        mesa23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa23.setText("23");
        mesa23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        mesa24.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa24.setForeground(new java.awt.Color(0, 0, 0));
        mesa24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa24.setText("24");
        mesa24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        mesa25.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa25.setForeground(new java.awt.Color(0, 0, 0));
        mesa25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa25.setText("25");
        mesa25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        mesa26.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa26.setForeground(new java.awt.Color(0, 0, 0));
        mesa26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa26.setText("26");
        mesa26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        mesa27.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa27.setForeground(new java.awt.Color(0, 0, 0));
        mesa27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa27.setText("27");
        mesa27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        mesa28.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa28.setForeground(new java.awt.Color(0, 0, 0));
        mesa28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa28.setText("28");
        mesa28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        mesa29.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa29.setForeground(new java.awt.Color(0, 0, 0));
        mesa29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa29.setText("29");
        mesa29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        mesa30.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa30.setForeground(new java.awt.Color(0, 0, 0));
        mesa30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa30.setText("30");
        mesa30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(277, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mesa25)
                        .addGap(49, 49, 49)
                        .addComponent(mesa26)
                        .addGap(58, 58, 58)
                        .addComponent(mesa27)
                        .addGap(59, 59, 59)
                        .addComponent(mesa28)
                        .addGap(61, 61, 61)
                        .addComponent(mesa29)
                        .addGap(55, 55, 55)
                        .addComponent(mesa30))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mesa19)
                        .addGap(49, 49, 49)
                        .addComponent(mesa20)
                        .addGap(58, 58, 58)
                        .addComponent(mesa21)
                        .addGap(59, 59, 59)
                        .addComponent(mesa22)
                        .addGap(61, 61, 61)
                        .addComponent(mesa23)
                        .addGap(55, 55, 55)
                        .addComponent(mesa24))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(mesa13)
                            .addGap(49, 49, 49)
                            .addComponent(mesa14)
                            .addGap(58, 58, 58)
                            .addComponent(mesa15)
                            .addGap(59, 59, 59)
                            .addComponent(mesa16)
                            .addGap(61, 61, 61)
                            .addComponent(mesa17)
                            .addGap(55, 55, 55)
                            .addComponent(mesa18))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(mesa7)
                            .addGap(49, 49, 49)
                            .addComponent(mesa8)
                            .addGap(58, 58, 58)
                            .addComponent(mesa9)
                            .addGap(59, 59, 59)
                            .addComponent(mesa10)
                            .addGap(61, 61, 61)
                            .addComponent(mesa11)
                            .addGap(55, 55, 55)
                            .addComponent(mesa12))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(mesa1)
                            .addGap(49, 49, 49)
                            .addComponent(mesa2)
                            .addGap(58, 58, 58)
                            .addComponent(mesa3)
                            .addGap(59, 59, 59)
                            .addComponent(mesa4)
                            .addGap(61, 61, 61)
                            .addComponent(mesa5)
                            .addGap(55, 55, 55)
                            .addComponent(mesa6))))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesa1)
                    .addComponent(mesa2)
                    .addComponent(mesa3)
                    .addComponent(mesa4)
                    .addComponent(mesa5)
                    .addComponent(mesa6))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesa7)
                    .addComponent(mesa8)
                    .addComponent(mesa9)
                    .addComponent(mesa10)
                    .addComponent(mesa11)
                    .addComponent(mesa12))
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesa13)
                    .addComponent(mesa14)
                    .addComponent(mesa15)
                    .addComponent(mesa16)
                    .addComponent(mesa17)
                    .addComponent(mesa18))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesa19)
                    .addComponent(mesa20)
                    .addComponent(mesa21)
                    .addComponent(mesa22)
                    .addComponent(mesa23)
                    .addComponent(mesa24))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesa25)
                    .addComponent(mesa26)
                    .addComponent(mesa27)
                    .addComponent(mesa28)
                    .addComponent(mesa29)
                    .addComponent(mesa30))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentAdded

    private void mesa1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesa1MouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_mesa1MouseReleased

    private void mesa1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mesa1KeyReleased

    }//GEN-LAST:event_mesa1KeyReleased

    private void mesa1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesa1MouseClicked
        
        // Cambia el estado de la mesa
        mesaOcupada = !mesaOcupada;

        // Actualiza el color de fondo
        if (mesaOcupada){
              
            mesa1.setIcon(ico); // Cambia el color al ocupado
            Mesa mesa1 = new Mesa();
        } else{
                
            mesa1.setIcon(icoG); // Cambia el color al libre
            
        }
    }//GEN-LAST:event_mesa1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
