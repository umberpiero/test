package is.gestionevideo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import is.gestionevideo.database.DBManager;

public class InizializzaDB {

	public static void main(String[] args) {
		try {
			Connection conn=DBManager.getConnection();
			String query;
			query="CREATE TABLE VIDEO("
					+" ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,"
					+" NOME VARCHAR(30),"
					+" DATA DATE,"
					+" SPORT VARCHAR(30),"
					+" TIPO VARCHAR(30)"
					+");";
			try(PreparedStatement stmt=conn.prepareStatement(query)) {
				stmt.executeUpdate();
			}
		} catch(SQLException e) {
			e.printStackTrace();			
		}

	}

}
