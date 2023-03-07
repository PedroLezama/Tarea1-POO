import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String[] separador;
        Scanner teclado = new Scanner(System.in);
        String input = "";
        System.out.println("Jugadas: ");
        input = teclado.nextLine();
        input = input.toUpperCase();
        separador = input.split("");

            System.out.println("-------------");
            System.out.println("| " + separador[0] + " | " + separador[1] + " | " + separador[2] + " |");
            System.out.println("| " + separador[3] + " | " + separador[4] + " | " + separador[5] + " |");
            System.out.println("| " + separador[6] + " | " + separador[7] + " | " + separador[8] + " |");
            System.out.println("-------------");
        }

    }
