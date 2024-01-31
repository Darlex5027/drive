/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.golosinas;

/**
 *
 * @author Darlex5027
 */
import javax.swing.JOptionPane;
public class Golosinas {
    

    public static void main(String[] args) {
        mostrar();
     
     
    }
    
    public static void  mostrar (){
        String nombres [][]= {
                            {"Gansito","Pay de piña","Pay de nuez","Chocoroles"},
                            {"Canelitas","Tutsi Pop","Paleta de cervez","Panditas"}, 
                            {"Paleta payaso","Cachetadas","Pecositas","Dientes de goma"},
                            {"Pinguinos de goma","Bites","Chocomentas","Bites chocolate"}
                            };
        int precios [][]={
                          {15,25,10,14},
                          {18,20,24,7},
                          {2,5,6,7},
                          {14,25,21,22}
                         };
        int existencia [][]={
                            {1,4,6,7},
                            {4,4,4,6},
                            {7,9,8,10},
                            {4,5,7,2}
                          };
        
        String mensaje = "";
        int op=0;
       do{
           mensaje = "Digita la Fila y luego la columan del dulce que quieres \nEjemplo: Cachetada '32' \n Para Salir digita 5027\n";
        for(int i=0;i<nombres.length;i++){
            mensaje += "Fila "+(i+1)+"\n";
                for(int j=0;j<nombres[i].length;j++){
                    mensaje+=nombres[i][j]+" Precio: $";
                    mensaje+=precios[i][j]+" Exist:";
                    mensaje+=existencia[i][j]+"  //  ";
                }
            mensaje+="\n";
        }
        op = (int) Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        int fila=op/10;
        int columna=op-(fila*10);
        if(op==5027){
            JOptionPane.showMessageDialog(null, "Que tengas buen día");
            System. exit(0);
        }
        if((fila>4||fila<=0)||(columna>4||columna<=0)){
            JOptionPane.showMessageDialog(null, "Debes ingresar un producto valido");
        }else if(existencia[fila-1][columna-1]==0){
            JOptionPane.showMessageDialog(null, "Este producto ya no tiene existencias");
        } else if(existencia[fila-1][columna-1]>0){
            existencia[fila-1][columna-1]--;
            JOptionPane.showMessageDialog(null,"Disfruta tus "+nombres[fila-1][columna-1]+" por $"+precios[fila-1][columna-1]);
        }
        mensaje ="";
    }while(op!=5027);
            
    }
}
