public class Vehiculo{
	protected String matricula;
	protected String marca;
	protected String modelo;

		public Vehiculo (String _matricula, String _marca, String _modelo){
			this.matricula=_modelo;	
			this.marca=_marca;
			this.modelo=_modelo;
		}

		public String getMatricula(){
			return matricula;
		}
		public String getMarca(){
			return matricula;
		}
		public String getModelo(){
			return modelo;
		}

		public String mostrarDatos(){
			return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo;
		}
}	
