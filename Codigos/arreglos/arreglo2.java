/*
 *Leer 10 números enteros por teclado y guardarlos en un array.
 *Calcula y muestra la media de los números que estén en las posiciones pares del array. 
 */


import java.util.Scanner;

public class arreglo2{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float[] nums=new float[10];
		float prom=0;
		for(int i=0;i<nums.length;i++){
			System.out.printf("Ingresa el dato N°"+(i+1)+": ");
			nums[i]=entrada.nextFloat();
		}
		for(int i=0;i<nums.length;i++){
			if((i+1)%2==0)
				prom+=nums[i];
		}
		System.out.println("El promedio es: "+(prom/5));

	}
}