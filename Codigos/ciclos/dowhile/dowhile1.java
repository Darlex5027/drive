//12. Programa que lea números e indique si son positivos o negativos y pares o impares
import java.util.Scanner;
public class dowhile1{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int i;
		String resp1="",resp2="";
		do{
			System.out.println("Desea analizar un número? S/N");
			if(entrada.next().charAt(0)=='S'){
				System.out.println("Digita el número que quieres analizar: ");
				i=entrada.nextInt();
				if(i<0)
					resp1="negativo";
				if(i>0)
						resp1="positivo";
				if((i%2)==0){
						resp2="par";
				}else{
						resp2="impar";
				}
				System.out.println("El número ingresado es "+resp1+" y también es "+resp2);
			}else{
				resp1="noa";
			}
			
		}while(!(resp1.equals("noa")));
	}
}