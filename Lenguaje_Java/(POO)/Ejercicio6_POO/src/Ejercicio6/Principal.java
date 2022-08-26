/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

import java.util.Scanner;

/**
 *
 * @author sanch
 */
public class Principal {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        
        NumeroComplejo numero1,numero2,suma,mult;
        double a,b,c,d;
        int opcion, numero;
        
        
        do {
            System.out.println("\t :Operaciones con numeros complejos:");
            System.out.println("1. Sumar 2 numeros complejos");
            System.out.println("2. Multiplicar 2 numeros complejos");
            System.out.println("3. Comparar 2 numeros complejos (iguales o no)");
            System.out.println("4. Multiplicar un numero complejo por un entero");
            System.out.println("5. Salir");
            System.out.print("\nDigite la opcion de menu: ");
            opcion = entrada.nextInt();
            
            switch (opcion) {
                case 1: System.out.print("\nDigite el primer numero complejo: ");
                        System.out.print("\nDigite la parte real: ");
                        a = entrada.nextDouble();
                        System.out.print("Digite la parte imaginaria: ");
                        b = entrada.nextDouble();
                        System.out.print("\nDigite el segundo numero complejo: ");
                        System.out.print("\nDigite la parte real: ");
                        c = entrada.nextDouble();
                        System.out.print("Digite la parte imaginaria: ");
                        d = entrada.nextDouble();
                        
                        numero1 = new NumeroComplejo(a, b);
                        numero2 = new NumeroComplejo(c, d);
                        
                        suma = numero1.calcularSuma(numero2);
                        System.out.println("\nLa suma es: " + suma.getA() + " + " + suma.getB()+"i.");
                        break;
                
                case 2: System.out.print("\nDigite el primer numero complejo: ");
                        System.out.print("\nDigite la parte real: ");
                        a = entrada.nextDouble();
                        System.out.print("Digite la parte imaginaria: ");
                        b = entrada.nextDouble();
                        System.out.print("\nDigite el segundo numero complejo: ");
                        System.out.print("\nDigite la parte real: ");
                        c = entrada.nextDouble();
                        System.out.print("Digite la parte imaginaria: ");
                        d = entrada.nextDouble();
                        
                        numero1 = new NumeroComplejo(a, b);
                        numero2 = new NumeroComplejo(c, d);
                        
                        mult = numero1.calcularProducto(numero2);
                         System.out.println("\nLa multiplicacion es: " + mult.getA() + " + " + mult.getB()+"i.");
                         break;
                
                case 3: System.out.print("\nDigite el primer numero complejo: ");
                        System.out.print("\nDigite la parte real: ");
                        a = entrada.nextDouble();
                        System.out.print("Digite la parte imaginaria: ");
                        b = entrada.nextDouble();
                        System.out.print("\nDigite el segundo numero complejo: ");
                        System.out.print("\nDigite la parte real: ");
                        c = entrada.nextDouble();
                        System.out.print("Digite la parte imaginaria: ");
                        d = entrada.nextDouble();
                        
                        numero1 = new NumeroComplejo(a, b);
                        numero2 = new NumeroComplejo(c, d);
                        
                        if(numero1.comprobarIgualdad(numero2)){
                            System.out.println("\nLos numeros complejos son iguales");
                        } else{
                            System.out.println("\nLos numeros complejos no son iguales");
                        }
                        break;
                        
                case 4: System.out.print("\nDigite el numero complejo: ");
                        System.out.print("\nDigite la parte real: ");
                        a = entrada.nextDouble();
                        System.out.print("Digite la parte imaginaria: ");
                        b = entrada.nextDouble();
                        System.out.print("Digite el numero entero: ");
                        numero = entrada.nextInt();
                        
                        numero1 = new NumeroComplejo(a,b);
                        mult = numero1.multiplicarPorEntero(numero);
                        System.out.println("\nLa multiplicacion es: " + mult.getA() + " + " + mult.getB()+"i.");
                        break;
            }
            System.out.println();
        } while (opcion != 5);
    }
}
