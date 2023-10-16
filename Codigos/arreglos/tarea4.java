/*5. Desarrollar un programa en el que se pida al usuario 
 *una matriz de dimensiones N × M, y construya una nueva 
 *matriz representando la matriz opuesta de la inicial.
 */
import java.util.Scanner;
public class tarea4{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int x,y;
		System.out.println("Ingresa el ancho de tu matriz");
		x=entrada.nextInt();
		System.out.println("Ingresa lo alto de tu matriz");
		y=entrada.nextInt();
		int[][] matriz = new int[x][y];
		int[][] matrizneg = new int[x][y];

		for (int a=0; a<matriz.length; a++) {
           	for (int b=0;b<matriz[0].length;b++) {
               	System.out.printf("a ["+a+"]["+b+"]= ");
               	matriz[a][b] = entrada.nextInt();
               	matrizneg[a][b]=matriz[a][b]*-1;
           	}
        }
        for (int a=0; a<matriz.length; a++) {
           	for (int b=0;b<matriz[0].length;b++) {
               	System.out.printf(matrizneg[a][b]+" ");
            }
            System.out.println();
        }



	}
}