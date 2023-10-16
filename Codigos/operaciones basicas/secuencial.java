import java.util.Scanner;
public class secuencia {
	public static void main(String[] args) {
		int n1,n2;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un número entero: ");
		n1 = entrada.nextInt();
		System.out.println("Introduce otro número entero: ");
		n2 = entrada.nextInt();
		System.out.println("Ha introducido los número:" +n1+" y " + n2);
	}
}