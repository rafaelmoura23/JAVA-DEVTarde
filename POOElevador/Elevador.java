package POOElevador;

public class Elevador {
    //atributos do Elevador 
    private int andarAtual;
    private int totalAndares;
    private int capacidadePessoas;
    private int pessoasNoElevador;

    //construtor Inicializar
    public void Inicializar(int capacidadePessoas, int totalAndares) { //atribuir apenas a capacidade e o total de andares no App
        this.andarAtual = 0; //definido como zero
        this.totalAndares = totalAndares;  //pedir para o usuario definir 
        this.capacidadePessoas = capacidadePessoas;  //pedir para o usuario definir
        this.pessoasNoElevador = 0; //definido como zero
    }

    // métodos que o elevador também necessita  
    public void entrar() {
        if(pessoasNoElevador>capacidadePessoas){ //se pessoas no elevador for maior do que a capacidade então o elevador está lotado
            System.out.println("O elevador está LOTADO"); 
        } else{
            pessoasNoElevador++;
            System.out.println("Uma pessoa ENTROU no elevador");

        } 
    }

    public void sair() {
        if(pessoasNoElevador<=0){
            System.out.println("O elevador está VAZIO"); // se pessoas no elevador = 0 então elevador está vazio
        } else{
            pessoasNoElevador--;
            System.out.println("Uma pessoa SAIU do elevador");
        }
    }

    public void subir(){
        if(andarAtual==totalAndares){
            System.out.println("O elevador está no ÚLTIMO andar, desça ou fique aí"); //se andar atual for igual ao total de andares então está no ultimo andar
        } else{
            andarAtual++;
            System.out.println("você SUBIU para o " +andarAtual+"º andar");
        }
    }

    public void descer() {
        if(andarAtual<=0){
            System.out.println("O elevador já está no TÉRREO"); //se o andar atual for igual a zero entçao o elevador ja esta no terreo
        } else{
            andarAtual--;
            System.out.println("Você DESCEU para o "+ andarAtual+"º andar" );
        }
        
    }










}



 


