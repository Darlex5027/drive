//9. Programa Java que lea dos números y muestre los números desde el menor hasta el mayor
import java.util.Scanner;
public class dowhile2{
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
            int i=menor; 
            do{
                System.out.println(i);
                i++;
            }while(i <= mayor);
        }
	}
}