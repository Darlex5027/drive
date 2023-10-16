import java.util.Scanner;
public class anid2{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int filas, columnas,contador=0;
		do{
			System.out.print("Introduce número de filas del cuadrado: ");
			filas = entrada.nextInt();
		}while(filas<2);
		for(int i= 1; i<=filas; i++){
			for( int j=1;j<=filas;j++){
				System.out.print(contador%10+" ");
				contador++;
			}
			System.out.println();
		}
	}
}