import java.util.Scanner;
public class anid3{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int tablas=0;
		System.out.print("Introduce número de filas del cuadrado: ");
		tablas= entrada.nextInt();
		for(int j=1;j<=tablas;j++){
			for(int i=1;i<=10;i++){
				System.out.println(j+"x"+i+"="+(j*i));	
			}	
		}
		
		}
}