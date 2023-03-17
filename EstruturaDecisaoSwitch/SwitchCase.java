package EstruturaDecisaoSwitch;

import java.util.Scanner;

public class SwitchCase {
    Scanner sc = new Scanner(System.in);
    public void letra() {
        System.out.println("Digite uma letra:");
        String letra = sc.nextLine();
        String tipoLetra = ""; //variavel com valor igual a 0;
        switch(letra) {
            case "a": tipoLetra="vogal";
            break;
            case "e": tipoLetra="vogal";
            break;
            case "i": tipoLetra="vogal";
            break;
            case "o": tipoLetra="vogal";
            break;
            case "u": tipoLetra="vogal";
            break;
            default: tipoLetra= "consoante";
            break;
        }
        System.out.println(letra + " é uma  " +tipoLetra);
        
    }
    public void letra2() {
        System.out.println("Digite um número referente ao mês:");
        int mes = sc.nextInt();

        String meses = "";

        switch(mes) {
            case 1: meses= "Janeiro";
            break; 
            case 2: meses= "Fevereiro";
            break; 
            case 3: meses= "Março";
            break; 
            case 4: meses= "Abril";
            break; 
            case 5: meses= "Maio";
            break; 
            case 6: meses= "Junho";
            break; 
            case 7: meses= "Julho";
            break; 
            case 8: meses= "Agosto";
            break; 
            case 9: meses= "Setembro";
            break; 
            case 10: meses= "Outubro";
            break; 
            case 11: meses= "Novembro";
            break; 
            case 12: meses= "Dezembro";
            break;
            default: meses= " núemero não encontrado";
            break;
        }
        System.out.println("O mês correspondente é "+meses);
        
    }
}
