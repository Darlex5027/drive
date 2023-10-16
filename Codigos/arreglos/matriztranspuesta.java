import java.util.Scanner;
public class matriztranspuesta{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[][] a = new int[3][3];
		int[][] b = new int[3][3];

		System.out.println("Leer datos para la matriz a");
        
        //Metemos datos a la matriz a
        for (int x= 0; x<a.length; x++) {
            for (int y = 0; y<a[0].length; y++) {
                System.out.printf("a ["+x+"]["+y+"]= ");
                a [x] [y] = entrada.nextInt();
            }
        }

		for (int x= 0; x<a.length; x++) {
            for (int y = 0; y<a[0].length; y++) {
                b[y][x]=a[x][y];
            }
        }        

		for (int x= 0; x<a.length; x++) {
            for (int y = 0; y<a[0].length; y++) {
                System.out.printf(b[x][y]+" ");
            }
            System.out.println();
        }        


	}
}
