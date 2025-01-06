
package Vistas;

import BaseDatos.PedidoData;
import Entidades.Pedido;
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
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class ListarPedidos extends JInternalFrame {

    PedidoData pd = new PedidoData();

    public ListarPedidos() throws ParseException {

        initComponents();
        armarCabecera();
        cargarPedidos();

        // Desactiva la barra de título del JInternalFrame
        BasicInternalFrameUI ui = (BasicInternalFrameUI) getUI();
        ui.setNorthPane(null);
        
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

        jLabel1 = new javax.swing.JLabel();
        jcElegir = new javax.swing.JComboBox<>();
        jtNMesero = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jdFecha = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jtMDia = new javax.swing.JTextField();
        jdMDia = new com.toedter.calendar.JDateChooser();
        jbBuscar = new javax.swing.JButton();
        jbBuscar1 = new javax.swing.JButton();
        jsHoraFin = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jsHoraInicio = new javax.swing.JSpinner();
        jdDia = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtIdmesa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtIngresos = new javax.swing.JTextField();
        jBsalir = new javax.swing.JButton();
        jLingresosTotales = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPedido = new javax.swing.JTable();
        jLfondo = new javax.swing.JLabel();

        setBorder(null);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LISTAR PEDIDOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 6, 354, 36));

        jcElegir.setBackground(new java.awt.Color(51, 51, 51));
        jcElegir.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jcElegir.setForeground(new java.awt.Color(255, 255, 255));
        jcElegir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "MESERO", "MESEROxDIA", "FECHA", "MESAxDIA/HORA" }));
        jcElegir.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcElegirItemStateChanged(evt);
            }
        });
        getContentPane().add(jcElegir, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 54, 143, -1));

        jtNMesero.setBackground(new java.awt.Color(51, 51, 51));
        jtNMesero.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jtNMesero.setForeground(new java.awt.Color(255, 255, 255));
        jtNMesero.setBorder(null);
        jtNMesero.setCaretColor(new java.awt.Color(255, 255, 255));
        jtNMesero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtNMeseroKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNMeseroKeyTyped(evt);
            }
        });
        getContentPane().add(jtNMesero, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 130, 125, 20));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Por Mesero");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Por Fecha");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 97, -1));

        jdFecha.setBackground(new java.awt.Color(51, 51, 51));
        jdFecha.setForeground(new java.awt.Color(255, 255, 255));
        jdFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdFechaPropertyChange(evt);
            }
        });
        getContentPane().add(jdFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 167, 153, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mesero por dia");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jtMDia.setBackground(new java.awt.Color(51, 51, 51));
        jtMDia.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jtMDia.setForeground(new java.awt.Color(255, 255, 255));
        jtMDia.setBorder(null);
        jtMDia.setCaretColor(new java.awt.Color(255, 255, 255));
        jtMDia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtMDiaKeyTyped(evt);
            }
        });
        getContentPane().add(jtMDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 205, 84, 20));

        jdMDia.setBackground(new java.awt.Color(51, 51, 51));
        jdMDia.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jdMDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 205, 130, -1));

        jbBuscar.setBackground(new java.awt.Color(51, 51, 51));
        jbBuscar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jbBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jbBuscar.setText("Buscar");
        jbBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 60, 30));

        jbBuscar1.setBackground(new java.awt.Color(51, 51, 51));
        jbBuscar1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jbBuscar1.setForeground(new java.awt.Color(255, 255, 255));
        jbBuscar1.setText("Buscar");
        jbBuscar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbBuscar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 60, 30));
        getContentPane().add(jsHoraFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 275, 81, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Entre horas");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 245, -1, -1));

        jsHoraInicio.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        getContentPane().add(jsHoraInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 275, 80, -1));

        jdDia.setBackground(new java.awt.Color(51, 51, 51));
        jdDia.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jdDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 275, 96, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Dia");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 245, 29, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nº Mesa");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 245, -1, -1));

        jtIdmesa.setBackground(new java.awt.Color(51, 51, 51));
        jtIdmesa.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jtIdmesa.setForeground(new java.awt.Color(255, 255, 255));
        jtIdmesa.setBorder(null);
        jtIdmesa.setCaretColor(new java.awt.Color(255, 255, 255));
        jtIdmesa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtIdmesaKeyTyped(evt);
            }
        });
        getContentPane().add(jtIdmesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 275, 38, 20));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mesa x dia/hora");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, 10));

        jtIngresos.setBackground(new java.awt.Color(51, 51, 51));
        jtIngresos.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jtIngresos.setForeground(new java.awt.Color(255, 255, 255));
        jtIngresos.setBorder(null);
        getContentPane().add(jtIngresos, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 519, 116, 20));

        jBsalir.setBackground(new java.awt.Color(51, 51, 51));
        jBsalir.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jBsalir.setForeground(new java.awt.Color(255, 255, 255));
        jBsalir.setText("Salir");
        jBsalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jBsalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });
        getContentPane().add(jBsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 519, 71, 30));

        jLingresosTotales.setBackground(new java.awt.Color(51, 51, 51));
        jLingresosTotales.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jLingresosTotales.setForeground(new java.awt.Color(255, 255, 255));
        jLingresosTotales.setText("Ingresos Totales");
        getContentPane().add(jLingresosTotales, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 515, 147, -1));

        jtPedido.setBackground(new java.awt.Color(51, 51, 51));
        jtPedido.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jtPedido.setForeground(new java.awt.Color(255, 255, 255));
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 335, 524, 162));

        jLfondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/AdministrarPedidos.jpg"))); // NOI18N
        getContentPane().add(jLfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 560));

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
                cargarPedidos();

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
                cargarPedidos();

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
                cargarPedidos();

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
                cargarPedidos();

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

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
       
        dispose();
        
    }//GEN-LAST:event_jBsalirActionPerformed

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
    private javax.swing.JButton jBsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLfondo;
    private javax.swing.JLabel jLingresosTotales;
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

            Utilidades.mostrarDialogoTemporal("Error", "Ingrese solo letras", 2000);

        }
    }
    
     private void soloNumeros(KeyEvent evt){
        
        char validar = evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            
            getToolkit().beep();
            evt.consume();
            
            Utilidades.mostrarDialogoTemporal("Error", "Ingrese solo numeros", 2000);
            
        }
    }
}
