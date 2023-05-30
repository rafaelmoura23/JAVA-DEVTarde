package POOExercicioII;


public class App {
    public static void main(String[] args) {
        //vetor de objetos
        Agenda obj[]=new Agenda[10];  //vetor de objetos que cabem 10 objetos

        for (int i = 0; i < obj.length; i++) {
            obj[i] = new Agenda(); //construindo o objeto 
            //preencher o objeto
            obj[i].setNome("Pessoa"+i);
            obj[i].setIdade("Idade"+i);
            obj[i].setAltura("Altura"+i);
        }
        System.out.println();


}
}
