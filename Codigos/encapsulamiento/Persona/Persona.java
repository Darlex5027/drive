public class Persona {
	public Persona(){
	}

	public Persona (String nombre, String apellidos, boolean borrado){
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.borrado= borrado;
	}

	private String nombre;
	private String apellidos;
	private boolean borrado;

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public String getApellidos(){
		return apellidos;
	}

	public void setApellidos(String apellidos){
		this.apellidos=apellidos;
	}

	public boolean isBorrado(){
		return borrado;
	}

	public void setBorrado(boolean borrado){
		this.borrado =borrado;
	}

	@Override
	public String toString(){
		return "Persona{"+"nombre="+nombre+", apellidos="+apellidos+",borrado="+borrado+'}';
	}
}