/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author sanch
 */
public class Tablero {
    //Atributos
    private int x;
    private int y;
    
    public Tablero(int x, int y){
        this.x = x; 
        this.y = y;
    }
    
    public void setMoverArriba(int incremento){
        y += incremento;
    }
    
    public void setMoverAbajo(int incremento){
        y -= incremento;
    }
    
    public void setMoverDerecha(int incremento){
        x += incremento;
    }
    
    public void setMoverIzquierda(int incremento){
        x -= incremento;
    }
    
    public int getY(){
        return y;
    }
    
    public int getX(){
        return x;
    }
}
