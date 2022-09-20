
package aplication;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class Persona extends javax.swing.JFrame {

    public static final String URL = "jdbc:mysql://localhost:3306/escuela?autoReconnet=true&useSSL=false";
    public static final String usuario = "root";
    public static final String contraseña = "0811";
    PreparedStatement ps;
    ResultSet rs;

    public Connection getConnection(){
        Connection conexion = null; 
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(URL, usuario, contraseña);
            //JOptionPane.showMessageDialog(null, "Conexion exitosa");
        } catch (Exception e) {
            System.err.println("Error, " + e);
        }
        
        return conexion;
    }
    
    public void limpiarCajas(){
        cajaBuscar.setText(null);
        cajaClave.setText(null);
        cajaNombre.setText(null);
        cajaDomicilio.setText(null);
        cajaCelular.setText(null);
        cajaCorreo.setText(null);
        cajaFechaNacimiento.setText(null);
        comboGenero.setSelectedIndex(0);
    }
    
    public Persona() {
        initComponents();
        cajaID.setVisible(false); 
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        botonBuscar = new javax.swing.JButton();
        cajaBuscar = new javax.swing.JTextField();
        etiquetaClave = new javax.swing.JLabel();
        cajaClave = new javax.swing.JTextField();
        etiquetaNombre = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        etiquetaDomicilio = new javax.swing.JLabel();
        cajaDomicilio = new javax.swing.JTextField();
        etiquetaCelular = new javax.swing.JLabel();
        cajaCelular = new javax.swing.JTextField();
        etiquetaCorreo = new javax.swing.JLabel();
        cajaCorreo = new javax.swing.JTextField();
        etiquetaFechaNacimiento = new javax.swing.JLabel();
        cajaFechaNacimiento = new javax.swing.JTextField();
        etiquetaGenero = new javax.swing.JLabel();
        comboGenero = new javax.swing.JComboBox<>();
        botonInsertar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();
        cajaID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonBuscar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        cajaBuscar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        etiquetaClave.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etiquetaClave.setText("Clave: ");

        cajaClave.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        etiquetaNombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etiquetaNombre.setText("Nombre:");

        cajaNombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        etiquetaDomicilio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etiquetaDomicilio.setText("Domicilio: ");

        cajaDomicilio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        etiquetaCelular.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etiquetaCelular.setText("Celular: ");

        cajaCelular.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        etiquetaCorreo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etiquetaCorreo.setText("Correo Electronico:");

        cajaCorreo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        etiquetaFechaNacimiento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etiquetaFechaNacimiento.setText("Fecha nacimiento: ");

        cajaFechaNacimiento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        etiquetaGenero.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etiquetaGenero.setText("Genero: ");

        comboGenero.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        comboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Masculino", "Femenino" }));

        botonInsertar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonInsertar.setText("Insertar");
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });

        botonModificar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonEliminar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonLimpiar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonLimpiar.setText("Limpiar");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        cajaID.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaClave)
                                    .addComponent(etiquetaNombre)
                                    .addComponent(etiquetaDomicilio)
                                    .addComponent(etiquetaCelular)
                                    .addComponent(etiquetaCorreo)
                                    .addComponent(etiquetaFechaNacimiento)
                                    .addComponent(etiquetaGenero))
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cajaClave)
                                            .addComponent(cajaNombre)
                                            .addComponent(cajaDomicilio)
                                            .addComponent(cajaCelular)))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cajaCorreo)
                                            .addComponent(cajaFechaNacimiento)
                                            .addComponent(comboGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(botonInsertar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                .addComponent(botonModificar)
                                .addGap(61, 61, 61)
                                .addComponent(botonEliminar)
                                .addGap(47, 47, 47)
                                .addComponent(botonLimpiar))))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cajaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cajaID, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(36, 36, 36))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonBuscar)
                    .addComponent(cajaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cajaID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaClave)
                    .addComponent(cajaClave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNombre)
                    .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaDomicilio)
                    .addComponent(cajaDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaCelular)
                    .addComponent(cajaCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaCorreo)
                    .addComponent(cajaCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaFechaNacimiento)
                    .addComponent(cajaFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaGenero)
                    .addComponent(comboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonInsertar)
                    .addComponent(botonModificar)
                    .addComponent(botonEliminar)
                    .addComponent(botonLimpiar))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
        Connection conexion = null;
        
        try {
            conexion = getConnection();
            ps = conexion.prepareStatement("insert into persona (clave, nombre, domicilio, celular, correo_electronico, fecha_nacimiento, genero) values (?,?,?,?,?,?,?)");
            ps.setString(1, cajaClave.getText());
            ps.setString(2, cajaNombre.getText());
            ps.setString(3, cajaDomicilio.getText());
            ps.setString(4, cajaCelular.getText());
            ps.setString(5, cajaCorreo.getText());
            ps.setDate(6, Date.valueOf(cajaFechaNacimiento.getText()));
            ps.setString(7, comboGenero.getSelectedItem().toString());
            
            int resultado = ps.executeUpdate();//Ejecutamos la insersion dentro de la BD
            
            if(resultado > 0){
                JOptionPane.showMessageDialog(null, "Registro insertado correctamente");
                limpiarCajas();
            } else {
                JOptionPane.showMessageDialog(null, "Error al insertar el registro"); 
                limpiarCajas();
            }
            
            conexion.close();
            
        } catch (Exception ex) {
            System.err.println("Error, " + ex);
        }
    }//GEN-LAST:event_botonInsertarActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
       limpiarCajas();
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        Connection conexion = null;
        
        try {
            conexion = getConnection();
            ps = conexion.prepareStatement("Select * from persona where clave=?");
            ps.setString(1, cajaBuscar.getText());
            rs = ps.executeQuery();
            
            if(rs.next()){
                cajaID.setText(String.valueOf(rs.getInt("idPersona")));
                cajaClave.setText(rs.getString("clave"));
                cajaNombre.setText(rs.getString("nombre"));
                cajaDomicilio.setText(rs.getString("domicilio"));
                cajaCelular.setText(rs.getString("celular"));
                cajaCorreo.setText(rs.getString("correo_electronico"));
                cajaFechaNacimiento.setText(String.valueOf(rs.getDate("fecha_nacimiento")));
                comboGenero.setSelectedItem(rs.getString("genero"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe una persona con esa clave");
            }
            
            conexion.close();
            
        } catch (Exception ex) {
            System.err.println("Error, " + ex);
        }
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        Connection conexion = null;
        
        try {
            conexion = getConnection();
            ps = conexion.prepareStatement("update persona set clave=?,nombre=?,domicilio=?,celular=?,correo_electronico=?,fecha_nacimiento=?,genero=? where idPersona=?");
            ps.setString(1, cajaClave.getText());
            ps.setString(2, cajaNombre.getText());
            ps.setString(3, cajaDomicilio.getText());
            ps.setString(4, cajaCelular.getText());
            ps.setString(5, cajaCorreo.getText());
            ps.setDate(6, Date.valueOf(cajaFechaNacimiento.getText()));
            ps.setString(7, comboGenero.getSelectedItem().toString());
            ps.setInt(8, Integer.parseInt(cajaID.getText()));
            
            int resultado = ps.executeUpdate(); //Ejecutamos la modificacion
            
            if(resultado > 0){
                JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
                limpiarCajas();
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar el registro"); 
                limpiarCajas();
            }
            
            conexion.close();
            
        } catch (Exception ex) {
            System.err.println("Error, " + ex);
        }
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        Connection conexion = null;
        
        try {
            conexion = getConnection();
            ps = conexion.prepareStatement("delete from persona where idPersona=?");
            ps.setInt(1, Integer.parseInt(cajaID.getText()));
            
            int resultado = ps.executeUpdate(); //Ejecutamos la eliminacion
            
            if(resultado > 0){
                JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
                limpiarCajas();
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminado el registro"); 
                limpiarCajas();
            }
            
            conexion.close();
            
        } catch (Exception ex) {
            System.err.println("Error, " + ex);
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Persona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonInsertar;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JTextField cajaBuscar;
    private javax.swing.JTextField cajaCelular;
    private javax.swing.JTextField cajaClave;
    private javax.swing.JTextField cajaCorreo;
    private javax.swing.JTextField cajaDomicilio;
    private javax.swing.JTextField cajaFechaNacimiento;
    private javax.swing.JTextField cajaID;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JComboBox<String> comboGenero;
    private javax.swing.JLabel etiquetaCelular;
    private javax.swing.JLabel etiquetaClave;
    private javax.swing.JLabel etiquetaCorreo;
    private javax.swing.JLabel etiquetaDomicilio;
    private javax.swing.JLabel etiquetaFechaNacimiento;
    private javax.swing.JLabel etiquetaGenero;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
