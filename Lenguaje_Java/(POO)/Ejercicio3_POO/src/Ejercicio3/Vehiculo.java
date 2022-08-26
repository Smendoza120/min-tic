/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author sanch
 */
public class Vehiculo {
    //Atributos
    
    //Creamos los atributos.
    private String marca;
    private String modelo;
    private float precio;
    
    
    //Metodos
    //Metodo constructor.
    //Hacemos un constructor y le agregamos los datos solicitados 
    public Vehiculo(String marca, String modelo, float precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    
    //Metodo getter
    //Mostramos el precio.
    public float getPrecio(){
        return precio;
    }
    
    //Mostramos los datos.
    public String mostrarDatos(){
        return "Marca: " + marca + "\nModelo: " + modelo + "\nPrecio: " + precio + "\n"; 
    }
}
