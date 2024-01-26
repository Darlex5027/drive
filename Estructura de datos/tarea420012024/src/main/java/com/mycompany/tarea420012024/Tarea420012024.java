/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea420012024;

/**
 *
 * @author Darlex5027
 */
import javax.swing.JOptionPane;
public class Tarea420012024 {

    public static void main(String[] args) {
        int tamaño=0;
        
        do{
            tamaño=(int)Integer.parseInt(JOptionPane.showInputDialog("Qué tamaño tendrá el arreglo?"));
            if(tamaño%2==0) JOptionPane.showConfirmDialog(null,"El tamaño debe ser un numero impar");
        }while(tamaño%2==0);
        int nums[]=new int[tamaño];
        String mensaje="En la siguiente lista:\n";
        for(int i = 0; i<nums.length;i++){
            nums[i]=(int)(Math.random()*20+1);
            if(i==(int)(tamaño/2))
                mensaje+="["+nums[i]+"],";
            if(i!=(int)(tamaño/2))
                mensaje+=""+nums[i]+",";
        }
        mensaje+="\n el número "+nums[(int)(tamaño/2)]+" ocupa el centro de la lista.";
        JOptionPane.showMessageDialog(null, mensaje);
                
    }
}
