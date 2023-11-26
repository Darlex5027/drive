/*1.- Muestra la longitud del texto: “Curso POO en Java!”,
utilizando cualquier estructura cíclica (for, do-while, while)
para el conteo de los caracteres y también con length(). 
Es decir resuélvalo de las dos formas. */

public class primero{
	public static void main(String[] args) {
		StringBuilder cadena = new StringBuilder("Cursos POO en Java");
		int i=0;
		//for
		for(i=0;i>-1;i++){
			try{
				cadena.charAt(i);
			} catch (Exception e) {
				break;
			}
		}
		System.out.println("La longitud de la cadena es: " +i);
		//do-while
		i=0;
		do{
			try{

				cadena.charAt(i);
				i++;
			} catch (Exception e) {
				break;
			}
		}while(true);

		System.out.println("La longitud de la cadena es: " +i);
		//while
		i=0;
		while(true){
			try{

				cadena.charAt(i);
				i++;
			} catch (Exception e) {
				break;
			}
		}

		System.out.println("La longitud de la cadena es: " +i);
		//length
		System.out.println("La longitud de la cadena es: " +(cadena.length()));
	}
}