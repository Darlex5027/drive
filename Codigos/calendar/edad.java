import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class edad {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Calendar fecha = new GregorianCalendar();
		final int act =fecha. get(Calendar. YEAR);; 
		int nac;

		System.out.print("Digita tu año de nacimiento");
		nac = entrada.nextInt();
		System.out.print("Tu edad es:"+(act-nac));
	}
}