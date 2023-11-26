/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebacuentabancarioa;

/**
 *
 * @author HPDarlexAdmin
 */
public class PruebaCuentaBancarioa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaBancaria c1 = new CuentaBancaria();
        c1.totalCuentas++;
        
        System.out.println("Total cuentas "+c1.totalCuentas);
        
        CuentaBancaria c2 = new CuentaBancaria();
        c2.totalCuentas++;
        System.out.println("Total cuentas "+ c2.totalCuentas);
        
        CuentaBancaria.totalCuentas++;
        System.out.println("Total cuentas "+ CuentaBancaria.totalCuentas);
        
    }
    
}
