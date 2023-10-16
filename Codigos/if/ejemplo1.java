/*
	* Programa que pide una nota por teclado y muestra si se ha aprobado o no
	*/
import java.util.*;
public class ejemplo1 {
	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		System.out.println("-----Ejercicio con IF-ELSE-----");
		System.out.println("Condicional Doble");
		System.out.println("Verificar calificación.");
		System.out.print("Nota: ");
		float nota = sc.nextFloat();
		if (nota >=6){
			System.out.println("Enhorabuena!!");
			System.out.println("Has aprobado");
		} else {
			System.out.println("Lo siento, has suspendido");
		}
		System.out.println("Hasta Pronto!");
	}
}