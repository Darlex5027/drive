public class practicaguiada5 {
	public static void main (String[] args){
		//Declaraciones enteros
		byte enterob; //-128 a 127
		short enteros; //-32.768 a 32767
		int enteroi;//-2,147,486,648 a 2,14,748,3647
		long enterol; //9,223,372,036,854,775,808 a 9,223,372,854,775,807

		//Declaraciones de decimales
		float decimal; //1.4e-045 a 3.4e+038
		double decimald; //4.9e-324 a 1.8e+308

		//Declaraciones de caracteres
		char caracter;

		//Declaración de boolean
		boolean decision;

		//asignación de valores enteros
		enterob =12;
		enteros = 23456;
		enteroi = 12345656;
		enterol = 92233728;

		//asignación de valores decimales
		decimal = 3.45f;
		decimald= 3.45647897123167;

		//asiganción de valores tipo caracter
		caracter ='a';

		//asignación de valores boolean
		decision = true;

		System.out.println("Byte: "+enterob+
							"\nShort: "+enteros+
							"\nInt: "+enteroi+
							"\nLong: "+enterol+
							"\nDecimal: "+decimal+
							"\nDouble: "+decimald+
							"\nCaracter: "+caracter+
							"\nBoolean: "+decision);
	}
}