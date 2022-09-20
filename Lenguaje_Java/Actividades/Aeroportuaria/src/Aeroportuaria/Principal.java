/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aeroportuaria;

import java.util.Scanner;

/**
 *
 * @author sanch
 */
public class Principal {
    static Scanner entrada = new Scanner(System.in);
    final static int num = 4; //Numero aeropuertos
    static Aeropuerto aeropuertos[] = new Aeropuerto[num];
    
    public static void main (String [] args){
        
        //Insertar datos de los aeropuertos
        insertarDatosAeropuerto(aeropuertos);
        menu();
    }
    
    public static void insertarDatosAeropuerto(Aeropuerto aero[]){
        aero[0] = new AeropuertoPublico(80000000, "Jorge Chavez", "Lima", "Peru");
        aero[0].insertarCompañia(new Compañia("AeroPeru"));
        aero[0].insertarCompañia(new Compañia("LATAM"));
        aero[0].getCompañia("AeroPeru").insertarVuelo(new Vuelo("IB20", "Lima", "Mexico", 150.90, 150));
        aero[0].getCompañia("AeroPeru").insertarVuelo(new Vuelo("IB21", "Lima", "Buenos Aires", 180.99, 120));
        aero[0].getCompañia("LATAM").insertarVuelo(new Vuelo("FC12", "Lima", "Londres", 500.90, 180));
        aero[0].getCompañia("AeroPeru").getVuelo("IB20").insertarPasajero(new Pasajero("Alejandro", "20BGHP", "Peruana"));
        aero[0].getCompañia("AeroPeru").getVuelo("IB20").insertarPasajero(new Pasajero("Maria", "PJKL20", "Mexicana"));
        aero[0].getCompañia("LATAM").getVuelo("FC12").insertarPasajero(new Pasajero("Raul", "JH21KL", "Peruana"));
        
        aero[1] = new AeropuertoPrivado("Dorado", "Bogota", "Colombia");
        aero[1].insertarCompañia(new Compañia("Avianca"));
        aero[1].insertarCompañia(new Compañia("Wingo"));
        String empresas1[] = {"Cobersol", "Anguila34"};
        ((AeropuertoPrivado)aero[1]).insertarEmpresas(empresas1);
        aero[1].getCompañia("Avianca").insertarVuelo(new Vuelo("HI50", "Bogota", "Peru", 130.5, 110));
        aero[1].getCompañia("Wingo").insertarVuelo(new Vuelo("HB90", "Bogota", "Chile", 180.70, 130));
        aero[1].getCompañia("Avianca").getVuelo("HI50").insertarPasajero(new Pasajero("Harold", "25BHTU", "Colombiano"));
        aero[1].getCompañia("Wingo").getVuelo("HB90").insertarPasajero(new Pasajero("Carlos", "Santana", "Chileno"));
        
        aero[2] = new AeropuertoPublico(50000000, "El Tepual Airport", "Santiago", "Chile");
        aero[2].insertarCompañia(new Compañia("Azul"));
        aero[2].insertarCompañia(new Compañia("Emirates"));
        aero[2].getCompañia("Azul").insertarVuelo(new Vuelo("SH12", "Chile", "Brasil", 150.5, 140));
        aero[2].getCompañia("Emirates").insertarVuelo(new Vuelo("BR34", "Chile", "Peru", 200, 140));
        aero[2].getCompañia("Azul").getVuelo("SH12").insertarPasajero(new Pasajero("Juan", "PUT302", "Peruano"));
        aero[2].getCompañia("Emirates").getVuelo("BR34").insertarPasajero(new Pasajero("Martha", "QWD456", "Venezolana"));
        
        aero[3] = new AeropuertoPrivado("Aeropuerto Internacional de Limón", "limon", "Costa Rica");
        aero[3].insertarCompañia(new Compañia("Delta"));
        aero[3].insertarCompañia(new Compañia("Wizz"));
        String empresas2[] = {"Cocacola","Ramon"};
        ((AeropuertoPrivado)aero[3]).insertarEmpresas(empresas2);
        aero[3].getCompañia("Delta").insertarVuelo(new Vuelo("DF21", "Costa Rica", "Colombia", 350, 90));
        aero[3].getCompañia("Wizz").insertarVuelo(new Vuelo("TG89", "Costa Rica", "Argentina", 230, 140));
        aero[3].getCompañia("Delta").getVuelo("DF21").insertarPasajero(new Pasajero("Ana", "ERTY85", "Colombiana"));
        aero[3].getCompañia("Wizz").getVuelo("TG89").insertarPasajero(new Pasajero("Jhon", "POLI56", "Americano"));
    }
    
    public static void menu(){
        String nombreAeropuerto, nombreCompañia, origen, destino;
        int opcion;
        Aeropuerto aeropuerto;
        Compañia compañia;
        
        do {
            System.out.println("\t:MENU:");
            System.out.println("1. Ver Aeropuertos gestionados(publicos o privados)");
            System.out.println("2. Ver empresas (privado) o subvencion (publico)");
            System.out.println("3. Lista de compañias de un Aeropuerto");
            System.out.println("4. Lista de vuelos por compañia");
            System.out.println("5. Listar posibles vuelos de origen a destino");
            System.out.println("6. Salir");
            System.out.print("\nDigite la opcion: ");
            opcion = entrada.nextInt();
            
            switch (opcion) {
                case 1: System.out.println("");
                        mostrarDatosAeropuertos(aeropuertos);//Ver Aeropuertos gestionados(publicos o privados)              
                    break;
                   
                case 2: System.out.println("");
                        mostrarPatrocinio(aeropuertos);//Ver empresas (privado) o subvencion (publico)
                    break;
                    
                case 3: //Lista compañias de un Aeropuerto
                        entrada.nextLine();
                        System.out.print("\nDigite el nombre del Aeropuerto: ");
                        nombreAeropuerto = entrada.nextLine();
                        aeropuerto = buscarAeropuerto(nombreAeropuerto, aeropuertos);
                        if(aeropuerto == null){
                            System.out.println("El Aeropuerto no existe");
                        }   else {
                            mosrtarCompañias(aeropuerto);
                        }
                    break;
                        
                case 4: //Lista de vuelos por compañia
                        entrada.nextLine();
                        System.out.print("\nDigite el nombre del Aeropuerto: ");
                        nombreAeropuerto = entrada.nextLine();
                        aeropuerto = buscarAeropuerto(nombreAeropuerto, aeropuertos);
                        if(aeropuerto == null){
                            System.out.print("El Aeropuerto no existe.");
                        }   else {
                                System.out.print("Digite el nombre de la compañia: ");
                                nombreCompañia = entrada.nextLine();
                                compañia = aeropuerto.getCompañia(nombreCompañia);
                                motrarVuelos(compañia);
                        }
                    break;
                    
                case 5: //Listar posibles vuelos de origen a destino
                        entrada.nextLine();
                        System.out.print("\nDigite la ciudad Origen: ");
                        origen = entrada.nextLine();
                        System.out.print("Digite la ciudad Destino: ");
                        destino = entrada.nextLine();
                        mostrarVueloorigenDestino(origen, destino, aeropuertos);
                    break;
                    
                case 6: break; // Salir
                        
                default:    System.out.println("Error, se equivoco de opcion de menu");      
            }
            System.out.println("");
        } while (opcion != 6);
    }
    
    public static void mostrarDatosAeropuertos(Aeropuerto aeropuertos[]){
        for(int i=0; i < aeropuertos.length; i++){
            if(aeropuertos[i] instanceof AeropuertoPrivado){
                System.out.println("Aeropuerto Privado");
                System.out.println("Nombre: " + aeropuertos[i].getNombre());
                System.out.println("Ciudad: " + aeropuertos[i].getCiudad());
                System.out.println("Pais: " + aeropuertos[i].getPais());
            }   else {
                System.out.println("Aeropuerto Publico");
                System.out.println("Nombre: " + aeropuertos[i].getNombre());
                System.out.println("Ciudad: " + aeropuertos[i].getCiudad());
                System.out.println("Pais: " + aeropuertos[i].getPais());
            }
            System.out.println("");
        }
    }
    
    public static void mostrarPatrocinio(Aeropuerto aeropuertos[]){
        String empresas[];
        
        for(int i=0; i < aeropuertos.length; i++){
            if(aeropuertos[i] instanceof AeropuertoPrivado){
                System.out.println("Aeropuerto privado: " + aeropuertos[i].getNombre());
                empresas = ((AeropuertoPrivado) aeropuertos[i]).getListaEmpresas();
                for(int j=0; j < empresas.length; j++){
                    System.out.println(empresas[j]);
                }
            }   else {
                System.out.println("Aeropuerto publico: " + aeropuertos[i].getNombre());
                System.out.println("Subvencion: " + ((AeropuertoPublico) aeropuertos[i]).getSubvencion());
            }
            System.out.println("");
        }
    }
    
    public static Aeropuerto buscarAeropuerto(String nombre, Aeropuerto aeropuertos[]){
        boolean encontrado = false; 
        int i=0; 
        Aeropuerto aero = null; 
        while((!encontrado) && (i < aeropuertos.length)){
            if(nombre.equals(aeropuertos[i].getNombre())){
                encontrado = true;
                aero = aeropuertos[i];
            }
            i++;
        }
        return aero;
    }
    
    public static void mosrtarCompañias(Aeropuerto aeropuerto){
        System.out.println("\nLas compañias del aeropuerto: " + aeropuerto.getNombre());
        for(int i=0; i < aeropuerto.getNumCompañia();i++){
            System.out.println(aeropuerto.getCompañia(i).getNombre());
        }
    }
    
    public static void motrarVuelos(Compañia compañia){
        Vuelo vuelo;
        System.out.println("Los vuelos de la compañia: " + compañia.getNombre());
        for(int i=0; i < compañia.getNumVuelo(); i++){
            vuelo = compañia.getVuelo(i);
            System.out.println("Identificador: " + vuelo.getIdentificador());
            System.out.println("Ciudad origen: " + vuelo.getCiudadOrigen());
            System.out.println("Ciudad destino: " + vuelo.getCiudadDestino());
            System.out.println("Precio: $" + vuelo.getPrecio());
            System.out.println("");
        }
    }
    
    public static Vuelo[] buscarVuelosOrigenDestino(String origen, String destino, Aeropuerto aeropuertos[]){
        Vuelo vuelo;
        int contador = 0; 
        Vuelo listaVuelos[];
         
        for(int i=0; i < aeropuertos.length; i++){ //Recorremos los aeropuertos
            for(int j=0; j < aeropuertos[i].getNumCompañia(); j++){ //Recorremos las compañias
                for(int k=0; k < aeropuertos[i].getCompañia(j).getNumVuelo(); k++){ //Recorremos los vuelos
                    vuelo = aeropuertos[i].getCompañia(j).getVuelo(k);
                    if((origen.equals(vuelo.getCiudadOrigen()))&& (destino.equals(vuelo.getCiudadDestino()))){
                        contador++;
                    }
                }
            }  
        }
        listaVuelos = new Vuelo[contador];
        int q=0;
        
        for(int i=0; i < aeropuertos.length; i++){
            for(int j=0; j < aeropuertos[i].getNumCompañia();j++){
                for(int k=0; k < aeropuertos[i].getCompañia(j).getNumVuelo();k++){
                    vuelo = aeropuertos[i].getCompañia(j).getVuelo(k);
                    if((origen.equals(vuelo.getCiudadOrigen())) && (destino.equals(vuelo.getCiudadDestino()))){
                        listaVuelos[q] = vuelo;
                        q++;
                    }
                }
            }
        }
        
        return listaVuelos;
    }
    
    public static void mostrarVueloorigenDestino(String origen, String destino, Aeropuerto aeropuertos[]){
        Vuelo vuelos[];
        vuelos = buscarVuelosOrigenDestino(origen, destino, aeropuertos);
        if(vuelos.length == 0){
            System.out.println("\nNo existen vuelos de esa ciudad origen a destino");
        }   else    {
            System.out.println("Vuelos encontrados: ");
            for(int i=0; i < vuelos.length;i++){
                System.out.println("Identificador: " + vuelos[i].getIdentificador());
                System.out.println("Ciudad Origen: " + vuelos[i].getCiudadOrigen());
                System.out.println("Ciudad Destino: " + vuelos[i].getCiudadDestino());
                System.out.println("Precio: $" + vuelos[i].getPrecio());
                System.out.println("");
            }
        }
    }
}
