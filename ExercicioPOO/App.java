package ExercicioPOO;

public class App {
    public static void main(String[] args) {
        Pessoa people1 = new Pessoa();  //criar um objeto

        // setando os atibutos (SET)
        people1.setNome("Ana Carla Pereira");
        people1.setAltura(1.80);
        people1.setDia(23);
        people1.setMes(10);
        people1.setAno(2003);
        people1.setIdade(2023-2003);

        // mostrando os atributos com o (GET)
        System.out.println("Nome: " + people1.getNome());
        System.out.println("Altura: " + people1.getAltura());
        System.out.println("Data de Nascimento: " + people1.getDia() + "/" + people1.getMes()+ "/"+people1.getAno());
        System.out.println("Idade: " +people1.getIdade());

    }
}
