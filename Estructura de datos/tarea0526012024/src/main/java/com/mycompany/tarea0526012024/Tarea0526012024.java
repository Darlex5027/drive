/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea0526012024;

/**
 *
 * @author Darlex5027
 */
import javax.swing.JOptionPane;
public class Tarea0526012024 {

    public static void main(String[] args) {
        String mensaje="Aquí sus calificaciones\n";
        float calif[]=new float[(int)Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos alumnos hay en la clase?"))];
        int e=0,b=0,r=0,d=0;
                
        for(int i = 0; i<calif.length;i++){
            calif[i]=Math.round((Math.random()*10) * 100) / 100;
            mensaje+=calif[i]+" ";
            if(calif[i]>=9){
                mensaje+="Excelente\n";
                e++;
            }
            if(calif[i]>=8&&calif[i]<=8.9){
                mensaje+="Bueno\n";
                b++;
            }
            if(calif[i]>=6&&calif[i]<=7.9){
                mensaje+="Regular\n";
                r++;
            }
            if(calif[i]<=5.9){
            mensaje+="Deficiente\n";//se hizo la modificación ya que en el rango 5.1-5.9 no hay definición
                d++;
            }                   
   
        }
        mensaje+="\n\nEn total hay:\n"+e+": Excelentes\n"+b+": Buenos\n"+r+": Regulares\n"+d+": Deficientes\n";
        JOptionPane.showMessageDialog(null,mensaje);
    }
}
