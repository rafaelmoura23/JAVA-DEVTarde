package Connection;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionFactory {
    // atributos                                                        nome do bd
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USUARIO = "postgres"; // ADM do banco de dados
    private static final String SENHA = "postgres";

    // métodos
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USUARIO, SENHA); // acessa o drive baixado de acordo com o banco de dados na pasta lib 
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao obter conexão com o banco de dados.", e);
        }
    }

    public static void closeConnection(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void closeConnection(Connection connection, PreparedStatement stmt) {
        try {
            if (connection != null && stmt != null) {
                connection.close();
                stmt.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

     public static void closeConnection(PreparedStatement stmt) {
        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
