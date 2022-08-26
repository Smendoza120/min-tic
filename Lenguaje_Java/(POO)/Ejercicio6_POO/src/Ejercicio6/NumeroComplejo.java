/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author sanch
 */
public class NumeroComplejo {
    
    private double a; // Parte real
    private double b; // Parte imaginaria

    public NumeroComplejo(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
    
    public NumeroComplejo calcularSuma(NumeroComplejo c){
        NumeroComplejo suma = new NumeroComplejo(a + c.getA(),b+c.getB());
        return suma;
    }
    
    public NumeroComplejo calcularProducto(NumeroComplejo c){
        NumeroComplejo mult = new NumeroComplejo((a * c.getA() - b * c.getB()), (a * c.getB() + b * c.getA()));
        return mult;
    }
    
    public boolean comprobarIgualdad(NumeroComplejo c){
        boolean igualdad = false;
        if(a == c.getA() && b == c.getB()){
            igualdad = true;
        }
        
        return igualdad;
    }
    
    public NumeroComplejo multiplicarPorEntero(int x){
        NumeroComplejo mult2 = new NumeroComplejo(a * x, b * x);
        return mult2;
    } 
}
