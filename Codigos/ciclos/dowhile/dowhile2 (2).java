//12. Programa que lea números e indique si son positivos o negativos y pares o impares
import java.util.Scanner;
public class dowhile2{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int i;
		char resp='l';
		do{
			System.out.println("Desea analizar un número? S/N");
			resp=entrada.next().charAt(0);
			if(resp=='S'||resp=='s'){
				System.out.println("Digita el número que quieres analizar: ");
				i=entrada.nextInt();
				if(i<0)
					System.out.print("El número ingresado es negativo");
				if(i>0)
					System.out.print("El número ingresado es positivo");
				if((i%2)==0){
						System.out.print(" y también es par");
				}else{
						System.out.print(" y también es impar");
				}
				System.out.println();
			}
			
		}while(resp=='S'||resp=='s');
	}
}