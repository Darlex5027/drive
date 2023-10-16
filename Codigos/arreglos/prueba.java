import java.util.Scanner;
public class prueba{
	public static void main(String[] args) {

		
		Scanner entrada = new Scanner(System.in);
		int [] lista=new int[10000000];

		for (int z =0;z<entrada.nextInt();z++){
			lista[z]=(int) (Math.random() * 50 + 1);
		}
		for(int v : lista){
			System.out.println(v);
		}	
	}
}