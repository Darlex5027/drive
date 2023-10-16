/*Escriba un programa que capture 20 números. Si el número capturado 
es cero debe salir del ciclo y desplegar el mensaje "Se capturo el numero
 cero" así como el resultado de la suma de los números capturados. Si el 
 número es negativo este numero no debe contarse. Al final debe desplegar 
 la suma de los números capturados. Usando las sentencias break y continue,
 implemente el programa anterior. */
import java.util.Scanner;

public class bc{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int suma=0,cant=0;
		for (int i=1;i<21;i++){
			System.out.println("Digita la cantidad n°"+i+":");
			cant=entrada.nextInt();
			suma+=cant;
			if(cant<0){
				suma-=cant;
				continue;
			}
			if(cant==0){
				System.out.println("Se ingresó el númro cero");
				break;
			}
		}
		System.out.println("La suma total es: "+suma);
	}
}