public class Carro implements Rueda,Silla{
	public Carro(){

	}

	public void avanzar(){
		System.out.println("El carro avanza");
	}

	public void detenerse(){
		System.out.println("El carro se detiene ");
	}

	public void sentarse(){
		System.out.println("El auto está sentado");
	}

}