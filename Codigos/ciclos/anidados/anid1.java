/*17. Algoritmo que lea un número entero (lado) y a partir de él cree 
        un cuadrado de asteriscos con ese tamaño. Los asteriscos sólo 
        se verán en el borde del cuadrado, no en el interior
*/
import java.util.Scanner;
public class anid1{
	public static void main(String[] args) {
		int l;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el lado: ");
        l = entrada.nextInt();
        for(int i=0;i<l;i++){
            if(i==0||i==(l-1)){
                for (int j=0;j<l;j++) {
                    System.out.print("*");
                }       
                System.out.println();
            }else{
                System.out.print("*");
                for (int j=1;j<(l-1);j++) {
                    System.out.print(" ");
                }    
                System.out.print("*");
                System.out.println();
            }            
            
        }
    }
}