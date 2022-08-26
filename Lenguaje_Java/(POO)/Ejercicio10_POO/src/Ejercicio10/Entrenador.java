/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

/**
 *
 * @author sanch
 */
public class Entrenador extends Persona{
    private String estrategia;

    public Entrenador(String estrategia, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.estrategia = estrategia;
    }

    public String getEstrategia() {
        return estrategia;
    }
    
    public void planificarEntrenamiento(){
        System.out.println("Planifica el entrenamiento");
    }
    
    @Override
    public void partidoFutbol(){
        System.out.println("Dirige un partido de Futbol");
    }
    
    @Override
    public void entrenamiento(){
        System.out.println("Dirige un entrenamiento");
    }
}
