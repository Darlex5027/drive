import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

public class s3 extends JFrame{
	public JPanel panel = new JPanel();

	public s3(){
		setSize(1000,700);
		setTitle("103");
		setLocationRelativeTo(null);

		inciarComponentes();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void inciarComponentes(){
		iniciarPanel();
		iniciarTextBox();
	}

	public void iniciarPanel(){
		panel.setLayout(null);
		this.getContentPane().add(panel);
	}


	public void iniciarTextBox(){
		JTextArea areaTexto = new JTextArea();
        areaTexto.append("Escribe lo que piensas");
        areaTexto.setBackground(Color.BLACK);
        areaTexto.setForeground(Color.WHITE);
        areaTexto.setBounds(300,10,350,600);
        panel.add(areaTexto);

        JTextField boton1 = new JTextField("");
		boton1.setBounds(((1000-100)/2),600,100,35);
		panel.add(boton1);
		
		
			
		KeyListener eventoTeclado = new KeyListener(){
			@Override
			public void keyTyped(KeyEvent ke){

			}
			@Override
			public void keyPressed(KeyEvent ke){
				areaTexto.append("keyPressed\n");
			}
			@Override
			public void keyReleased(KeyEvent ke){

			}
		};
		boton1.addKeyListener(eventoTeclado);	
		
		
	}

	public void iniciarBotones(){
		}


}