//14. Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
import java.util.Scanner;
public class dowhile1{
	public static void main(String[] args) {
		int primo=2;

		do{
			int i=2;
			while (i<primo&&primo<100){
				if(primo%i==0){
					primo=primo+1;
					i=2;
				}
				i++;
			}
			System.out.println(primo);
			primo++;
		}while(primo<100);		
	}
		

}
