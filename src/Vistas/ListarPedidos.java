package Vistas;

import BaseDatos.MozoData;
import BaseDatos.PedidoData;
import Entidades.Mozo;
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
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class ListarPedidos extends JInternalFrame {

    PedidoData pd = new PedidoData();
    MozoData mozoDat = new MozoData();

    public ListarPedidos() {
        
        initComponents();
        armarCabecera();
        cargarSpinerMozos(jCmozoXdia);
        cargarSpinerMozos(jCidMozo);

        // Desactiva la barra de título del JInternalFrame
        BasicInternalFrameUI ui = (BasicInternalFrameUI) getUI();
        ui.setNorthPane(null);

        editarCampos(false, false, false,false, false, false,
                false, false, false, false);

        formatoHora(jsHoraInicio);
        formatoHora(jsHoraFin);
        cargarPedidos();
    }
    
    /* 
    * Modelo de tabla no editable utilizado para la tabla 'jtPedido', 
    * asegurando que los datos de la tabla sean de solo lectura.
    */
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jdFecha = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
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
        jCmozoXdia = new javax.swing.JComboBox<>();
        jCidMozo = new javax.swing.JComboBox<>();
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
        getContentPane().add(jdFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 140, 20));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mesero por dia");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jdMDia.setBackground(new java.awt.Color(51, 51, 51));
        jdMDia.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jdMDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 130, -1));

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
        getContentPane().add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 60, 30));

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

        jBsalir.setBackground(new java.awt.Color(179, 36, 36));
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
        getContentPane().add(jBsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 510, 71, 30));

        jLingresosTotales.setBackground(new java.awt.Color(51, 51, 51));
        jLingresosTotales.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jLingresosTotales.setForeground(new java.awt.Color(255, 255, 255));
        jLingresosTotales.setText("Ingresos Totales");
        getContentPane().add(jLingresosTotales, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 515, 147, -1));

        getContentPane().add(jCmozoXdia, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 140, 20));

        jCidMozo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCidMozoItemStateChanged(evt);
            }
        });
        getContentPane().add(jCidMozo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 140, 20));

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

        String elegir = jcElegir.getSelectedItem() + "";

        switch (elegir) {

            case "MESERO" -> {
                editarCampos(false, true, false, false, false, false,
                        false, false, false, false);
                Mozo mozo = (Mozo)jCidMozo.getSelectedItem();
                pedidoMesero(mozo);
            }

            case "FECHA" -> editarCampos(false, false, true, false, false, false,
                        false, false, false, false);

            case "MESEROxDIA" -> editarCampos(true, false, false, true, false, false,
                        false, false, false, true);

            case "MESAxDIA/HORA" -> editarCampos(false, false, false, false, true, true,
                        true, true, true, false);

            default -> {
                editarCampos(false, false, false, false, false, false,
                        false, false, false, false);
                cargarPedidos();
            }
        }
    }//GEN-LAST:event_jcElegirItemStateChanged

    private void jdFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdFechaPropertyChange

        if (jdFecha.getDate() != null) {
            
            LocalDate localDate = jdFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDateTime localDateTime = localDate.atTime(00, 0);

            pedidoFecha(localDateTime);
        }
    }//GEN-LAST:event_jdFechaPropertyChange

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed

        if (jdMDia.getDate() != null ) {

            LocalDate fecha = jdMDia.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Mozo mozo = (Mozo) jCmozoXdia.getSelectedItem();
            pedidoMeseroDia(mozo, fecha);

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

            Utilidades.mostrarDialogoTemporal("Buscar pedidos", "Ingrese todos los datos", 2000);
        }
    }//GEN-LAST:event_jbBuscar1ActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed

        dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jtIdmesaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIdmesaKeyTyped

        soloNumeros(evt);
    }//GEN-LAST:event_jtIdmesaKeyTyped

    private void jCidMozoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCidMozoItemStateChanged
        
        pedidoMesero((Mozo) jCidMozo.getSelectedItem());
    }//GEN-LAST:event_jCidMozoItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<Mozo> jCidMozo;
    private javax.swing.JComboBox<Mozo> jCmozoXdia;
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
    private javax.swing.JTable jtPedido;
    // End of variables declaration//GEN-END:variables

    // Configura las columnas del modelo de la tabla 'jtPedido'.
    private void armarCabecera() {

        modelo.addColumn("NºMesa");
        modelo.addColumn("Mozo");
        modelo.addColumn("FechaHora");
        modelo.addColumn("Cobrada");
        modelo.addColumn("Importe");
        modelo.addColumn("Estado");
        jtPedido.setModel(modelo);
    }
    
    // Carga todos los pedidos en la tabla desde la base de datos y calcula el ingreso total.
    private void cargarPedidos() {

        modelo.setRowCount(0);
        
        List<Pedido> pedidos = pd.listarPedidos();

        for (Pedido pe : pedidos) {

            modelo.addRow(new Object[]{pe.getMesa().getNumero(),pe.getMozo(), pe.getFechaHora(), 
                pe.isCobrada(), pe.getImporte(), pe.getEstado()});
        }
    }
    
    // Filtra y muestra los pedidos realizados por un mesero específico y calcula el ingreso total de esos pedidos.
    private void pedidoMesero(Mozo mozo) {

        double total = 0.0;
        modelo.setRowCount(0);
        int idMozo = mozo.getIdMozo();
        List<Pedido> pedidos = pd.listarPedidoMesero(idMozo);
        for (Pedido pe : pedidos) {

            modelo.addRow(new Object[]{pe.getMesa().getNumero(),
                pe.getMozo(), pe.getFechaHora(), pe.isCobrada(), pe.getImporte(), pe.getEstado()});
            total += pe.getImporte();
        }

        jtIngresos.setText(total + "");
    }
    
    // Filtra y muestra los pedidos realizados en una fecha específica y calcula el ingreso total de esos pedidos.
    private void pedidoFecha(LocalDateTime fechad) {

        double total = 0.0;
        modelo.setRowCount(0);
        List<Pedido> pedido = pd.listarPedidoFechaDia(fechad);

        for (Pedido pe : pedido) {

            modelo.addRow(new Object[]{pe.getIdPedido(), pe.getMesa().getNumero(),
                pe.getMozo(), pe.getFechaHora(), pe.isCobrada(), pe.getImporte(), pe.getEstado()});
            total += pe.getImporte();
        }

        jtIngresos.setText(total + "");
    }
    
    // Filtra y muestra los pedidos realizados por un mesero en un día específico, y calcula el ingreso total.
    private void pedidoMeseroDia(Mozo mozo, LocalDate fecha) {

        double total = 0.0;
        modelo.setRowCount(0);
        List<Pedido> pedido = pd.listarPedidosCobradosPorMeseroEnElDia(mozo, fecha);

        for (Pedido pe : pedido) {

            modelo.addRow(new Object[]{pe.getIdPedido(), pe.getMesa().getNumero(),
                pe.getMozo(), pe.getFechaHora(), pe.isCobrada(), pe.getImporte(), pe.getEstado()});
            total += pe.getImporte();
        }

        jtIngresos.setText(total + "");
    }
    
    // Filtra y muestra los pedidos realizados en una mesa específica, en una fecha y rango horario determinados, y calcula el ingreso total.
    private void pedidoMesaHoras(int idMesa, LocalDate fecha, LocalDateTime horaInicio, LocalDateTime horaFin) {

        double total = 0.0;
        modelo.setRowCount(0);
        List<Pedido> pedido = pd.listarPedidosDeMesaEnFechaYRangoHorario(idMesa, fecha, horaInicio, horaFin);

        for (Pedido pe : pedido) {

            modelo.addRow(new Object[]{pe.getIdPedido(), pe.getMesa().getNumero(),
                pe.getMozo(), pe.getFechaHora(), pe.isCobrada(), pe.getImporte(), pe.getEstado()});
            total += pe.getImporte();
        }

        jtIngresos.setText(total + "");
    }
    
    // Valida que el campo de texto acepte solo números. Si se ingresa una letra, muestra un mensaje de error.
    private void soloNumeros(KeyEvent evt) {

        char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {

            getToolkit().beep();
            evt.consume();

            Utilidades.mostrarDialogoTemporal("Error", "Ingrese solo numeros", 2000);
        }
    }
    
    // Configura el formato de la hora en un 'JSpinner' para que muestre solo la hora y los minutos.
    private void formatoHora(JSpinner horaFormat) {

        try {

            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
            Date hora = sdf.parse("00:00");
            SpinnerDateModel sdm = new SpinnerDateModel(hora, null, null, Calendar.HOUR_OF_DAY);
            horaFormat.setModel(sdm);
            JSpinner.DateEditor de = new JSpinner.DateEditor(jsHoraInicio, "HH:mm");
            horaFormat.setEditor(de);

        } catch (ParseException ex) {

            Utilidades.mostrarDialogoTemporal("Formato de hora", "no se pudo dar formato a la hora", 2000);
        }
    }
    
    // Habilita o deshabilita campos y controles en la interfaz según los parámetros booleanos recibidos y recarga los pedidos.
    private void editarCampos(boolean CmozoXdia, boolean CidMozo, boolean dFecha, boolean dMDia, boolean tIdmesa,
            boolean dDia, boolean sHoraInicio, boolean sHoraFin, boolean bBuscar1, boolean bBuscar) {

        modelo.setRowCount(0);
        jCmozoXdia.setEnabled(CmozoXdia);
        jCidMozo.setEnabled(CidMozo);
        jdFecha.setEnabled(dFecha);
        jdMDia.setEnabled(dMDia);
        jtIdmesa.setEnabled(tIdmesa);
        jdDia.setEnabled(dDia);
        jsHoraInicio.setEnabled(sHoraInicio);
        jsHoraFin.setEnabled(sHoraFin);
        jbBuscar1.setEnabled(bBuscar1);
        jbBuscar.setEnabled(bBuscar);
    }
    
     // Agregar cada objeto Mozo al JComboBox
    private void cargarSpinerMozos(JComboBox jCombo) {

        List <Mozo> mozos = mozoDat.listarMozos();
       
        for (Mozo mozo : mozos) {
            jCombo.addItem(mozo);
        }
    }
}
