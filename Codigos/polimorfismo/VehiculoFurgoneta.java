public class VehiculoFurgoneta extends Vehiculo{
	private int carga;

	public VehiculoFurgoneta(int carga, String martricula, String marca, String modelo){
		super(martricula,marca,modelo);
		this.carga=carga;
	}

	public int getCarga(){
		return carga;
	}

	@Override
	public String mostrarDatos(){
		return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+"\nCarga"+carga;
	}
}