/*6. Programa que lea un carácter y compruebe si es un número (Carácter entre '0' y '9').*/
import java.util.Scanner;
public class switch1{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		char intro;
		System.out.println("Registra el digito a evaluar");
		intro=entrada.next().charAt(0);
		switch (intro){
			case 48,49,50,51,52,53,54,55,56,57,58,59:
				System.out.println("si es un número");
				break;
			default:

				System.out.println("no es un número");
				break;
				
		}
	}
}