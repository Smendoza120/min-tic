/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

/**
 *
 * @author sanch
 */
public class Paquete {
    
    private int numeroPaquete;
    private String dni;
    private double peso;
    private int prioridad;

    public Paquete(int numeroPaquete, String dni, double peso, int prioridad) {
        this.numeroPaquete = numeroPaquete;
        this.dni = dni;
        this.peso = peso;
        this.prioridad = prioridad;
    }

    public int getNumeroPaquete() {
        return numeroPaquete;
    }

    public String getDni() {
        return dni;
    }

    public double getPeso() {
        return peso;
    }

    public int getPrioridad() {
        return prioridad;
    }
    
    public String mostrarDatosPaquete(){
        return "Numero paquete: " + numeroPaquete + 
                ".\nDNI: " + dni + 
                ".\nPeso: " + peso + 
                ".\nPrioridad: " + prioridad +".";
    }
}
