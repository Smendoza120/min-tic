
package Ejercicio2;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ventana extends JFrame{
    private JPanel panel;
    private JLabel titulo, imagen;
    private JRadioButton botonTennis, botonGaming, botonNatacion, botonBaloncesto;
    
    
    public Ventana(){
        this.setSize(600, 500);
        setTitle("Ejercicio2");
        setLocationRelativeTo(null);
        
        iniciarComponentes();
                
        setDefaultCloseOperation(EXIT_ON_CLOSE);
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
    }
    
    private void colocarEtiqueta(){
        titulo = new JLabel();
        titulo.setBounds(20, 40, 250, 30);
        titulo.setText("Escoja su deporte favorito");
        titulo.setFont(new Font("arial",3,18));
        
        panel.add(titulo);
    }

    private void colocarBotones(){
        //Creamos botones
        botonTennis = new JRadioButton("Tennis", false);
        botonTennis.setBounds(20, 120, 150, 30);
        botonTennis.setFont(new Font("arial", 1 , 20));

        botonGaming = new JRadioButton("Gaming", false);
        botonGaming.setBounds(20, 190, 150, 30);
        botonGaming.setFont(new Font("arial", 1, 20));

        botonNatacion = new JRadioButton("Natacion", false);
        botonNatacion.setBounds(20, 260, 150, 30);
        botonNatacion.setFont(new Font("arial", 1, 20));
        
        botonBaloncesto = new JRadioButton("Baloncesto", false);
        botonBaloncesto.setBounds(20, 330, 150, 30);
        botonBaloncesto.setFont(new Font("arial", 1, 20));
        
        //Añadimos botones
        panel.add(botonTennis);
        panel.add(botonGaming);
        panel.add(botonNatacion);
        panel.add(botonBaloncesto);
        
        //Agrupamos el conjunto de botones
        ButtonGroup grupoBotones = new ButtonGroup();
        grupoBotones.add(botonTennis);
        grupoBotones.add(botonGaming);
        grupoBotones.add(botonBaloncesto);
        grupoBotones.add(botonNatacion);
        
        eventoDeAccion();
    }
    
    private void eventoDeAccion(){
        //Creamos el label de las imagenes con su ubicacion
        imagen = new JLabel();
        imagen.setBounds(220, 130, 330, 250);
        panel.add(imagen);
        
        //Añadimos las imagenes
        final ImageIcon imagenTennis = new ImageIcon(getClass().getResource("/Imagenes/tennis.jpg"));//Cuando creamos el ejecutable salen las imagenes
        final ImageIcon imagenGaming = new ImageIcon(getClass().getResource("/Imagenes/gaming.jpg"));
        final ImageIcon  imagenNatacion = new ImageIcon(getClass().getResource("/Imagenes/natacion.jpg"));
        final ImageIcon imagenBaloncesto = new ImageIcon(getClass().getResource("/Imagenes/baloncesto.jpg"));
        
        //Acion de tennis
        ActionListener accionTennis = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagen.setIcon(new ImageIcon(imagenTennis.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        
        botonTennis.addActionListener(accionTennis);

        //Accion Gaming
        ActionListener accionGaming = new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                imagen.setIcon(new ImageIcon(imagenGaming.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        
        botonGaming.addActionListener(accionGaming);

        //Accion Natacion
        ActionListener accionNatacion = new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e) {
                imagen.setIcon(new ImageIcon(imagenNatacion.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
            }
            
        };
        
        botonNatacion.addActionListener(accionNatacion);

        //Accion Baloncesto
        ActionListener accionBaloncesto = new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e) {
                imagen.setIcon(new ImageIcon(imagenBaloncesto.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
            }
            
        };
        
        botonBaloncesto.addActionListener(accionBaloncesto);
    }
    
}
