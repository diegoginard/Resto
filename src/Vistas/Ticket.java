package Vistas;

import BaseDatos.PedidoProductoData;
import Entidades.PedidoProducto;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class Ticket extends javax.swing.JFrame {

    private PedidoProductoData ppd = new PedidoProductoData();
    private LocalTime horaActual = LocalTime.now();
    private DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm"); // Formato de hora sin segundos
    private String idRecibida;

    public Ticket() {
             
    }

    public Ticket(String idPed) {

        this.idRecibida = idPed;
        initComponents();
        this.setLocationRelativeTo(null);
        armarCabeceraProdPed();
        jtFecha.setText(LocalDate.now() + "");
        jtHora.setText(horaActual.format(formato));

        if (idRecibida != null) {

            int idP = Integer.parseInt(idRecibida);
            cargarPedido(idP);   
        }
        
        SwingUtilities.invokeLater(() -> generarPDF());
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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        javax.swing.JButton jBimprimir = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTicket = new javax.swing.JTable();
        jtTotal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtFecha = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtHora = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jInternalFrame1.setBorder(null);
        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBimprimir.setText("Imprimir");
        jBimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBimprimirActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jBimprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 20));

        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel1.setText("RESTO");
        jDesktopPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel2.setText("Direccion :    Bulnes 556");
        jDesktopPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setText("Localidad :    San Isidro Buenos Aires");
        jDesktopPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("FACTURA 0000");
        jDesktopPane1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 13, -1, -1));

        jtTicket.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtTicket);

        jDesktopPane1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 368));
        jDesktopPane1.add(jtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 550, 78, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mesa60.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jDesktopPane1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 62, 89));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setText("Telefono :    45282658");
        jDesktopPane1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel6.setText("Fecha");
        jDesktopPane1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));
        jDesktopPane1.add(jtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 90, -1));

        jLabel7.setText("TOTAL A PAGAR");
        jDesktopPane1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 550, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("GRACIAS POR SU VISITA");
        jDesktopPane1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 600, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel9.setText("Hora");
        jDesktopPane1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        jDesktopPane1.add(jtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBimprimirActionPerformed

        // Crear un trabajo de impresión
        PrinterJob job = PrinterJob.getPrinterJob();

        // Configurar el Printable para imprimir el JDesktopPane
        job.setPrintable(new Printable() {
            
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                
                if (pageIndex > 0) {
                    
                    return Printable.NO_SUCH_PAGE; // Solo imprimir una página
                }

                // Escalar el contenido para que quepa en la página
                Graphics2D g2d = (Graphics2D) graphics;
                double scaleX = pageFormat.getImageableWidth() / jDesktopPane1.getWidth();
                double scaleY = pageFormat.getImageableHeight() / jDesktopPane1.getHeight();
                double scale = Math.min(scaleX, scaleY);
                g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
                g2d.scale(scale, scale);

                // Dibujar el contenido del JDesktopPane
                jDesktopPane1.printAll(g2d);
                return Printable.PAGE_EXISTS;
            }
        });

        // Mostrar el diálogo de impresión
        if (job.printDialog()) {
            
            try {
                
                job.print(); // Imprimir
                Utilidades.mostrarDialogoTemporal("Éxito", "Impresión completada.", 2000);
            } catch (PrinterException ex) {
                
                Utilidades.mostrarDialogoTemporal("Error", "Error al imprimir: " + ex.getMessage(), 2000);
            }
        }
    }//GEN-LAST:event_jBimprimirActionPerformed

    public static void main(String args[]) {

        /* Crea y muetra el form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new Ticket().setVisible(true);      
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
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
    private javax.swing.JTextField jtFecha;
    private javax.swing.JTextField jtHora;
    private javax.swing.JTable jtTicket;
    private javax.swing.JTextField jtTotal;
    // End of variables declaration//GEN-END:variables

    private void armarCabeceraProdPed() {

        modelo.addColumn("DESCRIPCION");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("IMPORTE");
        jtTicket.setModel(modelo); 
    }

    private void cargarPedido(int id) {

        double total = 0.0;
        List<PedidoProducto> pedidoP = ppd.BuscarProductosxIdPedido(id);

        for (PedidoProducto pp : pedidoP) {

            modelo.addRow(new Object[]{pp.getProducto().getNombre(), pp.getCantidad(), pp.getImporte()});
            total += pp.getImporte();
        }

        jtTotal.setText(total + "");
    }

    private void generarPDF() {

        // Obtener la fecha y hora actual
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy_hh.mma");
        String fechaHoraActual = dateFormat.format(new Date());

        // Crear el nombre del archivo con la fecha y hora actual
        String filePath = "Tikets/ticket_" + fechaHoraActual + ".pdf"; // Ruta donde se guardará el PDF

        // Verificar si la carpeta "Tikets" existe, y si no, crearla
        File carpetaTikets = new File("Tikets");
        
        if (!carpetaTikets.exists()) {
            
            if (carpetaTikets.mkdir()) {
                
                Utilidades.mostrarDialogoTemporal("Error","Carpeta 'Tikets' creada correctamente.",2000);
                
            } else {
                
                Utilidades.mostrarDialogoTemporal("Error","No se pudo crear la carpeta 'Tikets'.",2000);
                return; // Salir del método si no se puede crear la carpeta
            }
        }

        // Generar el PDF
        Pdf.generarPdfDesktopPane(jDesktopPane1, filePath);
        Utilidades.mostrarDialogoTemporal("Error","PDF generado en: " + filePath,2000);
    }
}
