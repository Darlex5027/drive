import javax.swing.JOptionPane;

public class ClaseyObjetos {

    public static void main(String[] args) {
        
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

        Operacion op = new Operacion ();
        
        op.suma(n1, n2);
        op.resta(n1, n2);
        op.multiplicar(n1, n2);
        op.dividir(n1, n2);
        
        op.MostrarResultados();
        
    }
    
}