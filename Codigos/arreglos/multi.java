import java.util.Scanner;
public class multi{
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int [][] caja = new int [3][3];
        int [][] contenedor = new int [3][3];
        int fila, columna;
        
        System.out.println("Leer datos para la matriz caja");
        
        //Metemos datos a la matriz caja
        for (fila = 0; fila <caja.length; fila++) {
            for (columna = 0; columna <caja[0].length; columna++) {
                System.out.printf("caja ["+fila+"]["+columna+"]= ");
                caja [fila] [columna] = entrada.nextInt();
            }
        }
        
        System.out.println("Leer datos para la matriz contenedor");
        //Metemos datos a la matriz contenedor
        for (fila = 0; fila<contenedor.length; fila++) {
            for (columna = 0; columna <contenedor[0].length; columna++) {
                System.out.printf("contenedor ["+fila+"]["+columna+"]= ");
                contenedor [fila] [columna] = entrada.nextInt();
            }
        }

        System.out.println("\nMatriz caja");
        //Mostrar la matriz caja
        for (fila=0;fila<caja.length; fila++) {
            for (columna=0;columna <  caja[0].length; columna++) {
                System.out.printf(caja[fila][columna]+" ");
            }
            System.out.println();
        }
        System.out.println("\nMatriz contenedor");
        //Mostrar la matriz contenedor
        for (fila=0; fila < contenedor.length; fila++) {
            for (columna=0;columna<contenedor[0].length; columna++) {
                System.out.printf(contenedor[fila][columna]+" ");
            }
            System.out.println();
        }

        //sumamos dos unidades a la matriz caja
        for (fila = 0; fila<caja.length; fila++) {
            for (columna = 0; columna <caja[0].length; columna++) {
                caja [fila] [columna] +=2;
            }
        }

        System.out.println("\nMatriz caja +2 ");
        //Mostrar la matriz caja
        for (fila=0; fila < caja.length; fila++) {
            for (columna=0;columna<caja[0].length; columna++) {
                System.out.printf(caja[fila][columna]+" ");
            }
            System.out.println();
        }

    }
    
}
    