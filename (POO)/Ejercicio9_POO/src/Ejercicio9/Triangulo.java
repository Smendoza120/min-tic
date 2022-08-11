/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9;

/**
 *
 * @author sanch
 */
public class Triangulo extends Poligono{
    private double lado1;
    private double lado2; 
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        super(3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    @Override
    public String toString() {
        return "Triangulo: \n" + super.toString() 
               + "\nLado1= " + lado1 
               + "\nLado2= " + lado2 
               + "\nLado3= " + lado3;
    }
    
    @Override
    public double area(){
        double perimetro = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(perimetro * (perimetro - lado1) * (perimetro - lado2) * (perimetro - lado3));
    }
}

