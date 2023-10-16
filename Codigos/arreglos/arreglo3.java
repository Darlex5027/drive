/*
 * Leer por teclado la nota de los alumnos de una clase y calcular la nota media del grupo. 
 * Mostar los alumnos con notas superiores a la media.
 */
import java.util.Scanner;

public class arreglo3{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Cuantas calificaciones va a ingresar?");
		float[] nums=new float[entrada.nextInt()];
		float prom=0;
		for(int i=0;i<nums.length;i++){
			System.out.printf("Ingresa la calificaciómn N°"+(i+1)+": ");
			nums[i]=entrada.nextFloat();
		}
		for(int i=0;i<nums.length;i++){
			prom+=nums[i];
		}
		prom=prom/nums.length;

		System.out.println("El promedio es: "+(prom));
		System.out.println("Las calificaciones arriba del promedio fueron");
		for(int i=0;i<nums.length;i++){
			if(nums[i]>prom)
				System.out.println(nums[i]);
		}
		

	}
}