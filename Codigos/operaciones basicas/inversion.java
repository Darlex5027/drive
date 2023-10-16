import java.util.Scanner;
public class tortillas {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double capital,ganancia;

		System.out.print("Cuanto invertirá?");
		capital = entrada.nextInt();
		ganancia = (capital*.02)*12;
		System.out.print("Tu ganancia es:"+ganancia);


	}
}