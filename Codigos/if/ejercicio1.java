/*Se necesita un sistema para un supermercado, 
el cual dará un descuento del 10% a las personas que compren más de $1000
al cliente se le debe de dar el total a pagar
*/
import java.util.Scanner;
public class ejercicio1{
	public static void main(String[] args) {
		
		final float desc= 0.90f;

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Cuál es el subtotal?");
		float subtotal = entrada.nextFloat();

		if(subtotal>1000){
			System.out.println("Tu total es: "+(subtotal*desc));
		}else{
			System.out.println("Tu total es: "+subtotal);
		}
	}
}