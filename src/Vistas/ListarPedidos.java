
package Vistas;

import BaseDatos.PedidoData;
import Entidades.Pedido;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.table.DefaultTableModel;

public class ListarPedidos extends javax.swing.JInternalFrame {

    PedidoData pd = new PedidoData();

    public ListarPedidos() throws ParseException {

        initComponents();
        armarCabecera();
        cargarPedidos();
        jtNMesero.setEnabled(false);
        jdFecha.setEnabled(false);
        jdMDia.setEnabled(false);
        jtMDia.setEnabled(false);
        jbBuscar.setEnabled(false);
        jtIdmesa.setEnabled(false);
        jdDia.setEnabled(false);
        jsHoraInicio.setEnabled(false);
        jsHoraFin.setEnabled(false);
        jbBuscar1.setEnabled(false);

        try {

            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
            Date hora = sdf.parse("00:00");
            SpinnerDateModel sdm = new SpinnerDateModel(hora, null, null, Calendar.HOUR_OF_DAY);
            jsHoraInicio.setModel(sdm);
            JSpinner.DateEditor de = new JSpinner.DateEditor(jsHoraInicio, "HH:mm");
            jsHoraInicio.setEditor(de);

        } catch (ParseException ex) {
            
            JOptionPane.showMessageDialog(rootPane, "no funca");
        }

        try {

            SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm");
            Date hora1 = sdf1.parse("00:00");
            SpinnerDateModel sdm1 = new SpinnerDateModel(hora1, null, null, Calendar.HOUR_OF_DAY);
            jsHoraFin.setModel(sdm1);
            JSpinner.DateEditor de1 = new JSpinner.DateEditor(jsHoraFin, "HH:mm");
            jsHoraFin.setEditor(de1);

        } catch (ParseException ex) {

            JOptionPane.showMessageDialog(rootPane, "no funca");
        }

    }

    private DefaultTableModel modelo = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {

            return false;

        }
    };

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono = new ImageIcon(getClass().getResource("/Recursos/FONDO15.jpg"));
        Image imagen = icono.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){

                g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
            }

        };
        jLabel1 = new javax.swing.JLabel();
        jcElegir = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jtNMesero = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jdFecha = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jtMDia = new javax.swing.JTextField();
        jdMDia = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jdDia = new com.toedter.calendar.JDateChooser();
        jtIdmesa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jsHoraInicio = new javax.swing.JSpinner();
        jsHoraFin = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPedido = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jtIngresos = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jbBuscar1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Listar Pedido");

        jcElegir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "MESERO", "MESEROxDIA", "FECHA", "MESAxDIA/HORA" }));
        jcElegir.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcElegirItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setText("Por Mesero");

        jtNMesero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtNMeseroKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNMeseroKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setText("Por Fecha");

        jdFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdFechaPropertyChange(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setText("Mesero por dia");

        jtMDia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtMDiaKeyTyped(evt);
            }
        });

        jLabel7.setText("Nº Mesa");

        jLabel8.setText("Dia");

        jtIdmesa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtIdmesaKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel6.setText("Mesa x dia/hora");

        jsHoraInicio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsHoraInicioStateChanged(evt);
            }
        });

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

        jLabel5.setText("Ingresos Totales");

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jLabel9.setText("Entre horas");

        jbBuscar1.setText("Buscar");
        jbBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscar1ActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jtIdmesa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jdDia, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(118, 118, 118))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jsHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jsHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jbBuscar)
                                                    .addComponent(jbBuscar1)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jtMDia, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jtNMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(230, 230, 230))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jdMDia, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(118, 118, 118))))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(83, 83, 83)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(111, 111, 111)
                                        .addComponent(jcElegir, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(61, 61, 61)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jDesktopPane1))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcElegir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jtNMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdMDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jtMDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbBuscar))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jtIdmesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jsHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jsHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbBuscar1))
                    .addComponent(jdDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(4, 4, 4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcElegirItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcElegirItemStateChanged

        String elegir = (String) jcElegir.getSelectedItem();

        switch (elegir) {

            case "MESERO":

                modelo.setRowCount(0);
                jtNMesero.setEnabled(true);
                jdFecha.setEnabled(false);
                jtMDia.setEnabled(false);
                jdMDia.setEnabled(false);
                jtIdmesa.setEnabled(false);
                jdDia.setEnabled(false);
                jsHoraInicio.setEnabled(false);
                jsHoraFin.setEnabled(false);
                jbBuscar1.setEnabled(false);

                break;

            case "FECHA":

                modelo.setRowCount(0);
                jdFecha.setEnabled(true);
                jtMDia.setEnabled(false);
                jdMDia.setEnabled(false);
                jtNMesero.setEnabled(false);
                jtIdmesa.setEnabled(false);
                jdDia.setEnabled(false);
                jsHoraInicio.setEnabled(false);
                jsHoraFin.setEnabled(false);
                jbBuscar1.setEnabled(false);

                break;

            case "MESEROxDIA":

                modelo.setRowCount(0);
                jbBuscar.setEnabled(true);
                jdMDia.setEnabled(true);
                jtMDia.setEnabled(true);
                jtNMesero.setEnabled(false);
                jtIdmesa.setEnabled(false);
                jdDia.setEnabled(false);
                jsHoraInicio.setEnabled(false);
                jsHoraFin.setEnabled(false);
                jbBuscar1.setEnabled(false);
                jdFecha.setEnabled(false);

                break;

            case "MESAxDIA/HORA":

                modelo.setRowCount(0);
                jtIdmesa.setEnabled(true);
                jdDia.setEnabled(true);
                jsHoraInicio.setEnabled(true);
                jsHoraFin.setEnabled(true);
                jbBuscar1.setEnabled(true);
                jbBuscar.setEnabled(false);
                jdMDia.setEnabled(false);
                jtMDia.setEnabled(false);
                jtNMesero.setEnabled(false);
                jdFecha.setEnabled(false);

                break;

            default:

                modelo.setRowCount(0);
                jtNMesero.setEnabled(false);
                jdFecha.setEnabled(false);
                jdMDia.setEnabled(false);
                jtMDia.setEnabled(false);
                jtIdmesa.setEnabled(false);
                jdDia.setEnabled(false);
                jsHoraInicio.setEnabled(false);
                jsHoraFin.setEnabled(false);
                jbBuscar1.setEnabled(false);
                cargarPedidos();

        }
    }//GEN-LAST:event_jcElegirItemStateChanged

    private void jtNMeseroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNMeseroKeyReleased

        pedidoMesero(jtNMesero.getText());

    }//GEN-LAST:event_jtNMeseroKeyReleased

    private void jdFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdFechaPropertyChange

        if (jdFecha.getDate() != null) {
            LocalDate localDate = jdFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDateTime localDateTime = localDate.atTime(00, 0);

            pedidoFecha(localDateTime);

        }
    }//GEN-LAST:event_jdFechaPropertyChange

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed

        if (jdMDia.getDate() != null && jtMDia.getText() != null) {

            String mesero = jtMDia.getText();
            LocalDate fecha = jdMDia.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            pedidoMeseroDia(mesero, fecha);

        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscar1ActionPerformed

        if (jtIdmesa.getText() != null && jdDia.getDate() != null) {

            int idMesa = Integer.parseInt(jtIdmesa.getText());

            LocalDate fecha = jdDia.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            Date date = (Date) jsHoraInicio.getValue();
            Instant instant = date.toInstant();
            LocalTime HoraInicio = instant.atZone(ZoneId.systemDefault()).toLocalTime();

            Date date1 = (Date) jsHoraFin.getValue();
            Instant instant1 = date1.toInstant();
            LocalTime HoraFin = instant1.atZone(ZoneId.systemDefault()).toLocalTime();

            LocalDateTime Inicio = LocalDateTime.of(fecha, HoraInicio);
            LocalDateTime Fin = LocalDateTime.of(fecha, HoraFin);

            pedidoMesaHoras(idMesa, fecha, Inicio, Fin);

        } else {

            JOptionPane.showMessageDialog(rootPane, "Ingrese todos los datos");

        }
    }//GEN-LAST:event_jbBuscar1ActionPerformed

    private void jsHoraInicioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsHoraInicioStateChanged

    }//GEN-LAST:event_jsHoraInicioStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtNMeseroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNMeseroKeyTyped
        
        soloLetras(evt);
        
    }//GEN-LAST:event_jtNMeseroKeyTyped

    private void jtMDiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtMDiaKeyTyped
        
        soloLetras(evt);
        
    }//GEN-LAST:event_jtMDiaKeyTyped

    private void jtIdmesaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIdmesaKeyTyped
        
        soloNumeros(evt);
        
    }//GEN-LAST:event_jtIdmesaKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbBuscar1;
    private javax.swing.JComboBox<String> jcElegir;
    private com.toedter.calendar.JDateChooser jdDia;
    private com.toedter.calendar.JDateChooser jdFecha;
    private com.toedter.calendar.JDateChooser jdMDia;
    private javax.swing.JSpinner jsHoraFin;
    private javax.swing.JSpinner jsHoraInicio;
    private javax.swing.JTextField jtIdmesa;
    private javax.swing.JTextField jtIngresos;
    private javax.swing.JTextField jtMDia;
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
    
    private void pedidoMeseroDia(String mesero,LocalDate fecha){
        
        double total = 0.0;
        modelo.setRowCount(0);
        List<Pedido> pedido = pd.listarPedidosCobradosPorMeseroEnElDia(mesero,fecha);

        for (Pedido pe : pedido) {

            modelo.addRow(new Object[]{pe.getIdPedido(), pe.getMesa().getNumero(),
                pe.getNombreMesero(), pe.getFechaHora(),pe.isCobrada(),pe.getImporte(), pe.getEstado()});
            total += pe.getImporte();
        }
        
         jtIngresos.setText(total + "");
         
    } 
    
    private void pedidoMesaHoras(int idMesa, LocalDate fecha, LocalDateTime horaInicio, LocalDateTime horaFin){
        
        double total = 0.0;
        modelo.setRowCount(0);
        List<Pedido> pedido = pd.listarPedidosDeMesaEnFechaYRangoHorario(idMesa,fecha,horaInicio,horaFin);

        for (Pedido pe : pedido) {

            modelo.addRow(new Object[]{pe.getIdPedido(), pe.getMesa().getNumero(),
                pe.getNombreMesero(), pe.getFechaHora(), pe.isCobrada(), pe.getImporte(), pe.getEstado()});
            total += pe.getImporte();
        }

        jtIngresos.setText(total + "");

    }

    private void soloLetras(KeyEvent evt) {

        char validar = evt.getKeyChar();

        if (Character.isDigit(validar)) {

            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Ingrese solo letras");

        }
    }
    
     private void soloNumeros(KeyEvent evt){
        
        char validar = evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo numeros");
            
        }
    }
}
