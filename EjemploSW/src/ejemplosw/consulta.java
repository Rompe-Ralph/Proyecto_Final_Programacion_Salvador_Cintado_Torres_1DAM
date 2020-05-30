/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosw;

import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author salva
 */
public class consulta extends Conexion {

    public boolean registro() throws SQLException {
        PreparedStatement stmt = null;
        Connection con = getConexion();

        try {
            stmt = con.prepareStatement("SELECT * FROM formulario");

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getInt(3));
                System.out.println(rs.getString(4));
                System.out.println(rs.getString(5));
                System.out.println(rs.getBoolean(5));
                System.out.println(rs.getBoolean(6));
                System.out.println(rs.getBoolean(7));
                System.out.println(rs.getString(8));
                System.out.println(rs.getString(9));
                System.out.println(rs.getInt(10));
                System.out.println(rs.getInt(11));

            }

            rs.close();
            stmt.close();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(sql.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}
