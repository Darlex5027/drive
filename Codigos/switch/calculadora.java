import java.util.Scanner;
public class alumno {
	public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			int opcion=0;
			float num1, num2, resultado;
			for (int i=0;opcion!=5;) {
					System.out.println("----Calculadora");
					System.out.println("Escoge una opción: \n1)Sumar" +
														"\n2)Restar"+
														"\n3)Multiplicar"+
														"\n4)Dividir"+
														"\n5)Salir");
					opcion=entrada.nextInt();
					
					switch (opcion){
							case 1:
								System.out.println("Digita el primer numero: ");
					num1=entrada.nextFloat();
					System.out.println("Digita el segundo numero: ");
					num2=entrada.nextFloat();
								System.out.println("La suma es: "+(num1+num2));
								break;
							case 2:
								System.out.println("Digita el primer numero: ");
					num1=entrada.nextFloat();
					System.out.println("Digita el segundo numero: ");
					num2=entrada.nextFloat();
								System.out.println("La resta es: "+(num1-num2));
								break;
							case 3:
								System.out.println("Digita el primer numero: ");
					num1=entrada.nextFloat();
					System.out.println("Digita el segundo numero: ");
					num2=entrada.nextFloat();
								System.out.println("La multiplicación es: "+(num1*num2));
								break;
							case 4:
								System.out.println("Digita el primer numero: ");
					num1=entrada.nextFloat();
					System.out.println("Digita el segundo numero: ");
					num2=entrada.nextFloat();
								System.out.println("La división es: "+(num1/num2));
								break;
							default:
								break;
					}

			}

	}
}