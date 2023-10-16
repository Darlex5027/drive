//8. Programa Java que muestre los números desde N hasta 1 utilizando las instrucciones for, while y do .. while
import java.util.Scanner;
public class for2{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num=0;
		System.out.println("Digita el número al que deseas llegar:");
		num=entrada.nextInt();
		for(int i=num; i>0;i--){
			System.out.println(i);
		}
	}
}