/*
	* Programa que pide una nota por teclado y muestra si se ha aprobado o no
	*/
import java.util.*;
public class ejercicio4 {
	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		System.out.println("-----Ejercicio con IF-ELSE-----");
		System.out.println("Condicional Doble");
		System.out.println("Verificar la edad.");
		System.out.print("Edad: ");
		int edad = sc.nextInt();
		if (edad <45){
			System.out.println("Felicidades eres joven");
		} else {
			System.out.println("Lo lamento eres viejo");
		}
		System.out.println("Hasta Pronto!");
	}
}