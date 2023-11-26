import CuentaBancaria;

public class prueba1{
    public class CuentaBancaria {
    	public static int totalCuentas;
    
	}
    
	
	public static void main(String[] args){
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