import java.util.Scanner;
public class break2{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num1 =0,num2=0,i=0, z=0,suma=0;
		do{
			System.out.println("Digita el primer número");
			num1=entrada.nextInt();
			System.out.println("Digita el segundo número");
			num2=entrada.nextInt();
		}while(!((num1==1||num1==0)&&(num2==1||num2==0)))
		if(num1+num2==2){
			System.out.println("10");
		}else{
			System.out.println(num1+num2);
		}
		
	} 
}