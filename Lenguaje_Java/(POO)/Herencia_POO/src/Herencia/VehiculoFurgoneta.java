/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author sanch
 */
public class VehiculoFurgoneta extends Vehiculo{
    private int carga;
    
    public VehiculoFurgoneta(String matricula, String marca, String modelo, int carga){
        super(matricula, marca, modelo);
        this.carga = carga;
    }   
    
    public int getCarga(){
        return carga;
    }
    
    @Override
    public String mostrarDatos(){
        return "Carga: " + carga
              +"\nMarca: " + marca
              +"\nModelo: " + modelo
              +"\nMatricula: " + matricula;
    }
}
