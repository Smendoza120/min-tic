
package Ejercicio8;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class VentanaDivisas extends javax.swing.JFrame {

    private String divisa1 = "";
    private String divisa2 = "";
    private String cantidad = "";
    private boolean punto = true;
    private float dinero, cambio;
    
    public VentanaDivisas() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(300,450);
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

        panel = new javax.swing.JPanel();
        etiquetaDivisa1 = new javax.swing.JLabel();
        etiquetaCambio1 = new javax.swing.JLabel();
        comboDivisas1 = new javax.swing.JComboBox<>();
        etiquetaDivisa2 = new javax.swing.JLabel();
        etiquetaCambio2 = new javax.swing.JLabel();
        comboDivisas2 = new javax.swing.JComboBox<>();
        botonReset = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton0 = new javax.swing.JButton();
        botonPunto = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuCalculadora = new javax.swing.JMenuItem();
        menuDivisas = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Divisas");

        panel.setLayout(new java.awt.GridBagLayout());

        etiquetaDivisa1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etiquetaDivisa1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaDivisa1.setText("$");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 0, 10);
        panel.add(etiquetaDivisa1, gridBagConstraints);

        etiquetaCambio1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etiquetaCambio1.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        panel.add(etiquetaCambio1, gridBagConstraints);

        comboDivisas1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboDivisas1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estados Unidos - Dólar", "Perú - Nuevo Sol", "Europa - Euro", "Colombia - Peso Colombiano" }));
        comboDivisas1.setPreferredSize(new java.awt.Dimension(10, 22));
        comboDivisas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDivisas1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        panel.add(comboDivisas1, gridBagConstraints);

        etiquetaDivisa2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etiquetaDivisa2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaDivisa2.setText("$");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 0, 10);
        panel.add(etiquetaDivisa2, gridBagConstraints);

        etiquetaCambio2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etiquetaCambio2.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        panel.add(etiquetaCambio2, gridBagConstraints);

        comboDivisas2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboDivisas2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estados Unidos - Dólar", "Perú - Nuevo Sol", "Europa - Euro", "Colombia - Peso Colombiano" }));
        comboDivisas2.setPreferredSize(new java.awt.Dimension(10, 22));
        comboDivisas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDivisas2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        panel.add(comboDivisas2, gridBagConstraints);

        botonReset.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonReset.setForeground(new java.awt.Color(0, 0, 0));
        botonReset.setText("C");
        botonReset.setPreferredSize(new java.awt.Dimension(20, 20));
        botonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonResetActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 1, 1, 1);
        panel.add(botonReset, gridBagConstraints);

        botonBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/borrar.png"))); // NOI18N
        botonBorrar.setPreferredSize(new java.awt.Dimension(20, 20));
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 1, 1, 1);
        panel.add(botonBorrar, gridBagConstraints);

        boton7.setBackground(new java.awt.Color(102, 102, 0));
        boton7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        boton7.setForeground(new java.awt.Color(0, 0, 0));
        boton7.setText("7");
        boton7.setPreferredSize(new java.awt.Dimension(20, 20));
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        panel.add(boton7, gridBagConstraints);

        boton8.setBackground(new java.awt.Color(102, 102, 0));
        boton8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        boton8.setForeground(new java.awt.Color(0, 0, 0));
        boton8.setText("8");
        boton8.setPreferredSize(new java.awt.Dimension(20, 20));
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        panel.add(boton8, gridBagConstraints);

        boton9.setBackground(new java.awt.Color(102, 102, 0));
        boton9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        boton9.setForeground(new java.awt.Color(0, 0, 0));
        boton9.setText("9");
        boton9.setPreferredSize(new java.awt.Dimension(20, 20));
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        panel.add(boton9, gridBagConstraints);

        boton4.setBackground(new java.awt.Color(102, 102, 0));
        boton4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        boton4.setForeground(new java.awt.Color(0, 0, 0));
        boton4.setText("4");
        boton4.setPreferredSize(new java.awt.Dimension(20, 20));
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        panel.add(boton4, gridBagConstraints);

        boton5.setBackground(new java.awt.Color(102, 102, 0));
        boton5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        boton5.setForeground(new java.awt.Color(0, 0, 0));
        boton5.setText("5");
        boton5.setPreferredSize(new java.awt.Dimension(20, 20));
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        panel.add(boton5, gridBagConstraints);

        boton6.setBackground(new java.awt.Color(102, 102, 0));
        boton6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        boton6.setForeground(new java.awt.Color(0, 0, 0));
        boton6.setText("6");
        boton6.setPreferredSize(new java.awt.Dimension(20, 20));
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        panel.add(boton6, gridBagConstraints);

        boton1.setBackground(new java.awt.Color(102, 102, 0));
        boton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        boton1.setForeground(new java.awt.Color(0, 0, 0));
        boton1.setText("1");
        boton1.setPreferredSize(new java.awt.Dimension(20, 20));
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        panel.add(boton1, gridBagConstraints);

        boton2.setBackground(new java.awt.Color(102, 102, 0));
        boton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        boton2.setForeground(new java.awt.Color(0, 0, 0));
        boton2.setText("2");
        boton2.setPreferredSize(new java.awt.Dimension(20, 20));
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        panel.add(boton2, gridBagConstraints);

        boton3.setBackground(new java.awt.Color(102, 102, 0));
        boton3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        boton3.setForeground(new java.awt.Color(0, 0, 0));
        boton3.setText("3");
        boton3.setPreferredSize(new java.awt.Dimension(20, 20));
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        panel.add(boton3, gridBagConstraints);

        boton0.setBackground(new java.awt.Color(102, 102, 0));
        boton0.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        boton0.setForeground(new java.awt.Color(0, 0, 0));
        boton0.setText("0");
        boton0.setPreferredSize(new java.awt.Dimension(20, 20));
        boton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        panel.add(boton0, gridBagConstraints);

        botonPunto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonPunto.setForeground(new java.awt.Color(0, 0, 0));
        botonPunto.setText(".");
        botonPunto.setPreferredSize(new java.awt.Dimension(20, 20));
        botonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPuntoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        panel.add(botonPunto, gridBagConstraints);

        jMenu1.setText("Usos");

        menuCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/calculadora.png"))); // NOI18N
        menuCalculadora.setText("Calculadora");
        menuCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCalculadoraActionPerformed(evt);
            }
        });
        jMenu1.add(menuCalculadora);

        menuDivisas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/divisas.png"))); // NOI18N
        menuDivisas.setText("Divisas");
        jMenu1.add(menuDivisas);
        jMenu1.add(jSeparator1);

        menuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salir.png"))); // NOI18N
        menuSalir.setText("jMenuItem3");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        jMenu1.add(menuSalir);

        jMenuBar1.add(jMenu1);

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

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuSalirActionPerformed

    private void comboDivisas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDivisas2ActionPerformed
        divisa2 = (String) comboDivisas2.getSelectedItem();
        
        if(divisa2.equals("Estados Unidos - Dólar")){
            etiquetaDivisa2.setText("$");
        } else if(divisa2.equals("Europa - Euro")){
            etiquetaDivisa2.setText("€");
        } else if(divisa2.equals("Perú - Nuevo Sol")){
            etiquetaDivisa2.setText("S/.");
        } else if(divisa2.equals("Colombia - Peso Colombiano")){
            etiquetaDivisa2.setText("COP");
        }
        
        obtenerDinero();
    }//GEN-LAST:event_comboDivisas2ActionPerformed

    private void menuCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCalculadoraActionPerformed
        VentanaCalculadora calculadora = new VentanaCalculadora();
        calculadora.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_menuCalculadoraActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        if(etiquetaCambio1.getText() == "0"){
            cantidad = "1";
        } else {
            cantidad += "1";
        }

        etiquetaCambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        if(etiquetaCambio1.getText() == "0"){
            cantidad = "2";
        } else {
            cantidad += "2";
        }
        etiquetaCambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        if(etiquetaCambio1.getText() == "0"){
            cantidad = "3";
        } else {
            cantidad += "3";
        }
        etiquetaCambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        if(etiquetaCambio1.getText() == "0"){
            cantidad = "4";
        } else {
            cantidad += "4";
        }
        etiquetaCambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        if(etiquetaCambio1.getText() == "0"){
            cantidad = "5";
        } else {
            cantidad += "5";
        }
        etiquetaCambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
        if(etiquetaCambio1.getText() == "0"){
            cantidad = "6";
        } else {
            cantidad += "6";
        }
        etiquetaCambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
        if(etiquetaCambio1.getText() == "0"){
            cantidad = "7";
        } else {
            cantidad += "7";
        }
        etiquetaCambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
        if(etiquetaCambio1.getText() == "0"){
            cantidad = "8";
        } else {
            cantidad += "8";
        }
        etiquetaCambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
        if(etiquetaCambio1.getText() == "0"){
            cantidad = "9";
        } else {
            cantidad += "9";
        }
        etiquetaCambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_boton9ActionPerformed

    private void comboDivisas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDivisas1ActionPerformed
        divisa1 = (String) comboDivisas1.getSelectedItem();
        
        if(divisa1.equals("Estados Unidos - Dólar")){
            etiquetaDivisa1.setText("$");
        } else if(divisa1.equals("Europa - Euro")){
            etiquetaDivisa1.setText("€");
        } else if(divisa1.equals("Perú - Nuevo Sol")){
            etiquetaDivisa1.setText("S/.");
        } else if(divisa1.equals("Colombia - Peso Colombiano")){
            etiquetaDivisa1.setText("COP");
        }
        
        obtenerDinero();
    }//GEN-LAST:event_comboDivisas1ActionPerformed

    private void boton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0ActionPerformed
        if(cantidad != ""){
            if(etiquetaCambio1.getText() == "0"){
                cantidad = "0";
            } else {
                cantidad += "0";
            }
            etiquetaCambio1.setText(cantidad);
            obtenerDinero();
        } 
    }//GEN-LAST:event_boton0ActionPerformed

    private void botonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPuntoActionPerformed
        if(punto == true){
            if(cantidad == ""){
                cantidad = "0.";
            } else {
                cantidad += ".";
            }
            etiquetaCambio1.setText(cantidad);
            
            punto = false;
        }
    }//GEN-LAST:event_botonPuntoActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        int tamaño = cantidad.length();
        if(tamaño > 0){
            if(tamaño == 1){
                cantidad = "0";
            } else {
                cantidad = cantidad.substring(0, cantidad.length()-1);
            }
            etiquetaCambio1.setText(cantidad);
            obtenerDinero();
        }
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void botonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonResetActionPerformed
        cantidad = "";
        punto = true;
        etiquetaCambio1.setText("0");
        etiquetaCambio2.setText("0");
    }//GEN-LAST:event_botonResetActionPerformed

    private void obtenerDinero(){
        cantidad = etiquetaCambio1.getText();
        dinero = Float.parseFloat(cantidad);
        cambioDivisas();
        dinero *= cambio;
        etiquetaCambio2.setText(String.format("%.2f", dinero));
    }
    
    private void cambioDivisas(){
        if(divisa1.equals(divisa2)){
            cambio = (float) 1.;
        } else if(divisa1.equals("Estados Unidos - Dólar") && divisa2.equals("Perú - Nuevo Sol")){
            cambio = (float) 3.86;
        } else if(divisa1.equals("Estados Unidos - Dólar") && divisa2.equals("Europa - Euro")){
            cambio = (float) 1.;
        } else if(divisa1.equals("Estados Unidos - Dólar") && divisa2.equals("Colombia - Peso Colombiano")){
            cambio = (float) 4_362.15; 
        } else if(divisa1.equals("Perú - Nuevo Sol") && divisa2.equals("Estados Unidos - Dólar")){
            cambio = (float) 0.26;
        } else if(divisa1.equals("Perú - Nuevo Sol") && divisa2.equals("Europa - Euro")){
            cambio = (float) 0.26;
        } else if(divisa1.equals("Perú - Nuevo Sol") && divisa2.equals("Colombia - Peso Colombiano")){
            cambio = (float) 1123.92;
        } else if(divisa1.equals("Europa - Euro") && divisa2.equals("Estados Unidos - Dólar")){
            cambio = (float) 1.;
        } else if(divisa1.equals("Europa - Euro") && divisa2.equals("Perú - Nuevo Sol")){
            cambio = (float) 3.85;
        } else if(divisa1.equals("Europa - Euro") && divisa2.equals("Colombia - Peso Colombiano")){
            cambio = (float) 4_358.66;
        } else if(divisa1.equals("Colombia - Peso Colombiano") && divisa2.equals("Estados Unidos - Dólar")){
            cambio = (float) 0.00023;
        } else if(divisa1.equals("Colombia - Peso Colombiano") && divisa2.equals("Perú - Nuevo Sol")){
            cambio = (float) 0.00088;
        } else if(divisa1.equals("Colombia - Peso Colombiano") && divisa2.equals("Europa - Euro")){
            cambio = (float) 0.00023;
        }
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
            java.util.logging.Logger.getLogger(VentanaDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        try {
                UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
            } catch (ClassNotFoundException ex) {
                //Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                //Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                //Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedLookAndFeelException ex) {
                //Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaDivisas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton0;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonPunto;
    private javax.swing.JButton botonReset;
    private javax.swing.JComboBox<String> comboDivisas1;
    private javax.swing.JComboBox<String> comboDivisas2;
    private javax.swing.JLabel etiquetaCambio1;
    private javax.swing.JLabel etiquetaCambio2;
    private javax.swing.JLabel etiquetaDivisa1;
    private javax.swing.JLabel etiquetaDivisa2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem menuCalculadora;
    private javax.swing.JMenuItem menuDivisas;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
