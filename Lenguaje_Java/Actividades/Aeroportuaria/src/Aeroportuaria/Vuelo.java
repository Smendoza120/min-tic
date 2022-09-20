/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aeroportuaria;

/**
 *
 * @author sanch
 */
public class Vuelo {
    private String identificador;
    private String ciudadOrigen;
    private String ciudadDestino; 
    private double precio;
    private int numMaxPasajeros;
    private int numActualPasajeros;
    private Pasajero listaPasajeros[];

    public Vuelo(String identificador, String ciudadOrigen, String ciudadDestino, double precio, int numMaxPasajeros) {
        this.identificador = identificador;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.precio = precio;
        this.numMaxPasajeros = numMaxPasajeros;
        this.numActualPasajeros = 0; //Se agrega de manera manual
        this.listaPasajeros = new Pasajero[numMaxPasajeros]; //Se agrega de manera manual
    }
    
    //insertamos un pasajero
    public void insertarPasajero(Pasajero pasajero){
        listaPasajeros[numActualPasajeros] = pasajero;
        numActualPasajeros++;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public double getPrecio() {
        return precio;
    }

    public int getNumMaxPasajeros() {
        return numMaxPasajeros;
    }

    public int getNumActualPasajeros() {
        return numActualPasajeros;
    }
    
    public Pasajero getPasajero(int i){
        return listaPasajeros[i];
    }
    
    //Buscador secuencial
    public Pasajero getPasajero(String pasaporte){
        boolean encontrado = false;
        int i = 0;
        Pasajero pas = null;
        while((encontrado == false) && (i < listaPasajeros.length)){
            if(pasaporte.equals(listaPasajeros[i].getPasaporte())){ //Esto es lo mismo que decir que si es igual a la lista de pasajeros.
                encontrado = true;
                pas = listaPasajeros[i];
            }
            i++;
        }
        return pas;
    }
}
