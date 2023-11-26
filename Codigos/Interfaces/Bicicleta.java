public class Bicicleta implements Rueda,Silla{
	
	public Bicicleta(){

	}

	public void avanzar (){
		System.out.println("La bicicleta avanza");
	}

	public void detenerse(){
		System.out.println("La bicicleta se detiene");
	}

	public void sentarse(){
		System.out.println("La bicicleta está sentada");
	}
}