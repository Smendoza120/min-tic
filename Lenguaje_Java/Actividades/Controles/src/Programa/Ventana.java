/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa;

import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author sanch
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        grupoBotones.add(radioHombre);
        grupoBotones.add(radioMujer);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotones = new javax.swing.ButtonGroup();
        panel = new javax.swing.JPanel();
        etiquetaFormulario = new javax.swing.JLabel();
        etiquetaGenero = new javax.swing.JLabel();
        radioHombre = new javax.swing.JRadioButton();
        radioMujer = new javax.swing.JRadioButton();
        etiquetaEdad = new javax.swing.JLabel();
        etiquetaDeporte = new javax.swing.JLabel();
        checkFutbol = new javax.swing.JCheckBox();
        checkBasquet = new javax.swing.JCheckBox();
        checkTennis = new javax.swing.JCheckBox();
        checkNatacion = new javax.swing.JCheckBox();
        checkBeisbol = new javax.swing.JCheckBox();
        spinnerEdad = new javax.swing.JSpinner();
        botonInsertar = new javax.swing.JButton();
        botonMostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiquetaFormulario.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etiquetaFormulario.setText("Formulario");

        etiquetaGenero.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaGenero.setText("Seleccione Género:");

        radioHombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        radioHombre.setText("Hombre");

        radioMujer.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        radioMujer.setText("Mujer");

        etiquetaEdad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaEdad.setText("¿Cuál es tu edad?");

        etiquetaDeporte.setText("Seleccione sus deportes favoritos:");

        checkFutbol.setText("Fútbol");

        checkBasquet.setText("Basket");

        checkTennis.setText("Tennis");

        checkNatacion.setText("Natación");
        checkNatacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkNatacionActionPerformed(evt);
            }
        });

        checkBeisbol.setText("Beisbol");

        botonInsertar.setText("Insertar Registro");
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });

        botonMostrar.setText("Mostrar Registro");
        botonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(etiquetaFormulario))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(etiquetaEdad)
                                .addGap(18, 18, 18)
                                .addComponent(spinnerEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(radioHombre)
                            .addComponent(etiquetaGenero)
                            .addComponent(radioMujer)
                            .addComponent(etiquetaDeporte)
                            .addComponent(checkFutbol)
                            .addComponent(checkBasquet)
                            .addComponent(checkTennis)
                            .addComponent(checkNatacion)
                            .addComponent(checkBeisbol)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(botonInsertar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addComponent(botonMostrar)))))
                .addGap(30, 30, 30))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(etiquetaFormulario)
                .addGap(30, 30, 30)
                .addComponent(etiquetaGenero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioHombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioMujer)
                .addGap(22, 22, 22)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaEdad)
                    .addComponent(spinnerEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(etiquetaDeporte)
                .addGap(18, 18, 18)
                .addComponent(checkFutbol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBasquet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkTennis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkNatacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBeisbol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonInsertar)
                    .addComponent(botonMostrar))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkNatacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkNatacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkNatacionActionPerformed

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        String genero = "";
        int edad;
        boolean futbol = false, basquet = false, tennis = false, natacion = false, beisbol = false;
        
        //Radio Botones - JRadioButton
        if(radioHombre.isSelected() == true){
            genero = "Hombre";
        } else if(radioMujer.isSelected() == true){
            genero = "Mujer";
        }
        
        //Numero Edad - JSpinner
        edad = (int) spinnerEdad.getValue();
        
        //Casillas de verificacion -JCheckBox
        if(checkFutbol.isSelected() == true){
            futbol = true;
        }
        if(checkBasquet.isSelected() == true){
            basquet = true;
        }
        if(checkTennis.isSelected() == true){
            tennis = true;
        }
        if(checkNatacion.isSelected() == true){
            natacion = true;
        }
        if(checkBeisbol.isSelected() == true){
            beisbol = true;
        }
        
        try {
            Connection conexion = con.getConnection();
            
            ps = conexion.prepareStatement("insert into gustospersona (genero,edad,futbol,basquet,tennis,natacion,beisbol) values (?,?,?,?,?,?,?)");
            ps.setString(1, genero);
            ps.setInt(2, edad);
            ps.setBoolean(3, futbol);
            ps.setBoolean(4, basquet);
            ps.setBoolean(5, tennis);
            ps.setBoolean(6, natacion);
            ps.setBoolean(7, beisbol);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registro ingresado correctamente");
            
            conexion.close();
        } catch (Exception e) {
            System.err.println("Error, " + e);
        }
    }//GEN-LAST:event_botonInsertarActionPerformed

    private void botonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarActionPerformed
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            Connection conexion = con.getConnection();
            
            ps = conexion.prepareStatement("select genero,edad,futbol,basquet,tennis,natacion,beisbol from gustospersona where id=?");
            ps.setInt(1, 2);
            rs = ps.executeQuery();
            
            while(rs.next()){
                //RadioBotones
                if(rs.getString("genero").equals("Hombre")){
                    radioHombre.setSelected(true);
                } else if(rs.getString("genero").equals("Mujer")){
                    radioMujer.setSelected(true);
                }
                
                //Numero de edad - JSpinner
                spinnerEdad.setValue(rs.getInt("edad"));
                
                //Casillas de verificacion
                if(rs.getBoolean("futbol") == true){
                    checkFutbol.setSelected(true);
                }
                if(rs.getBoolean("basquet") == true){
                    checkBasquet.setSelected(true);
                }
                if(rs.getBoolean("tennis") == true){
                    checkTennis.setSelected(true);
                }
                if(rs.getBoolean("natacion") == true){
                    checkNatacion.setSelected(true);
                }
                if(rs.getBoolean("beisbol") == true){
                    checkBeisbol.setSelected(true);
                }
            }
            
            conexion.close();
        } catch (Exception e) {
            System.err.println("Error, " + e);
        }
    }//GEN-LAST:event_botonMostrarActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonInsertar;
    private javax.swing.JButton botonMostrar;
    private javax.swing.JCheckBox checkBasquet;
    private javax.swing.JCheckBox checkBeisbol;
    private javax.swing.JCheckBox checkFutbol;
    private javax.swing.JCheckBox checkNatacion;
    private javax.swing.JCheckBox checkTennis;
    private javax.swing.JLabel etiquetaDeporte;
    private javax.swing.JLabel etiquetaEdad;
    private javax.swing.JLabel etiquetaFormulario;
    private javax.swing.JLabel etiquetaGenero;
    private javax.swing.ButtonGroup grupoBotones;
    private javax.swing.JPanel panel;
    private javax.swing.JRadioButton radioHombre;
    private javax.swing.JRadioButton radioMujer;
    private javax.swing.JSpinner spinnerEdad;
    // End of variables declaration//GEN-END:variables
}
