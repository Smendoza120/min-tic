/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerenciaMultiple;

/**
 *
 * @author sanch
 */
public class MusicoEstudiante implements Musico, Estudiante{
    
    @Override
    public void hablar(){
        System.out.println("Estoy hablando español");
    }
    
    @Override
    public void tocarMusica(){
        System.out.println("Estoy tocando la guitarra");
    }
    
    @Override
    public void estudiar(){
        System.out.println("Estoy estudiando");
    }
    
}
