public class practicaguiada6 {
	public static void main (String[] args){
		//Declaraciones enteros
		Integer enterob,enteroa; 
		Boolean igualdad;
		String frase; 

		enterob = 10;
		enteroa = 10;
		frase = "Si lo puedes imaginar, lo puedes programar. <3\n No hace falta correr tanto, vamos lento despacio, pero entendamos lo que hacemos.";
		igualdad = enterob.equals(enteroa);

		System.out.println("Integer: "+enterob+
							"\nString: "+frase+
							"\nBoolean: "+igualdad);
	}
}