
package clasefile;

import java.io.File;

public class ClaseFile {
    public static void main(String[] args) {
        //File archivo = new File("C:\\Users\\sanch\\OneDrive\\Documentos\\NetBeansProjects\\ClaseFile\\prueba.txt"); //Ruta absoluta
        File archivo = new File("CarpetaPrueba"); //Ruta relativa: tiene que estar dentro del proyecto 
        
        if(archivo.exists()){
            System.out.println("el directiorio existe");
            System.out.println("Ruta Absoluta :" + archivo.getAbsolutePath());
            System.out.println("¿Es un directorio? " + archivo.isDirectory());
            System.out.println("¿Se puede leer? " + archivo.canRead());
        } else {
            System.out.println("No existe");
        }
    }
}
