/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ejercicio7;

import javax.swing.JScrollPane;

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
        java.awt.GridBagConstraints gridBagConstraints;

        scroll = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
        etiquetaPelicula1 = new javax.swing.JLabel();
        etiquetaTitulo1 = new javax.swing.JLabel();
        etiquetaGenero1 = new javax.swing.JLabel();
        etiquetaPelicula2 = new javax.swing.JLabel();
        etiquetaTitulo2 = new javax.swing.JLabel();
        etiquetaGenero2 = new javax.swing.JLabel();
        etiquetaPelicula3 = new javax.swing.JLabel();
        etiquetaTitulo3 = new javax.swing.JLabel();
        etiquetaGenero3 = new javax.swing.JLabel();
        etiquetaPelicula4 = new javax.swing.JLabel();
        etiquetaTitulo4 = new javax.swing.JLabel();
        etiquetaGenero4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Peliculas para Programadores");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(420, 500));

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setLayout(new java.awt.GridBagLayout());

        etiquetaPelicula1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/codigoEnigma .jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        panel.add(etiquetaPelicula1, gridBagConstraints);

        etiquetaTitulo1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiquetaTitulo1.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaTitulo1.setText("Titulo: Codigo Enigma");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 20);
        panel.add(etiquetaTitulo1, gridBagConstraints);

        etiquetaGenero1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiquetaGenero1.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaGenero1.setText("Genero: Guerra, Historia, Drama ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 20);
        panel.add(etiquetaGenero1, gridBagConstraints);

        etiquetaPelicula2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/efectoMariposa .jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        panel.add(etiquetaPelicula2, gridBagConstraints);

        etiquetaTitulo2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiquetaTitulo2.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaTitulo2.setText("Titulo: Efecto Mariposa");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 20);
        panel.add(etiquetaTitulo2, gridBagConstraints);

        etiquetaGenero2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiquetaGenero2.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaGenero2.setText("Genero: Thriller psicológico, Drama. ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 20);
        panel.add(etiquetaGenero2, gridBagConstraints);

        etiquetaPelicula3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/freddyeKruguer .jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        panel.add(etiquetaPelicula3, gridBagConstraints);

        etiquetaTitulo3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiquetaTitulo3.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaTitulo3.setText("Titulo: A Nightmare on Elm Street");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 20);
        panel.add(etiquetaTitulo3, gridBagConstraints);

        etiquetaGenero3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiquetaGenero3.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaGenero3.setText("Genero");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 20);
        panel.add(etiquetaGenero3, gridBagConstraints);

        etiquetaPelicula4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/theNightMareBeforeChrismas.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 0);
        panel.add(etiquetaPelicula4, gridBagConstraints);

        etiquetaTitulo4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiquetaTitulo4.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaTitulo4.setText("Titulo: The Nightmare Before Christmas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 20);
        panel.add(etiquetaTitulo4, gridBagConstraints);

        etiquetaGenero4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiquetaGenero4.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaGenero4.setText("Genero: Fantasia, Musical, Animacion");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 20);
        panel.add(etiquetaGenero4, gridBagConstraints);

        scroll.setViewportView(panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JLabel etiquetaGenero1;
    private javax.swing.JLabel etiquetaGenero2;
    private javax.swing.JLabel etiquetaGenero3;
    private javax.swing.JLabel etiquetaGenero4;
    private javax.swing.JLabel etiquetaPelicula1;
    private javax.swing.JLabel etiquetaPelicula2;
    private javax.swing.JLabel etiquetaPelicula3;
    private javax.swing.JLabel etiquetaPelicula4;
    private javax.swing.JLabel etiquetaTitulo1;
    private javax.swing.JLabel etiquetaTitulo2;
    private javax.swing.JLabel etiquetaTitulo3;
    private javax.swing.JLabel etiquetaTitulo4;
    private javax.swing.JPanel panel;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
