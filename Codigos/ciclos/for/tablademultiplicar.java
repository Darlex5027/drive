import java.util.Scanner;
public class for1{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int t;
		System.out.print("Qué tabla deseas ver? ingresa una letra para salir del programa");
		t=entrada.nextInt();
		for(int i=1;i<=10;i++){
			System.out.println(t+"x"+i+"="+(t*i));
		}
	}
}