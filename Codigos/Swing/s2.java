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

public class s2 extends JFrame{
	public JPanel panel = new JPanel();

	public s2(){
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

        JButton boton1 = new JButton("Enviar");
		boton1.setBounds(((1000-100)/2),600,100,35);
		panel.add(boton1);
		
		
	
		MouseListener oyenteDeRaton = new MouseListener(){
			@Override
			public void mouseClicked(MouseEvent me){
				areaTexto.append("mouseClicked\n");
			}

			@Override
			public void mousePressed(MouseEvent me){
				areaTexto.append("mousePressed\n");
			}

			@Override
			public void mouseReleased(MouseEvent me){
				areaTexto.append("mouseReleased\n");
			}

			@Override
			public void mouseEntered(MouseEvent me){
				areaTexto.append("mouseEntered\n");
			}

			@Override
			public void mouseExited(MouseEvent me){
				areaTexto.append("MouseExited\n");
			}
		};

		boton1.addMouseListener(oyenteDeRaton);
	}

	public void iniciarBotones(){
		}


}






