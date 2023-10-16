import java.util.Scanner;
public class practica16 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float parti, exam1, exam2, examfinal, notafinal;

		System.out.println("Digita la nota de tus participaciones: ");
		parti = entrada.nextFloat();
		System.out.println("Digita la nota de tu primer examen: ");
		exam1 = entrada.nextFloat();
		System.out.println("Digita la nota de tu segundo examen: ");
		exam2 = entrada.nextFloat();
		System.out.println("Digita la nota de tu examen final: ");
		examfinal = entrada.nextFloat();

		parti *=0.10f;
		exam1*=0.25f;
		exam2*=0.25;
		examfinal*=0.40;

		notafinal= parti+exam1+exam2+examfinal;

		System.out.println("Tu calificación final es: "+notafinal);   
	}
}