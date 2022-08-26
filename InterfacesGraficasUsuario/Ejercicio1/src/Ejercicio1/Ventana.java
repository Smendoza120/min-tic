
package Ejercicio1;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{
    private JButton boton;
    private JPanel panel;
    private JLabel etiqueta;
    private int contador = 0;
    
    public Ventana(){
        this.setSize(500,500);
        setTitle("Ejercicio 1"); //Titulo a la ventana
        setLocationRelativeTo(null); //Ventana centrada en la pantalla
        
        iniciarComponentes();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);//
    }
    
    private void iniciarComponentes(){
        colocarPanel();
        colocarBoton();
        colocarEtiqueta();
    }
    
    private void colocarPanel(){
        panel = new JPanel();
        panel.setLayout(null);//Reseteamos los diseños
        this.getContentPane().add(panel);//Agregamos a la ventana
    }
    
    private void colocarEtiqueta(){
        etiqueta = new JLabel();
        etiqueta.setBounds(0, 70, 500, 80); //Ubicacion de la etiqueta
        etiqueta.setText("Pulsa el boton"); //Texto de la etiqueta
        etiqueta.setFont(new Font("arial", 0, 20)); //Fuente
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER); //Centrar etiqueta
        
        panel.add(etiqueta); //Añadimos la etiqueta al panel
    }

    private void colocarBoton(){
        boton = new JButton();
        boton.setBounds(155, 320, 200, 50); //Ubicacion del boton
        boton.setText("Pulsa Aqui"); //Texto del boton
        boton.setFont(new Font("cooper black", 0, 20)); //Font del texto 

        oyenteDeRaton();
        
        panel.add(boton);
    }
    
    private void oyenteDeRaton(){
        ActionListener eventoAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contador++; 
                if(contador == 1){
                   etiqueta.setText("Has presionado el boton 1 vez");
                } else {
                    etiqueta.setText("Has pulsado el boton " + contador + " veces");
                } 
            }
        };
        boton.addActionListener(eventoAccion);
    }
}
