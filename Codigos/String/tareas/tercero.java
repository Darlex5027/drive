/*3.- Tome como entrada una cadena de texto e invierta la cadena, realícelo con una estructura
 cíclica tradicional y también con StringBuilder utilizando  reverse().Es decir resuélvalo de las dos formas.*/
 import java.util.Scanner;

 public class tercero{
 	public static void main(String[] args) {
 		Scanner entrada = new Scanner(System.in);
 		System.out.println("Ingresa la cadena que quieres voltear:");
 		StringBuilder cadena=new StringBuilder(entrada.nextLine());


		for(int i=cadena.length()-1;i>=0;i--){
 			System.out.print(cadena.charAt(i));
 		}

 		System.out.println();

 		System.out.println(cadena.reverse());

 		

 	}
 }