//2. Programa que lea un número entero y muestre si el número es múltiplo de 10.
import java.util.Scanner;
public class if2{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1;
		System.out.println("Ingresa el digito a evaluar:");
		n1 = entrada.nextInt();
		if((n1%10)==0){
			System.out.println("Si es multiplo de 10");
		}else{
			System.out.println("No es un multiplo de 10");
		}
	}
}