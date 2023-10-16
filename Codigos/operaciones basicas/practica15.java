import java.util.Scanner;
public class practica15 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		float guille, luis, juan, total;

		System.out.println("Cuánto dinero tiene guillermo?");
		guille=entrada.nextFloat();
		luis = guille/2;
		juan = (luis+guille)/2;
		total=guille+juan+luis;
		System.out.println("El total de dinero es: "+total);
	}
}