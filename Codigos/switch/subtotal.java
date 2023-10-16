import java.util.Scanner;
public class alumno {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float subtotal;
		int opcion=4;
		System.out.println("Cual es el subtotal?");
		subtotal = entrada.nextInt();
		if(subtotal>5000)
			opcion=1;
		if(subtotal>3000&&subtotal<=5000)
			opcion=2;
		if(subtotal>1000&&subtotal<=3000)
			opcion=3;

		switch (opcion){
			case 1:
				System.out.println("Se le da un descuento del 30%, tu total es: "+(subtotal*.7f));
				break;
			case 2:
				System.out.println("Se le da un descuento del 20%, tu total es: "+(subtotal*.8f));
				break;
			case 3:
				System.out.println("Se le da un descuento del 10%, tu total es: "+(subtotal*.9f));
				break;
			default:
				System.out.println("No hay descuentos disponibles, tu total es: "+subtotal);
		}
		System.out.println("Hasta Pronto!");
	}
}