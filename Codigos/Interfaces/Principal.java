public class Principal{
	public static void main(String[] args) {
		Carro c = new Carro();

		Bicicleta b = new Bicicleta();

		c.avanzar();
		b.avanzar();

		c.detenerse();
		b.detenerse();

		c.sentarse();
		b.sentarse();
	}
}