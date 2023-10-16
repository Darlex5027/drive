import java.util.Scanner;
public class arreglo1{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int [] a = new int[5];
		int [] b = new int[5];
		int [] c = new int[5];

		for(int i=0;i<a.length;i++){
			System.out.println("Dame el dato #"+(i+1)+" del arreglo a");
			a[i]=entrada.nextInt();
		}
		for(int i=0;i<b.length;i++){
			System.out.println("Dame el dato #"+(i+1)+" del arreglo b");
			b[i]=entrada.nextInt();
		}
		for(int i=0;i<c.length;i++){
			c[i]=a[i]+b[i];
		}
		System.out.println("| a | b | c |");
		for(int i=0;i<a.length;i++){
			System.out.println("| "+a[i]+" | "+b[i]+" | "+c[i]+" | ");
		}
	}
}