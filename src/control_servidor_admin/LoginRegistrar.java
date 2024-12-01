package control_servidor_admin;


import GUI.LoginAdmin;
import GUI.VerEstudiantes;
import Percistencia.DBConexion;
import com.mysql.cj.jdbc.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Controlador.EstudianteControlador;

/**
 *
 * @author Erick Tejada
 */
public class LoginRegistrar {

    DBConexion con1 = new DBConexion(); 
    Connection conet;               
    LoginAdmin loginAdmin = new LoginAdmin();
    ConsultasSQL logica = new ConsultasSQL();
    EstudianteControlador estudianteControlador = new EstudianteControlador();
    


    public LoginRegistrar(LoginAdmin loginAdmin) {
        this.loginAdmin = loginAdmin;
    }

    public void IniciarSesion(String usuario, String contraseña) {
    // Establecer la conexión con la base de datos
    try {
        conet = con1.getConexion(); 
        String query = "{CALL VerificarContrasena(?, ?)}";
        CallableStatement stmt = (CallableStatement) conet.prepareCall(query);
        
        stmt.setString(1, usuario);
        stmt.setString(2, contraseña);

        ResultSet result = stmt.executeQuery();
        if (result.next()) {
            String mensaje = result.getString("Mensaje");
            System.out.println(mensaje);  

            if ("Acceso concedido".equals(mensaje)) {

                System.out.println("Bienvenido, " + usuario);
                JOptionPane.showMessageDialog(null, "Todo bien crack", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                VerEstudiantes verEstudiantes = new VerEstudiantes();
                verEstudiantes.setVisible(true);
                verEstudiantes.setLocationRelativeTo(null);
                loginAdmin.dispose();
                DefaultTableModel modelo = (DefaultTableModel) verEstudiantes.TablaEstudiantes.getModel();
                estudianteControlador.MostrarEstudiante(modelo);
              
            } else {
                System.out.println("Usuario o contraseña incorrectos.");
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");

            }
        }
        result.close();
        stmt.close();
        conet.close();
        
    } catch (SQLException e) {
        System.out.println("Error de base de datos: " + e.getMessage());
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}
    
}