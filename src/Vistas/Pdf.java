package Vistas;

import com.itextpdf.awt.PdfGraphics2D;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Component;
import java.awt.Graphics2D;
import java.io.FileOutputStream;
import java.io.IOException;


public class Pdf {

    public static void generarPDF(Component component, String filePath) {
        
        Document document = new Document(PageSize.A4);

        try {
            
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();

            PdfContentByte cb = writer.getDirectContent();
            PdfTemplate template = cb.createTemplate(component.getWidth(), component.getHeight());

            // Crear un Graphics2D para dibujar el componente en el PDF
            Graphics2D g2d = new PdfGraphics2D(template, component.getWidth(), component.getHeight());

            // Dibujar el contenido del componente
            component.printAll(g2d);
            g2d.dispose();

            // Añadir el contenido al PDF
            cb.addTemplate(template, 0, 0);

        } catch (DocumentException | IOException e) {
            
            e.printStackTrace();
            
        } finally {
            
            document.close();
        }
    }
}