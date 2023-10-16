import java.util.Scanner;
public class anid1{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int fil=0,col=0;
		do{
			System.out.println("Digita el número de filas: ");
			fil=entrada.nextInt();
			System.out.println("Digita el número de columnas: ");
			col=entrada.nextInt();
		}while(fil<2||col<2);

		for(int i =0;i<fil;i++){
			for(int z=0;z<col;z++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}