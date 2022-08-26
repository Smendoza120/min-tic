
package Ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;


public class Ventana extends JFrame{
    public JPanel panel;
    
    public Ventana(){
        this.setSize(500, 500);//Establecemos el tamaño de la pantalla
        setTitle("Esto es un titulo"); //Agregamos el titulo de la ventana
        //setLocation(300, 150); //Establecemos la posicion inicial de la ventana
        //setBounds(300, 150, 500, 500); //Fusion entre setSize y setLocation
        setLocationRelativeTo(null); // Establecemos la ventana en el centro de la pantalla.
        
        setResizable(true); //Bloquear la dimension de la ventana
        setMinimumSize(new Dimension(200, 200)); //Tamaño minimo de la ventana
        this.getContentPane().setBackground(Color.BLUE); //Establecer color de fondo
        
        iniciarComponentes();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Cuando cierre la ventana, el programa se cierra automaticamente.
    }
    
    private void iniciarComponentes(){
        colocarPaneles();
        //colocarEtiquetas();
        //colocarBotones();
        //colocarRadioBotones();
        //colocarBotonesDeActivacion();
        //colocarCajasDeTexto();
        //colocarAreasDeTexto();
        //colocarCasillasDeVerificacion();
        //colocarListasDesplegables();
        //colocarCamposDeContraseña();
        //colocarTablas();
        //colocarListas();
    }
    
    private void colocarPaneles(){
        panel = new JPanel();
        panel.setLayout(null); //Desactivamos parametros de ubicacion por defecto
        this.getContentPane().add(panel); //Agregamos el panel a la ventana
    }
    
    private void colocarEtiquetas(){
        
        JLabel etiqueta = new JLabel(); //Creamos una etiqueta
        etiqueta.setText("Muldial 2018"); //Establecemos el texto de la etiqueta
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER); //Centrado al texto dentro de la etiqueta de forma horizontal

        etiqueta.setBounds(85, 10, 300, 80);
        etiqueta.setForeground(Color.BLACK); //Color de letras
        etiqueta.setFont(new Font("cooper black",0, 40)); //Establecemos la fuente 

        panel.add(etiqueta); //Agregamos la etiqueta al panel      
        
        
        ImageIcon imagen = new ImageIcon("images/balon.png");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(80, 90, 300, 300);
        
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
        
        panel.add(etiqueta2);
    }
    
    private void colocarBotones(){
        //Boton1 - boton de texto.
        JButton boton1 = new JButton();
        
        boton1.setText("Click"); //Establecemos un texto al boton
        boton1.setBounds(100, 100, 100, 40); //Posicion del boton y tamaño
        boton1.setEnabled(true); //habilitar o deshabilitar botones
        boton1.setMnemonic('a'); //Establecemos alt + letra
        
        boton1.setForeground(Color.BLUE); //Establecemos el color de la letra del boton
        boton1.setFont(new Font("cooper black", Font.BOLD, 20)); //Establecemos el tamaño de la letra del boton
        
        panel.add(boton1);
        
        //boton 2 - boton de imagen
        JButton boton2 = new JButton();
        boton2.setBounds(100, 200, 100, 40);
        boton2.setOpaque(true);//Poder cambiar el color de fondo.
        
        ImageIcon clickAqui = new ImageIcon("images/cigarro.png");
        boton2.setIcon(new ImageIcon(clickAqui.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
        
        boton2.setBackground(Color.blue); //Establecemos el color de fondo del boton.
        
        panel.add(boton2);
        
        //Boton3- boton de bordes
        JButton boton3 = new JButton();
        boton3.setBounds(100, 300, 110, 50);
        
        boton3.setBorder(BorderFactory.createLineBorder(Color.GREEN, 4, true)); //Creacion del borde.
        
        panel.add(boton3);
        
    }
    
    private void colocarRadioBotones(){
        JRadioButton radioBoton1 = new JRadioButton("Opcion 1", true);
        radioBoton1.setBounds(50, 100, 200, 50);
        
        radioBoton1.setEnabled(true); // Desmarcar la casilla.
        radioBoton1.setText("Programacion");
        radioBoton1.setFont(new Font("cooper black",0,20));
        
        panel.add(radioBoton1);
        
        JRadioButton radioBoton2 = new JRadioButton("Opcion 2", false);
        radioBoton2.setBounds(50, 150, 100, 50);
        
        panel.add(radioBoton2);
        
        JRadioButton radioBoton3 = new JRadioButton("opcion 3", false);
        radioBoton3.setBounds(50, 200, 100, 50);
        
        panel.add(radioBoton3);
        
        //Grupo de radio botones (encuestas, examenes)
        ButtonGroup grupoRadioBotones = new ButtonGroup();
        grupoRadioBotones.add(radioBoton1);
        grupoRadioBotones.add(radioBoton2);
        grupoRadioBotones.add(radioBoton3);
    }
    
    private void colocarBotonesDeActivacion(){
        JToggleButton botonActivacion1 = new JToggleButton("Opcion 1", true);       
        botonActivacion1.setBounds(50, 100, 100, 40);
        panel.add(botonActivacion1);  
        
        JToggleButton botonActivacion2 = new JToggleButton("Opcion 2", false);
        botonActivacion2.setBounds(50, 150, 100, 40);
        panel.add(botonActivacion2);
        
        JToggleButton botonActivacion3 = new JToggleButton("Opcion 3", false);
        botonActivacion3.setBounds(50, 200, 100, 40);
        panel.add(botonActivacion3);
        
        /*
        ButtonGroup grupoBotonesActivacion = new ButtonGroup();
        grupoBotonesActivacion.add(botonActivacion1);
        grupoBotonesActivacion.add(botonActivacion2);
        grupoBotonesActivacion.add(botonActivacion3);
        */
    }
    
    private void colocarCajasDeTexto(){
        JTextField cajaTexto = new JTextField();
        cajaTexto.setBounds(50, 50, 100, 30);
        cajaTexto.setText("Hola...");
        
        panel.add(cajaTexto);
    }
    
    private void colocarAreasDeTexto(){
        JTextArea areaTexto = new JTextArea();
        areaTexto.setBounds(20, 20, 300, 200);
        areaTexto.setText("Hola");
        areaTexto.append("\nEscribe por aqui");//Añade mas texto al area
        areaTexto.setEditable(true);//Permitir o no edutar el contenido
        
        panel.add(areaTexto);
        
        //Barras de desplazamiento
        JScrollPane barrasDesplazamiento = new JScrollPane(areaTexto);
        barrasDesplazamiento.setBounds(20, 20, 300, 200);
        JScrollBar ScrollPaneConstants;
        
        panel.add(barrasDesplazamiento);
    }
    
    private void colocarCasillasDeVerificacion(){
        JCheckBox casillaVerificacion1 = new JCheckBox("Leche", true);
        casillaVerificacion1.setBounds(20, 20, 100, 40);
        panel.add(casillaVerificacion1);
        
        JCheckBox casillaVerificacion2 = new JCheckBox("Galletas", false);
        casillaVerificacion2.setBounds(20, 50, 100, 40);
        panel.add(casillaVerificacion2);
        
        JCheckBox casillaVerificacion3 = new JCheckBox("yogurt", false);
        casillaVerificacion3.setBounds(20, 80, 100, 40);
        panel.add(casillaVerificacion3);
        
        JCheckBox casillaVerificacion4 = new JCheckBox("Cereal", false);
        casillaVerificacion4.setBounds(20, 110, 100, 40);
        panel.add(casillaVerificacion4);  
    }
    
    private void colocarListasDesplegables(){
        /*
        String paises[] = {"Peru", "Colombia", "Paraguay", "Ecuador"};
        
        JComboBox listaDesplegable = new JComboBox(paises);
        listaDesplegable.setBounds(20, 20, 100, 30);
        
        listaDesplegable.addItem("Mexico"); // Agregar mas datos.
        listaDesplegable.setSelectedItem("Ecuador");//Seleccionar el primer objeto
        
        panel.add(listaDesplegable);
        */
        
        Persona persona1 = new Persona("Harold Sanchez", 24, "Colombiano");
        Persona persona2 = new Persona("Tania Bustamante", 20, "Argentina");
        
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        JComboBox listaDesplegable = new JComboBox(modelo);
        
        modelo.addElement(persona1);
        modelo.addElement(persona2);
        
        listaDesplegable.setBounds(20, 20, 200, 30);
        panel.add(listaDesplegable);
    }
    
    private void colocarCamposDeContraseña(){
        JPasswordField campoContraseña = new JPasswordField();
        
        campoContraseña.setText("Programacion");
        campoContraseña.setBounds(20, 20, 150, 30);
        panel.add(campoContraseña);
        
        String contraseña = "";
        
        for(int i=0; i<campoContraseña.getPassword().length;i++){
            contraseña += campoContraseña.getPassword()[i];
        }
        
        System.out.println("Contraseña: " + contraseña);
    }
    
    private void colocarTablas(){
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("Nombre");
        modelo.addColumn("Edad");
        modelo.addColumn("Nacionalidad");
        
        String persona1[] = {"Alejandro", "21", "Peruano"};
        String persona2[] = {"Rosa", "22", "Mexicana"};
        String persona3[] = {"Harold", "24", "Colombiano"};
        String persona4[] = {"Json", "19", "Colombiano"};
        String persona5[] = {"Carlos", "30", "Español"};
        String persona6[] = {"Bryan", "23", "Argentino"};
        String persona7[] = {"Leo", "40", "Chileno"};
        String persona8[] = {"Dobby", "18", "Brasileño"};
        String persona9[] = {"Juan", "23", "Chino"};
        String persona10[] = {"Criss", "15", "Argentino"};
        String persona11[] = {"Marco", "18", "Peruano"};
        String persona12[] = {"Maria", "23", "Mexicano"};
        String persona13[] = {"Katti", "23", "Mexicano"};
        
        
        modelo.addRow(persona1);
        modelo.addRow(persona2);
        modelo.addRow(persona3);
        modelo.addRow(persona4);
        modelo.addRow(persona5);
        modelo.addRow(persona6);
        modelo.addRow(persona7);
        modelo.addRow(persona8);
        modelo.addRow(persona9);
        modelo.addRow(persona10);
        modelo.addRow(persona11);
        modelo.addRow(persona12);
        modelo.addRow(persona13);
        

        JTable tabla = new JTable(modelo);
        tabla.setBounds(20, 20, 300, 200);
        panel.add(tabla);
        
        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBounds(20, 20, 300, 200);
        panel.add(scroll);
    }
    
    private void colocarListas(){
        DefaultListModel modelo = new DefaultListModel();
        
        modelo.addElement(new Persona("Harold Sanchez", 24, "Colombiano"));
        modelo.addElement(new Persona("Maria Paula", 22, "Colombiana"));
        modelo.addElement(new Persona("Cristian Moreno", 23, "Mexicano"));
        modelo.addElement(new Persona("Salome Pulido", 15, "Peruana"));
        modelo.addElement(new Persona("Blanca Borda", 70, "Argentina"));
        modelo.addElement(new Persona("Loren Alcantar", 40, "Chilena"));
        modelo.addElement(new Persona("Aylin Alcantar", 23, "Colombiana"));
        modelo.addElement(new Persona("Jean Pierre", 22, "Brasileño"));
        modelo.addElement(new Persona("Marcela Diaz", 30, "Argentina"));
        modelo.addElement(new Persona("Leandro Alcantar", 45, "Chileno"));
        modelo.addElement(new Persona("Harold Sanchez", 24, "Colombiano"));
        modelo.addElement(new Persona("Maria Paula", 22, "Colombiana"));
        modelo.addElement(new Persona("Cristian Moreno", 23, "Mexicano"));
        modelo.addElement(new Persona("Salome Pulido", 15, "Peruana"));
        modelo.addElement(new Persona("Blanca Borda", 70, "Argentina"));
        modelo.addElement(new Persona("Loren Alcantar", 40, "Chilena"));
        modelo.addElement(new Persona("Aylin Alcantar", 23, "Colombiana"));
        modelo.addElement(new Persona("Jean Pierre", 22, "Brasileño"));
        modelo.addElement(new Persona("Marcela Diaz", 30, "Argentina"));
        modelo.addElement(new Persona("Leandro Alcantar", 45, "Chileno"));
        
        JList lista = new JList(modelo);
        lista.setBounds(20, 20, 200, 300);
        panel.add(lista);
        
        JScrollPane scroll = new JScrollPane(lista);
        scroll.setBounds(20, 20, 200, 300);
        panel.add(scroll);
    }
}
