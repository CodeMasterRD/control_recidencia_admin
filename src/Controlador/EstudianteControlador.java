/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import GUI.RetirarEstudiante;
import GUI.VerEstudiantes;
import Percistencia.DBConexion;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
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
    
    
    
        public void VerTodosEstudiantes(DefaultTableModel modelo) {
        
        String sql = "call ObtenerEstudiantesActivos();";

    try {
        conet = con1.getConexion();
        st = conet.createStatement();
        rs = st.executeQuery(sql);
        
        modelo.setRowCount(0);
        
        Object[] Botellones = new Object[6];  
        
        while (rs.next()) {
            Botellones[0] = rs.getInt("Matricula"); 
            Botellones[1] = rs.getString("Nombre Completo");
            Botellones[2] = rs.getString("Telefono");
            Botellones[3] = rs.getString("Estado");
            Botellones[4] = rs.getBoolean("Modulo");
            Botellones[5] = rs.getBoolean("Habitacion");
            Botellones[7] = rs.getBoolean("Genero del Modulo");

            modelo.addRow(Botellones);
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
        
        
        public void MostrarEstudianteEditar(DefaultTableModel modelo) {
        
        String sql = "call obtenerEstudianteActualizar();";

        try {
            conet = con1.getConexion();
            st = conet.createStatement();
            rs = st.executeQuery(sql);

            modelo.setRowCount(0);

            Object[] Estudiantes = new Object[6];

            while (rs.next()) {
                Estudiantes[0] = rs.getInt("Matricula");
                Estudiantes[1] = rs.getString("Nombre"); 
                Estudiantes[2] = rs.getString("Apellido"); 
                Estudiantes[3] = rs.getString("Telefono");
                Estudiantes[4] = rs.getString("Modulo"); 
                Estudiantes[5] = rs.getString("Habitacion");

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
        

        
        public static void BuscarEstudiante(DefaultTableModel modelo, String matricula) throws FileNotFoundException {
        // Define la consulta SQL para llamar al procedimiento almacenado
        String sql = "CALL buscarEstudiantesByMatricula(?);";  // Usamos parámetros en lugar de concatenar directamente

        // Manejo de la conexión y consulta
        try (Connection conet = con1.getConexion(); // Asumiendo que con1.getConexion() retorna una conexión válida
             PreparedStatement ps = conet.prepareStatement(sql)) {

            // Establecer el valor del parámetro
            ps.setString(1, matricula);  // Asignamos la matrícula al parámetro del procedimiento

            // Ejecutar la consulta
            rs = ps.executeQuery();

            // Limpiar el modelo antes de llenarlo
            modelo.setRowCount(0);

            // Definir un arreglo de objetos para cada fila
            Object[] Estudiantes = new Object[7];

            // Iterar sobre los resultados y agregar cada fila al modelo de la tabla
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
        }
    }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
}
