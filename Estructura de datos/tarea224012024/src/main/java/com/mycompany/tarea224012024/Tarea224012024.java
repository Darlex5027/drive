package com.mycompany.tarea224012024;

/**
 *
 * @author Darlex5027
 */

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Tarea224012024 {

    public static void main(String[] args) {
        int nums[]=new int[5];
        int cubos[]=new int[5];
        String mensaje = "Aquí están los cubos de tus números:\n";
        for(int i=0;i<nums.length;i++){
            nums[i]=(int)Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número "+(i+1)+" de tu lista"));
            cubos[i]=nums[i]*nums[i]*nums[i];
            mensaje+="("+nums[i]+")^3 -> "+cubos[i]+"\n";                     
        }
        
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
