package Vistas;

import BaseDatos.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class AdministrarConexion extends JFrame {

    private Connection con = null;

    public AdministrarConexion() {
        initComponents();
        cargarConfig();
        cargarConfigSql();
        this.setLocationRelativeTo(null); //El jframe se inicia en el centro de la pantalla.
        setIconImage(getIconImage()); //se inicia el icono en la barra de titulo.
    }
    
    /**
     * Sobrescribe el método getIconImage para establecer el icono de la
     * ventana. Carga una imagen desde los recursos del proyecto utilizando la
     * ruta especificada.
     *
     * @return Un objeto Image que representa el icono de la ventana.
     */
     @Override
    public Image getIconImage() {

        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Recursos/Lock.png"));

        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBconex = new javax.swing.JButton();
        jBcrearDB = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jTmenu = new javax.swing.JTabbedPane();
        jPconex = new javax.swing.JPanel();
        jLtituloCon = new javax.swing.JLabel();
        jLdriver = new javax.swing.JLabel();
        jLurl = new javax.swing.JLabel();
        jLdb = new javax.swing.JLabel();
        jLuser = new javax.swing.JLabel();
        jLpass = new javax.swing.JLabel();
        jTdriver = new javax.swing.JTextField();
        jTurl = new javax.swing.JTextField();
        jTdb = new javax.swing.JTextField();
        jTuser = new javax.swing.JTextField();
        jTpass = new javax.swing.JTextField();
        jbconectar = new javax.swing.JButton();
        jLfondo1 = new javax.swing.JLabel();
        jPcrearDB = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTurl1 = new javax.swing.JTextField();
        jLurl1 = new javax.swing.JLabel();
        jTuser1 = new javax.swing.JTextField();
        jLuser1 = new javax.swing.JLabel();
        jTpass1 = new javax.swing.JTextField();
        jLpass1 = new javax.swing.JLabel();
        jBcrear = new javax.swing.JButton();
        jLfondo2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setLocation(new java.awt.Point(0, 0));
        setName(""); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBconex.setBackground(new java.awt.Color(35, 42, 68));
        jBconex.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jBconex.setForeground(new java.awt.Color(211, 211, 211));
        jBconex.setText("Conexion");
        jBconex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBconexActionPerformed(evt);
            }
        });
        jPanel1.add(jBconex, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 140, 40));

        jBcrearDB.setBackground(new java.awt.Color(35, 42, 68));
        jBcrearDB.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jBcrearDB.setForeground(new java.awt.Color(211, 211, 211));
        jBcrearDB.setText("Crear BD");
        jBcrearDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcrearDBActionPerformed(evt);
            }
        });
        jPanel1.add(jBcrearDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 140, 40));

        jBsalir.setBackground(new java.awt.Color(35, 42, 68));
        jBsalir.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jBsalir.setForeground(new java.awt.Color(211, 211, 211));
        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });
        jPanel1.add(jBsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 140, 40));

        jPconex.setForeground(new java.awt.Color(211, 211, 211));
        jPconex.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLtituloCon.setBackground(new java.awt.Color(51, 51, 51));
        jLtituloCon.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLtituloCon.setForeground(new java.awt.Color(204, 204, 204));
        jLtituloCon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLtituloCon.setText("Conexion a base de datos");
        jPconex.add(jLtituloCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 300, 40));

        jLdriver.setBackground(new java.awt.Color(51, 51, 51));
        jLdriver.setForeground(new java.awt.Color(211, 211, 211));
        jLdriver.setText("DRIVER");
        jPconex.add(jLdriver, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLurl.setBackground(new java.awt.Color(51, 51, 51));
        jLurl.setForeground(new java.awt.Color(211, 211, 211));
        jLurl.setText("URL");
        jPconex.add(jLurl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLdb.setBackground(new java.awt.Color(51, 51, 51));
        jLdb.setForeground(new java.awt.Color(211, 211, 211));
        jLdb.setText("DB");
        jPconex.add(jLdb, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLuser.setBackground(new java.awt.Color(51, 51, 51));
        jLuser.setForeground(new java.awt.Color(211, 211, 211));
        jLuser.setText("USER");
        jPconex.add(jLuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLpass.setBackground(new java.awt.Color(51, 51, 51));
        jLpass.setForeground(new java.awt.Color(211, 211, 211));
        jLpass.setText("PASS");
        jPconex.add(jLpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jTdriver.setBackground(new java.awt.Color(35, 42, 68));
        jTdriver.setForeground(new java.awt.Color(211, 211, 211));
        jTdriver.setBorder(null);
        jTdriver.setCaretColor(new java.awt.Color(255, 255, 255));
        jPconex.add(jTdriver, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 66, 222, 20));

        jTurl.setBackground(new java.awt.Color(35, 42, 68));
        jTurl.setForeground(new java.awt.Color(211, 211, 211));
        jTurl.setBorder(null);
        jTurl.setCaretColor(new java.awt.Color(255, 255, 255));
        jPconex.add(jTurl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 106, 222, 20));

        jTdb.setBackground(new java.awt.Color(35, 42, 68));
        jTdb.setForeground(new java.awt.Color(211, 211, 211));
        jTdb.setBorder(null);
        jTdb.setCaretColor(new java.awt.Color(255, 255, 255));
        jPconex.add(jTdb, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 146, 222, 20));

        jTuser.setBackground(new java.awt.Color(35, 42, 68));
        jTuser.setForeground(new java.awt.Color(211, 211, 211));
        jTuser.setBorder(null);
        jTuser.setCaretColor(new java.awt.Color(255, 255, 255));
        jPconex.add(jTuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 186, 222, 20));

        jTpass.setBackground(new java.awt.Color(35, 42, 68));
        jTpass.setForeground(new java.awt.Color(211, 211, 211));
        jTpass.setBorder(null);
        jTpass.setCaretColor(new java.awt.Color(255, 255, 255));
        jPconex.add(jTpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 226, 222, 20));

        jbconectar.setBackground(new java.awt.Color(35, 42, 68));
        jbconectar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jbconectar.setForeground(new java.awt.Color(204, 204, 204));
        jbconectar.setText("Conectar");
        jbconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbconectarActionPerformed(evt);
            }
        });
        jPconex.add(jbconectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 170, 40));

        jLfondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/conex.jpg"))); // NOI18N
        jPconex.add(jLfondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 350));

        jTmenu.addTab("1", jPconex);

        jPcrearDB.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Crear base de datos");
        jPcrearDB.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 300, 50));

        jTurl1.setBackground(new java.awt.Color(35, 42, 68));
        jTurl1.setForeground(new java.awt.Color(211, 211, 211));
        jTurl1.setBorder(null);
        jPcrearDB.add(jTurl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 86, 222, 20));

        jLurl1.setBackground(new java.awt.Color(51, 51, 51));
        jLurl1.setForeground(new java.awt.Color(204, 204, 204));
        jLurl1.setText("URL");
        jPcrearDB.add(jLurl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jTuser1.setBackground(new java.awt.Color(35, 42, 68));
        jTuser1.setForeground(new java.awt.Color(211, 211, 211));
        jTuser1.setBorder(null);
        jPcrearDB.add(jTuser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 146, 222, 20));

        jLuser1.setBackground(new java.awt.Color(51, 51, 51));
        jLuser1.setForeground(new java.awt.Color(204, 204, 204));
        jLuser1.setText("USER");
        jPcrearDB.add(jLuser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jTpass1.setBackground(new java.awt.Color(35, 42, 68));
        jTpass1.setForeground(new java.awt.Color(211, 211, 211));
        jTpass1.setBorder(null);
        jPcrearDB.add(jTpass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 206, 222, 20));

        jLpass1.setBackground(new java.awt.Color(51, 51, 51));
        jLpass1.setForeground(new java.awt.Color(204, 204, 204));
        jLpass1.setText("PASS");
        jPcrearDB.add(jLpass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jBcrear.setBackground(new java.awt.Color(35, 42, 68));
        jBcrear.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jBcrear.setForeground(new java.awt.Color(211, 211, 211));
        jBcrear.setText("Crear");
        jBcrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcrearActionPerformed(evt);
            }
        });
        jPcrearDB.add(jBcrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 170, 40));

        jLfondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/conex.jpg"))); // NOI18N
        jPcrearDB.add(jLfondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 350));
        jLfondo2.getAccessibleContext().setAccessibleName("");

        jTmenu.addTab("2", jPcrearDB);

        jPanel1.add(jTmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, -30, 400, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/conexion.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 350));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 352));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void cargarConfigSql(){
        
        Properties properties = new Properties();

        try (FileInputStream fis = new FileInputStream("configSql.txt")) {

            // Cargar las propiedades desde el archivo
            properties.load(fis);

            // Asignar valores a las variables
            String URL = properties.getProperty("URL");  
            String USUARIO = properties.getProperty("USUARIO");
            String PASSWORD = properties.getProperty("PASSWORD");


            jTurl1.setText(URL);
            jTuser1.setText(USUARIO);
            jTpass1.setText(PASSWORD);

        } catch (IOException e) {

            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, "Error al cargar configuración", e);
            Utilidades.mostrarDialogoTemporal("Error", "No se pudo cargar el archivo de configuración.", 3000);
            System.exit(1);

        }
       
    }
    
    private void cargarConfig(){
        
        Properties properties = new Properties();

        try (FileInputStream fis = new FileInputStream("config.txt")) {

            // Cargar las propiedades desde el archivo
            properties.load(fis);

            // Asignar valores a las variables
            String DRIVER = properties.getProperty("DRIVER");
            String URL = properties.getProperty("URL");
            String DB = properties.getProperty("DB");
            String USUARIO = properties.getProperty("USUARIO");
            String PASSWORD = properties.getProperty("PASSWORD");

            jTdriver.setText(DRIVER);
            jTurl.setText(URL);
            jTurl1.setText(URL);
            jTdb.setText(DB);
            jTuser.setText(USUARIO);
            jTuser1.setText(USUARIO);
            jTpass.setText(PASSWORD);
            jTpass1.setText(PASSWORD);

        } catch (IOException e) {

            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, "Error al cargar configuración", e);
            Utilidades.mostrarDialogoTemporal("Error", "No se pudo cargar el archivo de configuración.", 3000);
            System.exit(1);

        }
       
    }
    private void jbconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbconectarActionPerformed

        Properties properties = new Properties();

        try (FileOutputStream fos = new FileOutputStream("config.txt")) {

            // Asignar valores de los JTextField a las propiedades
            properties.setProperty("DRIVER", jTdriver.getText());
            properties.setProperty("URL", jTurl.getText());
            properties.setProperty("DB", jTdb.getText());
            properties.setProperty("USUARIO", jTuser.getText());
            properties.setProperty("PASSWORD", jTpass.getText());

            // Guardar las propiedades en el archivo
            properties.store(fos, "Configuración de la conexión a la base de datos");

            // Mensaje de confirmación
            Utilidades.mostrarDialogoTemporal("Guardado", "Configuración guardada exitosamente.", 2000);

        } catch (IOException e) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, "Error al guardar configuración", e);
            Utilidades.mostrarDialogoTemporal("Error", "No se pudo guardar la configuración.", 3000);
        }
        
        Conexion.cerrarConexion();
        con = Conexion.getConexion();

    }//GEN-LAST:event_jbconectarActionPerformed

    private void jBcrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcrearActionPerformed
        
        Properties properties = new Properties();

        try (FileOutputStream fos = new FileOutputStream("configSql.txt")) {

            // Asignar valores de los JTextField a las propiedades
            
            properties.setProperty("URL", jTurl1.getText());
            properties.setProperty("USUARIO", jTuser1.getText());
            properties.setProperty("PASSWORD", jTpass1.getText());

            // Guardar las propiedades en el archivo
            properties.store(fos, "Configuración de la conexión a la base de datos");

            // Mensaje de confirmación
            Utilidades.mostrarDialogoTemporal("Guardado", "Configuración guardada exitosamente.", 2000);

        } catch (IOException e) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, "Error al guardar configuración", e);
            Utilidades.mostrarDialogoTemporal("Error", "No se pudo guardar la configuración.", 3000);
        }
        
        Conexion.crearBD();
        
    }//GEN-LAST:event_jBcrearActionPerformed

    private void jBconexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBconexActionPerformed

        jTmenu.setSelectedIndex(0);
        
    }//GEN-LAST:event_jBconexActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBcrearDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcrearDBActionPerformed

        jTmenu.setSelectedIndex(1);
        
    }//GEN-LAST:event_jBcrearDBActionPerformed

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
            java.util.logging.Logger.getLogger(AdministrarConexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministrarConexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministrarConexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministrarConexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministrarConexion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBconex;
    private javax.swing.JButton jBcrear;
    private javax.swing.JButton jBcrearDB;
    private javax.swing.JButton jBsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLdb;
    private javax.swing.JLabel jLdriver;
    private javax.swing.JLabel jLfondo1;
    private javax.swing.JLabel jLfondo2;
    private javax.swing.JLabel jLpass;
    private javax.swing.JLabel jLpass1;
    private javax.swing.JLabel jLtituloCon;
    private javax.swing.JLabel jLurl;
    private javax.swing.JLabel jLurl1;
    private javax.swing.JLabel jLuser;
    private javax.swing.JLabel jLuser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPconex;
    private javax.swing.JPanel jPcrearDB;
    private javax.swing.JTextField jTdb;
    private javax.swing.JTextField jTdriver;
    private javax.swing.JTabbedPane jTmenu;
    private javax.swing.JTextField jTpass;
    private javax.swing.JTextField jTpass1;
    private javax.swing.JTextField jTurl;
    private javax.swing.JTextField jTurl1;
    private javax.swing.JTextField jTuser;
    private javax.swing.JTextField jTuser1;
    private javax.swing.JButton jbconectar;
    // End of variables declaration//GEN-END:variables
}



