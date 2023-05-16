package POOIntroducao;

public class App {
    public static void main(String[] args) {
        // criando objetos
        RegistraAluno aluno1 = new RegistraAluno(); // criei um objeto
        RegistraAluno aluno2 = new RegistraAluno(); // criei um objeto
        RegistraAluno aluno3 = new RegistraAluno(); // criei um objeto

        // setando os atibutos (SET)

        aluno1.setNome("Ana Carla Pereira");
        aluno1.setEndereco("Rua Carlos Gomes");
        aluno1.setIdade(19);
        aluno1.setNotaCiencias(10);
        aluno1.setNotaMatematica(10);
        aluno1.setNotaPortugues(9);

        aluno2.setNome("João Paulo");
        aluno2.setEndereco("Rua pedro Elias");
        aluno2.setIdade(15);
        aluno2.setNotaCiencias(5);
        aluno2.setNotaMatematica(7);
        aluno2.setNotaPortugues(8);

        aluno3.setNome("Roberto Carlos");
        aluno3.setEndereco("Rua Carlos Zaccaria");
        aluno3.setIdade(20);
        aluno3.setNotaCiencias(10);
        aluno3.setNotaMatematica(6);
        aluno3.setNotaPortugues(3);

        // mostrando os atributos com o (GET)
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Endereço: " + aluno1.getEndereco());
        System.out.println("Idade: " + aluno1.getIdade());
        System.out.println("Media: " + aluno1.getMedia());

        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Endereço: " + aluno2.getEndereco());
        System.out.println("Idade: " + aluno2.getIdade());
        System.out.println("Media: " + aluno2.getMedia());

        System.out.println("Nome: " + aluno3.getNome());
        System.out.println("Endereço: " + aluno3.getEndereco());
        System.out.println("Idade: " + aluno3.getIdade());
        System.out.println("Media: " + aluno3.getMedia());

        System.out.println("Contador: " + RegistraAluno.getQuantidadeAlunos());

    }
}
