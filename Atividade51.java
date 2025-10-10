1
import java.util.Scanner;

public class Atividade51{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7 para o dia da semana" );
        int numero = scanner.nextInt();

        String dia;

        switch (numero) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda-feira";
                break;
            case 3:
                dia = "Terça-feira";
                break;
            case 4:
                dia = "Quarta-feira";
                break;
            case 5:
                dia = "Quinta-feira";
                break;
            case 6:
                dia = "Sexta-feira";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Número inválido! Digite um número entre 1 e 7.";
        }

        System.out.println("Dia da semana: " + dia);
        scanner.close();
    }
}