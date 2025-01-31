/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JLabel;

/**
 *
 * @author Yo
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    
    
    public MenuPrincipal() {
        initComponents();
        
        this.setLocationRelativeTo(null);
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
        imagenRef = new javax.swing.JLabel();
        textUsuario = new javax.swing.JLabel();
        usuarioInfo = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Cerrar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        agregarProducto = new javax.swing.JMenuItem();
        modificarProducto = new javax.swing.JMenuItem();
        eliminarProducto = new javax.swing.JMenuItem();
        listarProducto = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagenRef.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UsuarioLogoRef.png"))); // NOI18N
        jPanel1.add(imagenRef, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 110, 110));

        textUsuario.setBackground(new java.awt.Color(204, 204, 204));
        textUsuario.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        textUsuario.setForeground(new java.awt.Color(51, 51, 51));
        textUsuario.setText("Usuario:");
        jPanel1.add(textUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        usuarioInfo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jPanel1.add(usuarioInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 190, 150));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Fondo.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 480));

        jMenuBar1.setBackground(new java.awt.Color(102, 102, 102));
        jMenuBar1.setForeground(new java.awt.Color(51, 51, 51));
        jMenuBar1.setAlignmentX(0.7F);
        jMenuBar1.setAlignmentY(0.7F);
        jMenuBar1.setPreferredSize(new java.awt.Dimension(190, 23));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Home.png"))); // NOI18N
        jMenu1.setText("Inicio");

        Cerrar.setText("Cerrar");
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });
        jMenu1.add(Cerrar);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UsuarioLogo.png"))); // NOI18N
        jMenu2.setText("Usuario");

        agregarProducto.setText("Agregar Productos");
        agregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProductoActionPerformed(evt);
            }
        });
        jMenu2.add(agregarProducto);

        modificarProducto.setText("Modificar Productos");
        modificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarProductoActionPerformed(evt);
            }
        });
        jMenu2.add(modificarProducto);

        eliminarProducto.setText("Eliminar Productos");
        eliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarProductoActionPerformed(evt);
            }
        });
        jMenu2.add(eliminarProducto);

        listarProducto.setText("Listar Productos");
        listarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarProductoActionPerformed(evt);
            }
        });
        jMenu2.add(listarProducto);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CerrarActionPerformed

    private void agregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProductoActionPerformed
        
        AgregarProducto agregar = new AgregarProducto();
        
        agregar.setVisible(true);
    }//GEN-LAST:event_agregarProductoActionPerformed

    private void modificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarProductoActionPerformed
        
        ModificarProducto modificar = new ModificarProducto();
        
        modificar.setVisible(true);
    }//GEN-LAST:event_modificarProductoActionPerformed

    private void eliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarProductoActionPerformed
        
        EliminarProducto eliminar = new EliminarProducto();
        
        eliminar.setVisible(true);
    }//GEN-LAST:event_eliminarProductoActionPerformed

    private void listarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarProductoActionPerformed
        
        ListarProducto listar = new ListarProducto();
        
        listar.setVisible(true);
    }//GEN-LAST:event_listarProductoActionPerformed

    public JLabel getText(String usuario){
        
       this.usuarioInfo.setText(usuario);
       
       return usuarioInfo;

    }
    
    
    
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Cerrar;
    private javax.swing.JMenuItem agregarProducto;
    private javax.swing.JMenuItem eliminarProducto;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel imagenRef;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem listarProducto;
    private javax.swing.JMenuItem modificarProducto;
    private javax.swing.JLabel textUsuario;
    private javax.swing.JLabel usuarioInfo;
    // End of variables declaration//GEN-END:variables
}
