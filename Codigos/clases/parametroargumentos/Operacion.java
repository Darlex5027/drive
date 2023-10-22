public class Operacion {

    //Atributos
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //Métodos
    
    //Método para sumar ambos números
    public void suma (int numero1, int numero2) {
        suma = numero1 + numero2;
    }
    
    //Método para restar ambos números
    public void resta (int numero1, int numero2) {
        resta = numero1 - numero2;
    }
    
    //Método para multiplicar ambos numeros 
    public void multiplicar (int numero1, int numero2) {
        multiplicacion = numero1 * numero2;
    }
    
    //Método para dividir ambos números 
    public void dividir (int numero1, int numero2) {
        division = numero1 / numero2; 
    }
    
    public void MostrarResultados () {
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);
    }
    
    }