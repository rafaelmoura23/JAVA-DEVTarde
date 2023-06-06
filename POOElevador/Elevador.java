package POOElevador;

public class Elevador {
    //atributos do Elevador 
    int andarAtual;
    int totalAndares;
    int capacidadePessoas;
    int pessoasNoElevador;

    //metodos

    //construtor
    public Elevador(int totalAndares, int capacidadePessoas) {
        this.totalAndares = totalAndares;
        this.capacidadePessoas = capacidadePessoas;
    }

    //getts and setts
    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getPessoasNoElevador() {
        return pessoasNoElevador;
    }

    public void setPessoasNoElevador(int pessoasNoElevador) {
        this.pessoasNoElevador = pessoasNoElevador;
    }

    //metodos próprios
    public void inicializa() {
        andarAtual=0;
        pessoasNoElevador=0;
    }
    //entra
    public int entra() {
        if(pessoasNoElevador<capacidadePessoas){
        pessoasNoElevador++;
        }else{
            System.out.println("Elevador está CHEIO");
    }
    return pessoasNoElevador;
    }

    //sair
    public int sai() {
        if(pessoasNoElevador>0){
        pessoasNoElevador--;
        }else{
            System.out.println("Elevador está VAZIO");
    }
    return pessoasNoElevador;
    }

    //subir
    public void subir(int nAndares) {
        if(andarAtual+nAndares<=totalAndares){
        andarAtual+=nAndares;
        }else{
            System.out.println("já está no andar mais alto");
    }
    }




    }



 


