/*7.- Transforma la cadena de texto “programadores" a mayúsculas.
Guarda el valor en la variable cadena y posteriormente
conviértela nuevamente a minúsculas.*/

public class septimo{
	public static void main(String[] args) {
		String cadena = "programadores";
		System.out.println(cadena);
		StringBuilder mayus = new StringBuilder (cadena.toUpperCase());
		System.out.println(mayus);
		StringBuilder minus = new StringBuilder (cadena.toLowerCase());
		System.out.println(minus);
	}
}