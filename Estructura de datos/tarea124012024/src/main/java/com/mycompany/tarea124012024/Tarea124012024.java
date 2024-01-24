package com.mycompany.tarea124012024;

/**
 *
 * @author Darlex5027
 */

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Tarea124012024 {

    public static void main(String[] args) {
        int nums[]=new int[6];
        int suma=0;
        String mensaje ="La suma de los siguientes números: ";
        for(int i=0;i<nums.length;i++){
            nums[i]=(int)Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número "+(i+1)+" de tu lista"));
            suma+=nums[i];
            if(i!=nums.length-1)
                mensaje+=nums[i]+", ";
            if(i==nums.length-1)
                mensaje+=nums[i];
        }
        mensaje+=" es igual a: "+suma+"\n el cuadrado de esa suma es: "+(suma*suma)+"\nel promedio de dichos número es: "+(suma/nums.length);
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
