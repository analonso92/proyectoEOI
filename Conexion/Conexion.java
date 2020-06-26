package Conexion;

import Usuario.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexion {
    private Connection getConnection() throws SQLException {
       
        String url = "jdbc:mysql://localhost:3306/proyectoeoi?useSSL=false&serverTimezone=UTC";
	String user = "root";
	String pass = "CyanDolphins55";
	
        try{
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Error al registrar el driver de MySQL: " + ex);
            }
        
	return DriverManager.getConnection(url, user, pass);
	}
    
    public boolean createUsuario(Usuario usuario) {
	String insertQuery = "INSERT INTO usuarios(usuario, password, telefono móvil, telefono secundario,  email) VALUES (?, ?, ?, ?, ?)";
	Connection con = null;
	PreparedStatement stmt = null;
	int rows = 0;
            try {
                con = getConnection();
                stmt = con.prepareStatement(insertQuery);
		stmt.setString(1, usuario.getUsuario());
                stmt.setString(2, usuario.getPassword());
                stmt.setInt(3, usuario.getTelefono());
                stmt.setInt(4, usuario.getTelefono2());
                stmt.setString(5, usuario.getEmail());
                System.out.println("Ejecutando la query: " + insertQuery);
				
		rows = stmt.executeUpdate();
                System.out.println("Registros afectados: " + rows);
				
		stmt.close();
                con.close();
				
		return true;
				
				
	    } catch (SQLException e) {
		e.printStackTrace();
		return false;
        }
        
            
    }
}
