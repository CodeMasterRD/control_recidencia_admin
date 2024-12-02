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

/**
 *
 * @author Erick Tejada
 */
public class EstudianteControlador {
    
    private static DBConexion con1 = new DBConexion();  // Hacer con1 estática
    private static Connection conet;
    DefaultTableModel modelo;
    private static Statement st;
    private static ResultSet rs;
    int idc;
    private static VerEstudiantes vista;
    private RetirarEstudiante vista1;
    
    
        public void MostrarEstudiante(DefaultTableModel modelo) {
        
        String sql = "call ObtenerEstudiantesActivos();";

        try {
            conet = con1.getConexion();
            st = conet.createStatement();
            rs = st.executeQuery(sql);

            modelo.setRowCount(0);

            Object[] Estudiantes = new Object[7];

            while (rs.next()) {
                Estudiantes[0] = rs.getInt("Matricula");
                Estudiantes[1] = rs.getString("Nombre Completo"); 
                Estudiantes[2] = rs.getString("Telefono"); 
                Estudiantes[3] = rs.getString("Estado");
                Estudiantes[4] = rs.getInt("Modulo"); 
                Estudiantes[5] = rs.getString("Habitacion");
                Estudiantes[6] = rs.getString("Genero del Modulo");

                modelo.addRow(Estudiantes);
            }
        } catch (SQLException e) {
            System.err.println("Error al ejecutar la consulta: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error general: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (st != null) st.close();
                if (conet != null) conet.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar los recursos: " + e.getMessage());
            }
        }
    }
}
