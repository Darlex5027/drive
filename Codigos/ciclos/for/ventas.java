import java.util.Scanner;
public class ventas {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n;
		float sueldo, v=0;

		System.out.println("Digita tu sueldo base:");
		sueldo = entrada.nextInt();
		System.out.println("Cuantas ventas realizó?");
		n = entrada.nextInt();
		for (int i=0;i<n;i++){
			System.out.println("Digita la venta N."+(i+1));
			v+=entrada.nextFloat();
		}
		System.out.println("Tus comisiones suman: "+((v)*.10));
		System.out.print("Tu total es:"+(sueldo+((v)*.10)));


	}
}