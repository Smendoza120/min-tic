
package Vista;

import Modelo.Usuario;

public class Programa extends javax.swing.JFrame {

    Usuario usuario;
    
    public Programa() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public Programa(Usuario usuario){
        initComponents();
        setLocationRelativeTo(null);
        this.usuario = usuario;
        
        etiquetaNombre.setText(usuario.getNombreUsuario());
        etiquetaRol.setText(usuario.getNombreRol());
        
        if(usuario.getIdTipo_usuario() == 1){
            
        } else if(usuario.getIdTipo_usuario() == 2){
            menuProveedores.setVisible(false);
            subMenuAgregarProducto.setVisible(false);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaRol = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuProductos = new javax.swing.JMenu();
        subMenuAgregarProducto = new javax.swing.JMenuItem();
        subMenuModificarProducto = new javax.swing.JMenuItem();
        subMenuCatalogoProductos = new javax.swing.JMenuItem();
        menuProveedores = new javax.swing.JMenu();
        subMenuAgregarProveedor = new javax.swing.JMenuItem();
        subMenuCatalogoProveedor = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("Bienvenido al Programa");

        etiquetaNombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        etiquetaRol.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(136, 136, 136))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etiquetaRol, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                    .addComponent(etiquetaNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addComponent(etiquetaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(etiquetaRol, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(179, Short.MAX_VALUE))
        );

        menuProductos.setText("Productos");

        subMenuAgregarProducto.setText("Agregar Producto");
        subMenuAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuAgregarProductoActionPerformed(evt);
            }
        });
        menuProductos.add(subMenuAgregarProducto);

        subMenuModificarProducto.setText("Modificar Producto");
        subMenuModificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuModificarProductoActionPerformed(evt);
            }
        });
        menuProductos.add(subMenuModificarProducto);

        subMenuCatalogoProductos.setText("Catalogo de Productos");
        menuProductos.add(subMenuCatalogoProductos);

        jMenuBar1.add(menuProductos);

        menuProveedores.setText("Proveedores");

        subMenuAgregarProveedor.setText("Agregar Proveedor");
        menuProveedores.add(subMenuAgregarProveedor);

        subMenuCatalogoProveedor.setText("Catalogo de proveedores");
        menuProveedores.add(subMenuCatalogoProveedor);

        jMenuBar1.add(menuProveedores);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subMenuAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuAgregarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subMenuAgregarProductoActionPerformed

    private void subMenuModificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuModificarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subMenuModificarProductoActionPerformed

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
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Programa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaRol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuProductos;
    private javax.swing.JMenu menuProveedores;
    private javax.swing.JPanel panel;
    private javax.swing.JMenuItem subMenuAgregarProducto;
    private javax.swing.JMenuItem subMenuAgregarProveedor;
    private javax.swing.JMenuItem subMenuCatalogoProductos;
    private javax.swing.JMenuItem subMenuCatalogoProveedor;
    private javax.swing.JMenuItem subMenuModificarProducto;
    // End of variables declaration//GEN-END:variables
}
