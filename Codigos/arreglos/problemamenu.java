import java.util.Scanner;
public class problemamenu{
	public static class alumno{
		int matricula = 0;
		String nombre = " ";
		float p1=0; 
		float p2=0;
		float p3=0;
		float prom = 0;

		/*Setter*/
		public void setMatricula(int valor){
			matricula = valor;
		}

		public void setNombre(String valor){
			nombre = valor;
		}

		public void setP1(float valor){
			p1= valor;
		}

		public void setP2(float valor){
			p2= valor;
		}

		public void setP3(float valor){
			p3= valor;
		}

		public void setProm(){
			prom = (p1+p2+p3)/3;
		}

		/*Getter*/

		public int getMatricula(){
			return(matricula);
		}

		public String getNombre(){
			return(nombre);	
		}

		public float getP1(){
			return(p1);
		}

		public float getP2(){
			return(p2);
		}

		public float getP3(){
			return(p3);
		}

		public float getProm(){
			return(prom);
		}
	}


	public static class menu{
		int i=0;
		public void listar(){
			for(int i=0;i<alumno.length;i++){
				if(!(imprimir(i).equals("")))
				System.out.printf(imprimir(i));
			}
		}
		public void men (){
			System.out.println("1) Buscar alumno");
			System.out.println("2) Actualizar alumno");
			System.out.println("3) Borrar alumno");
			System.out.println("4) Listar alumnos");
			System.out.println("5) Salir");
			switch (entrada.nextInt()){
				case 1:
					System.out.println("Ingresa la matricula que quieres buscar");
					System.out.println(buscar(entrada.nextInt())); 
					men();
					break;
				case 2:
					System.out.println("Ingresa la matricula que quieres actualizar");
					System.out.println(actualizar(entrada.nextInt())); 
					men();
					break;
				case 3:
					System.out.println("Ingrese la matricula que desea eliminar:");
					System.out.println(borrar(entrada.nextInt()));
					men();
					break;
				case 4:
					listar();
					men();
					break;
				case 5:
					System.exit(0);
					break;
				default:
					System.out.println("Opción no validad");
					men();
					break;

			}
		}
		public String borrar(int dato){
			for(i=0;i<alumno.length;i++){
				if(alumno[i].getMatricula()==dato)
					break;
			}

			
			for(int z=i;z<alumno.length-1;z++){
				alumno[z].setMatricula(alumno[z+1].getMatricula());
				alumno[z].setNombre(alumno[z+1].getNombre());
				alumno[z].setP1(alumno[z+1].getP1());
				alumno[z].setP2(alumno[z+1].getP2());
				alumno[z].setP3(alumno[z+1].getP3());
				alumno[z].setProm();
			}	
			i++;
			alumno[i].setMatricula(0);
			alumno[i].setNombre("");
			alumno[i].setP1(0.0f);
			alumno[i].setP2(0.0f);
			alumno[i].setP3(0.0f);
			alumno[i].setProm();

			return("Alumno: "+dato+" eliminado correctamente");

		}
		public String buscar(int dato){
			for(i=0;i<alumno.length;i++){
				if(alumno[i].getMatricula()==dato)
					break;
			}
			return(imprimir(i));
		}
		public String actualizar(int dato){
			int i=0;
			for(i=0;i<alumno.length;i++){
				if(alumno[i].getMatricula()==dato)
					break;
			}
			return(registrar(i));
		}

		public String imprimir(int i){
			if(!(alumno[i].getMatricula()==0))
				return("|"+alumno[i].getMatricula()+" | "+alumno[i].getNombre()+" | "+alumno[i].getP1()+" | "+alumno[i].getP2()+" | "+alumno[i].getP3()+" | "+alumno[i].getProm()+" | \n");
			return("");
		}

		public String registrar(int i){
			alumno[i]=new alumno();
			System.out.println("Ingresa la matricula del alumno N°:"+(i+1)+" ");
			alumno[i].setMatricula(entrada.nextInt());
			System.out.println("Ingresa la nombre del alumno N°:"+(i+1)+" ");
			entrada.nextLine();
			String algo = "";
			algo = entrada.nextLine();
			alumno[i].setNombre(algo);
			System.out.println("Ingresa la calificación del parcial 1 del alumno N°:"+(i+1)+" ");
			alumno[i].setP1(entrada.nextFloat());
			System.out.println("Ingresa la calificación del parcial 2 del alumno N°:"+(i+1)+" ");
			alumno[i].setP2(entrada.nextFloat());
			System.out.println("Ingresa la calificación del parcial 3 del alumno N°:"+(i+1)+" ");
			alumno[i].setP3(entrada.nextFloat());
			alumno[i].setProm();
			return("Alumno actualizado correctamente");
		}
	}

	public static alumno [] alumno = new alumno[2];
	public static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
		menu slide = new menu();
		for(int i=0;i<alumno.length;i++){
			System.out.println(slide.registrar(i));
		}

		slide.listar();

		slide.men();
		
		
	}
}