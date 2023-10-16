//11. Programa que muestre los múltiplos de un número desde 1 hasta M
import java.util.Scanner;
public class for1{
	public static void main(String[] args) {
		int numero1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el número: ");
        numero1 = entrada.nextInt();
        int i=1;
        do{
        	if(numero1%i==0)
            	System.out.println(i);
            i++;
        }while(i <= numero1);
    }
}