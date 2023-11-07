import Connection.ConnectionDAO;

public class App {
    public static void main(String[] args) throws Exception {
        //new ConnectionDAO().criaTabela();
        //new ConnectionDAO().inserir("Rafael de Sousa Moura ", "rafael123@gmail.com");
        //new ConnectionDAO().buscarPorId(1);
        //new ConnectionDAO().apagarTabela();
        //new ConnectionDAO().apagarID(4);
        new ConnectionDAO().atualizarID(
            3, "Rafael", "rafael@gmail.com");
    }
}
