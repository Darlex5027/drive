/*6.- Divide la cadena de texto “Programación en Java”
en dos partes “Programación” y “en Java”. Para 
posteriormente concaténalas y mostrarlas de nuevo.*/

public class sexto {
	public static void main(String[] args) {
		String cadena = "Programación en Java";
		int i=0;

		for( i=0; i<cadena.length();i++){
			if(cadena.charAt(i)==' ') break;
		}

		StringBuilder cadena2 = new StringBuilder(cadena.substring(0,i-1));
		StringBuilder cadena3 = new StringBuilder(cadena.substring(i+1,cadena.length()));
		cadena2.append(cadena3);

		System.out.println(cadena2.toString());


	}
}