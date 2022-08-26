/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

/**
 *
 * @author sanch
 */
public class Doctor extends Persona{
    private String titulacion;
    private int añosExperiencia;

    public Doctor(String titulacion, int añosExperiencia, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }
    
    @Override
    public void partidoFutbol(){
        System.out.println("Da asistencia en un partido de Futbol");
    }
    
    @Override
    public void entrenamiento(){
        System.out.println("Da asistencia en un entrenamiento");
    }

    public void curarLesion(){
        System.out.println("Curar lesion");
    }
}
