/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sanch
 */
public class Principal {
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>(); //Arreglo de tipo dinamico.
    static Scanner entrada = new Scanner(System.in);
   
    
    public static void main(String [] args){
        //llenar un poligono
        llenarPoligono();
        
        //Mostrar los datos y el area de cada poligono
        mostrarResultados();
    }
    
    public static void llenarPoligono(){
        char respuesta;
        int opcion;
        
        do {
            do {
                System.out.println("Digite un que poligono desea");
                System.out.println("1. Triangulo");
                System.out.println("2. Rectangulo");
                System.out.print("Opcion: ");
                opcion = entrada.nextInt();
            } while (opcion > 2 || opcion < 1);
            
            switch (opcion) {
                case 1: llenarTriangulo();
                    break;
                
                case 2: llenarRectangulo();
                    break;
            }
            
            System.out.print("\nDesea introducir otro poligono(s/n): ");
            respuesta = entrada.next().charAt(0);
            System.out.println("");
        } while (respuesta == 's' || respuesta == 'S');
    }
    
    public static void llenarTriangulo(){
        double lado1, lado2, lado3;
        
        System.out.print("Digite el lado1 del triangulo: ");
        lado1 = entrada.nextDouble();
        System.out.print("Digite el lado2 del triangulo: ");
        lado2 = entrada.nextDouble();
        System.out.print("Digite el lado3 del triangulo: ");
        lado3 = entrada.nextDouble();
        
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        
        //Guardamos un triangulo dentro de nuestro arreglo de poligonos
        poligono.add(triangulo);
    }
    
    public static void llenarRectangulo(){
        double lado1, lado2;
        
        System.out.print("Digite la base del rectangulo: ");
        lado1 = entrada.nextDouble();
        System.out.print("Digite la altura del rectangulo: ");
        lado2 = entrada.nextDouble();
        
        Rectangulo rectangulo = new Rectangulo(lado1, lado2);
        
        //Guardamos un rectangulo dentro de nuestro arreglo de poligonos
        poligono.add(rectangulo);
    }
    
    public static void mostrarResultados(){
        
        for(Poligono poli : poligono){
            System.out.println(poli.toString());
            System.out.println("");
            System.out.println("Area: " + poli.area());
            System.out.println("");
        }
        
    }
}
