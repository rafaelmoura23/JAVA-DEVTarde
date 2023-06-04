package POOElevador;

public class Elevador {
    //atributos do Elevador 
    private int andarAtual;
    private int totalAndares;
    private int capacidadePessoas;
    private int pessoasNoElevador;

    //construtor Inicializar
    public Elevador(int andarAtual, int totalAndares, int capacidadePessoas, int pessoasNoElevador) {
        this.andarAtual = 0;
        this.totalAndares = totalAndares;
        this.capacidadePessoas = capacidadePessoas;
        this.pessoasNoElevador = 0;
    }

    //outros métodos que o elevador também necessita  
    public void entrar() {
        if(pessoasNoElevador>capacidadePessoas){
            System.out.println("O elevador está lotado");
        } else{
            pessoasNoElevador++;
            System.out.println("Uma pessoa entrou no elevador");

        } 
    }

    public void sair() {
        if(pessoasNoElevador<=0){
            System.out.println("Não há ninguém no elevador");
        } else{
            pessoasNoElevador--;
            System.out.println("Uma pessoa saiu");
        }
    }

    public void subir(){
        if(andarAtual==totalAndares){
            System.out.println("O elevador está no último andar, desça ou fique aí");
        } else{
            andarAtual++;
            System.out.println("você subiu para o andar " +andarAtual);
        }
    }

    public void descer() {
        if(andarAtual<=0){
            System.out.println("O elevador já está no térreo");
        } else{
            andarAtual--;
            System.out.println("Você desceu para o andar "+ andarAtual);
        }
        
    }










}



 


