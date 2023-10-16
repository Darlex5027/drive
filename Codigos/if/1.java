//4. Programa que lea dos caracteres por teclado y compruebe si son iguales.
import java.util.Scanner;
public class if1{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		char c1,c2;

		System.out.println("Digita el primer caracter:");
		c1 = entrada.next().charAt(0);
		System.out.println("Digita el segundo caracter:");
		c2 = entrada.next().charAt(0);
		String respuesta = "No";
		if(c1==c2){
			respuesta = "Sí";
		}
		System.out.println(respuesta+" son iguales");
	}
}