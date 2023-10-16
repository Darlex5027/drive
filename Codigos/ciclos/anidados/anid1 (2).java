/*8. Algoritmo que lea un número entero (altura) y a partir de él
    cree una escalera invertida de asteriscos con esa altura. 
    Debera quedar asi, si ponemos una altura de 5.
 */
import java.util.Scanner;
public class anid1 {
    public static void main(String[] args) {
        Scanner entrada =new Scanner (System.in);
        int h;
     	System.out.println("Digita la altura:");
 	    h=entrada.nextInt();
 	    for(int i=h;i>0;i--){
            for (int j=i;j>0;j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
