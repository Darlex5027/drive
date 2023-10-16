import java.util.*;
public class while2{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n;
		int contador = 0;
		String asterisco="";
		System.out.print("Introduce número de asteriscos a mostrar: ");
		n = entrada.nextInt();

		while(contador<n){
			asterisco= asterisco+"*";
			System.out.println(asterisco);
			contador++;
		}
		System.out.print("Programa finalizado");
	}
}