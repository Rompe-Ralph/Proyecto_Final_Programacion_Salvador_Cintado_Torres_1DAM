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
public class EnfermedadMusc extends Enfermedades{
    private int duracion=1;
    private int gravedad;

    public EnfermedadMusc(String tipo,   int gravedad) {
        super(tipo);
        this.gravedad = gravedad;
    }

    public int getGravedad() {
        return gravedad;
    }

    public void setGravedad(int gravedad) {
        this.gravedad = gravedad;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
}
