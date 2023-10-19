public class Persona {
	private String nombre ="";
	private	byte edad=0;
	private	String DNI="";
	private	char sexo='M';
	private	float peso=0;
	private float altura=0;

	public Persona (){
	}
	public Persona (String _nombre, byte _edad, char _sexo){
		this.nombre=_nombre;
		this.edad=_edad;
		comprobarSexo(_sexo);
	}
	public Persona (String _nombre, byte _edad, String DNI,char _sexo, float _peso, float _altura){
		this.nombre=_nombre;
		this.edad=_edad;
		this.DNI=DNI;
		comprobarSexo(_sexo);
		this.peso=_peso;
		this.altura=_altura;
	}
	public boolean esMayorDeEdad(){
		if(edad>18)
			return true;
		if(edad<18)
			return false;		
	}
	public void comprobarSexo (char _sexo){
		if(_sexo=='F')
			this.sexo=_sexo;
	}

	public String toString(){
	
	}
		
}
