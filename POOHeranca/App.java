package POOHeranca;

public class App {
    public static void main(String[] args) {
        // Pessoas pessoa01 = new Pessoas(); // objeto
        Alunos aluno01 = new Alunos(); // objeto
        Professores professor01 = new Professores(); // objeto
        Funcionarios funcionario01 = new Funcionarios(); // objeto

        //setando os atributos - PESSOA
        //pessoa01.setNome("Rafael de Sousa Moura");  não consigo instanciar um objeto da classe pessoa 
        //pessoa01.setEndereco("Rua das Flores, 192");
        //pessoa01.setIdade(19);
        //pessoa01.setCpf("123.456.789-1");


        //setando os atributos - ALUNO
        aluno01.setNome("Rafael de Sousa Moura");
        aluno01.setEndereco("Rua das Flores, 192");
        aluno01.setIdade(19);
        aluno01.setCpf("123.456.789-1");
        aluno01.setTurma("Turma B ");
        aluno01.setCurso("POO");
        aluno01.setnMatricula(111);
        aluno01.setMediaSemestre(10);

        //setando os atributos - PROFESSOR
        professor01.setNome("Rafael de Sousa Moura");
        professor01.setEndereco("Rua das Flores, 192");
        professor01.setIdade(19);
        professor01.setCpf("123.456.789-1");
        professor01.setMateriasDadas("POO");
        professor01.setQntdAulas(80);

        //setando os atributos - FUNCIONARIOS
        funcionario01.setNome("Rafael de Sousa Moura");
        funcionario01.setEndereco("Rua das Flores, 192");
        funcionario01.setIdade(19);
        funcionario01.setCpf("123.456.789-1");
        funcionario01.setAreaServico("Área de Lazer");
        funcionario01.setHorasTrabalhadas(8);
        
        

        //mostrando os atributos
        //System.out.println("Nome: " + pessoa01.getNome());
        //System.out.println("Endereço: " + pessoa01.getEndereco()); 
        //System.out.println("Idade: " + pessoa01.getIdade());
        //System.out.println("CPF: " + pessoa01.getCpf());

        System.out.println(" ");

        System.out.println("Nome: " + aluno01.getNome());
        System.out.println("Endereço: " + aluno01.getEndereco()); 
        System.out.println("Idade: " + aluno01.getIdade());
        System.out.println("CPF: " + aluno01.getCpf());
        System.out.println("Turma: " + aluno01.getTurma()); 

        System.out.println(" ");

        System.out.println("Matéria: " + professor01.getMateriasDadas());

        System.out.println(" ");
        
        System.out.println("CPF: " + funcionario01.getCpf()); 
    }
}
