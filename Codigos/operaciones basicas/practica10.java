import java.util.Scanner;
public class practica10 {
	public static void main (String[] args){
		Scanner entrada = new Scanner (System.in);

		float numero1, numero2, suma, resta, mult, div, resto;

		System.out.print("Digite 2 numeros: ");
		numero1 = entrada.nextFloat();
		numero2 = entrada.nextFloat();

		suma = numero1+numero2;
		resta  = numero1-numero2;
		mult = numero1*numero2;
		div  = numero1/numero2;
		resto = numero1%numero2;

		System.out.println("La suma es: "+suma+
							"\nLa resta es: "+resta+
							"\nLa multiplicación es: "+mult+
							"\nLa división es: "+div+
							"\nEl resto es: "+resto);

	}
}