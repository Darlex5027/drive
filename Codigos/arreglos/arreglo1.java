/*
 * Calcular la media de una serie de números que se leen por teclado.
 */

import java.util.Scanner;

public class arreglo1{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Cuantos datos vas a ingresar?");
		float[] nums=new float[entrada.nextInt()];
		float prom=0;
		for(int i=0;i<nums.length;i++){
			System.out.printf("Ingresa el dato N°"+(i+1)+": ");
			nums[i]=entrada.nextFloat();
		}
		for(int i=0;i<nums.length;i++){
			prom+=nums[i];
		}
		System.out.println("El promedio es: "+(prom/nums.length));

	}
}