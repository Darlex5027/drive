import java.util.Scanner;
public class alumno {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float a,p,i=0,z=0;
		float califgen=0,califalumn=0;
		char resp='s';
		
		
		while (resp=='s'){
			System.out.println("Deseas capturar la calificación del alumno número: "+(i+1));
			resp=entrada.next().charAt(0);
			if(resp=='s'){
				while(z<3){
					System.out.println("Digita la calificación del parcial "+(z+1));
					califalumn=califalumn+entrada.nextFloat();
					z++;
				}
				System.out.println("el promedio del alumno es:"+(califalumn/3));
				califgen=califgen+(califalumn/3);
				z=0;
				califalumn=0;
				i++;
			}
		}
		System.out.println("La calificación de la generación es: "+(califgen/i));
		System.out.println("Hasta Pronto!");
		
		


	}
}