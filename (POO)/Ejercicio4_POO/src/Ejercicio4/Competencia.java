/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author sanch
 */
public class Competencia {
    
    //Atributos creados.
    private int numeroA;
    private String nombre;
    private float tiempoCarrera;
    
    //Metodo constructor.
    public Competencia(int numeroA, String nombreA, float tiempoCarrera){
        this.nombre = nombre;
        this.numeroA = numeroA;
        this.tiempoCarrera = tiempoCarrera;
    }
    
    public float getTiempoCarrera(){
        return tiempoCarrera;
    }
    
    public String mostrarDatosGanador(){
        return "Nombre del atleta: " + nombre + "\nNumero del atleta: " + numeroA + "\ntiempo de carrera: " + tiempoCarrera + ".";
    }
}
