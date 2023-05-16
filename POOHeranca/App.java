package POOHeranca;

public class App {
    public static void main(String[] args) {
    Pessoas pessoa01 = new Pessoas(); // objeto
    Alunos aluno01 = new Alunos(); // objeto
    Professores professor01 = new Professores(); // objeto
    Funcionarios funcionario01 = new Funcionarios(); // objeto


    pessoa01.setNome("Rafael de Sousa Moura"); //setando os atributos
    aluno01.setTurma("Turma B "); //setando os atributos
    professor01.setMateriasDadas("POO"); //setando os atributos
    funcionario01.setCpf("123.456.789.1"); //setando os atributos
    


    System.out.println("Nome: " + pessoa01.getNome()); //mostrando os atributos
    System.out.println("Turma: " + aluno01.getTurma()); //mostrando os atributos
    System.out.println("Matéria: " + professor01.getMateriasDadas()); //mostrando os atributos
    System.out.println("CPF: " + funcionario01.getCpf()); //mostrando os atributos
    }
}
