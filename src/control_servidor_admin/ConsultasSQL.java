package control_servidor_admin;


import Percistencia.DBConexion;
import java.sql.Statement;
import GUI.VerEstudiantes;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;
import GUI.RetirarEstudiante;
import com.mysql.cj.jdbc.CallableStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;
import Controlador.EstudianteControlador;

public class ConsultasSQL {
    
    private static DBConexion con1 = new DBConexion();  // Hacer con1 estática
    private static Connection conet;
    DefaultTableModel modelo;
    private static Statement st;
    private static ResultSet rs;
    int idc;
    private static VerEstudiantes vista;
    private RetirarEstudiante vista1;
    EstudianteControlador estudianteControlador = new EstudianteControlador();

    
    
      
    public void RetirarMatricula(int matricula) throws FileNotFoundException {
        String sql = "CALL EliminarEstudiante(?);";

        try (Connection conet = con1.getConexion();
             PreparedStatement ps = conet.prepareStatement(sql)) {

            // Establecer el parámetro del procedimiento
            ps.setInt(1, matricula);

            // Ejecutar el procedimiento almacenado
            ps.executeUpdate();

            // Mostrar un mensaje de éxito
            JOptionPane.showMessageDialog(null, "Estudiante retirado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            
            RetirarEstudiante retirarEstudiante = new RetirarEstudiante();
            retirarEstudiante.BuscarMatriculaRetirar.setText("");
            
            System.out.println(retirarEstudiante.BuscarMatriculaRetirar.getText());
            
            ConsultasSQL logica = new ConsultasSQL();
            DefaultTableModel modelo = (DefaultTableModel) retirarEstudiante.TablaEstudiantesRetirar.getModel();
            estudianteControlador.MostrarEstudiante(modelo);
            
        } catch (SQLException e) {
            System.err.println("Error al ejecutar el procedimiento: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al retirar el estudiante.", "Error", JOptionPane.ERROR_MESSAGE);
        }
}
         
    
public void ejecutarInsertarAsignacionBotellon(String matricula) {
    String procedimiento = "{CALL InsertarAsignacionBotellon(?)}"; // Procedimiento almacenado

    // Confirmación antes de ejecutar la operación
    int respuesta = JOptionPane.showConfirmDialog(null, 
        "¿Estás seguro de que deseas asignar el botellón para la matrícula: " + matricula + "?", 
        "Confirmar operación", 
        JOptionPane.YES_NO_OPTION, 
        JOptionPane.QUESTION_MESSAGE);

    if (respuesta == JOptionPane.YES_OPTION) {
        try {
            Connection conexion = DBConexion.getConexion();

            if (conexion != null) {
                try (CallableStatement stmt = (CallableStatement) conexion.prepareCall(procedimiento)) {
                    stmt.setString(1, matricula);

                    stmt.execute();

                    // Mensaje de éxito
                    JOptionPane.showMessageDialog(null, "Procedimiento ejecutado con éxito para matrícula: " + matricula);
                } catch (SQLException ex) {
                    // Mensaje de error si falla el procedimiento
                    JOptionPane.showMessageDialog(null, "Error al ejecutar el procedimiento almacenado: " + ex.getMessage());
                }
            } else {
                // Mensaje si no se pudo obtener la conexión
                JOptionPane.showMessageDialog(null, "Error: No se pudo obtener la conexión a la base de datos.");
            }
        } catch (SQLException | FileNotFoundException ex) {
            // Mensaje en caso de error al obtener la conexión
            JOptionPane.showMessageDialog(null, "Error al obtener la conexión: " + ex.getMessage());
        }
    } else {
        // Mensaje si el usuario cancela la operación
        JOptionPane.showMessageDialog(null, "Operación cancelada.");
    }
}

public void ejecutarDepositarBotellon(String matricula) {
    String procedimiento = "{call confirmacionDepositoBotellon(?)};"; 

    // Confirmación antes de ejecutar la operación
    int respuesta = JOptionPane.showConfirmDialog(null, 
        "¿Estás seguro de que deseas registrar el depósito del botellón para la matrícula: " + matricula + "?", 
        "Confirmar operación", 
        JOptionPane.YES_NO_OPTION, 
        JOptionPane.QUESTION_MESSAGE);

    if (respuesta == JOptionPane.YES_OPTION) {
        try {
            Connection conexion = DBConexion.getConexion();

            if (conexion != null) {
                try (CallableStatement stmt = (CallableStatement) conexion.prepareCall(procedimiento)) {
                    stmt.setString(1, matricula);

                    stmt.execute();

                    JOptionPane.showMessageDialog(null, "Depósito registrado con éxito para matrícula: " + matricula);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al ejecutar el procedimiento almacenado: " + ex.getMessage());
                }
            } else {
                // mensaje si no se pudo obtener la conexión
                JOptionPane.showMessageDialog(null, "Error: No se pudo obtener la conexión a la base de datos.");
            }
        } catch (SQLException | FileNotFoundException ex) {
            // mensaje en caso de error al obtener la conexión
            JOptionPane.showMessageDialog(null, "Error al obtener la conexión: " + ex.getMessage());
        }
    } else {
        // mensaje si el usuario cancela la operación
        JOptionPane.showMessageDialog(null, "Operación cancelada.");
    }
}

public void actualizarEstudiante(
        int matricula, 
        String nombres, 
        String apellidos, 
        String telefono, 
        String modulo, 
        String habitacion
    ) throws FileNotFoundException {
    String sql = "{CALL ActualizarEstudiante(?, ?, ?, ?, ?, ?, ?)}";
    Connection con = null;
    CallableStatement cs = null;

    try {

        con = con1.getConexion();
        cs = (CallableStatement) con.prepareCall(sql);

        cs.setInt(1, matricula);
        cs.setInt(2, matricula);
        cs.setString(3, nombres);
        cs.setString(4, apellidos);
        cs.setString(5, telefono);
        cs.setString(6, modulo);
        cs.setString(7, habitacion);

        // Ejecutar el procedimiento almacenado.
        cs.execute();
        System.out.println("Estudiante actualizado exitosamente.");
        JOptionPane.showMessageDialog(null, "Estudiante actualizado exitosamente.");


        
    } catch (SQLException e) {
        System.err.println("Error al actualizar el estudiante: " + e.getMessage());
    } finally {
        try {
            if (cs != null) cs.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            System.err.println("Error al cerrar los recursos: " + e.getMessage());
        }
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}





