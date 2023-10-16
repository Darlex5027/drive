/*
 * 3. Desarrollar un programa en el que se pida al usuario una matriz 
 * de dimensiones N × M, y compruebe si la matriz es negativa.
 * (Todos sus elementos menores o iguales a cero)
 */
import java.util.Scanner;
public class tarea1{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int x,y;
		boolean pos=false;
		System.out.println("Ingresa el ancho de tu matriz");
		x=entrada.nextInt();
		System.out.println("Ingresa lo alto de tu matriz");
		y=entrada.nextInt();
		int[][] matriz = new int[x][y];

		for (int a=0; a<matriz.length; a++) {
           	for (int b=0;b<matriz[0].length;b++) {
               	System.out.printf("a ["+a+"]["+b+"]= ");
               	matriz[a][b] = entrada.nextInt();
               	if(matriz[a][b]>0)
               		pos=true;
           	}
        }
        if(pos)
        	System.out.printf("no ");
        System.out.println("toda la matriz es negativa");



	}
}