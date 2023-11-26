import java.util.Scanner;
public class tortillas {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float sueldo, v1,v2,v3;

		System.out.println("Digita tu sueldo base:");
		sueldo = entrada.nextInt();
		System.out.println("Digita la venta 1:");
		v1 = entrada.nextInt();
		System.out.println("Digita la venta 2:");
		v2 = entrada.nextInt();
		System.out.println("Digita la venta 3:");
		v3 = entrada.nextInt();
		System.out.print("Tu total es:"+(sueldo+((v1+v2+v3)*10));


	}
}