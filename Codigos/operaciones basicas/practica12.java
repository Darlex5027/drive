public class practica12{
	public static void main(String[] args) {
		int y=0,x= 5;

		System.out.println("x:"+x);
		System.out.println("y:"+y);
		x++;
		System.out.println("x++:"+x);
		x=5;
		x--;
		System.out.println("x--:"+x);
		y=x++;
		System.out.println("y=x++:"+y);
		y=0;
		y=++x;
		System.out.println("y=++x:"+y);
		y=0;
		y=x--;
		System.out.println("y=x--:"+y);
		y=0;
		y=--x;
		System.out.println("y=--x:"+y);
	}
}