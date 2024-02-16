package com.mycompany.colas;
import javax.swing.*;
public class Colas {


int cola[]= new int[15];
String cadena="";
int cima=0;
int frente=0;
int maximo=cola.length;

public void iniciarcola(){
    for (int i = 0; i < cola.length; i++) {
        insertar(i+1);
        //cola[i]=0;
    }
}

public void insertar(int z){
    if(cima==maximo){
        cadena="la cola esta llena";
        JOptionPane.showMessageDialog(null, cadena);
    }else{
        if(z==0){
            cadena=JOptionPane.showInputDialog("ingresa un numero");
            cola[cima]=Integer.parseInt(cadena);
        }
        if(z!=0){
            cola[cima]=z;
        }
        cima++;
    } 
       
}

public void mostrar(){
    cadena="los elementos de la cola son: \n";
    for(int i=0; i< cola.length; i++)
        cadena+=cola[i] + "\n";
    JOptionPane.showMessageDialog(null, cadena);
}

public void eliminar(){
    if(cima==0||frente==15){
        cadena="La cola está vacia";
        JOptionPane.showMessageDialog(null, cadena);
    }else{
        cadena="El elemento eliminado es:"+cola[frente];
        cola[frente]=0;
        frente++;
        JOptionPane.showMessageDialog(null,cadena);
    }
}
public void vaciar(){
    do{
        eliminar();
    }while(frente!=15);
}

    public static void main(String[] args) {
       int opcion =10;
       Colas objeto=new Colas();
       objeto.iniciarcola();
       do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                     1. Insertar elemento 
                                                                     2. Eliminar elemento
                                                                     3. Vaciar cola 
                                                                     4. Mostrar cola 
                                                                     5. salir 
                                                                     ingrese la opcion [1-5]"""));
      
            switch(opcion){
            case 1 -> objeto.insertar(0);
            case 2 -> objeto.eliminar();
            case 3 -> objeto.vaciar();
            case 4 -> objeto.mostrar();
            case 5 -> System.exit(0);
          default -> JOptionPane.showMessageDialog(null, "ingrese una opcion valida" + JOptionPane.WARNING_MESSAGE);
      }
       
       }while(true);
    }
    
}
