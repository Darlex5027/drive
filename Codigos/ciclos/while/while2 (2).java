//11. Programa que muestre los múltiplos de un número desde 1 hasta M
import java.util.Scanner;
public class while2{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n=0;
		System.out.println("Digita el número al que quieres llegar:");
		n=entrada.nextInt();
		int i=1;
		while(i<=n){
			if(n%i==0)
			System.out.println(i);
			i++;
		}
	}
}