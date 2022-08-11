/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author sanch
 */
public class Vehiculo {
    protected String matricula;
    protected String marca;
    protected String modelo; 
    
    public Vehiculo(String matricula, String marca, String modelo){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;   
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public String mostrarDatos(){
        return "Matricula: " + matricula
              +"\nMarca: " + marca
              +"\nmodelo: " + modelo;
    }
}
