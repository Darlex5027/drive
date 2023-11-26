/*Sobre la cadena de texto “Jeve jeve jeve”, sustituye/reemplaza todas las vocales
por la vocal 'a' dando como resultado “Java java java”. Realícelo utilizando un 
for, con un forEach y con replace. Es decir resuélvalo de las tres formas.*/
import java.util.*;
public class noveno {
	public static boolean esVocal(int _as){
 		return Arrays.asList(65,97,69,101,73,105,79,111,85,117).contains(_as);
 		
 	}

	public static void main(String[] args) {
		StringBuilder cadenafor = new StringBuilder ("Jeve jeve jeve");
		for(byte i = 0; i<cadenafor.length();i++){
			if(esVocal(cadenafor.charAt(i))) cadenafor.setCharAt(i,'a');
		}
		System.out.println(cadenafor.toString());

		StringBuilder cadenaforeach = new StringBuilder ("Jeve jeve jeve");
		char [] cadenaforeacharray = cadenaforeach.toString().toCharArray();

		int y=0;
		for(char x: cadenaforeacharray){
			if(esVocal(x)) cadenaforeach.setCharAt(y,'a');
			y++;
		}
		System.out.println(cadenaforeach);


		StringBuilder cadenareplace = new StringBuilder("Jeve jeve jeve");
		for(byte i = 0; i<cadenareplace.length();i++){
			if(esVocal(cadenareplace.charAt(i))){
				cadenareplace.replace(i,i+1,"a");
			}
		}
		System.out.println(cadenareplace);

	}
}