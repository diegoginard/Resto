
package Vistas;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        
        initComponents();
        this.setLocationRelativeTo(null); 
        setIconImage(getIconImage());
        
         // Agregar un ActionListener al botón "Login"
        jbEntrar.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
                login(); // Método para manejar el inicio de sesión
                
            }
        });

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

    @Override
    public Image getIconImage(){
        
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Recursos/Lock.png"));
    
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbEntrar = new javax.swing.JButton();
        jpContraseña = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbEntrar.setText("Entrar");
        jbEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(jbEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 80, 40));
        jPanel1.add(jpContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 164, 180, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 164, -1, -1));

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 104, -1, -1));
        jPanel1.add(jtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 104, 180, -1));

        jLabel4.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Iniciar Seción");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/segurity.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 310));

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
        
        String Usuario = "admin";
        String Contraseña = "admin";

        String Pass = new String(jpContraseña.getPassword());

        if (jtUsuario.getText().isEmpty() || jpContraseña.getPassword().length == 0) {
            
            JOptionPane.showMessageDialog(null, "No se Permiten Casillas Vacias");
            
        } else if (jtUsuario.getText().equals(Usuario) && Pass.equals(Contraseña)) {
            
            IniciarSalon is = new IniciarSalon();
            is.setVisible(true);
            dispose();

        } else {
            
            JOptionPane.showMessageDialog(this, "Error al Entrar Usuario y/o Contraseña Incorrecta");
        }
    }
    
    private void jbEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEntrarActionPerformed
        
        login();
        
    }//GEN-LAST:event_jbEntrarActionPerformed

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new Login().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbEntrar;
    private javax.swing.JPasswordField jpContraseña;
    private javax.swing.JTextField jtUsuario;
    // End of variables declaration//GEN-END:variables
}
