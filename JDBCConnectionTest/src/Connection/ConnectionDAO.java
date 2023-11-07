package Connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDAO {
    private Connection connection;

    // construtor
    public ConnectionDAO() {
        this.connection = ConnectionFactory.getConnection(); // estabelece a conexão
    }

    // métodos
    public void criaTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS MINHA_TABELA (ID SERIAL PRIMARY KEY,NOME VARCHAR(255),EMAIL VARCHAR(255))";
        try (Statement stmt = this.connection.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabela criada com sucesso.");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao criar a tabela: " + e.getMessage(), e);
        } finally {
            ConnectionFactory.closeConnection(this.connection);
        }
    }

    public void apagarTabela() {
        String sql = "DROP TABLE MINHA_TABELA";
        try (Statement stmt = connection.createStatement()) {
            stmt.executeUpdate(sql);
            System.out.println("Tabela apagada com sucesso.");
        } catch (Exception e) {
            throw new RuntimeException("Erro ao apagar tabela.", e);
        } finally {
            ConnectionFactory.closeConnection(this.connection);
        }
    }

    public void inserir(String nome, String email) throws SQLException {
        String sql = "INSERT INTO MINHA_TABELA (NOME, EMAIL) VALUES (?, ?)";
        PreparedStatement stmt = connection.prepareStatement(sql);
        try {
            stmt.setString(1, nome);
            stmt.setString(2, email);
            stmt.executeUpdate();
            System.out.println("Dados inseridos com sucesso");
            ConnectionFactory.closeConnection(stmt);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(this.connection);
        }
    }

    // inserindo com id
    public void inserir(int id, String nome, String email) throws SQLException {
        String sql = "INSERT INTO MINHA_TABELA (ID, NOME, EMAIL) VALUES (?, ?, ?)";
        PreparedStatement stmt = connection.prepareStatement(sql);
        try {
            stmt.setInt(1, id);
            stmt.setString(2, nome);
            stmt.setString(3, email);
            stmt.executeUpdate();
            System.out.println("Dados inseridos com sucesso");
            ConnectionFactory.closeConnection(stmt);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(this.connection);
        }
    }

    public void buscarPorId(int id) {
        String sql = "SELECT * FROM MINHA_TABELA WHERE ID = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                int idBuscado = resultSet.getInt("ID");
                String nomeBuscado = resultSet.getString("NOME");
                String emailBuscado = resultSet.getString("EMAIL");
                System.out.println("Resultado da busca pelo id " + idBuscado + " \nNome: " +

                        nomeBuscado + " \nEmail: " + emailBuscado);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(this.connection);
        }
    }

    // apagar um dado da tabela
    public void apagarID(int id) {
        String sql = "DELETE FROM MINHA_TABELA WHERE ID = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) { // para o try executar tem que criar a conexão
                                                                          // do statement
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Dado Apagado com Sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(this.connection);
        }
    }

    // atualizar dados pelo id
    public void atualizarID(int id, String novoNome, String novoEmail) {
        String sql = "UPDATE MINHA_TABELA SET nome = ?, email = ? WHERE ID = ? ";
        try (PreparedStatement stmt = connection.prepareStatement(sql);) {
            stmt.setString(1, novoNome);
            stmt.setString(2, novoEmail);
            stmt.setInt(3, id);
            stmt.executeUpdate();
            System.out.println("Dados atualizados com sucesso");
            ConnectionFactory.closeConnection(stmt);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(this.connection);
        }
    }

}
