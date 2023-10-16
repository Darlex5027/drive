//declarar arreglo tipo char de dimensión 5, cada posición tendrá una letra, imprimir la posición y el contenido 
import java.util.Scanner;
public class prueba{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int [] nums = new int[10];




		//declaramos el arreglo de tipo caracter
		char [] lista=new char[5];

		//llenamos el arreglo anterior
		for (int i=0; i<lista.length;i++){
			/*obtener un número aleatorio entre 0.0 y 1.0, lo multiplicamos por 255,
			 lo convertimos a entero, así obtenemos el codigo ASCII y luego lo convertimos
			  en su caracter          
			*/
			lista[i]= (char) ((int) (Math.random()*255));
		}


		System.out.println("Los datos del Arreglo lista son:");
		int p =0;
		//Usamor un foreach para recorrer los valores del arreglo de caracteres e imprimirlos
		for (char x : lista){
			System.out.println("Lista["+p+"]: "+x);
			p++;
		}

		//Usamor un for para vaciar el arreglo de caracteres
		for (int i=0; i<lista.length;i++){
			lista[i]=' ';
		}
		
		//Imprimimos el arreglo de caracteres vaciado
		System.out.println("\n\nLos datos del Arreglo lista se han vaciado");
		p=0;
		for (char x : lista){
			System.out.println("Lista["+p+"]: "+x);
			p++;
		}
	
		//Creamos un arreglo tipo float de 6 posiciones
		float [] numero = new float[6];

		//le asignamos un valor aleatorio a entre 0 y 100 a cada posición del arreglo
		for (int i=0; i<numero.length;i++){
			numero[i]= (float) (Math.random()*100);
		}

		//Desplegamos los valores del arreglo numero[]
		System.out.println("\n\nLos datos del Arreglo numero son:");
		p=0;
		for (float x : numero){
			System.out.println("numero["+p+"]: "+x);
			p++;
		}

		System.out.println("\n\n");
		
		//obtenermos e imprimimos la suma de numero[0]+numero[5]
		float y = numero[0]+numero[5];
		System.out.println("numero[0]+numero[5]: "+y);
		//asignamos el valor de numero[1]-numero[4] a numero[0]
		numero[0]=numero[1]-numero[4];
		//asignamos el valor de numero[2]*numero[3] a numero[5]
		numero[5]=numero[2]*numero[3];
		
		//desplegaos los nuevos valores
		p=0;
		for (float x : numero){
			System.out.println("numero["+p+"]: "+x);
			p++;
		}		


		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("solicitamos los datos para el arreglo");
		for(int i=0;i<nums.length;i++){
			System.out.println("Dame el dato #"+(i+1)+" del arreglo");
			nums[i]=entrada.nextInt();
		}

		for(int i=0;i<nums.length;i++){
			System.out.println(nums[i]);
		}

	}
}