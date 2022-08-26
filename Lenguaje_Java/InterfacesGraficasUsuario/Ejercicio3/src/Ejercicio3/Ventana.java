
package Ejercicio3;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{
    private JPanel panel;
    private JLabel etiqueta;
    private JButton botonRojo, botonVerde, botonAzul;
    private int contadorRojo = 0, contadorVerde = 0, contadorAzul = 0;
    private int pulsado = 0;
    
    public Ventana(){
        this.setSize(600,400);
        setTitle("Ejercicio3");
        setLocationRelativeTo(null);
        
        iniciarComponentes();
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void iniciarComponentes(){
        colocarPanel();
        colocarEtiqueta();
        colocarBotones();
    }
    
    private void colocarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
        
        eventoRuedaRaton();
    }
    
    private void colocarEtiqueta(){
        etiqueta = new JLabel();
        etiqueta.setText("Color (Rojo, Verde, Azul)");
        etiqueta.setBounds(0, 50, 600, 20);
        etiqueta.setFont(new Font("arial", 0, 25));
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        
        panel.add(etiqueta);
    }
    
    private void colocarBotones(){
        /*
            pulsado = 1 -> botonRojo
            pulsado = 2 -> botonVerde
            pulsado = 3 -> botonAzul
        */
        
        botonRojo = new JButton("Rojo");
        botonRojo.setBounds(50, 230, 130, 50);
        botonRojo.setFont(new Font("arial", 0, 20));
        botonRojo.setOpaque(true);
        botonRojo.setForeground(Color.red);
        panel.add(botonRojo);
        
        botonRojo.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                pulsado = 1;
            }
        });
        
        botonVerde = new JButton("Verde");
        botonVerde.setBounds(220, 230, 130, 50);
        botonVerde.setFont(new Font("arial", 0, 20));
        botonVerde.setOpaque(true);
        botonVerde.setForeground(Color.green);
        panel.add(botonVerde);
        
        botonVerde.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                pulsado = 2;
            }
        });
        
        botonAzul = new JButton("Azul");
        botonAzul.setBounds(390, 230, 130, 50);
        botonAzul.setFont(new Font("arial", 0, 20));
        botonAzul.setOpaque(true);
        botonAzul.setForeground(Color.blue);
        panel.add(botonAzul);
        
        botonAzul.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                pulsado = 3;
            }
        });
    }
    
    private void eventoRuedaRaton(){     
        MouseWheelListener eventoRueda = new MouseWheelListener(){
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                if(pulsado != 0){ //Si se ha pulsado algun boton
                    if(pulsado == 1){ //Se ha pulsado el color rojo
                        contadorRojo -= e.getWheelRotation();
                        if(contadorRojo > 255){
                            contadorRojo = 255;
                        }
                        if(contadorRojo < 0){
                            contadorRojo = 0;
                        }
                    }else if (pulsado == 2){//Se ha pulsado el boton verde
                        contadorVerde -= e.getWheelRotation();
                        if(contadorVerde > 255){
                            contadorVerde = 255;
                        }
                        if(contadorVerde < 0){
                            contadorVerde = 0;
                        }
                    } else{ //Se ha pulsado el boton azul
                        contadorAzul -= e.getWheelRotation();
                        if(contadorAzul > 255){
                            contadorAzul = 255;
                        }
                        if(contadorAzul < 0){
                            contadorAzul = 0;
                        }
                    }
                    
                }
                etiqueta.setText("Color (Rojo = " + contadorRojo + ", Verde = " + contadorVerde + ", Azul = " + contadorAzul + ")");
                panel.setBackground(new Color(contadorRojo,contadorVerde,contadorAzul));
            }
            
        };
        panel.addMouseWheelListener(eventoRueda);
    }    
}
