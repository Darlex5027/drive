import java.util.Scanner;
public class whil {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int num=0;
		int suma=0;

		while (num>=0){
			suma = suma + num;
			System.out.print("Introduzca un número (<0 para finalizar):");
			num = entrada.nextInt();
		}
		System.out.println("La suma es: "+suma);
	}
}