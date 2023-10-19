public class CuentaApp{
	public static void main (String[] args){
		Cuenta cuenta1 = new Cuenta("Simon");
		Cuenta cuenta2 = new Cuenta("Alejandro", 300);

		//Ingresa dinero en las cuentas
		cuenta1.ingresar(300);
		cuenta2.ingresar(400);
		
		//Retiramos dinero en las cuentas
		cuenta1.retirar(500);
		cuenta2.retirar(100);

		System.out.println(cuenta1); 
		System.out.println(cuenta2);
	}
}
