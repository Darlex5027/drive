//7. Programa Java que muestre los números desde 1 hasta N utilizando las instrucciones for, while y do .. while
import java.util.Scanner;
public class while1{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n=0;
		System.out.println("Digita el número al que quieres llegar:");
		n=entrada.nextInt();
		int i=1;
		while(i<=n){
			System.out.println(i);
			i++;
		}
	}
}