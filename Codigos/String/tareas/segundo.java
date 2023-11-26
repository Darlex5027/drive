/*2.- Desmenuza el String “POO Java” mostrándolo por pantalla carácter a carácter. 
Realícelo con for y también con forEach. Es decir resuélvalo de las dos formas.*/
public class segundo {
	public static void main(String[] args) {
		long t1,t2;
		int n = 100000;
		//Declaramos la cadema
		final String cadena ="POO Java";

		//usando for:
		System.out.println("------Usando FOR-----");
		t1=System.currentTimeMillis();
		/*repetimos de acuerdo al tamaño del string, y con charAt obtenemos el
		digito que esté en la ubicación*/
		for (int i=0;i<cadena.length();i++ ) {
			System.out.println(cadena.charAt(i));	
		}
		t2=System.currentTimeMillis();
		System.out.println((t2-t1)+" Milisegundos");


		System.out.println("------Usando FOR-EACH-----");
		t1=System.currentTimeMillis();
		//Usando foreach convertimos primero el String en un char array
		char [] cadenachar = cadena.toCharArray();

		//Usamos el for each para recorrer dicho array imprimiendo cada una de sus posiciones
		for(char i: cadenachar){
			System.out.println(i);
		}
		t2=System.currentTimeMillis();
		System.out.println((t2-t1)+" Milisegundos");
	}
}
