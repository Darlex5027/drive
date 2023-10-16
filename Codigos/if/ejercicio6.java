import java.util.Scanner;
public class ejercicio6{
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		System.out.println("-----Ejercicio con IF-ELSE-----");
		System.out.println("Condicional Doble");
		System.out.println("Verificar la contraseña.");
		System.out.print("Contraseña: ");
		String pass = sc.next();
		if ( pass.equals("solrac")){
			System.out.println("Felicidades conoces la contraseña");
		} else {
			System.out.println("Lo lamento no sabes la contraseña");
		}
		System.out.println("Hasta Pronto!");
	}
}