
package Controlador;

import Modelo.ConsultasPersona;
import Modelo.Persona;
import Vista.VistaPersona;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.time.LocalDate;
import javax.swing.JOptionPane;


public class ControladorPersona implements ActionListener {
    private VistaPersona vista;
    private Persona persona;
    private ConsultasPersona modelo;

    public ControladorPersona(VistaPersona vista, Persona persona, ConsultasPersona modelo) {
        this.vista = vista;
        this.persona = persona;
        this.modelo = modelo;
        vista.botonInsertar.addActionListener(this);
        vista.botonLimpiar.addActionListener(this);
        vista.botonBuscar.addActionListener(this);
        vista.botonModificar.addActionListener(this);
        vista.botonEliminar.addActionListener(this);
    }
    
    public void iniciar(){
        vista.setTitle("CRUD MVC");
        vista.setLocationRelativeTo(null);
        vista.cajaID.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.botonInsertar){
            persona.setClave(vista.cajaClave.getText());
            persona.setNombre(vista.cajaNombre.getText());
            persona.setDomicilio(vista.cajaDomicilio.getText());
            persona.setCelular(vista.cajaCelular.getText());
            persona.setCorreo_electronico(vista.cajaCorreo.getText());
            persona.setFecha_nacimiento(Date.valueOf(vista.cajaFechaNacimiento.getText()));
            persona.setGenero(vista.comboGenero.getSelectedItem().toString());
            
            if(modelo.insertar(persona)){
                JOptionPane.showMessageDialog(null, "Registro insertado correctamente");
                limpiarCajas();
            } else {
                JOptionPane.showMessageDialog(null, "Error, al insertar registro");
                limpiarCajas();
            }
        }
        
        if(e.getSource() == vista.botonLimpiar){
            limpiarCajas();
        }
        
        if(e.getSource() == vista.botonBuscar){
            persona.setClave(vista.cajaBuscar.getText());
            
            if(modelo.buscar(persona)){
                vista.cajaID.setText(String.valueOf(persona.getIdPersona()));
                vista.cajaClave.setText(persona.getClave());
                vista.cajaNombre.setText(persona.getNombre());
                vista.cajaDomicilio.setText(persona.getDomicilio());
                vista.cajaCelular.setText(persona.getCelular());
                vista.cajaCorreo.setText(persona.getCorreo_electronico());
                vista.cajaFechaNacimiento.setText(String.valueOf(persona.getFecha_nacimiento()));
                vista.comboGenero.setSelectedItem(persona.getGenero());
            } else {
                JOptionPane.showMessageDialog(null, "No existe una persona con esa clave");
            }
        }
        
        if(e.getSource() == vista.botonModificar){
            persona.setIdPersona(Integer.parseInt(vista.cajaID.getText()));
            persona.setClave(vista.cajaClave.getText());
            persona.setNombre(vista.cajaNombre.getText());
            persona.setDomicilio(vista.cajaDomicilio.getText());
            persona.setCelular(vista.cajaCelular.getText());
            persona.setCorreo_electronico(vista.cajaCorreo.getText());
            persona.setFecha_nacimiento(Date.valueOf(vista.cajaFechaNacimiento.getText()));
            persona.setGenero(vista.comboGenero.getSelectedItem().toString());
            
            if(modelo.modificar(persona)){
                JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
                limpiarCajas();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo modificar el registro");
                limpiarCajas();
            }
        }
        
        if(e.getSource() == vista.botonEliminar){
            persona.setIdPersona(Integer.parseInt(vista.cajaID.getText()));
            
            if(modelo.eliminar(persona)){
                JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
                limpiarCajas();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro");
                limpiarCajas();
            }
        }
    }
    
    public void limpiarCajas(){
        vista.cajaID.setText(null);
        vista.cajaBuscar.setText(null);
        vista.cajaClave.setText(null);
        vista.cajaNombre.setText(null);   
        vista.cajaDomicilio.setText(null);
        vista.cajaCelular.setText(null);
        vista.cajaCorreo.setText(null);
        vista.cajaFechaNacimiento.setText(null);
        vista.comboGenero.setSelectedIndex(0);
    }
    
}
