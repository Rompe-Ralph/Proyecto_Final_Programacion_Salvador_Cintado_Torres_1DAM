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
public class EnfermedadInfec extends Enfermedades{
    private int duracion=1;
    private int gravedad;

    public EnfermedadInfec(String tipo, String nombre, int gravedad , int duracion) {
        super(tipo);
        this.duracion = duracion;
        this.gravedad = gravedad;
    }



    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getGravedad() {
        return gravedad;
    }

    public void setGravedad(int gravedad) {
        this.gravedad = gravedad;
    }
    
    public int calcularDuracion(int getDuracion) {
        int duracionf = getDuracion();
        if (gravedad == 1) {
            duracionf = (duracion + getDuracion) * 2;
        } else if (gravedad == 2) {
            duracionf = (duracion + getDuracion) * 3;
        } else if (gravedad == 3) {
            duracionf = (duracion + getDuracion) * 4;
        } else {
            JOptionPane.showMessageDialog(null, "No podemos hacer una aproximación de la duración cone sa gravedad");
        }
        return duracionf;
    }
}
