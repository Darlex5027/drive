public class Gato{
	private int patas;
	private String name;

	//Setter
	public void setPatas(int _patas){
		if(_patas>=0&&_patas<=4){
			this.patas= _patas;
		}
		throw new IllegalArgumentException("El nùmero de patas debe ser igual o mayor a 0 e igual o menor a 4");
	}
	public void setName(String _name){
		this.name=_name;
	}
	//Setter
	public int getPatas(){
		return this.patas;
	}
	public String getName(){
		return this.name;
	}
}
