package ProjectPOO;


import ExercicioPOO.Pessoa;

public class CriacaoContas {
    Pessoa[] vPessoas = new Pessoa[100]; //criar um vetor de pessoas, inicalmente com 100 pessoas
    int contPessoas = 0;  // contador para o número de pessoas, ou seja o numero de cadastros realizados, max=100




    public void cadastroFisico() {

        
    }

    public void cadastroJuridico() {
        
    }
     
    public void buscarPessoaLoop(String nome) {
        boolean encontrou = false;
        for (int i = 0; i < vPessoas.length; i++) {
            if(vPessoas[i].getNome().equalsIgnoreCase(nome)){
                System.out.println("Pessoa Encontrada");
                System.out.println("Nome: " + vPessoas[i].getNome());
                System.out.println("Saldo: " + vPessoas[i]);
                System.out.println("Número da Conta: " + vPessoas[i]);
                encontrou=true;
            }
        }
        if(!encontrou){
            System.out.println("A Pessoa não foi Encontrada! ");
        }
        
    }
}