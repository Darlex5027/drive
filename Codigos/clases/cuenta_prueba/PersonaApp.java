import java.util.Scanner;
public class PersonaApp{
	public static void main (String[] args){
		Scanner entrada = new Scanner(System.in);
		String nombre ="";
		byte edad=0;
		char sexo='c';
		float peso =0;
		float altura=0;

		System.out.println("Ingresa el nombre");
		nombre=entrada.next();
		System.out.println("Ingresa la edad");
		edad=entrada.nextByte();	
		System.out.println("Ingresa el sexo M/F");
		sexo=entrada.next().charAt(0);
		System.out.println("Ingresa el peso");
		peso=entrada.nextFloat();
		System.out.println("Ingresa la altura");
		altura=entrada.nextFloat();
		
		Persona p1 = new Persona(nombre,edad,sexo,peso,altura);
		Persona p2 = new Persona(nombre,edad,sexo);
		Persona p3 = new Persona();
		p3.setNombre("Arturo");
		p3.setEdad(27);
		p3.setSexo('M');
		p3.setPeso(67.5f);
		p3.setAltura(1.75f);
		p3.generaDNI();

		System.out.println("Persona 1 es mayor de edad?: "+p1.esMayorDeEdad());
		System.out.println("Persona 2 es mayor de edad?: "+p2.esMayorDeEdad());
		System.out.println("Persona 3 es mayor de edad?: "+p3.esMayorDeEdad());

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);		
	}
}
