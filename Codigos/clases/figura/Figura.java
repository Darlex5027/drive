import java.util.Scanner;

public class Figura{
	//Atributos
	Scanner entrada = new Scanner(System.in);

	float lado;
	float lado2;
	float apotema;
	float base;
	float altura;
	float area;
	float perimetro;

	//Metodos
	public void Menu(){
		int op=0;
		System.out.println("1)Triangulo");
		System.out.println("2)Cuadrado");
		System.out.println("3)Rectangulo");
		System.out.println("4)Pentagono");
		System.out.println("5)Hexagono");
		System.out.println("6)Salir");
		op=entrada.nextInt();
		
		if(op==6) System.exit(0);
		if(op>6||op<1){
			System.out.println("No es un opciòn valida");
			this.Menu();
		}				
		if(op>=1||op<=6) leer(op);
	}

	public void leer(int _op){
		System.out.println("Digita el tamaño de la base:");
		this.lado=entrada.nextFloat();
		if(_op==3){
			System.out.println("Digita el tamaño de la altura:");
			this.lado2=entrada.nextFloat();	
			this.perimetro=(lado*2)+(lado2*2);
			this.area=lado*lado2;
		}	
		if(_op==1){
			
		}
	}


}
