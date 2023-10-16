/*
 * Mostrar la suma, resta, y multiplicación de dos valores
 *de tipo double que se introducen por teclado.
 */

import java.util.Scanner;
public class Secuencial2{
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		double numero1, numero2;
		System.out.println("Introduce el primer número:");
		numero1= entrada.nextDouble();
		System.out.println("Introduce el segundo número:");
		numero2= entrada.nextDouble();
		System.out.println("Número introducidos: "+numero1+""+numero2);
		System.out.println(numero1 + "+" + numero2 + "=" + (numero1+numero2));
		System.out.println(numero1 + "-" + numero2 + "=" + (numero1-numero2));
		System.out.println(numero1 + "*" + numero2 + "=" + numero1*numero2);
		System.out.println(numero1 + "/" + numero2 + "=" + numero1/numero2);
	}
}