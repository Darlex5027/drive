import java.util.Scanner;
public class pruebaexcepciones{
	static int num1=5,num2=0;
	public static void main(String[] args) {
		
		error();

	}

	public static void error(){
		try{
			System.out.println(num1+"/"+num2+"="+num1/num2);
		}catch (Exception e){
			System.out.println(e);
			System.out.println("intanta de nuevo cambiando el número 2");
			Scanner entrada = new Scanner(System.in);
			try{
				num2=entrada.nextInt();
				error();
			}catch(Exception x){
				System.out.println(x);
				error();
			}
			
		}
	}
}