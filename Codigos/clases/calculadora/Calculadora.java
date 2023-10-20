import java.util.Scanner;
public class Calculadora{
	Scanner entrada=new Scanner(System.in);
	float n1=0;
	float n2=0;
	float n3=0;

	public void menu(){
		int i=0;
		do{
			System.out.println("1)Sumar\n");
			System.out.println("2)Restar\n");
			System.out.println("3)Dividir\n");
			System.out.println("4)Multiplicar\n");
			System.out.println("5)Potenciaciòn\n");
			System.out.println("6)Salir\n");	
			
			i=entrada.nextInt();
			if(i!=6)
				leer();
			if(i==1)
				suma();
			if(i==2)
				resta();
			if(i==3)
				dividir();
			if(i==4)
				multiplicar();
			if(i==5)
				potenciacion();

		}while(i!=6);
		
		
	}
	public void leer(){
		System.out.println("Digita el nùmero 1:");
		this.n1=entrada.nextFloat();
		System.out.println("Digita el nùmero 2:");
		this.n2=entrada.nextFloat();
	}
	public void suma(){
		n3=n1+n2;
		mostrarResultado('+',n3);
	}
	public void resta(){
		n3=n1-n2;
		mostrarResultado('-',n3);
	}
	public void dividir(){
		if(n2==0){
			System.out.println("No se puede dividir entre 0, intente de nuevo");
			leer();
			dividir();
		}else{
			n3=n1/n2;
			mostrarResultado('/',n3);
		}
	}
	public void multiplicar(){
		n3=n1*n2;
		mostrarResultado('*',n3);
	}
	public void potenciacion(){
		double nn1=n1;
		double nn2=n2;
		n3=(float) Math.pow(nn1,nn2);
		mostrarResultado('^',n3);
	}
	public void mostrarResultado(char op,float resul){
		System.out.println("El resultado de "+n1+op+n2+"es: "+resul);
	}
	
}
