import java.util.Scanner;
public class Tarea2{
public static void main(String[] args){

	String[] separador;
	Scanner teclado = new Scanner(System.in);
	String input = "";
	input = teclado.nextLine();
	separador = input.split(" ");
	System.out.println("Nombre: "+separador[0]);
	System.out.println("Profesion: "+separador[1]);
	System.out.println("Pais: "+separador[2]);


}



}
