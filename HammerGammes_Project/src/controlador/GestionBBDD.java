package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GestionBBDD {
	    private static final String URL = "jdbc:mysql://localhost/HammerGames_db";
	    private static final String USUARIO = "root";
	    private static final String PASSWORD = "";

	    public static boolean verificarUsuario(String usuario, String password) {
	        String sql = "SELECT * FROM empleados WHERE usuario = '" + usuario +  "' AND clave = '" + password + "'";
	        
	        try (Connection con = DriverManager.getConnection(URL, USUARIO, PASSWORD);
	        	Statement stmt = con.createStatement();
	            ResultSet rs = stmt.executeQuery(sql)) {

	            return rs.next(); // Si hay resultados, el usuario existe

	        } catch (SQLException e) {
	            System.err.println("❌ Error al conectar con la base de datos.");
	            e.printStackTrace();
	        }
	        return false;
	    }
}
