/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aeroportuaria;

/**
 *
 * @author sanch
 */
public class AeropuertoPublico extends Aeropuerto{
    private double subvencion;

    public AeropuertoPublico(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }

    public AeropuertoPublico(double subvencion, String nombre, String ciudad, String pais, Compañia[] c) {
        super(nombre, ciudad, pais, c);
        this.subvencion = subvencion;
    }

    public AeropuertoPublico(double subvencion, String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
        this.subvencion = subvencion;
    }

    public double getSubvencion() {
        return subvencion;
    }

}
