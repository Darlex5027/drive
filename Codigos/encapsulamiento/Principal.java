public class Principal{
	public static void main(String[] args){
		Alumno alu1 = new Alumno();

		alu1.setNoControl(12345);
		alu1.nombre="Juan";
		alu1.apellidos="Pérez Lopéz";
		alu1.setEmail("jhon@gmail.com");
		alu1.verDatos();
		System.out.println("Accediendo al No. de Control "+ alu1.getNoControl() +" Que es privado");

	}
}