
package Vistas;

import BaseDatos.PedidoData;
import Entidades.Pedido;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListarPedidos extends javax.swing.JInternalFrame {

    PedidoData pd = new PedidoData();
    
    public ListarPedidos() {
        
        initComponents();
        armarCabecera();
        cargarPedidos();
        jtNMesero.setEnabled(false);
        jdFecha.setEnabled(false);
        
    }
    
    private DefaultTableModel modelo = new DefaultTableModel(){

        @Override
        public boolean  isCellEditable(int rowIndex, int columnIndex ){
            
            return false;
            
        }
    };
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PorDia = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jdFecha = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPedido = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jcElegir = new javax.swing.JComboBox<>();
        jtIngresos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtNMesero = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(488, 589));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setText("Por Mesero");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setText("Por Fecha");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setText("Por Cobrado en el Dia");

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Listar Pedido");

        jdFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdFechaPropertyChange(evt);
            }
        });

        jButton1.setText("Buscar");

        jtPedido.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtPedido);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/ico pedido/anular_48.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jcElegir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "MESERO", "COBRADO", "ESTADO", "IMPORTES", "FECHA" }));
        jcElegir.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcElegirItemStateChanged(evt);
            }
        });

        jLabel5.setText("Ingresos Totales");

        jtNMesero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtNMeseroKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jdFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PorDia, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtNMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jcElegir, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jcElegir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jtNMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PorDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

        dispose();

    }//GEN-LAST:event_jButton2MouseClicked

    private void jcElegirItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcElegirItemStateChanged
        
        String elegir = (String) jcElegir.getSelectedItem();
        
        switch (elegir){
            
            case "MESERO":
                
                modelo.setRowCount(0);
                jtNMesero.setEnabled(true);
 
                break;
               
            case "FECHA":
                
                modelo.setRowCount(0);
                jdFecha.setEnabled(true);
                
                break;
                
            default:
                
                modelo.setRowCount(0);
                jtNMesero.setEnabled(false);
                jdFecha.setEnabled(false);
                cargarPedidos();
                
        }  
    }//GEN-LAST:event_jcElegirItemStateChanged

    private void jtNMeseroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNMeseroKeyReleased
        
        pedidoMesero(jtNMesero.getText());
        
    }//GEN-LAST:event_jtNMeseroKeyReleased

    private void jdFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdFechaPropertyChange
        
        if (jdFecha.getDate()!= null) {
            LocalDate localDate = jdFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDateTime localDateTime = localDate.atTime(00, 0);

            pedidoFecha(localDateTime);
            
        }
    }//GEN-LAST:event_jdFechaPropertyChange

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser PorDia;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcElegir;
    private com.toedter.calendar.JDateChooser jdFecha;
    private javax.swing.JTextField jtIngresos;
    private javax.swing.JTextField jtNMesero;
    private javax.swing.JTable jtPedido;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera(){
    
        modelo.addColumn("ID");
        modelo.addColumn("idMesa");
        modelo.addColumn("Mesero");
        modelo.addColumn("FechaHora");
        modelo.addColumn("Cobrada");
        modelo.addColumn("Importe");
        modelo.addColumn("Estado");
        jtPedido.setModel(modelo);   
    
    }
    
    private void cargarPedidos(){
    
        
        modelo.setRowCount(0);
        List<Pedido> pedido = pd.listarPedidos();

        for (Pedido pe : pedido) {

            modelo.addRow(new Object[]{pe.getIdPedido(), pe.getMesa().getNumero(),
                pe.getNombreMesero(), pe.getFechaHora(),pe.isCobrada(),pe.getImporte(), pe.getEstado()});

        }
    }
    
    private void pedidoMesero(String mesero){
        
        double total = 0.0;
        modelo.setRowCount(0);
        List<Pedido> pedido = pd.listarPedidoMesero(mesero);

        for (Pedido pe : pedido) {

            modelo.addRow(new Object[]{pe.getIdPedido(), pe.getMesa().getNumero(),
                pe.getNombreMesero(), pe.getFechaHora(),pe.isCobrada(),pe.getImporte(), pe.getEstado()});
            total += pe.getImporte();
        }
        
         jtIngresos.setText(total + "");
         
    } 
    
    private void pedidoFecha(LocalDateTime fechad){
        
        double total = 0.0;
        modelo.setRowCount(0);
        List<Pedido> pedido = pd.listarPedidoFechaDia(fechad);

        for (Pedido pe : pedido) {

            modelo.addRow(new Object[]{pe.getIdPedido(), pe.getMesa().getNumero(),
                pe.getNombreMesero(), pe.getFechaHora(),pe.isCobrada(),pe.getImporte(), pe.getEstado()});
            total += pe.getImporte();
        }
        
         jtIngresos.setText(total + "");
         
    } 
}
