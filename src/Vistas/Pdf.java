package Vistas;

import com.itextpdf.awt.PdfGraphics2D;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Graphics2D;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;

public class Pdf {

    public static void generarPDF(JFrame frame, String filePath) {

        Document document = new Document(PageSize.A4) {
            
        };

        try {

            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();

            PdfContentByte cb = writer.getDirectContent();
            PdfTemplate template = cb.createTemplate(frame.getWidth(), frame.getHeight());
            Graphics2D g2d = new PdfGraphics2D(template, frame.getWidth(), frame.getHeight());


            frame.printAll(g2d);
            g2d.dispose();

            cb.addTemplate(template, 0, 0);

        } catch (DocumentException | IOException e) {

            e.printStackTrace();

        } finally {

            document.close();
        }
    }

    public static void generarPdfDesktopPane(JDesktopPane desktopPane, String filePath) {
        
        // Crear un documento PDF
        Document document = new Document(PageSize.A4);

        try {
            
            // Inicializar el escritor del PDF
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();

            // Obtener el contenido del JDesktopPane
            PdfContentByte cb = writer.getDirectContent();
            PdfTemplate template = cb.createTemplate(desktopPane.getWidth(), desktopPane.getHeight());

            // Crear un Graphics2D para dibujar el contenido del JDesktopPane en el PDF
            Graphics2D g2d = new PdfGraphics2D(template, desktopPane.getWidth(), desktopPane.getHeight());


            // Dibujar el contenido del JDesktopPane en el Graphics2D
            desktopPane.printAll(g2d);
            g2d.dispose();

            // Añadir el contenido al PDF
            cb.addTemplate(template, 0, 0);

        } catch (DocumentException | IOException e) {
            
            e.printStackTrace();
            
        } finally {
            
            // Cerrar el documento
            document.close();
        }
    }
}
