/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capitulo13;

/**
 *
 * @author HPDarlexAdmin
 */
public class Capitulo13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fecha origen = new Fecha();
        Fecha actual = new Fecha(16,2,2009);
 
        System.out.println("Primera fecha: " + origen.toString());
        System.out.println("Segunda fecha: " + actual.toString());
    }
    
}
