public class java12{
	public static void main(String[] args) {
		int a=20, b=10,c=0, D=20, e=40, f=30;
        String x = "Gracias", y= "A ti";
        boolean bches = true;
        
        //Operador+y-
        System.out.println ("La suma de a + b = "+ (a+b));
        System.out.println("La resta de a - b = "+ (a-b));
        System.out.println("El resto de a % b = "+a%b);

        //Operar + aplicado a cadenas
        System.out.println("x + y= "+ (x+y));

        //Operador * y /
        System.out.println("La multiplicacion de a * b= "+(a*b));
        System.out.println("La division de a / b= "+ a/b);

        //Operador %
		System.out.println("El resto de a % b = "+a%b);    

		c=++a;
		System.out.println("Valor de c(++a) ="+c);

		c=b++;
		System.out.println("Valor de c(b++) ="+c);
	}
}