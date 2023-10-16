public class while3{
	public static void main(String[] args) {
		int fahrenheit=10;
		double celsius;
		System.out.printf("°F \t °C \n");
		System.out.println("------------------");
		while (fahrenheit <= 100){
			celsius = (fahrenheit-32)*5/9.0;
			System.out.printf("%3d\t%6.2f\n", fahrenheit,celsius);
			fahrenheit+=10;
		}

	}
}