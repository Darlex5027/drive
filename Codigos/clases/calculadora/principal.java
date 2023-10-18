import java.util.Scanner;
public class principal{
	public static void main(String [] args){
		Scanner entrada = new Scanner(System.in);
		Calculadora p1 = new Calculadora();
		int i=0;

		do{
			System.out.println("1)Sumar\n2)Restar\n3)Dividir\n4)Multiplicar\n5)Potenciaciòn\n6)Salir");
			i=entrada.nextInt();
			if(i!=6){
				System.out.println("Ingresa el nùmero 1:");
				p1.n1 = entrada.nextInt();
				System.out.println("Ingresa el nùmero 2:");
				p1.n2 = entrada.nextInt();
			}
			if(i==1)
				p1.suma();	
			if(i==2)
				p1.resta();
			if(i==3)
				p1.dividir();
			if(i==4)
				p1.multiplicar();
			if(i==5)
				p1.potenciacion();
		}while(i!=6);
	}
}
