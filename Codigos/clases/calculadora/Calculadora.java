import java.util.Scanner;
public class Calculadora{
	Scanner entrada=new Scanner(System.in);
	private String _n1;
	private String _n2;

	private float n1=0;
	private	float n2=0;
	private	float n3=0;

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
	
	public boolean IsNumeric(String _cadena){
		try{
			Float.parseFloat(_cadena);
			return true;
		}catch(NumberFormatException exception){

			return false;
		}
	}

	public void leer(){
		leer1();
		leer2();
	}

	public void leer1(){
		System.out.println("Digita el primer nùmero");
		this._n1=entrada.next();
		if(!IsNumeric(_n1)){
			leer1();
		}
		if(IsNumeric(_n1)){
			this.n1=Float.parseFloat(this._n1);
			leer2();	
		}

	}

	public void leer2(){
		System.out.println("Digita el segundo nùmero");
		this._n2=entrada.next();
		if(!IsNumeric(_n2)){
			leer2();
		}
		if(IsNumeric(_n2)){
			this.n2=Float.parseFloat(this._n2);
		}
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
			System.out.println("El segundo nùmero no puede ser igual a 0 en una divisiòn");
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
