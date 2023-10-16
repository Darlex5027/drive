/*Escribe un programa que pinte una pirámide rellena con un carácter 
introducido por teclado que podrá ser una letra, un número o un símbolo
 como *, +, -, $, &, etc.*/
import java.util.Scanner;
public class anid1{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int h=0,x=1;
		char c ='*';
		System.out.println("Digita la altura de la piramide: ");
		h=entrada.nextInt();
		System.out.println("Digita el caracter que deseas usar:");
		c=entrada.next().charAt(0);
		for(int i =0;i<=h;i++){
			for(int z=1;z<=x;z++){
				System.out.print(c);
			}
			x+=2;
			System.out.println();		
		}
	}
}