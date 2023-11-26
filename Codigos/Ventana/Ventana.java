import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;

public class Ventana extends JFrame{
    
    public JPanel panel = new JPanel();
    
        
    public Ventana(){
        
        setSize(1000,700);
        setTitle("El mejor titulo");
        //setLocation(200,200);
        //setBounds(200,200,500,500);
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(1000,1000));
        
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    private void iniciarComponentes(){
        iniciarPanel();
        iniciarEtiqueta();
        iniciarBotones();
        iniciarRadBotones();
        iniciarCajasDeTexto();  
        colocarAreasdeTexto();
        colocarListaDesplegable();
                
    }
    
    private void iniciarPanel(){
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);
        this.getContentPane().add(panel);
    }
    
    private void iniciarEtiqueta(){
        JLabel etiqueta = new JLabel("",SwingConstants.CENTER);
        etiqueta.setText("<html><body>Crazy? I was crazy once.<br>They locked me in a room."
                + "<br> A rubber room.<br> A rubber room full of rats.<br> And rats make me crazy. "
                + "</body></html>");
        
        etiqueta.setSize(300,500);
        //etiqueta.setForeground(Color.);
        etiqueta.setOpaque(true);
        etiqueta.setForeground(Color.WHITE);
        etiqueta.setBackground(Color.BLACK);
        etiqueta.setFont(new Font("chiller",Font.BOLD,30));
        panel.add(etiqueta);
        
        ImageIcon imagen = new ImageIcon("crazy.jpg");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(((300-200)/2),500,200,200);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(200,200,
                Image.SCALE_SMOOTH)));
        panel.add(etiqueta2);
    }
    
    private void iniciarBotones(){
        JButton boton1 = new JButton();
        boton1.setText("No me presiones que me estreso");
        boton1.setBounds(300,0,300,40);
        
        boton1.setEnabled(false);
        panel.add(boton1);
        
        
        ImageIcon imagen2 = new ImageIcon("botónrojo.jpg");
        JButton boton2 = new JButton();
        boton2.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(200,200,Image.SCALE_SMOOTH)));
        boton2.setBounds(400,100,200,200);
        boton2.setMnemonic('b');
        
        panel.add(boton2);
    }
    
    private void iniciarRadBotones(){
        JRadioButton radioBoton1 = new JRadioButton("algo");
        radioBoton1.setBounds(600, 10, 100, 15);
        panel.add(radioBoton1);

        JRadioButton radioBoton2 = new JRadioButton("algo2");
        radioBoton2.setBounds(600, 25, 100, 15);
        panel.add(radioBoton2);

        JRadioButton radioBoton3 = new JRadioButton("algo3");
        radioBoton3.setBounds(600, 40, 100, 15);
        panel.add(radioBoton3);

        ButtonGroup grupoRadioBotones = new ButtonGroup();

        grupoRadioBotones.add(radioBoton1);
        grupoRadioBotones.add(radioBoton2);
        grupoRadioBotones.add(radioBoton3);
    }

    private void iniciarCajasDeTexto(){
        JTextField jtf1 = new JTextField();
        jtf1.setBounds(300,60,350,20);
        panel.add(jtf1);
    }

    private void colocarAreasdeTexto(){
        JTextArea areaTexto = new JTextArea();
        areaTexto.append("Escribe lo que piensas");
        areaTexto.setBackground(Color.BLACK);
        areaTexto.setForeground(Color.WHITE);
        areaTexto.setBounds(300,500,350,100);
        panel.add(areaTexto);
    }

    private void colocarListaDesplegable(){
        String [] frases = {"Crazy?","I was crazy once","They locked me in a room","A rubber room","A rubber room full of rats","And rats make me crazy"};

        JComboBox listaDesplegable1 = new JComboBox<>(frases);
        listaDesplegable1.setBounds(600,200,200,100);
        panel.add(listaDesplegable1);

    }
}
