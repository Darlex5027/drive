import java.util.Scanner;
public class ejercicio5{
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		System.out.println("-----Ejercicio con IF-ELSE-----");
		System.out.println("Condicional Doble");
		System.out.println("Verificar la altura.");
		System.out.print("Altura: ");
		float altura = sc.nextFloat();
		if (altura <1.65){
			System.out.println("Lo lamento eres chaparro");
		} else {
			System.out.println("Felicidades eres alto");
		}
		System.out.println("Hasta Pronto!");
	}
}