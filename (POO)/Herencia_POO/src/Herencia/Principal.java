/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author sanch
 */
public class Principal {
    public static void main(String [] args){
        
        Vehiculo vehiculo = new VehiculoDeportivo("GH89", "Audi", "HI9", 500); // Upcasting
        
        VehiculoDeportivo nuevoVehiculo = (VehiculoDeportivo) vehiculo;
        
        System.out.println(nuevoVehiculo);
        
    }
}
