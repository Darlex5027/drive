import java.util.Scanner;

public class sumamatriz{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[][] a = new int[3][3];
		int[][] b = new int[3][3];
		int[][] c = new int[3][3];
		int fila,columna;
		System.out.println("Leer datos para la matriz a");
        
        //Metemos datos a la matriz a
        for (fila = 0; fila <a.length; fila++) {
            for (columna = 0; columna <a[0].length; columna++) {
                System.out.printf("a ["+fila+"]["+columna+"]= ");
                a [fila] [columna] = entrada.nextInt();
            }
        }
        
        System.out.println("Leer datos para la matriz b");
        //Metemos datos a la matriz b
        for (fila = 0; fila<b.length; fila++) {
            for (columna = 0; columna <b[0].length; columna++) {
                System.out.printf("b ["+fila+"]["+columna+"]= ");
                b [fila] [columna] = entrada.nextInt();
            }
        }

        for(fila=0; fila<c.length;fila++){
        	for(columna=0;columna<c[0].length;columna++){
        		c[fila][columna]=a[fila][columna]+b[fila][columna];
        	}
        }

        for (fila=0; fila < c.length; fila++) {
            for (columna=0;columna<c[0].length; columna++) {
                System.out.printf(c[fila][columna]+" ");
            }
            System.out.println();
        }

	}
}