import java.util.Scanner;
public class alumno {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a,p,i=1,z=0;
		int califgen=0;califalumn=0;
		
		
		while (resp=='s'){
			System.out.print("Deseas capturar la calificación del alumno número: "+i);
			resp=entrada.next().charAt(0);
			if(resp='s'){
				while(z<3){
					System.out.println("Digita la calificación del parcial "+(z+1));
					califalumn+=entrada.nextFloat();
				}
				System.out.print("el promedio del alumno es:"+(califalumn/3);
				califgen=califgen+(califalumn+3);
			}
			i++;
		}
		System.out.print("La calificación de la generación es: "+(califgen/(i+1));
		System.out.println("Hasta Pronto!");
		
		


	}
}