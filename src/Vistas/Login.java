
package Vistas;

import BaseDatos.Conexion;
import java.sql.Connection;
import BaseDatos.UsuarioData;
import Entidades.Usuario;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

public class Login extends JFrame {
    
    public String nombre;
    public String apellido;
    private Connection con = null;

    public Login() {

        con = Conexion.getConexion();
        initComponents();
        this.setLocationRelativeTo(null); //El jframe se inicia en el centro de la pantalla.
        setIconImage(getIconImage()); //se inicia el icono en la barra de titulo.
        
        // Agregar un KeyAdapter al campo de contraseña
        jpContraseña.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    login(); // Método para manejar el inicio de sesión

                }
            }
        });
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

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jbEntrar = new javax.swing.JButton();
        jbconex = new javax.swing.JButton();
        jpContraseña = new javax.swing.JPasswordField();
        jLcontraseña = new javax.swing.JLabel();
        jLusuario = new javax.swing.JLabel();
        jtUsuario = new javax.swing.JTextField();
        jLiniSecion = new javax.swing.JLabel();
        jLfondo = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbEntrar.setBackground(new java.awt.Color(35, 42, 68));
        jbEntrar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jbEntrar.setForeground(new java.awt.Color(204, 204, 204));
        jbEntrar.setText("Entrar");
        jbEntrar.setMaximumSize(new java.awt.Dimension(81, 22));
        jbEntrar.setMinimumSize(new java.awt.Dimension(81, 22));
        jbEntrar.setName(""); // NOI18N
        jbEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(jbEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 110, 40));

        jbconex.setBackground(new java.awt.Color(35, 42, 68));
        jbconex.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jbconex.setForeground(new java.awt.Color(204, 204, 204));
        jbconex.setText("Conexion");
        jbconex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbconexActionPerformed(evt);
            }
        });
        jPanel1.add(jbconex, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 100, 40));

        jpContraseña.setBackground(new java.awt.Color(35, 42, 68));
        jpContraseña.setForeground(new java.awt.Color(211, 211, 211));
        jpContraseña.setBorder(null);
        jpContraseña.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(jpContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 180, 20));

        jLcontraseña.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        jLcontraseña.setForeground(new java.awt.Color(255, 255, 255));
        jLcontraseña.setText("Contraseña");
        jPanel1.add(jLcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLusuario.setBackground(java.awt.Color.white);
        jLusuario.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        jLusuario.setForeground(new java.awt.Color(255, 255, 255));
        jLusuario.setText("Usuario ");
        jPanel1.add(jLusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jtUsuario.setBackground(new java.awt.Color(35, 42, 68));
        jtUsuario.setForeground(new java.awt.Color(211, 211, 211));
        jtUsuario.setBorder(null);
        jtUsuario.setCaretColor(new java.awt.Color(255, 255, 255));
        jtUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(jtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 180, 20));

        jLiniSecion.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        jLiniSecion.setForeground(new java.awt.Color(255, 255, 255));
        jLiniSecion.setText("Iniciar Seción");
        jPanel1.add(jLiniSecion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        jLfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/segurity.png"))); // NOI18N
        jPanel1.add(jLfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void login() {

        String usuarioIngresado = jtUsuario.getText();
        String contraseñaIngresada = new String(jpContraseña.getPassword());

        // Verificar campos vacíos
        if (usuarioIngresado.isEmpty() || contraseñaIngresada.isEmpty()) {
            Utilidades.mostrarDialogoTemporal("", "No se permiten campos vacíos.", 2000);
            return;
        }

        // Buscar usuario en la base de datos
        UsuarioData usuarioData = new UsuarioData();
        Usuario usuario = usuarioData.buscarUsuario(usuarioIngresado, contraseñaIngresada);

        if (usuario != null) {

            Utilidades.mostrarDialogoTemporal("", "¡Inicio de sesión exitoso! Bienvenido, " + usuario.getNombre(), 2000);
            IniciarSalon is = new IniciarSalon(); // Lógica para abrir la siguiente ventana
            nombre = usuario.getNombre();
            apellido = usuario.getApellido();
            is.recibirDatos(nombre, apellido); // Enviar los datos
            is.setVisible(true);
            dispose();

        } else {

            Utilidades.mostrarDialogoTemporal("", "Usuario o contraseña incorrectos.", 2000);

        }
    }

    private void jbEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEntrarActionPerformed

        login();

    }//GEN-LAST:event_jbEntrarActionPerformed

    private void jbconexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbconexActionPerformed
        
        AdministrarConexion ac = new AdministrarConexion();
        ac.setVisible(true);
        
    }//GEN-LAST:event_jbconexActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Login().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLcontraseña;
    private javax.swing.JLabel jLfondo;
    private javax.swing.JLabel jLiniSecion;
    private javax.swing.JLabel jLusuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JButton jbEntrar;
    private javax.swing.JButton jbconex;
    private javax.swing.JPasswordField jpContraseña;
    private javax.swing.JTextField jtUsuario;
    // End of variables declaration//GEN-END:variables
}
