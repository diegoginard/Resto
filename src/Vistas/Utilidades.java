package Vistas;


import java.awt.event.KeyEvent;
import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Utilidades {

    public static void mostrarDialogoTemporal(String titulo, String mensaje, int milisegundos) {
        try {
            // Crear un JOptionPane para configurar el diálogo
            JOptionPane option = new JOptionPane(mensaje, JOptionPane.INFORMATION_MESSAGE);

            // Crear el diálogo desde el JOptionPane
            JDialog dialog = option.createDialog(null, titulo);

            // Configurar el botón de opción para que no se muestre
            option.setOptions(new Object[]{});

            // Crear un hilo para cerrar el diálogo después del tiempo especificado
            new Thread(() -> {
                try {
                    Thread.sleep(milisegundos);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Utilidades.class.getName()).log(Level.SEVERE, null, ex);
                }
                dialog.dispose(); // Cerrar el diálogo
            }).start();

            // Mostrar el diálogo
            dialog.setVisible(true);
        } catch (Exception e) {
            Logger.getLogger(Utilidades.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
