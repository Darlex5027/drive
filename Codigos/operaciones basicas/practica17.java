import java.util.Scanner;
public class practica17 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int horas, semanas, dias;

		System.out.println("Digite el número de horas: ");
		horas= entrada.nextInt();

		semanas=horas/(168);
		dias=(horas%(168))/24;
		horas=(horas%24);
		System.out.println("Semanas: "+semanas+
							"\nDías: "+dias+
							"\nHoras: "+horas);
	}
}
