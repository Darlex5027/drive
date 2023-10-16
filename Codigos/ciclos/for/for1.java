//12. Programa que lea números e indique si son positivos o negativos y pares o impares
import java.util.Scanner;
public class for1{
	public static void main(String[] args) {
		int numero1, numero2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        numero1 = entrada.nextInt();
        System.out.println("Introduce el segundo número: ");
        numero2 = entrada.nextInt();

        if (numero1 == numero2) {
            System.out.println("Los números introducidos son iguales.");
        } else {
            int menor = numero1;
            int mayor = numero2;
            if (numero1 > numero2) {
                menor = numero2;
                mayor = numero1;
        }
        for(int i=menor;i <= mayor;i++)
          	if(i%2==0)
           	System.out.println(i);
                
        }
    }
}