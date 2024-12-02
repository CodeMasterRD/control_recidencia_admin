/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import GUI.RetirarEstudiante;
import GUI.VerEstudiantes;
import Percistencia.DBConexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


public class BotellonesControlador {
    
    
    
    private static DBConexion con1 = new DBConexion();
    private static Connection conet;
    DefaultTableModel modelo;
    private static Statement st;
    private static ResultSet rs;

    
    
    
    public void historialBotellones(DefaultTableModel modelo) {
        
        String sql = "call historialBotellones();";

    try {
        conet = con1.getConexion();
        st = conet.createStatement();
        rs = st.executeQuery(sql);
        
        modelo.setRowCount(0);
        
        Object[] Botellones = new Object[7];  
        
        while (rs.next()) {
            Botellones[0] = rs.getInt("Matricula"); 
            Botellones[1] = rs.getString("Nombre Completo");
            Botellones[2] = rs.getString("Modulo");
            Botellones[3] = rs.getString("Habitacion");
            Botellones[4] = rs.getString("Fecha de entrega");
            Botellones[5] = rs.getInt("Fecha de deposito");
            Botellones[6] = rs.getString("estado");

            modelo.addRow(Botellones);
        }
    } catch (SQLException e) {
        System.err.println("Error al ejecutar la consulta: " + e.getMessage());
    } catch (Exception e) {
        System.err.println("Error general: " + e.getMessage());
    } finally {
        try {
            if (rs != null) rs.close();
            if (conet != null) conet.close();
        } catch (SQLException e) {
            System.err.println("Error al cerrar los recursos: " + e.getMessage());
        }
    }
    }
}
