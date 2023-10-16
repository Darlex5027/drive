import javax.swing.JOptionPane;
public class practicaguiada9 {
	public static void main (String[] args){
		String cadena;
		char letra;
		int numero;
		float decimal;
		double decimaldouble;

		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
		decimal = Float.parseFloat(JOptionPane.showInputDialog("Digite un decimal: "));
		decimaldouble = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal doble: "));
		cadena = JOptionPane.showInputDialog("Digite una cadena: ");
		letra = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);

		JOptionPane.showMessageDialog(null,"Tu contraseña es: "+cadena+letra+numero+decimal+decimaldouble);

		
	}
}