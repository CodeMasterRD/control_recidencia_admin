package DAO.BotellonesDAO;

import Percistencia.DBConexion;
import VentanasEmegentes.IngresarBotellonesConfirmar;
import java.awt.Component;
import java.io.FileNotFoundException;
import javax.swing.*;
import java.sql.*;

public class BotellonesDAO {

    // Asumiendo que ya tienes la clase DBConexion con un método getConexion() para obtener la conexión

    public void llenarBotellones(int numeroBotellones) throws FileNotFoundException {
    // Procedimiento almacenado
    String procedimiento = "{CALL convertirBotellonesVaciosALlenos(?)}"; // Cambia esto si es otro procedimiento

    // Confirmación antes de ejecutar la operación
    int respuesta = JOptionPane.showConfirmDialog(null, 
        "¿Estás seguro de que deseas asignar " + numeroBotellones + " botellones?", 
        "Confirmar operación", 
        JOptionPane.YES_NO_OPTION, 
        JOptionPane.QUESTION_MESSAGE);

    if (respuesta == JOptionPane.YES_OPTION) {
        try {
            Connection conexion = DBConexion.getConexion(); // Obtener la conexión desde tu clase DBConexion

            if (conexion != null) {
                try (CallableStatement stmt = (CallableStatement) conexion.prepareCall(procedimiento)) {
                    stmt.setInt(1, numeroBotellones); // Pasamos el valor de los botellones como parámetro

                    stmt.execute(); // Ejecutamos el procedimiento

                    // Mensaje de éxito
                    JOptionPane.showMessageDialog(null, "Procedimiento ejecutado con éxito. Botellones asignados: " + numeroBotellones);
                    
                    // Cerrar la ventana de IngresarBotellonesConfirmar
                    IngresarBotellonesConfirmar ingresarBotellonesConfirmar = new IngresarBotellonesConfirmar();
                    ingresarBotellonesConfirmar.dispose(); // Cierra la ventana

                } catch (SQLException ex) {
                    // Mensaje de error si falla el procedimiento
                    JOptionPane.showMessageDialog(null, "Error al ejecutar el procedimiento almacenado: " + ex.getMessage());
                }
            } else {
                // Mensaje si no se pudo obtener la conexión
                JOptionPane.showMessageDialog(null, "Error: No se pudo obtener la conexión a la base de datos.");
            }
        } catch (SQLException ex) {
            // Error al obtener la conexión
            JOptionPane.showMessageDialog(null, "Error al obtener la conexión: " + ex.getMessage());
        }
    } else {
        // Mensaje si el usuario cancela la operación
        JOptionPane.showMessageDialog(null, "Operación cancelada.");
    }
}
}
