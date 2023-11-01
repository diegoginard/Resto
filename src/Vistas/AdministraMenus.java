
package Vistas;

import BaseDatos.ProductoData;
import Entidades.Producto;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

public class AdministraMenus extends JInternalFrame {

    public AdministraMenus() {
        
        initComponents();
        armarCabecera();
        cargarLista();
        jbBorrar.setEnabled(false);
        jbModificar.setEnabled(false);
        jtBuscar.setEnabled(false);
        jcCategoria2.setEnabled(false);
        
    }

    
    private DefaultTableModel modelo = new DefaultTableModel(){
        
        @Override
        public boolean isCellEditable(int fila, int columna) {
            
            return false;
        
        }
    };
    
    ProductoData pd = new ProductoData();
    Producto produ = new Producto();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        ImageIcon icono = new ImageIcon(getClass().getResource("/Recursos/FMENU.jpg"));
        Image imagen = icono.getImage();
        escritorio = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){

                g.drawImage(imagen,0,0,getWidth(),getHeight(),this);

            }
        };
        jtId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jtPrecio = new javax.swing.JTextField();
        jtStock = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtListaMenu = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jbCrear = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jbModificar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtBuscar = new javax.swing.JTextField();
        jrEstado = new javax.swing.JRadioButton();
        jbBorrar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jbActualizar = new javax.swing.JButton();
        jcBuscar = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jcCategoria = new javax.swing.JComboBox<>();
        jcCategoria2 = new javax.swing.JComboBox<>();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        escritorio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        escritorio.setToolTipText("");
        escritorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtIdMouseClicked(evt);
            }
        });
        jtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtIdKeyTyped(evt);
            }
        });
        escritorio.add(jtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 50, 38, -1));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ADMINISTRACION DE MENUS");
        escritorio.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 340, 28));
        escritorio.add(jtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 86, 163, -1));

        jtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtPrecioKeyTyped(evt);
            }
        });
        escritorio.add(jtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 122, 50, -1));

        jtStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtStockKeyTyped(evt);
            }
        });
        escritorio.add(jtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 50, 41, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Id");
        escritorio.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 50, -1, 24));

        jtListaMenu.setModel(new javax.swing.table.DefaultTableModel(
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
        jtListaMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtListaMenuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtListaMenu);

        escritorio.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, -1, 184));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("Nombre");
        escritorio.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 90, -1, -1));

        jbCrear.setText("Crear");
        jbCrear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearActionPerformed(evt);
            }
        });
        escritorio.add(jbCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 211, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("Precio");
        escritorio.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 126, -1, -1));

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });
        escritorio.add(jbModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 211, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("Stock");
        escritorio.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 54, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("Estado");
        escritorio.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 126, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 0));
        jLabel7.setText("Buscar");
        escritorio.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 252, -1, -1));

        jtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtBuscarKeyReleased(evt);
            }
        });
        escritorio.add(jtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 248, 111, -1));
        escritorio.add(jrEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 122, -1, -1));

        jbBorrar.setText("Borrar");
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });
        escritorio.add(jbBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 211, -1, -1));

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        escritorio.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 510, 63, -1));

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });
        escritorio.add(jbLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 211, -1, -1));

        jbActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/refresh.png"))); // NOI18N
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });
        escritorio.add(jbActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 497, 51, -1));

        jcBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...........", "idProducto", "Nombre", "Precio", "Stock", "Estado", "Categoria" }));
        jcBuscar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcBuscarItemStateChanged(evt);
            }
        });
        jcBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcBuscarActionPerformed(evt);
            }
        });
        escritorio.add(jcBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 247, 97, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 0));
        jLabel8.setText("Categoria");
        escritorio.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 167, -1, -1));

        jcCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".............", "COMIDA", "BEBIDA", "POSTRE" }));
        escritorio.add(jcCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 162, -1, -1));

        jcCategoria2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..........", "COMIDA", "BEBIDA", "POSTRE" }));
        jcCategoria2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCategoria2ActionPerformed(evt);
            }
        });
        escritorio.add(jcCategoria2, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 247, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        
        produ.setIdProducto(Integer.parseInt(jtId.getText()));
        produ.setNombre(jtNombre.getText());
        produ.setPrecio(Double.parseDouble(jtPrecio.getText()));
        produ.setStock(Integer.parseInt(jtStock.getText()));
        produ.setEstado(jrEstado.isSelected());
        produ.setCategoria(jcCategoria.getSelectedItem()+"");

        pd.ModificarProducto(produ);
        cargarLista();
        limpiar();
        
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtBuscarKeyReleased
        
        modelo.setRowCount(0);
        String buscar = jtBuscar.getText();
        int indice = jcBuscar.getSelectedIndex();
        int indice1 = jcCategoria2.getSelectedIndex();
         
        switch (indice) {

            case 1:
                
                List<Producto> buscarId = pd.BuscarProductosId(buscar);

                for (Producto pro : buscarId) {

                    modelo.addRow(new Object[]{pro.getIdProducto(),
                        pro.getNombre(), pro.getPrecio(), pro.getStock(), pro.isEstado(), pro.getCategoria()});

                }
                
                break; 

            case 2:
                
                List<Producto> buscarNombre = pd.BuscarProductosNombre(buscar);

                for (Producto pro : buscarNombre) {

                    modelo.addRow(new Object[]{pro.getIdProducto(),
                        pro.getNombre(), pro.getPrecio(), pro.getStock(), pro.isEstado(), pro.getCategoria()});

                }
                
                break;

            case 3:
                
                List<Producto> buscarPrecio = pd.BuscarProductosPrecio(buscar);

                for (Producto pro : buscarPrecio) {

                    modelo.addRow(new Object[]{pro.getIdProducto(),
                        pro.getNombre(), pro.getPrecio(), pro.getStock(), pro.isEstado(), pro.getCategoria()});

                }
                
                break;

            case 4:
                
                List<Producto> buscarStock = pd.BuscarProductoStock(buscar);

                for (Producto pro : buscarStock) {

                    modelo.addRow(new Object[]{pro.getIdProducto(),
                        pro.getNombre(), pro.getPrecio(), pro.getStock(), pro.isEstado(), pro.getCategoria()});

                }
                
                break;
            
            case 5:
                
                List<Producto> buscarEstado = pd.BuscarProductoEstado(buscar);

                for (Producto pro : buscarEstado) {

                    modelo.addRow(new Object[]{pro.getIdProducto(),
                        pro.getNombre(), pro.getPrecio(), pro.getStock(), pro.isEstado(), pro.getCategoria()});

                }
                
                break;
            
            case 6:

                if (indice1 == 1) {

                    modelo.setRowCount(0);
                    List<Producto> buscarCategoria = pd.BuscarCategComida(buscar);

                    for (Producto pro : buscarCategoria) {

                        modelo.addRow(new Object[]{pro.getIdProducto(),
                            pro.getNombre(), pro.getPrecio(), pro.getStock(), pro.isEstado(), pro.getCategoria()});

                    }

                } else if (indice1 == 2) {

                    modelo.setRowCount(0);
                    List<Producto> buscarCategoria = pd.BuscarCategBebida(buscar);

                    for (Producto pro : buscarCategoria) {

                        modelo.addRow(new Object[]{pro.getIdProducto(),
                            pro.getNombre(), pro.getPrecio(), pro.getStock(), pro.isEstado(), pro.getCategoria()});

                    }

                } else if (indice1 == 3) {

                    modelo.setRowCount(0);
                    List<Producto> buscarCategoria = pd.BuscarCategPostre(buscar);

                    for (Producto pro : buscarCategoria) {

                        modelo.addRow(new Object[]{pro.getIdProducto(),
                            pro.getNombre(), pro.getPrecio(), pro.getStock(), pro.isEstado(), pro.getCategoria()});

                    }
                }
        }
    }//GEN-LAST:event_jtBuscarKeyReleased

    private void jbCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearActionPerformed
        
        try {
            
            produ.setNombre(jtNombre.getText());
            produ.setPrecio(Double.parseDouble(jtPrecio.getText()));
            produ.setStock(Integer.parseInt(jtStock.getText()));
 
            int categ = jcCategoria.getSelectedIndex();
            if (categ == 0){
            
                 JOptionPane.showMessageDialog(rootPane, "Seleccione una categoria");
                 
            }else{
                produ.setCategoria(jcCategoria.getSelectedItem()+"");
                pd.guardarProducto(produ);
                cargarLista();
            }

        } catch (NumberFormatException  ex) {
            
            JOptionPane.showMessageDialog(rootPane, "Debe rellenar todos los campos " );
            
        }
    }//GEN-LAST:event_jbCrearActionPerformed

    private void jtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIdKeyTyped

        soloNumeros(evt);

    }//GEN-LAST:event_jtIdKeyTyped

    private void jtStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtStockKeyTyped

        soloNumeros(evt);

    }//GEN-LAST:event_jtStockKeyTyped

    private void jtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecioKeyTyped

        soloNumeros(evt);

    }//GEN-LAST:event_jtPrecioKeyTyped

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        
        dispose();
        
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        
        cargarLista();
        
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jtListaMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtListaMenuMouseClicked
        
        int fila = jtListaMenu.getSelectedRow();
        
        jbBorrar.setEnabled(true);
        jbModificar.setEnabled(true);
        jbCrear.setEnabled(false);
        jtId.setText(jtListaMenu.getValueAt(fila, 0)+"");
        jtNombre.setText(jtListaMenu.getValueAt(fila, 1)+"");
        jtPrecio.setText(jtListaMenu.getValueAt(fila, 2)+"");
        jtStock.setText(jtListaMenu.getValueAt(fila, 3)+"");
        jrEstado.setSelected((boolean) jtListaMenu.getValueAt(fila, 4));
        jcCategoria.setSelectedItem(jtListaMenu.getValueAt(fila, 5)+"");
            
    }//GEN-LAST:event_jtListaMenuMouseClicked

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
  
        limpiar();
        
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
      
        try{
            
            int id = Integer.parseInt(jtId.getText());       
            pd.eliminarProducto(id);
           
        }catch(NumberFormatException ex){
            
            JOptionPane.showMessageDialog(rootPane, "Ingrese un numero de ID");
            
        }
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jtIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtIdMouseClicked
        
        jbBorrar.setEnabled(true);
        
    }//GEN-LAST:event_jtIdMouseClicked

    private void jcBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcBuscarActionPerformed
        
        int index = jcBuscar.getSelectedIndex();
        
        if (index == 6){
            
            jcCategoria2.setEnabled(true);
            
        }else{
        
            jcCategoria2.setEnabled(false);
        
        }
    }//GEN-LAST:event_jcBuscarActionPerformed

    private void jcBuscarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcBuscarItemStateChanged
        
        cargarLista();
        int indice = jcBuscar.getSelectedIndex();
        
        if(indice != 0){
            
            jtBuscar.setEnabled(true);
            
        }else{
        
            jtBuscar.setEnabled(false);
        
        }     
    }//GEN-LAST:event_jcBuscarItemStateChanged

    private void jcCategoria2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCategoria2ActionPerformed

        int indice = jcCategoria2.getSelectedIndex();     
        
        if (indice == 1) {
            
            modelo.setRowCount(0);
            List<Producto> buscarCategoria = pd.listarProdCateg(indice);

            for (Producto pro : buscarCategoria) {

                modelo.addRow(new Object[]{pro.getIdProducto(),
                    pro.getNombre(), pro.getPrecio(), pro.getStock(), pro.isEstado(), pro.getCategoria()});

            }

        } else if (indice == 2) {
            
            modelo.setRowCount(0);
            List<Producto> buscarCategoria = pd.listarProdCateg(indice);

            for (Producto pro : buscarCategoria) {

                modelo.addRow(new Object[]{pro.getIdProducto(),
                    pro.getNombre(), pro.getPrecio(), pro.getStock(), pro.isEstado(), pro.getCategoria()});

            }

        } else if (indice == 3) {
            
            modelo.setRowCount(0);
            List<Producto> buscarCategoria = pd.listarProdCateg(indice);

            for (Producto pro : buscarCategoria) {

                modelo.addRow(new Object[]{pro.getIdProducto(),
                    pro.getNombre(), pro.getPrecio(), pro.getStock(), pro.isEstado(), pro.getCategoria()});

            }
        }
    }//GEN-LAST:event_jcCategoria2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbCrear;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcBuscar;
    private javax.swing.JComboBox<String> jcCategoria;
    private javax.swing.JComboBox<String> jcCategoria2;
    private javax.swing.JRadioButton jrEstado;
    private javax.swing.JTextField jtBuscar;
    private javax.swing.JTextField jtId;
    private javax.swing.JTable jtListaMenu;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextField jtStock;
    // End of variables declaration//GEN-END:variables

 private void cargarLista() {

        List<Producto> menus = pd.listarTodosLosProductos();
        modelo.setRowCount(0);

        for (Producto pro : menus) {

            modelo.addRow(new Object[]{pro.getIdProducto(),
                pro.getNombre(), pro.getPrecio(),pro.getStock(),pro.isEstado(), pro.getCategoria()});

        }
    }
    
    private void armarCabecera() {

        modelo.addColumn("IProducto");
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        modelo.addColumn("Estado");
        modelo.addColumn("Categoria");
        jtListaMenu.setModel(modelo);

    }
    
    private void soloNumeros(KeyEvent evt){
        
        char validar = evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo numeros");
            
        }
    }

    private void limpiar(){
    
        jbCrear.setEnabled(true);
        jbBorrar.setEnabled(false);
        jbModificar.setEnabled(false);
        jtId.setText("");
        jtNombre.setText("");
        jtPrecio.setText("");
        jtStock.setText("");
        jrEstado.setSelected(false);
        jtBuscar.setText("");
        jcBuscar.setSelectedIndex(0);
        jcCategoria.setSelectedIndex(0);
        jcCategoria2.setSelectedIndex(0);
        
    }
}
