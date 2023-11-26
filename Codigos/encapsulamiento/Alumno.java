public class Alumno{
	//Atributos
	private int noControl;
	private String email;
	public String nombre, apellidos;

	//Setter
	public void setNoControl(int NC){
		this.noControl=NC;
	}

	public void setEmail(String EM){
		this.email=EM;

	}

	//Getter
	public int getNoControl(){
		return noControl;
	}

	public String getEmail(){
		return this.email;
	}

	public void verDatos(){
		System.out.println("No. de Control: "+noControl);
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellidos: "+ apellidos);
		System.out.println("Email: "+email);
	}
}