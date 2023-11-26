public class Principal{
	public static void main(String[] args){
		Persona p1=new Persona("Juan", "Péres",false);
		Persona p2=new Persona("Karla", "Gonzales",false);
		Persona p3=new Persona();

		System.out.println("Nombre de p1: "+p1.getNombre());
		System.out.println("Estado objeto p2: "+p2);
		p2.setBorrado(true);
		System.out.println("Estado objeto p2: "+p2);

		System.out.println("Estado objeto p3: "+p3);

	}
}