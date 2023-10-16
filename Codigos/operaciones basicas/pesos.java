import java.util.Scanner;
public class pesos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n;
		double gramos, toneladas, libras;

		System.out.println("Cuantos kilos pesas");
		n = entrada.nextInt();
		gramos=n*1000;
		toneladas=0.001*n;
		libras=n*2.204;

		System.out.println("gramos: "+gramos+
							"\ntoneladas: "+toneladas+
							"\nlibras: "+libras);
		


	}
}