/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

/**
 *
 * @author HPDarlexAdmin
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Auto a = new Auto();
        System.out.println(a.patente + " " + a.color +" "+a.kms+" "+a.conAire+" ");
        a.patente="MC123";
        a.color="Verde";
        a.kms=500;
        a.conAire=true;
        System.out.println(a.patente + " " + a.color +" "+a.kms+" "+a.conAire+" ");
        
        
        Auto a2 = new Auto();
        System.out.println(a2.patente + " " + a2.color +" "+a2.kms+" "+a2.conAire+" ");
        a2.patente="MC123";
        a2.color="Verde";
        a2.kms=500;
        a2.conAire=true;
        System.out.println(a2.patente + " " + a2.color +" "+a2.kms+" "+a2.conAire+" ");
        
        
    }
    
}
