import java.util.Scanner;

public class practica13{
	public static void main(String[] args) {
		double raiz = Math.sqrt(9);

		System.out.println("Raiz de 9:"+raiz);		

		double base = 5, exponente = 2;
		double resultado = Math.pow(base,exponente);

		System.out.println("5 elevado a la 2:"+resultado);	

		float numero =4.56f;
		int resuldato = Math.round(numero);
		System.out.println("el redondeo de 4.56 es:"+resuldato );	

		double azar = Math.random();
		System.out.println("Un número al azar:"+azar );
	}
}