import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Encuesta3 extends JFrame{

        //Respuestas
        String so = "";
        String [] esp = {"Programación","Diseño Gráfico","Administración"};
        int hr = 0;

        public JPanel panel = new JPanel();

        public Encuesta3(){        
                setSize(300,500);
                setTitle("Encuesta");
                setLocationRelativeTo(null);
                setMinimumSize(new Dimension(300,500));    
                iniciarComponentes();
                
                setDefaultCloseOperation(EXIT_ON_CLOSE);
        }

        public void iniciarComponentes(){
                panel.setLayout(null);
                panel.setBackground(Color.WHITE);
                this.getContentPane().add(panel);
                JLabel p1 = new JLabel("Elige un sistema operativo");
                JLabel p2 = new JLabel("Elige tu especialidad");
                JLabel p3 = new JLabel("<html><body>Señala las horas que dedicas <br>al ordenador (0-24 hrs)</body></html>");
                p1.setBounds(10,10,200,20);
                p2.setBounds(10,35+65,200,20);
                p3.setBounds(10,160+25,200,30);
                panel.add(p1);
                panel.add(p2);
                panel.add(p3);
                JRadioButton windows = new JRadioButton("Windows");
                JRadioButton linux = new JRadioButton("Linux");
                JRadioButton mac = new JRadioButton("Mac");
                windows.setBounds(10,35,200,20);
                linux.setBounds(10,(35+20),200,20);
                mac.setBounds(10,(35+40),200,20);
                ButtonGroup sos = new ButtonGroup();
                panel.add(windows);
                panel.add(linux);
                panel.add(mac);

                sos.add(windows);
                sos.add(linux);
                sos.add(mac);
                JCheckBox prog = new JCheckBox("Programación");
                JCheckBox dg = new JCheckBox("Diseño Grafico");
                JCheckBox adm = new JCheckBox("Administración");
                prog.setBounds(10,120,200,20);
                dg.setBounds(10,(120+20),200,20);
                adm.setBounds(10,(120+40),200,20);

                panel.add(prog);
                panel.add(dg);
                panel.add(adm);
                JSlider sldhoras = new JSlider(0,24,0);
                sldhoras.setBounds(10,(185+35),200,50);
                sldhoras.setMinorTickSpacing(1);
                sldhoras.setMajorTickSpacing(5);
                sldhoras.setPaintTicks(true);
                sldhoras.setPaintLabels(true);
                panel.add(sldhoras);

                JButton enviar = new JButton("Enviar");
                enviar.setBounds(10,(220+55),70,30);
                panel.add(enviar);

                ActionListener oyenteDeAccion = new ActionListener(){
                        @Override
                        public void actionPerformed(ActionEvent ae){
                                String informacion="Tu sistema operativo preferido es ";
         
                                //Cogemos todos los radiobutton en un array
                                JRadioButton[] rdbs={windows, linux, mac};
         
                                for(int i=0;i<rdbs.length;i++){
             
                                        //Si esta seleccionado, coge el texto
                                        if(rdbs[i].isSelected()){
                                                informacion+=rdbs[i].getText();
                                        }
             
                                }
         
                                //Hacemos igual con los checkboxes
                                JCheckBox[] ckbs={prog, dg, adm};
         
                                informacion+=", \ntus especialidades son ";
         
                                for(int i=0;i<ckbs.length;i++){
                                        if(ckbs[i].isSelected()){
                                                informacion+=ckbs[i].getText()+" "; //Ponemos un espacio por si hay mas de un elemento seleccionado
                                        }                       
                                }
         
                                informacion+=" \ny el numero de horas dedicadas al ordenador son "+sldhoras.getValue();
         
                        }
                                JOptionPane.showMessageDialog(panel,informacion);
                };

                enviar.addActionListener(oyenteDeAccion);
        
        }
}
