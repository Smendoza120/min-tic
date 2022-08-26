/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author sanch
 */
public class Principal {
    
    public static int indiceCocheMBarato(Vehiculo coches[]){
        float precio; 
        int indice = 0;
        
        
        //precio mas economico de nuestro arreglo
        precio = coches[0].getPrecio();
        for(int i=1; i<coches.length;i++){
            if(coches[i].getPrecio() < precio){
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        
        return indice;
    }
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        String marca, modelo;
        float precio;
        int numeroVehiculos, indiceBarato;
        
        System.out.print("Digite la cantidad de vehiculos: ");
        numeroVehiculos = entrada.nextInt();
        
        //Creamos los objetos para los coches.
        Vehiculo coches[] = new Vehiculo[numeroVehiculos];
        
        for(int i=0; i<numeroVehiculos; i++){
            entrada.nextLine();
            System.out.print("\nDigite las caracteristicas del coche " +(i+1)+": ");
            System.out.print("\nIntroduzca la marca: ");
            marca = entrada.nextLine();
            System.out.print("Introduzca el modelo: ");
            modelo = entrada.nextLine();
            System.out.print("Introduzca el precio: ");
            precio = entrada.nextFloat();
            
            coches[i] = new Vehiculo(marca, modelo, precio);
        }   
        
        indiceBarato = indiceCocheMBarato(coches);
        System.out.println("\nEl coche mas barato es: ");
        System.out.println(coches[indiceBarato].mostrarDatos());
    }
}
