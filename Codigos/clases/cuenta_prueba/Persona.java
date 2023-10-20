public class Persona {
	private String nombre ="";
	private	int edad=0;
	private	String DNI="";
	private	char sexo='M';
	private	float peso=0;
	private float altura=0;

	public Persona (){	
	}
	public Persona (String _nombre, int _edad, char _sexo){
		this.nombre=_nombre;
		this.edad=_edad;
		comprobarSexo(_sexo);
	}
	public Persona (String _nombre, int  _edad,char _sexo, float _peso, float _altura){
		this.nombre=_nombre;
		this.edad=_edad;
		this.DNI=generaDNI();
		comprobarSexo(_sexo);
		this.peso=_peso;
		this.altura=_altura;
	}
	public boolean esMayorDeEdad(){
		boolean exit=false;
		if(edad>18)
			exit=true;
		if(edad<18)
			exit=false;		
		return exit;
	}
	public void comprobarSexo (char _sexo){
		if(_sexo=='F')
			this.sexo=_sexo;
	}

	@Override
	public String toString(){
		return "Nombre: "+nombre+"\nEdad: "+edad+"\nDNI: "+DNI+"\nSexo: "+sexo+"\nPeso: "+peso+"\nAltura: "+altura+"IMC: "+calcularIMC();					
	}
	public String generaDNI(){
		return ""+(int)(Math.random()*99999999+1);
	}

	public void setNombre(String _nombre){
		this.nombre=_nombre;
	}
	public void setEdad(int _edad){
		this.edad=_edad;
	}
	public void setSexo(char _sexo){
		comprobarSexo(_sexo);
	}
	public void setPeso(float _peso){
		this.peso=_peso;
	}
	public void setAltura(float _altura){
		this.altura=_altura;
	}			

	public int calcularIMC(){
		float imc=(peso/(altura*altura));
		int exit=0;
		if(imc<20)
			exit= -1;
		if(imc>=20&&imc<=25)
			exit= 0;
		if(imc>25)
			exit= 1;
		return exit;

	}
}
