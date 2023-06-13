package ProjectPOO;

import java.util.Scanner;

public class CriacaoContas {
    Pessoa[] contas;
    int numContas;

    public CriacaoContas(){
        contas = new Pessoa[100];
        numContas = 0;
    }

    public void cadastrarContas() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do titular: ");
        String nome = sc.nextLine();

        System.out.println("Digite o saldo atual: ");
        double saldo = sc.nextDouble();

        System.out.println("Escolha o tipo de conta: \n 1 - Pessoa Física  \n 2 - Pessoa Jurídica");
        int tipoConta = sc.nextInt();

        Pessoa pessoa;

        if(tipoConta == 1){
            System.out.println("Digite o CPF: ");
            String cpf = sc.nextLine();
            pessoa = new PessoaFisica(nome, saldo, cpf);
        } else{
            System.out.println("Digite o CNPJ: ");
            String cnpj = sc.nextLine();
            pessoa = new PessoaJuridica(nome, saldo, cnpj);
        }

        contas[numContas] = pessoa;
        numContas++;

        System.out.println("Conta cadastrada com sucesso!");
    }

    public void buscarContaNome(String nome) {
        for (int i = 0; i < numContas; i++) {
            if(contas[i].getNome().equals(nome)){
                System.out.println("Conta encontrada:");
                System.out.println("Nome: " + contas[i].getNome());
                System.out.println("Número da conta: " + contas[i].getNumeroConta());
                System.out.println("Saldo: " + contas[i].getSaldo());
                return;
            }
        }
        System.out.println("Conta não Encontrada!");
    }
    }
    
