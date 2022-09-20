package Programa;

import java.awt.event.ItemEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.ResultSetMetaData;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import modelo.Ciudad;
import modelo.Conexion;
import modelo.Estado;
import modelo.Pais;

public class ComboBox extends javax.swing.JFrame {

    public ComboBox() {
        initComponents();
        setLocationRelativeTo(null);

        Pais pais = new Pais();
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel(pais.mostrarPaises());
        comboPaises.setModel(modeloCombo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        comboPaises = new javax.swing.JComboBox<>();
        etiquetaEstados = new javax.swing.JLabel();
        comboEstados = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        comboCiudades = new javax.swing.JComboBox<>();
        etiquetaInformacion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaInformacion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Pais:");

        comboPaises.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboPaises.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboPaisesItemStateChanged(evt);
            }
        });
        comboPaises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPaisesActionPerformed(evt);
            }
        });

        etiquetaEstados.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaEstados.setText("Estado:");

        comboEstados.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboEstadosItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Ciudad:");

        comboCiudades.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboCiudadesItemStateChanged(evt);
            }
        });

        etiquetaInformacion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaInformacion.setText("Informacion:");

        areaInformacion.setColumns(20);
        areaInformacion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        areaInformacion.setRows(5);
        jScrollPane1.setViewportView(areaInformacion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etiquetaInformacion)
                            .addComponent(jLabel2)
                            .addComponent(etiquetaEstados)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboPaises, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboEstados, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboCiudades, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboPaises, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaEstados)
                    .addComponent(comboEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboCiudades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(etiquetaInformacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboPaisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPaisesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboPaisesActionPerformed

    private void comboPaisesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboPaisesItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Pais pais = (Pais) comboPaises.getSelectedItem();

            Estado estado = new Estado();
            DefaultComboBoxModel modeloComboEstados = new DefaultComboBoxModel(estado.mostrarEstados(pais.getIdPais()));
            comboEstados.setModel(modeloComboEstados);
            comboCiudades.removeAllItems();
            areaInformacion.setText("");
        }
    }//GEN-LAST:event_comboPaisesItemStateChanged

    private void comboEstadosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboEstadosItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Estado estado = (Estado) comboEstados.getSelectedItem();

            Ciudad ciudad = new Ciudad();
            DefaultComboBoxModel modeloComboCiudades = new DefaultComboBoxModel(ciudad.mostrarCiudades(estado.getIdEstado()));
            comboCiudades.setModel(modeloComboCiudades);
        }
    }//GEN-LAST:event_comboEstadosItemStateChanged

    private void comboCiudadesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboCiudadesItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Pais pais = (Pais) comboPaises.getSelectedItem();
            Estado estado = (Estado) comboEstados.getSelectedItem();
            Ciudad ciudad = (Ciudad) comboCiudades.getSelectedItem();
            
            areaInformacion.setText("Pais: " + pais.getNombrePais() +
                        "\nEstado: " + estado.getNombreEstado() +
                        "\nCiudad: " + ciudad.getNombreCiudad());
            
        }
    }//GEN-LAST:event_comboCiudadesItemStateChanged

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
            java.util.logging.Logger.getLogger(ComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComboBox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaInformacion;
    private javax.swing.JComboBox<String> comboCiudades;
    private javax.swing.JComboBox<String> comboEstados;
    private javax.swing.JComboBox<String> comboPaises;
    private javax.swing.JLabel etiquetaEstados;
    private javax.swing.JLabel etiquetaInformacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
