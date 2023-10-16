import java.util.Scanner;
public class do4{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int t,i=1;
		do{
		System.out.print("Qué tabla deseas ver? ingresa una letra para salir del programa");
		t=entrada.nextInt();
			i=0;
			do{
				System.out.println(t+"x"+i+"="+(t*i));
				i++;
			}while(i<=10);

		}while(t!='n');
	}
}