public class Estudiante extends Persona{
	private int codigoEstudiante;
	private float notaFinal;
	
	public Estudiante (String nombre, String apellidos, int edad, int codigoEstudiante, float notaFinal){
		super(nombre, apellidos, edad);
		this.codigoEstudiante=codigoEstudiante;
		this.notaFinal=notaFinal;	
	}

	public void mostrarEstudinte(){
		System.out.println("------Datos del Estudiante------");
		System.out.println("Nombre: "+getNombre()+
					"\nApellidos: "+getApellidos()+
					"\nEdad: "+getEdad()+
					"\nCodigo de Estudiante: "+ codigoEstudiante+
					"\nNota Final: "+ notaFinal);
	}
}
