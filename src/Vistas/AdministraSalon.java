
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
    List<Mesa> mesas = md.listarMesas();
    Mesa mes = new Mesa();
    private boolean mesaOcupada = false;
       
    public AdministraSalon() {

        initComponents();
        mesa1.setIcon(icoG);
        List<Mesa> mesas = md.listarMesas();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jtListaMesas = new javax.swing.JTable();

        setClosable(true);
        setTitle("Administra Salon");
        setPreferredSize(new java.awt.Dimension(995, 661));
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
        });

        mesa2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa2.setForeground(new java.awt.Color(0, 0, 0));
        mesa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa2.setText("2");
        mesa2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa2MouseClicked(evt);
            }
        });

        mesa3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa3.setForeground(new java.awt.Color(0, 0, 0));
        mesa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa3.setText("3");
        mesa3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa3MouseClicked(evt);
            }
        });

        mesa4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa4.setForeground(new java.awt.Color(0, 0, 0));
        mesa4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa4.setText("4");
        mesa4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa4MouseClicked(evt);
            }
        });

        mesa5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa5.setForeground(new java.awt.Color(0, 0, 0));
        mesa5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa5.setText("5");
        mesa5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa5MouseClicked(evt);
            }
        });

        mesa6.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa6.setForeground(new java.awt.Color(0, 0, 0));
        mesa6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa6.setText("6");
        mesa6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa6MouseClicked(evt);
            }
        });

        mesa7.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa7.setForeground(new java.awt.Color(0, 0, 0));
        mesa7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa7.setText("7");
        mesa7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa7MouseClicked(evt);
            }
        });

        mesa8.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa8.setForeground(new java.awt.Color(0, 0, 0));
        mesa8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa8.setText("8");
        mesa8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa8MouseClicked(evt);
            }
        });

        mesa9.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa9.setForeground(new java.awt.Color(0, 0, 0));
        mesa9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa9.setText("9");
        mesa9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa9MouseClicked(evt);
            }
        });

        mesa10.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        mesa10.setForeground(new java.awt.Color(0, 0, 0));
        mesa10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa-icon.png"))); // NOI18N
        mesa10.setText("10");
        mesa10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesa10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa10MouseClicked(evt);
            }
        });

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
        jScrollPane1.setViewportView(jtListaMesas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
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
                                .addGap(50, 50, 50)
                                .addComponent(mesa21)
                                .addGap(67, 67, 67)
                                .addComponent(mesa22)
                                .addGap(61, 61, 61)
                                .addComponent(mesa23)
                                .addGap(55, 55, 55)
                                .addComponent(mesa24))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mesa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(49, 49, 49)
                                .addComponent(mesa2)
                                .addGap(58, 58, 58)
                                .addComponent(mesa3)
                                .addGap(59, 59, 59)
                                .addComponent(mesa4)
                                .addGap(61, 61, 61)
                                .addComponent(mesa5)
                                .addGap(55, 55, 55)
                                .addComponent(mesa6)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
                                .addComponent(mesa12)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mesa2)
                        .addComponent(mesa3)
                        .addComponent(mesa4)
                        .addComponent(mesa5)
                        .addComponent(mesa6))
                    .addComponent(mesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesa7)
                    .addComponent(mesa8)
                    .addComponent(mesa9)
                    .addComponent(mesa10)
                    .addComponent(mesa11)
                    .addComponent(mesa12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesa13)
                    .addComponent(mesa14)
                    .addComponent(mesa15)
                    .addComponent(mesa16)
                    .addComponent(mesa17)
                    .addComponent(mesa18))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesa19)
                    .addComponent(mesa20)
                    .addComponent(mesa21)
                    .addComponent(mesa22)
                    .addComponent(mesa23)
                    .addComponent(mesa24))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesa25)
                    .addComponent(mesa26)
                    .addComponent(mesa27)
                    .addComponent(mesa28)
                    .addComponent(mesa29)
                    .addComponent(mesa30))
                .addContainerGap())
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
        // TODO add your handling code here:
    }//GEN-LAST:event_mesa5MouseClicked

    private void mesa6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesa6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mesa6MouseClicked

    private void mesa7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesa7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mesa7MouseClicked

    private void mesa8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesa8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mesa8MouseClicked

    private void mesa9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesa9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mesa9MouseClicked

    private void mesa10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesa10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mesa10MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtListaMesas;
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

        List<Mesa> mesas = md.listarMesas();
        modelo.setRowCount(0);

        for (Mesa me : mesas) {

            modelo.addRow(new Object[]{me.getIdMesa(),
                me.getNumero(), me.getEstadoMesa(), me.getCapacidad()});

        }
    }
    
    private void armarCabecera() {

        modelo.addColumn("IdMesa");
        modelo.addColumn("Numero");
        modelo.addColumn("EstadoMesa");
        modelo.addColumn("Cantidad");
        jtListaMesas.setModel(modelo);

    }
}
