public class Persona{
	String nombre;
	int edad;

	public Persona (String _nombre, int _edad){
		nombre = _nombre;
		edad = _edad;
	}

	public void mostrarDatos(){
		System.out.println("El nombre es:"+nombre);
		System.out.println("La edad es:" +edad);
	}
}
