import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
		public Connection conectar() throws ClassNotFoundException {
			Connection conn = null;
			try {
				   Class.forName("com.mysql.cj.jdbc.Driver");
				   conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bar", "root", "MCi3sKg!tjth");
			} catch (SQLException ex) {
				   System.out.println("Erro: Não conseguiu conectar no BD.");
				   System.out.println(ex);
			}
			return conn;
		}
		
		public void desconectar(Connection conn) {
			try {
				if(conn != null && !conn.isClosed()) {
					conn.close();
				}
			} catch (SQLException ex) {
				System.out.println("Não conseguiu desconectar do BD.");
			}
		}
}