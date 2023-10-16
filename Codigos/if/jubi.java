import java.util.Scanner;
public class jubi {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int edad, antiguedad;

		System.out.println("Digita tu edad:");
		edad = entrada.nextInt();
		System.out.println("Digita tu antiguedad:");
		antiguedad = entrada.nextInt();

		if(edad>60){
			if(antiguedad>25){
				System.out.println("Edad");				
			}else{
				System.out.println("Antiguedad joven");
			}else{
				System.out.println("Antiguedad adulta");
			}
		}

	}
}