import java.util.Scanner;
public class calif {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n;
		float califinal=0;

		System.out.println("Cuantos parciales son?");
		n = entrada.nextInt();
		for (int i=0;i<n;i++){
			System.out.println("Digita la calificación del parcial "+(i+1));
			califinal+=entrada.nextFloat();
		}
		califinal/=n;
		if (califinal<6){
			System.out.println("NA");
		} else if(califinal<=8) {
			System.out.println("S");
		}else if(califinal<=9){
			System.out.println("B");
		} else{
			System.out.println("E");
		}
		System.out.println("Hasta Pronto!");
	}
}