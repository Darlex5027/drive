/*2.- Utilizando la función break, escriba un
programa que capture números. Si el numero es
múltiplo de cinco debe detener la captura de
números y desplegar la cantidad de números
capturados.*/
import java.util.Scanner;

public class break3{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		for (int i=1;i>0;i++){
			System.out.println("Ingresa una cantidad:");
			if(entrada.nextInt()%5==0){
				System.out.println("El número de cantidades ingresadas fue"+i);
				break;
			}
		}
		
	}
}
