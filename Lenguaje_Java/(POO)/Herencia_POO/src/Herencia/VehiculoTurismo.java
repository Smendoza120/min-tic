/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author sanch
 */
public class VehiculoTurismo extends Vehiculo{
    private int numeroPuertas;
    
    public VehiculoTurismo(String matricula, String marca, String modelo, int numeroPuertas){
        super(matricula,marca,modelo);
        this.numeroPuertas = numeroPuertas;
    }
    
    public int getNumeroPuertas(){
        return numeroPuertas;
    }
    
    @Override
    public String mostrarDatos(){
        return "Numero puertas: " + numeroPuertas
              +"\nMarca: " + marca
              +"\nModelo: " + modelo
              +"\nMatricula: " + matricula; 
    }
}
