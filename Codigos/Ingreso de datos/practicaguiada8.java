import java.util.Scanner;

public class practicaguiada8 {
	public static void contasena (){
		Scanner entrada = new Scanner (System.in);
		String cadena;
		char letra;
		int numero;
		float decimal;
		double decimaldouble;

		System.out.print("Digite un numero: ");
		numero = entrada.nextInt();
		System.out.print("\nDigite un numero con decimal: ");
		decimal = entrada.nextFloat();
		System.out.print("\nDigite un decimal doble: ");
		decimaldouble = entrada.nextDouble();
		System.out.print("\nDigite una cadena de texto: ");
		cadena = entrada.next();
		System.out.print("\nDigite un caracter: ");
		letra = entrada.next().charAt(0);

		System.out.println("Tu contraseña es: "+cadena+letra+numero+decimal+decimaldouble);

		
	}

	public static void datos (){
		Scanner entrada = new Scanner (System.in);
		String nombre, color;
		byte edad;
		float estatura;
		char genero;

		System.out.println("*****Captura de datos*****");
		System.out.println("Registra tu edad en años: ");
		edad = Byte.parseByte(entrada.next());
		System.out.println("Ingresa tu altura en metros: ");
		estatura = entrada.nextFloat();
		System.out.println("Digita tu genero en M o F: ");
		genero= entrada.next().charAt(0);
		System.out.println("Ingresa tu nombre completo: ");
		entrada.nextLine();
		nombre = entrada.nextLine();
		System.out.println("Ingresa tu color de piel: ");
		color = entrada.nextLine();
		
		System.out.println("**************"+
   						   "\n----Datos capturados----");
		System.out.println("Nombre: "+nombre+
							"\nEdad: "+edad+
							"\nEstatura: "+estatura+
							"\nColor de piel: "+color+
							"\nGenero: "+genero);
		
	}

	public static void vision (){
		Scanner entrada = new Scanner (System.in);
		System.out.println("¿Qué función desea usar?\n 1:Datos\n0:Contrasena\n45:Salir");
		
		int opcion = entrada.nextInt();
		if(opcion==0){
			contasena();
			vision();
			//return (true);
		}else if(opcion==1){
			datos();
			vision();
		//	return (true);
		}else if(opcion==45){
			System.out.println("Bye");
		//	return(false);
		}else{
			System.out.println("No es una opción disponible");
			vision();
		//	return (true);
		}
	}

	public static void main(String[] args){
		vision();
	}
		
}