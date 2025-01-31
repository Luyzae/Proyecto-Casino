/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.Registro;
import java.awt.Image;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import modelo.Producto;

/**
 *
 * @author Yo
 */
public class AgregarProducto extends javax.swing.JFrame {

    /**
     * Creates new form AgregarProducto
     */
    
    MenuPrincipal menu = new MenuPrincipal();
    
    String rutaImagen;
    
    
    private Registro registro;
    
    public AgregarProducto() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        this.registro = new Registro();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bottonAgregar = new javax.swing.JButton();
        bottonLimpiar = new javax.swing.JButton();
        categoriaProducto = new javax.swing.JComboBox<>();
        nombreProducto = new javax.swing.JTextField();
        precioProducto = new javax.swing.JTextField();
        cantidadProducto = new javax.swing.JTextField();
        bottonImagen = new javax.swing.JButton();
        textCategoria = new javax.swing.JLabel();
        textNombre = new javax.swing.JLabel();
        textPrecio = new javax.swing.JLabel();
        textCantidad = new javax.swing.JLabel();
        textImagen = new javax.swing.JLabel();
        verImagen = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Regresar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        modificar = new javax.swing.JMenuItem();
        eliminarM = new javax.swing.JMenuItem();
        listarM = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bottonAgregar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        bottonAgregar.setForeground(new java.awt.Color(0, 204, 0));
        bottonAgregar.setText("Agregar Producto");
        bottonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottonAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(bottonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(775, 158, -1, -1));

        bottonLimpiar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        bottonLimpiar.setForeground(new java.awt.Color(102, 102, 102));
        bottonLimpiar.setText("Limpar Casillas");
        bottonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottonLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(bottonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(775, 318, 140, -1));

        categoriaProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Bebida", "Comida" }));
        jPanel1.add(categoriaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 120, -1));
        jPanel1.add(nombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 120, -1));

        precioProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precioProductoKeyTyped(evt);
            }
        });
        jPanel1.add(precioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 120, -1));

        cantidadProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadProductoKeyTyped(evt);
            }
        });
        jPanel1.add(cantidadProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 120, -1));

        bottonImagen.setText("Elegir Imagen");
        bottonImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottonImagenActionPerformed(evt);
            }
        });
        jPanel1.add(bottonImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 120, -1));

        textCategoria.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        textCategoria.setForeground(new java.awt.Color(255, 255, 255));
        textCategoria.setText("Categoria:");
        jPanel1.add(textCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 49, -1, -1));

        textNombre.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        textNombre.setForeground(new java.awt.Color(255, 255, 255));
        textNombre.setText("Nombre:");
        jPanel1.add(textNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 119, -1, -1));

        textPrecio.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        textPrecio.setForeground(new java.awt.Color(255, 255, 255));
        textPrecio.setText("Precio:");
        jPanel1.add(textPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 207, -1, -1));

        textCantidad.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        textCantidad.setForeground(new java.awt.Color(255, 255, 255));
        textCantidad.setText("Cantidad:");
        jPanel1.add(textCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 290, -1, -1));

        textImagen.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        textImagen.setForeground(new java.awt.Color(255, 255, 255));
        textImagen.setText("Imagen:");
        jPanel1.add(textImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 378, -1, -1));
        jPanel1.add(verImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 120, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoMetodos.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, -1));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Home.png"))); // NOI18N
        jMenu1.setText("Inicio");

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        jMenu1.add(Regresar);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UsuarioLogo.png"))); // NOI18N
        jMenu2.setText("Usuario");

        modificar.setText("Modificar Productos");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        jMenu2.add(modificar);

        eliminarM.setText("Eliminar Productos");
        eliminarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarMActionPerformed(evt);
            }
        });
        jMenu2.add(eliminarM);

        listarM.setText("Listar Productos");
        listarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarMActionPerformed(evt);
            }
        });
        jMenu2.add(listarM);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed

        
        this.dispose();
        
        this.nombreProducto.setText("");
        this.precioProducto.setText("");
        this.cantidadProducto.setText("");
        this.categoriaProducto.setSelectedIndex(0);
        
        this.verImagen.setIcon(null);

    }//GEN-LAST:event_RegresarActionPerformed

    private void precioProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioProductoKeyTyped
        char validar = evt.getKeyChar();

        if(Character.isLetter(validar) || Character.isWhitespace(validar)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_precioProductoKeyTyped

    private void cantidadProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadProductoKeyTyped
        char validar = evt.getKeyChar();

        if(Character.isLetter(validar) || Character.isWhitespace(validar)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_cantidadProductoKeyTyped

    private void bottonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottonAgregarActionPerformed
        
        String categoria = this.categoriaProducto.getSelectedItem().toString();
        String nombre = this.nombreProducto.getText();
        String precioText = this.precioProducto.getText();
        String cantidadText = this.cantidadProducto.getText();
        
        
        if (!"Seleccionar".equals(categoria) && !nombre.isEmpty() && !precioText.isEmpty() && !cantidadText.isEmpty() && rutaImagen != null) {
            try {
                int precio = Integer.parseInt(precioText);
                int cantidad = Integer.parseInt(cantidadText);


                Path path = Paths.get(rutaImagen);
                byte[] img = Files.readAllBytes(path);

                if (registro.agregarProducto(new Producto(categoria, nombre, precio, cantidad, img))) {
                    JOptionPane.showMessageDialog(this, "Producto agregado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo agregar el producto", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException | IOException ex) {
                JOptionPane.showMessageDialog(this, "Error al procesar la información", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else { 
            JOptionPane.showMessageDialog(this, "Tienes que rellenar todas las casillas", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_bottonAgregarActionPerformed

    private void bottonImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottonImagenActionPerformed
        
        JFileChooser fileChooser = new JFileChooser();

        FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
        fileChooser.setFileFilter(extensionFilter);

        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            rutaImagen = fileChooser.getSelectedFile().getAbsolutePath();
            Image mImagen = new ImageIcon(rutaImagen).getImage();
            ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(this.verImagen.getWidth(), verImagen.getHeight(), 0));
            verImagen.setIcon(mIcono);
        }
    }//GEN-LAST:event_bottonImagenActionPerformed

    private void bottonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottonLimpiarActionPerformed
        
        this.nombreProducto.setText("");
        this.precioProducto.setText("");
        this.cantidadProducto.setText("");
        this.categoriaProducto.setSelectedIndex(0);
        
        this.verImagen.setIcon(null);
    }//GEN-LAST:event_bottonLimpiarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        
        ModificarProducto modificarr = new ModificarProducto();
        
        
        modificarr.setVisible(true);
        
        this.dispose();
        
        this.nombreProducto.setText("");
        this.precioProducto.setText("");
        this.cantidadProducto.setText("");
        this.categoriaProducto.setSelectedIndex(0);
        
        this.verImagen.setIcon(null);
        
    }//GEN-LAST:event_modificarActionPerformed

    private void eliminarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarMActionPerformed
        
        EliminarProducto eliminarr = new EliminarProducto();
        
        
        eliminarr.setVisible(true);
        
        this.dispose();
        
        this.nombreProducto.setText("");
        this.precioProducto.setText("");
        this.cantidadProducto.setText("");
        this.categoriaProducto.setSelectedIndex(0);
        
        this.verImagen.setIcon(null);
        
    }//GEN-LAST:event_eliminarMActionPerformed

    private void listarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarMActionPerformed
       
        ListarProducto listarr = new ListarProducto();
        
        
        listarr.setVisible(true);
        
        this.dispose();
        
        this.nombreProducto.setText("");
        this.precioProducto.setText("");
        this.cantidadProducto.setText("");
        this.categoriaProducto.setSelectedIndex(0);
        
        this.verImagen.setIcon(null);
        
    }//GEN-LAST:event_listarMActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Regresar;
    private javax.swing.JButton bottonAgregar;
    private javax.swing.JButton bottonImagen;
    private javax.swing.JButton bottonLimpiar;
    private javax.swing.JTextField cantidadProducto;
    private javax.swing.JComboBox<String> categoriaProducto;
    private javax.swing.JMenuItem eliminarM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem listarM;
    private javax.swing.JMenuItem modificar;
    private javax.swing.JTextField nombreProducto;
    private javax.swing.JTextField precioProducto;
    private javax.swing.JLabel textCantidad;
    private javax.swing.JLabel textCategoria;
    private javax.swing.JLabel textImagen;
    private javax.swing.JLabel textNombre;
    private javax.swing.JLabel textPrecio;
    private javax.swing.JLabel verImagen;
    // End of variables declaration//GEN-END:variables
}
