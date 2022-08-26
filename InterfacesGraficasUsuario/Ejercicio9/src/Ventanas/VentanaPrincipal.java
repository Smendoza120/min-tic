
package Ventanas;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class VentanaPrincipal extends javax.swing.JFrame {
    private boolean casilla[][] = new boolean[3][3];
    private String turno = "usuario1";
    private int matriz [][] = new int[3][3];
    private String usuario1, usuario2;
    private int vecesGano1 = 0, vecesGano2 = 0, vecesEmpate = 0;
    
    public VentanaPrincipal(String usuario1, String usuario2) {
        this.usuario1 = usuario1;
        this.usuario2 = usuario2;
        
        initComponents();
        setSize(600,600);
        setLocationRelativeTo(null);
        llenarCasillas();
        llenarMatriz();
    }
    
    private void llenarMatriz(){
        for(int i=0; i < 3; i++){
            for(int j=0; j < 3; j++){
                matriz[i][j] = 0;
            }
        }
    }
    
    private void llenarCasillas(){
        for(int i=0; i < 3; i++){
            for(int j=0; j < 3; j++){
                casilla[i][j] = true;
            }
        }
    }

    private void dibujarX(JButton boton){
        boton.setIcon(new ImageIcon(getClass().getResource("/Imagenes/equis.png")));
    }
    
    private void dibujarO(JButton boton){
        boton.setIcon(new ImageIcon(getClass().getResource("/Imagenes/circulo.png")));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        botonArribaIzquierda = new javax.swing.JButton();
        botonArriba = new javax.swing.JButton();
        botonArribaDerecha = new javax.swing.JButton();
        botonIzquierda = new javax.swing.JButton();
        botonCentro = new javax.swing.JButton();
        botonDerecha = new javax.swing.JButton();
        botonAbajoIzquierda = new javax.swing.JButton();
        botonAbajo = new javax.swing.JButton();
        botonAbajoDerecha = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuJuego = new javax.swing.JMenu();
        comenzarDeNuevo = new javax.swing.JMenuItem();
        mostrarResultados = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        salir = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panel.setLayout(new java.awt.GridLayout(3, 3));

        botonArribaIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArribaIzquierdaActionPerformed(evt);
            }
        });
        panel.add(botonArribaIzquierda);

        botonArriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArribaActionPerformed(evt);
            }
        });
        panel.add(botonArriba);

        botonArribaDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArribaDerechaActionPerformed(evt);
            }
        });
        panel.add(botonArribaDerecha);

        botonIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIzquierdaActionPerformed(evt);
            }
        });
        panel.add(botonIzquierda);

        botonCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCentroActionPerformed(evt);
            }
        });
        panel.add(botonCentro);

        botonDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDerechaActionPerformed(evt);
            }
        });
        panel.add(botonDerecha);

        botonAbajoIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbajoIzquierdaActionPerformed(evt);
            }
        });
        panel.add(botonAbajoIzquierda);

        botonAbajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbajoActionPerformed(evt);
            }
        });
        panel.add(botonAbajo);

        botonAbajoDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbajoDerechaActionPerformed(evt);
            }
        });
        panel.add(botonAbajoDerecha);

        menuJuego.setText("Juego");
        menuJuego.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        comenzarDeNuevo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzarDeNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reset.png"))); // NOI18N
        comenzarDeNuevo.setText("Comenzar de nuevo");
        comenzarDeNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzarDeNuevoActionPerformed(evt);
            }
        });
        menuJuego.add(comenzarDeNuevo);

        mostrarResultados.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mostrarResultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tabla.png"))); // NOI18N
        mostrarResultados.setText("Mostrar tabla de resultados");
        mostrarResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarResultadosActionPerformed(evt);
            }
        });
        menuJuego.add(mostrarResultados);
        menuJuego.add(jSeparator1);

        salir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        menuJuego.add(salir);

        jMenuBar1.add(menuJuego);

        menuAyuda.setText("Ayuda");
        menuAyuda.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        menuAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAyudaMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void botonArribaIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArribaIzquierdaActionPerformed
        if(casilla[0][0] == true){ //verificamos si no se han dado click sobre el boton
            if(turno.equals("usuario1")){ //Verificamos el turno
                dibujarX(botonArribaIzquierda);
                matriz[0][0] = 1;
                turno = "usuario2";
            } else { //Turno del usuario 2
                dibujarO(botonArribaIzquierda);
                matriz[0][0] = 2;
                turno = "usuario1";
            }
            casilla[0][0] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonArribaIzquierdaActionPerformed

    private void botonArribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArribaActionPerformed
        if(casilla[0][1] == true){ //verificamos si no se han dado click sobre el boton
            if(turno.equals("usuario1")){ //Verificamos el turno
                dibujarX(botonArriba);
                matriz[0][1] = 1;
                turno = "usuario2";
            } else { //Turno del usuario 2
                dibujarO(botonArriba);
                matriz[0][1] = 2;
                turno = "usuario1";
            }
            casilla[0][1] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonArribaActionPerformed

    private void botonArribaDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArribaDerechaActionPerformed
        if(casilla[0][2] == true){ //verificamos si no se han dado click sobre el boton
            if(turno.equals("usuario1")){ //Verificamos el turno
                dibujarX(botonArribaDerecha);
                matriz[0][2] = 1;
                turno = "usuario2";
            } else { //Turno del usuario 2
                dibujarO(botonArribaDerecha);
                matriz[0][2] = 2;
                turno = "usuario1";
            }
            casilla[0][2] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonArribaDerechaActionPerformed

    private void botonIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIzquierdaActionPerformed
        if(casilla[1][0] == true){ //verificamos si no se han dado click sobre el boton
            if(turno.equals("usuario1")){ //Verificamos el turno
                dibujarX(botonIzquierda);
                matriz[1][0] = 1;
                turno = "usuario2";
            } else { //Turno del usuario 2
                dibujarO(botonIzquierda);
                matriz[1][0] = 2;
                turno = "usuario1";
            }
            casilla[1][0] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonIzquierdaActionPerformed

    private void botonCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCentroActionPerformed
        if(casilla[1][1] == true){ //verificamos si no se han dado click sobre el boton
            if(turno.equals("usuario1")){ //Verificamos el turno
                dibujarX(botonCentro);
                matriz[1][1] = 1;
                turno = "usuario2";
            } else { //Turno del usuario 2
                dibujarO(botonCentro);
                matriz[1][1] = 2;
                turno = "usuario1";
            }
            casilla[1][1] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonCentroActionPerformed

    private void botonDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDerechaActionPerformed
        if(casilla[1][2] == true){ //verificamos si no se han dado click sobre el boton
            if(turno.equals("usuario1")){ //Verificamos el turno
                dibujarX(botonDerecha);
                matriz[1][2] = 1;
                turno = "usuario2";
            } else { //Turno del usuario 2
                dibujarO(botonDerecha);
                matriz[1][2] = 2;
                turno = "usuario1";
            }
            casilla[1][2] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonDerechaActionPerformed

    private void botonAbajoIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbajoIzquierdaActionPerformed
        if(casilla[2][0] == true){ //verificamos si no se han dado click sobre el boton
            if(turno.equals("usuario1")){ //Verificamos el turno
                dibujarX(botonAbajoIzquierda);
                matriz[2][0] = 1;
                turno = "usuario2";
            } else { //Turno del usuario 2
                dibujarO(botonAbajoIzquierda);
                matriz[2][0] = 2;
                turno = "usuario1";
            }
            casilla[2][0] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonAbajoIzquierdaActionPerformed

    private void botonAbajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbajoActionPerformed
        if(casilla[2][1] == true){ //verificamos si no se han dado click sobre el boton
            if(turno.equals("usuario1")){ //Verificamos el turno
                dibujarX(botonAbajo);
                matriz[2][1] = 1;
                turno = "usuario2";
            } else { //Turno del usuario 2
                dibujarO(botonAbajo);
                matriz[2][1] = 2;
                turno = "usuario1";
            }
            casilla[2][1] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonAbajoActionPerformed

    private void botonAbajoDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbajoDerechaActionPerformed
        if(casilla[2][2] == true){ //verificamos si no se han dado click sobre el boton
            if(turno.equals("usuario1")){ //Verificamos el turno
                dibujarX(botonAbajoDerecha);
                matriz[2][2] = 1;
                turno = "usuario2";
            } else { //Turno del usuario 2
                dibujarO(botonAbajoDerecha);
                matriz[2][2] = 2;
                turno = "usuario1";
            }
            casilla[2][2] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonAbajoDerechaActionPerformed

    private void mostrarResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarResultadosActionPerformed
        VentanaMostrarResultados ventanaMR = new VentanaMostrarResultados(this, true, usuario1, usuario2, vecesGano1, vecesGano2, vecesEmpate);
        ventanaMR.setVisible(true);
    }//GEN-LAST:event_mostrarResultadosActionPerformed

    private void comenzarDeNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzarDeNuevoActionPerformed
        vecesGano1 = 0;
        vecesGano2 = 0; 
        vecesEmpate = 0;
        reiniciarJuego();
    }//GEN-LAST:event_comenzarDeNuevoActionPerformed

    private void menuAyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAyudaMouseClicked
        try {
            try {
                Desktop.getDesktop().browse(new URI("https://www.mundodeportivo.com/uncomo/ocio/articulo/como-jugar-al-tres-en-raya-2442.html"));
            } catch (IOException ex) {
                //Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (URISyntaxException ex) {
            //Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuAyudaMouseClicked

    private void comprobarGanador(){
        boolean ganador1 = false;
        boolean ganador2 = false;
        int casillasEmpate = 0;
        
        //comprobamos si el ganador es el usuario1
        ganador1 = comprobar(1);
        
        //comprobamos si el ganador es el usuario2
        ganador2 = comprobar(2);
        
        if(ganador1 == true){
            vecesGano1++;
            Ventanaganador ventanaG = new Ventanaganador(this, true, usuario1);
            ventanaG.setVisible(true);
            reiniciarJuego();
        } else if (ganador2 == true){
            vecesGano2++;
            Ventanaganador ventanaG = new Ventanaganador(this, true, usuario2);
            ventanaG.setVisible(true);
            reiniciarJuego();
        } else { //tal vez el tablero este lleno, hay un empate
            for(int i=0; i < 3; i++){
                for(int j=0; j < 3; j++){ //Puede haber un 1 o un 2
                    if(matriz[i][j] != 0){
                        casillasEmpate++;
                    }
                }
            }
            
            if(casillasEmpate == 9){
                vecesEmpate++;
                VentanaEmpate ventanaE = new VentanaEmpate(this, true);
                ventanaE.setVisible(true);
                reiniciarJuego();
            } else{
                casillasEmpate = 0;
            }
        }
        
    }
    
    private boolean comprobar(int num){
        boolean ganador = false;
        
        if(matriz[0][0] == num && matriz[0][1] == num && matriz[0][2] == num){
            ganador = true;
        } else if(matriz[1][0] == num && matriz[1][1] == num && matriz[1][2] == num){
            ganador = true;
        } else if(matriz[2][0] == num && matriz[2][1] == num && matriz[2][2] == num){
            ganador = true;
        } else if(matriz[0][0] == num && matriz[1][0] == num && matriz[2][0] == num){
            ganador = true;
        } else if(matriz[0][0] == num && matriz[1][1] == num && matriz[2][2] == num){
            ganador = true;
        } else if(matriz[0][2] == num && matriz[1][1] == num && matriz[2][0] == num){
            ganador = true;
        } else if(matriz[0][1] == num && matriz[1][1] == num && matriz[2][1] == num){
            ganador = true;
        } else if(matriz[0][2] == num && matriz[1][2] == num && matriz[2][2] == num){
            ganador = true;
        }
        
        return ganador;
    }
    
    public void reiniciarJuego(){
        llenarCasillas();
        llenarMatriz();
        
        botonArribaIzquierda.setIcon(null);
        botonArriba.setIcon(null);
        botonArribaDerecha.setIcon(null);
        botonIzquierda.setIcon(null);
        botonCentro.setIcon(null);
        botonDerecha.setIcon(null);
        botonAbajoIzquierda.setIcon(null);
        botonAbajo.setIcon(null);
        botonAbajoDerecha.setIcon(null);
        
        //Preguntamos al usuario quien jugara primero 
        quienJuegaPrimero();
    }
    
    private void quienJuegaPrimero(){
        VentanaEscogerTurno ventanaET = new VentanaEscogerTurno(this, true, usuario1, usuario2);
        ventanaET.setVisible(true);
        turno = ventanaET.getTurno();
    }
    
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAbajo;
    private javax.swing.JButton botonAbajoDerecha;
    private javax.swing.JButton botonAbajoIzquierda;
    private javax.swing.JButton botonArriba;
    private javax.swing.JButton botonArribaDerecha;
    private javax.swing.JButton botonArribaIzquierda;
    private javax.swing.JButton botonCentro;
    private javax.swing.JButton botonDerecha;
    private javax.swing.JButton botonIzquierda;
    private javax.swing.JMenuItem comenzarDeNuevo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuJuego;
    private javax.swing.JMenuItem mostrarResultados;
    private javax.swing.JPanel panel;
    private javax.swing.JMenuItem salir;
    // End of variables declaration//GEN-END:variables
}
