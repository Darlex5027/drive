import javax.swing.JOptionPane;


public class Operacion {
    //Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //Métodos
    
    //Método para pedirle al usuario que nos digite dos numeros
    public void LeerNumeros () {
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
    }
    
    //Método para sumar ambos números
    public void suma () {
        suma = numero1 + numero2;
    }
    
    //Método para restar ambos números
    public void resta () {
        resta = numero1 - numero2;
    }
    
    //Método para multiplicar ambos numeros 
    public void multiplicar () {
        multiplicacion = numero1 * numero2;
    }
    
    //Método para dividir ambos números 
    public void dividir () {
        division = numero1 / numero2; 
    }
    
    public void MostrarResultados () {
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);
    }
    
    }