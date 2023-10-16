//6. Programa Java que muestre los números del 100 al 1 utilizando la instrucción for
import java.util.Scanner;
public class for1{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num=0;
		System.out.println("Digita el número al que deseas llegar:");
		num=entrada.nextInt();
		for(int i = 1; i<=num;i++){
			System.out.println(i);
		}
	}
}