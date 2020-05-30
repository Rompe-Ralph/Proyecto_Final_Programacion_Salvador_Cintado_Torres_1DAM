/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosw;

import javax.swing.JOptionPane;

/**
 *
 * @author salva
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private String dni;
    private boolean hombre;
    private boolean mujer;
    private boolean otro;
    private int edad;
    private String nombreEnfermedad;
    private String tipoEnfermedad;
    private int gravedad;
    private int dias;

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
    
    

    public int getGravedad() {
        return gravedad;
    }

    public void setGravedad(int gravedad) {
        this.gravedad = gravedad;
    }
   

    public String getNombre() {
        return nombre;
    }

    public String getNombreEnfermedad() {
        return nombreEnfermedad;
    }

    public void setNombreEnfermedad(String nombreEnfermedad) {
        this.nombreEnfermedad = nombreEnfermedad;
    }

    public String getTipoEnfermedad() {
        return tipoEnfermedad;
    }

    public void setTipoEnfermedad(String tipoEnfermedad) {
        this.tipoEnfermedad = tipoEnfermedad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {        
        return dni;
    }

    public void setDni(String dni) {
      
            this.dni = dni;
     
    }

    public boolean getHombre() {
        return hombre;
    }

    public void setHombre(boolean hombre) {
        this.hombre = hombre;
    }

    public boolean getMujer() {
        return mujer;
    }

    public void setMujer(boolean mujer) {
        this.mujer = mujer;
    }

    public boolean getOtro() {
        return otro;
    }

    public void setOtro(boolean otro) {
        this.otro = otro;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
}
