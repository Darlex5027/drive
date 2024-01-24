package com.mycompany.tarea324012024;

/**
 *
 * @author Darlex5027
 */

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Tarea324012024 {

    public static void main(String[] args) {
        int nums[]=new int[10];
        int mayor=0;
        int menor=10;
        String mensaje ="De los siguientes números ";
        for(int i=0;i<nums.length;i++){
            nums[i] = (int)(Math.random()*100+1);
            if(mayor<nums[i]){
                mayor=nums[i];
            }
            if(menor>nums[i]){
                menor=nums[i];
            }
            
            if(i!=nums.length-1)
                mensaje+=nums[i]+", ";
            if(i==nums.length-1)
                mensaje+=nums[i];
        }
        mensaje+="\n"+mayor+" es el mayor";
        mensaje+="\n"+menor+" es el menor";
        
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
