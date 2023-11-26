public class Principal {
	public static void main(String[] args){
		String s = "cadena";
		long t1,t2;
		int n = 100000;

		System.out.println("Concatenar "+ n +" cadenas con String: ");
		t1=System.currentTimeMillis();
		concatenar(s,n);
		t2=System.currentTimeMillis();
		System.out.println((t2-t1)+" Milisegundos");

		System.out.println("Concatenar "+ n +" cadenas con StringBuilder");
		t1=System.currentTimeMillis();
		concatenar1(s,n);
		t2=System.currentTimeMillis();
		System.out.println((t2-t1)+" Milisegundos");

		System.out.println("Concatener "+n+" cadenas con StringBuilder Optimizado");
		t1=System.currentTimeMillis();
		concatenar2(s,n);
		t2=System.currentTimeMillis();
		System.out.println((t2-t1)+" Milisegundos");
	}

	public static String concatenar(String s, int n){
		String resultado = s;
		for(int i = 1;i<n;i++){
			resultado = resultado + s;
		}
		return resultado;
	}

	public static String concatenar1(String s, int n){
		StringBuilder resultado = new StringBuilder(s);
		for (int i = 1; i<n;i++){
			resultado.append(s);
		}
		return resultado.toString();
	}

	public static String concatenar2(String s, int n) {
		StringBuilder resultado = new StringBuilder(s.length()*n);
		for(int i = 0; i<n; i++){
			resultado.append(s);
		}
		return resultado.toString();
	}
}