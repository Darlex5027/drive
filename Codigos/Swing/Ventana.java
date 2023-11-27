import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;

public class Ventana extends JFrame{
	public JPanel panel = new JPanel();

	public Ventana(){
		setSize(1000,700);
		setTitle("103");
		setLocationRelativeTo(null);

		inciarComponentes();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void inciarComponentes(){
		iniciarPanel();
		iniciarEtiqueta();
		iniciarTextBox();
	}

	public void iniciarPanel(){
		panel.setLayout(null);
		this.getContentPane().add(panel);
	}

	public void iniciarEtiqueta(){
		JLabel titulo = new JLabel("Ingresa tu nombre",SwingConstants.CENTER);
		
		titulo.setBounds(((1000-300)/2),10,300,500);
		
		panel.add(titulo);





	}

	public void iniciarTextBox(){
		JTextField jtf1 = new JTextField();
        jtf1.setBounds(((1000-350)/2),500,350,20);
        panel.add(jtf1);

        JButton boton1 = new JButton("Enviar");
		boton1.setBounds(((1000-100)/2),600,100,35);
		panel.add(boton1);
		
		JLabel nombre = new JLabel("",SwingConstants.CENTER);
		nombre.setBounds(((1000-300)/2),60,300,500);
		panel.add(nombre);
		
	
		ActionListener oyenteDeAccion = new ActionListener(){
        	@Override
            public void actionPerformed(ActionEvent ae){
            	String informacion="Hola "+jtf1.getText();
            	
            	nombre.setText(informacion);

            }
         };
         boton1.addActionListener(oyenteDeAccion);
	}

	public void iniciarBotones(){
		}


}