/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author sanch
 */
public class Triangulo_Isosceles {
    //Atributos
    private double base;
    private double lado;
    
    //Construnctor
    public Triangulo_Isosceles(double base, double lado){
        this.base = base;
        this.lado = lado;
    }
    
    public double obtenerPerimetro(){
        double perimetro = base + (lado * 2);
        return perimetro;
    }
    
    public double obtenerArea(){
        double area = (base * Math.sqrt((lado * lado) - ((base * base) / 4))) / 2;
        return area;
    }
    
    
}
