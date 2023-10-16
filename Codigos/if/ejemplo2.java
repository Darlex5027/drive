/*
	* Programa que pide una nota por teclado y muestra si se ha aprobado o no
	*/
import java.util.*;
public class ejemplo2 {
	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		System.out.println("-----Ejercicio con IF-ELSE-----");
		System.out.println("Condicional Doble");
		System.out.println("Verificar par o impar.");
		System.out.print("Número: ");
		int numero = sc.nextInt();
		if ((numero%2)!=0){
			System.out.println("Es impar!!"+(numero%2));
			
		} else {
			System.out.println("Es par!"+(numero%2));
		}
		System.out.println("Hasta Pronto!");
	}
}