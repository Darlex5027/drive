/*4.-  Elimina los espacios del texto: “Hola mundo cruel Java”,
realícelo con un for,  también con el método replace() y 
con replaceAll(). Es decir resuélvalo de las tres formas.*/

public class cuarto {
	public static void main(String[] args) {
		String cadena ="Hola mundo cruel Java";
		String cadena_vacia="";
		for(int i=0;i<cadena.length();i++){
			if(cadena.charAt(i)==' '){
				continue;
			}
			cadena_vacia=cadena_vacia+cadena.charAt(i);
		}
		System.out.println(cadena_vacia);


		System.out.println("\n"+cadena.replace(" ",""));

		System.out.println("\n"+cadena.replaceAll(" ",""));		

	}
}