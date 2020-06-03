/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosw;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author salva
 */
public class sql extends Conexion{
    public boolean registro(Persona usr)throws SQLException{
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO formulario (nombre,apellidos,edad,dni,hombre,mujer,otro,tipoEnfermedad,nombreEnfermedad,gravedad,dias) VALUES(?,?,?,?,?,?,?,?,?,?,?)";

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getNombre());
            ps.setString(2, usr.getApellidos());
            ps.setInt(3, usr.getEdad());
            ps.setString(4, usr.getDni());
            ps.setBoolean(5, usr.getHombre());
            ps.setBoolean(6, usr.getMujer());
            ps.setBoolean(7, usr.getOtro());
            ps.setString(8, usr.getTipoEnfermedad());
            ps.setString(9, usr.getNombreEnfermedad());
            ps.setInt(10, usr.getGravedad());
            ps.setInt(11, usr.getDias());


            
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(sql.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
