	/*14. Hacer un programa que convierta centímetros a pulgadas y libras a kilogramos.*/
import java.util.Scanner;
public class switch2{
	public static void main(String[] args) {
		int opcion;
		float dato;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingresa el dato a evaluar:");
		dato = entrada.nextFloat();

		System.out.println("¿Qué deseas hacer?"+
							"\n1)convertir de cm a pulgadas"+
							"\n2)convertir de libras a kilogramos");
		opcion=entrada.nextInt();
		switch (opcion) {
			case 1:
				System.out.println(dato+"cm en pulgadas equivalen a: "+(dato/2.54f));
				break;
			case 2:
				System.out.println(dato+"libras en kilos equivalen a:"+(dato/2.205f));
				break;
			default:
				System.out.println("Hubo un error en tu solicitud");
				break;
		}

	}
}