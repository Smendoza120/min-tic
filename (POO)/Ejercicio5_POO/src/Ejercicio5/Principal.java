/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

import java.util.Scanner;

/**
 *
 * @author sanch
 */
public class Principal {
    public static double mayorArea(Triangulo_Isosceles triangulos[]){
        double area;
        
        area = triangulos[0].obtenerArea();
        for (int i = 1; i < triangulos.length; i++) {
            if(triangulos[i].obtenerArea() > area){
                area = triangulos[i].obtenerArea();
            }
        }
        return area;
    }
    
    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);
        double base, lado;
        int nTriangulos;
        
        System.out.print("Digite la cantidad de triangulos: ");
        nTriangulos = entrada.nextInt();
        
        Triangulo_Isosceles triangulos[] = new Triangulo_Isosceles[nTriangulos];
        
        for(int i=0; i < triangulos.length; i++){
            System.out.println("\nDigite los valores para el triangulo " + (1+i));
            System.out.print("Digite la base: ");
            base = entrada.nextDouble();
            System.out.print("Digite el lado: ");
            lado = entrada.nextDouble();
            
            triangulos[i] = new Triangulo_Isosceles(base, lado);
        }
        
        for(int i=0; i < triangulos.length; i++){
            System.out.print("\nEl perimetros del triangulo es: " + triangulos[i].obtenerPerimetro());
            System.out.print("\nEl area del triangulo es: " + triangulos[i].obtenerArea());
        }
        
        System.out.println("\nEl area del triangulo con mayor superficie es: " + mayorArea(triangulos));
        
    }
}
