/*10.- Transforma los caracteres del String: “ABCD” a ASCII. 
Hágalo utilizando un ciclo  for (forma tradicional) y también con forEach.*/

public class decimo{
	public static void main(String[] args) {
		String cadena = "ABCD";
		StringBuilder nuevacadena = new StringBuilder();
		for (int i = 0;i<cadena.length();i++){
			nuevacadena.append((int) cadena.charAt(i));
		}

		System.out.println(nuevacadena.toString());

		char [] chararray = cadena.toCharArray();
		for(char x: chararray){
			System.out.print((int) x);
		}
	}
}