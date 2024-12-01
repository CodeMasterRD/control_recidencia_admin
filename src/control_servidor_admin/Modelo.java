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

public class Modelo {
    
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
    
    
public void EditarEstudiante(DefaultTableModel modelo, String matricula) throws FileNotFoundException {
    String sql = matricula.isEmpty() 
                 ? "CALL obtenerEstudianteActualizar();" 
                 : "CALL buscarEstudiantesByMatricula('" + matricula + "');";
    try {
        conet = con1.getConexion();
        st = conet.createStatement();
        rs = st.executeQuery(sql);

        modelo.setRowCount(0); // Limpia la tabla.

        Object[] Estudiantes = new Object[7];
        while (rs.next()) {
            Estudiantes[0] = rs.getInt("Matricula");
            Estudiantes[1] = rs.getString("Nombre Completo");
            Estudiantes[2] = rs.getString("Telefono");
            Estudiantes[3] = rs.getString("Estado");
            Estudiantes[4] = rs.getString("Modulo");
            Estudiantes[5] = rs.getString("Habitacion");
            Estudiantes[6] = rs.getString("Genero del Modulo");

            System.out.println(Arrays.toString(Estudiantes));
            modelo.addRow(Estudiantes);
        }
    } catch (SQLException e) {
        System.err.println("Error al ejecutar la consulta: " + e.getMessage());
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

                // Añadir la fila al modelo de la tabla
                modelo.addRow(Estudiantes);
            }
        } catch (SQLException e) {
            // Capturar errores relacionados con la base de datos
            System.err.println("Error al ejecutar la consulta: " + e.getMessage());
        }
    }
    
 
    public boolean GuardarEstudiante(String matricula, String nombres, String apellidos, String numero, String modulo, String habitacion) {
    try {
        if (matricula.equals("") || nombres.equals("") || apellidos.equals("") || numero.equals("") || habitacion.equals("")){
            JOptionPane.showMessageDialog(null, "Faltan Datos");
            
        } else {
            String sql = "CALL InsertarEstudiante('"+ matricula +"', '"+ nombres +"', '"+ apellidos +"', '"+ numero +"', '"+ modulo +"', '"+ habitacion +"')";

            conet = con1.getConexion();
            st = conet.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Estudiante Agregado");
            System.out.println(matricula + nombres + apellidos + numero + habitacion + modulo);
        }
        
        boolean guardadoExitosamente = false; 
    } catch (SQLException ex) {
        int errorCode = ex.getErrorCode();
        if (errorCode == 1062) {
            JOptionPane.showMessageDialog(null, "El estudiante con esta matrícula ya existe.");
        } else {
            JOptionPane.showMessageDialog(null, "Error SQL (Código " + errorCode + "): " + ex.getMessage());
        }
    }   catch (FileNotFoundException ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
        }
    return false; 
}

    
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
    
    
    public void NotificaionesBotellones(DefaultTableModel modelo) {
        
        String sql = "call notificacionBotellones();";

    try {
        conet = con1.getConexion();
        st = conet.createStatement();
        rs = st.executeQuery(sql);
        
        modelo.setRowCount(0);
        
        Object[] Botellones = new Object[4];  
        
        while (rs.next()) {
            Botellones[0] = rs.getInt("Matricula"); 
            Botellones[1] = rs.getString("Nombre Completo");
            Botellones[2] = rs.getString("Fecha de la solicitud");
            Botellones[3] = rs.getString("Estado");

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
       

    public void HistorialUsoCocina(DefaultTableModel modelo) {
        
        String sql = "call MostrarTodosEstudiantes();";

    try {
        conet = con1.getConexion();
        st = conet.createStatement();
        rs = st.executeQuery(sql);
        
        modelo.setRowCount(0);
        
        Object[] Botellones = new Object[5];  
        
        while (rs.next()) {
            Botellones[0] = rs.getInt("Matricula"); 
            Botellones[1] = rs.getString("Nombre");
            Botellones[2] = rs.getString("Entrada");
            Botellones[3] = rs.getString("Salida");
            Botellones[4] = rs.getString("Estado_uso");

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
     

    public void HistorialEntradaSalida(DefaultTableModel modelo) {

            String sql = "call HistorialEntradaSalida;";

        try {
            conet = con1.getConexion();
            st = conet.createStatement();
            rs = st.executeQuery(sql);

            modelo.setRowCount(0);

            Object[] Botellones = new Object[5];  

            while (rs.next()) {
                Botellones[0] = rs.getInt("Matricula"); 
                Botellones[1] = rs.getString("Nombre");
                Botellones[2] = rs.getString("Entrada");
                Botellones[3] = rs.getString("Salida");
                Botellones[4] = rs.getString("Esta en Residencia");

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
            
            Modelo logica = new Modelo();
            DefaultTableModel modelo = (DefaultTableModel) retirarEstudiante.TablaEstudiantesRetirar.getModel();
            logica.MostrarEstudiante(modelo);
            
        } catch (SQLException e) {
            System.err.println("Error al ejecutar el procedimiento: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al retirar el estudiante.", "Error", JOptionPane.ERROR_MESSAGE);
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
        // Establecer conexión con la base de datos.
        con = con1.getConexion(); // Cambia `con1` por tu método de conexión.
        cs = (CallableStatement) con.prepareCall(sql);

        // Configurar los parámetros del procedimiento almacenado.
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





