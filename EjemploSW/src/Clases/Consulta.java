/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosw;
import static java.lang.String.valueOf;
import java.util.logging.*;
import java.sql.*;
/**
 *
 * @author salva
 */
public class Consulta extends Conexion {
    String dni;
    String nombre;
    String nombreEnfermedad;
    String dias;
    String dniRecuperado;

    public Consulta(String dni) {
        this.dni = dni;
    }
    
    /**
     * Función que consultara los valores en la bdd
     *
     * @return true/false en caso de que se haya completado con exito la
     * consulta
     * @throws SQLException
     */
    public boolean registro() throws SQLException {
        //Preparamos la conexion
        PreparedStatement stmt = null;
        Connection con = getConexion();
        String sql = "SELECT nombre, nombreEnfermedad, dias FROM formulario WHERE dni = '"+dni+"';";
        try {
            //Ejecutamos nuestra selección
            stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            //Consultamos la base de datos
            while (rs.next()) {
                String aux = "";
                int aux2 = 0;
                //Guardamos los datos en variables
                nombre = rs.getString(1);
                nombreEnfermedad = rs.getString(2);
                int resultado = rs.getInt(3);
                dias = valueOf(resultado);
            }



            //Cerramos la conexión 
            rs.close();
            stmt.close();
            //Devolvemos true
            return true;

            //En caso de excepción devolvemos false
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public String getNombreEnfermedad() {
        return nombreEnfermedad;
    }

    public void setNombreEnfermedad(String nombreEnfermedad) {
        this.nombreEnfermedad = nombreEnfermedad;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    public String getDniRecuperado() {
        return dniRecuperado;
    }

    public void setDniRecuperado(String dniRecuperado) {
        this.dniRecuperado = dniRecuperado;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
