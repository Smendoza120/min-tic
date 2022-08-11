/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

/**
 *
 * @author sanch
 */
public class Futbolista extends Persona{
    private int dorsal;
    private String posicion; 

    public Futbolista(int dorsal, String posicion, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getPosicion() {
        return posicion;
    }
    
    public void entrevista(){
        System.out.println("Da una entrevista");
    }
    
    @Override
    public void partidoFutbol(){
        System.out.println("Juega el partido de Futbol");
    }
    
    @Override
    public void entrenamiento(){
        System.out.println("Entrena");
    }
    
}
