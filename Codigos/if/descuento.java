import java.util.Scanner;
public class descuento{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float subtotal = 0;
		System.out.println("Ingresa tu subtotal:");
		subtotal= entrada.nextFloat();
		if(subtotal>5000){
			System.out.println("Tu total es:"+(subtotal*.7f));
		}else if(subtotal>3000){
			System.out.println("Tu total es:"+(subtotal*.8f));
		}else if(subtotal>1000){
			System.out.println("Tu total es:"+(subtotal*.9f));
		}else{
			System.out.println("Tu total es:"+(subtotal));
		}
		System.out.println("Hasta luego");
	}
}