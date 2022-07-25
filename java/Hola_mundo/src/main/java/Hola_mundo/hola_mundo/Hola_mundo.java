package Hola_mundo.hola_mundo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Hola_mundo {

    public static void main(String[] args) {
        
        double salarioMes, cantidadCarros, precioCarro, comision, comisionPorcentaje, total;
        
        salarioMes = 1_000;
        cantidadCarros = Double.parseDouble(JOptionPane.showInputDialog("Cuantos carros vendio?"));
        precioCarro = Double.parseDouble(JOptionPane.showInputDialog("Cuanto costo el carro?"));
        comision = 150 * cantidadCarros;
        comisionPorcentaje = (precioCarro * 5) / 100;
        
        total = salarioMes + comision + comisionPorcentaje;
        
        System.out.println(total);
        
              
    }
}