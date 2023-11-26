/*5.- Cuenta las vocales y las consonantes del String “Java Java Java”.
 ¡OJO CON LOS ESPACIOS!. Realícelo con una estructura cíclica for  y
 con forEach también. Es decir resuélvalo de las dos formas.*/
import java.util.*;
 public class quinto {
 	public static void main(String[] args) {
 		StringBuilder cadena = new StringBuilder("Java Java Java");
 		
 		byte cons =0;
 		byte vocales=0;

 		int as = 0;

 		for(int i = 0; i<cadena.length();i++){
 			as =( (int) cadena.charAt(i));
 			if(esVocal(as)) vocales++;
 			if(esConsonante(as)) cons++;
 		}
 		System.out.println("La frase: "+cadena.toString()+" \nTiene "+cons+" consonantes y "+vocales+" volcales");
 	}

 	public static boolean esVocal(int _as){
 		return Arrays.asList(65,97,69,101,73,105,79,111,85,117).contains(_as);
 		
 	}

 	public static boolean esConsonante(int _as){
 		return Arrays.asList(66,67,68,70,71,72,74,75,76,77,78,79,80,81,82,83,84,86,87,88,89,90,98,99,100,102,103,104,106,107,109,110,112,113,114,115,116,118,119,120,121,122).contains(_as);
 		
 	}
 }