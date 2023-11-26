/*8.- Tomar como entrada dos cadenas desde teclado, posteriormente compararlas e indicar si son iguales o diferentes.*/
import java.util.Scanner;
public class octava{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa la primer cadena:");
		StringBuilder cadena1 = new StringBuilder(entrada.nextLine());
		System.out.println("Ingresa la segunda cadena:");
		StringBuilder cadena2 = new StringBuilder(entrada.nextLine());

		if(cadena1.toString().equals(cadena2.toString()))
			System.out.println("Son iguales");
		if(!(cadena1.toString().equals(cadena2.toString())))
			System.out.println("No son iguales");
	}

}