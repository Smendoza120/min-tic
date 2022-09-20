
package Tabla;

import java.sql.ResultSetMetaData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Tabla extends javax.swing.JFrame {

    public Tabla() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProducto = new javax.swing.JTable();
        botonCargar = new javax.swing.JButton();
        cajaBuscar = new javax.swing.JTextField();
        etiquetaCodigo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        cajaCodigo = new javax.swing.JTextField();
        cajaPrecio = new javax.swing.JTextField();
        cajaCantidad = new javax.swing.JTextField();
        botonInsertar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Precio", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProducto);

        botonCargar.setText("Cargar tabla");
        botonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarActionPerformed(evt);
            }
        });

        etiquetaCodigo.setText("Codigo:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Codigo:");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Precio:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Cantidad:");

        cajaNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        cajaCodigo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        cajaPrecio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        cajaCantidad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        botonInsertar.setText("Insertar");
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });

        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(etiquetaCodigo)
                        .addGap(50, 50, 50)
                        .addComponent(cajaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(botonCargar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(cajaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cajaPrecio)
                                    .addComponent(cajaCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonModificar)
                        .addGap(29, 29, 29)
                        .addComponent(botonEliminar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonInsertar)
                        .addGap(212, 212, 212)))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCargar)
                    .addComponent(cajaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaCodigo))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 32, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cajaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cajaPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cajaCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonInsertar)
                            .addComponent(botonModificar)
                            .addComponent(botonEliminar))
                        .addGap(48, 48, 48))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarActionPerformed
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tablaProducto.setModel(modeloTabla);
        
        String campo = cajaBuscar.getText();
        String where = "";
        
        if(!"".equals(campo)){ //Si el campo no esta vacio
            where = "where codigo='" + campo +"'";
        }
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            
            ps = conexion.prepareStatement("select codigo,nombre,precio,cantidad from producto " + where);
            rs = ps.executeQuery();
            
            modeloTabla.addColumn("codigo");
            modeloTabla.addColumn("nombre");
            modeloTabla.addColumn("precio");
            modeloTabla.addColumn("cantidad");
            
            ResultSetMetaData rsMD = rs.getMetaData();
            int cantidadColumnas = rsMD.getColumnCount();
            
            int anchos[] = {50,150,50,70};
            
            for(int i=0; i<cantidadColumnas; i++){
                tablaProducto.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
            
            while(rs.next()){
                Object fila[] = new Object[cantidadColumnas];
                for(int i=0; i<cantidadColumnas; i++){
                    fila[i] = rs.getObject(i+1);
                }
                
                modeloTabla.addRow(fila);
            }
            
        } catch (Exception ex) {
            System.err.println("Error, " + ex);
        }
    }//GEN-LAST:event_botonCargarActionPerformed

    private void tablaProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductoMouseClicked
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            
            int fila = tablaProducto.getSelectedRow();
            String codigo = tablaProducto.getValueAt(fila, 0).toString();
            
            ps = conexion.prepareStatement("select codigo,nombre,precio,cantidad from producto where codigo =?");
            ps.setString(1, codigo);
            rs = ps.executeQuery();
            
            while(rs.next()){
                cajaCodigo.setText(rs.getString("codigo"));
                cajaNombre.setText(rs.getString("nombre"));
                cajaPrecio.setText(String.valueOf(rs.getDouble("precio")));
                cajaCantidad.setText(String.valueOf(rs.getInt("cantidad")));
            }
            
        } catch (Exception ex) {
            System.err.println("Error, " + ex);
        }
    }//GEN-LAST:event_tablaProductoMouseClicked

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
        PreparedStatement ps = null;
        
        try {
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            
            ps = conexion.prepareStatement("insert into producto (codigo,nombre,precio,cantidad) values (?,?,?,?)");
            ps.setString(1, cajaCodigo.getText());
            ps.setString(2, cajaNombre.getText());
            ps.setDouble(3, Double.parseDouble(cajaPrecio.getText()));
            ps.setInt(4, Integer.parseInt(cajaCantidad.getText()));
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registro insertado correctamente");
            
        } catch (Exception e) {
            System.err.println("Error, " + e);
            JOptionPane.showMessageDialog(null, "No se pudo ingresar");
        }
    }//GEN-LAST:event_botonInsertarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        PreparedStatement ps = null;
        
        try {
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            
            ps = conexion.prepareStatement("update producto set codigo=?,nombre=?,precio=?,cantidad=? where codigo=?");
            ps.setString(1, cajaCodigo.getText());
            ps.setString(2, cajaNombre.getText());
            ps.setDouble(3, Double.parseDouble(cajaPrecio.getText()));
            ps.setInt(4, Integer.parseInt(cajaCantidad.getText()));
            ps.setString(5, cajaCodigo.getText());
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
            
        } catch (Exception e) {
            System.err.println("Error, " + e);
            JOptionPane.showMessageDialog(null, "No se pudo modificar");
        }
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        PreparedStatement ps = null;
        
        try {
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            
            ps = conexion.prepareStatement("delete from producto where codigo=?");
            ps.setString(1, cajaCodigo.getText());
                        
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
            
        } catch (Exception e) {
            System.err.println("Error, " + e);
            JOptionPane.showMessageDialog(null, "No se pudo eliminar");
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCargar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonInsertar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JTextField cajaBuscar;
    private javax.swing.JTextField cajaCantidad;
    private javax.swing.JTextField cajaCodigo;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JTextField cajaPrecio;
    private javax.swing.JLabel etiquetaCodigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProducto;
    // End of variables declaration//GEN-END:variables
}
