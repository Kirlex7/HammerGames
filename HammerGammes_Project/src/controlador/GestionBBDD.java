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
	    
	    public static void insertarVideojuego(String nombreV, int fechaV, String generoV, String plataformaV, int precioV, int calificacionV, boolean multijugadorV, int stockV) {
	    	try {
				Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/HammerGames_db", "root", "");
				Statement consulta = conexion.createStatement();
				// Mostramos por consola el insert a realizar
				// Realizamos el insert sobre la base de datos
				consulta.executeUpdate("insert into videojuegos (Nombre, Fecha_Lanzamiento, Genero, Plataforma, Precio, Calificacion, Multijugador, Stock) " + "values ('"
						+ nombreV + "'," + fechaV + ",'" + generoV + "','" + plataformaV + "'," + precioV + "," + calificacionV + "," + multijugadorV + "," + stockV + 
						"); ");

				conexion.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
}
