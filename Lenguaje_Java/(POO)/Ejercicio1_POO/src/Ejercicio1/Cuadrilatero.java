/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author sanch
 */
public class Cuadrilatero {
    
    //Diagrama de clase. 
    //Atributos
    private float lado1;
    private float lado2;
    
    //Metodos

    //Metodo constructor 1 (cuadrilatero)
    public Cuadrilatero(float lado1, float lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;   
    }
    
    //Metodo constructor 2 (cuadrado)
    public Cuadrilatero(float lado1){
        this.lado1 = this.lado2 = lado1;
    }
    
    public float getPerimetro(){
        float perimetro  = 2 * (lado1 + lado2); 
        return perimetro;
    }
    
    public float getArea(){
        float area = (lado1 * lado2);
        return area;
    }
}
