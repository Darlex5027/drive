public class Calculadora{
	float n1=0;
	float n2=0;
	float n3=0;

	public void suma(){
		n3=n1+n2;
		mostrarResultado('+',n3);
	}
	public void resta(){
		n3=n1-n2;
		mostrarResultado('-',n3);
	}
	public void dividir(){
		n3=n1/n2;
		mostrarResultado('/',n3);
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
