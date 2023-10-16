import java.util.Scanner;
public class matrizletras{
	public static class Menu{
		Scanner entrada = new Scanner (System.in);
		int [][] a = new int [3][3];
		boolean creada=false;
		int op=0;
		public void men(){
			
			System.out.println("1)Registrar");
			System.out.println("2)Buscar");
			System.out.println("3)Actualizar");
			System.out.println("4)Eliminar");
			System.out.println("5)Imprimir");
			System.out.println("6)Imprimir invertida");
			System.out.println("7)Imprimir invertida transpuesta");
			System.out.println("8)Salir");
			op=entrada.nextInt();
			if(op!=1&&!creada){
				System.out.println("Aún no haz creado una matriz");
				men();
			}else{
			switch (op){
				case 1:
					registrar();
					men();
					break;
				case 2:
					buscar();
					men();
					break;
				case 3:
					actualizar();
					men();
				case 4:
					eliminar();
					men();
					break;
				case 5:
					imprimir();
					men();
					break;
				case 6:
					imprimir2();
					men();
					break;
				case 7:
					imprimir3();
					men();
					break;
				case 8:
					salir();
					break;
				default:
					System.out.println("Esta opción no está disponible");
					men();
					break;
				}
			}
		}
		public void registrar(){
			System.out.println("Leer datos para la matriz a");
        
       		//Metemos datos a la matriz a
        	for (int fila = 0; fila <a.length; fila++) {
            	for (int columna = 0; columna <a[0].length; columna++) {
                	System.out.printf("a ["+fila+"]["+columna+"]= ");
                	a [fila] [columna] = entrada.nextInt();
            	}
        	}
        	System.out.println("Matriz creada correctamente");
        	creada=true;

		}
		public void buscar(){
			System.out.println("Qué dato deseas buscar?");
			int algo = entrada.nextInt();
			int fila, columna;
        	boolean c=false;
       		//Metemos datos a la matriz a
        	for (fila = 0; fila <a.length; fila++) {
            	for (columna = 0; columna <a[0].length; columna++) {
                	if(a[fila][columna]==algo)
            			c=true;
            			System.out.println("Si existe el dato dentro de la matriz registrada");
            			System.out.println("Su posición es: matriz["+fila+"]["+columna+"]");
                		break;
            	}
        	}	
        	if(!c)
        		System.out.println("No existe el dato dentro de la matriz registrada");

		}
		public void actualizar(){
			int f,c;
			System.out.println("Qué fila deseas editar?");
			f=entrada.nextInt();
			System.out.println("Qué columna deseas editar?");
			c=entrada.nextInt();
			if((f>a.length)||(c>a[0].length)){
				System.out.println("La matriz es más pequeña que ese rango");
			}else{
				System.out.println("Con qué cantidad deseas sustituir el dato: "+a[f][c]);
				a[f][c]=entrada.nextInt();
				System.out.println("Dato sustituido correctamente");
			}			
		}
		public void eliminar(){
			int f,c;
			System.out.println("Qué fila deseas eliminar?");
			f=entrada.nextInt();
			System.out.println("Qué columna deseas eliminar?");
			c=entrada.nextInt();
			if((f>a.length)||(c>a[0].length)){
				System.out.println("La matriz es más pequeña que ese rango");
			}else{
				a[f][c]=0;
				System.out.println("Dato eliminado correctamente");
			}		
		}

		public void imprimir(){
			for(int fila=0;fila<a.length;fila++){
				for(int columna=0;columna<a[0].length;columna++){
					System.out.printf(a[fila][columna]+" ");
				}
				System.out.println();
			}
		}
		public void imprimir2(){
			for(int fila=a.length-1;fila>=0;fila--){
				for(int columna=a[0]-1.length;columna>=0;columna--){
					System.out.printf(a[fila][columna]+" ");
				}
				System.out.println();
			}	
		}
		public void imprimir3(){
			for(int fila=a.length-1;fila>=0;fila--){
				for(int columna=a[0].length-1;columna>=0;columna--){
					System.out.printf(a[columna][fila]+" ");
				}
				System.out.println();
			}	
		}
		public void salir(){
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		Menu val = new Menu();
		val.men();
	}
}