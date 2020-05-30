/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosw;

/**
 *
 * @author salva
 */
public abstract class Enfermedades {
    private String nombre;

    public Enfermedades(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract int calcularDuracion (int duracion);


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
