package colas;
import javax.swing.*;
public class Colas {

/*
*  Autor: Alejandro Resendiz Reyes Darlex5027
*/
  
/*
    Simula una fila de banco con los datos:
    No. Cuenta.
    Deposito
    Saldo anterior
    Saldo nuevo
    
    Se deberá modificar el ingresar un cliente en la fila leyendo los datos: número de cuenta, deposito, y saldo anterior
    Al atender un cliente, modificar la opción eliminar y mostrar los datos 
        No. Cuenta.
        Deposito
        Saldo anterior
        Saldo nuevo
    Agregar una función modificar que permita agregar depositos
    */
    
//Declaramos el arreglo de 10x4
int cola[][]= new int[10][4];
//Declaramos el String en el que guardaremos nuestros mensajes
String cadena="";
//Declaramos el puntero para el siguiente espacio disponible en la cola
int cima=0;
//Declaramos el puntero para el siguiente espacio que se pueda borrar en la cola
int frente=0;
//Establecemos el maximo como el tamaño del arreglo
int maximo=cola.length;

//Al iniciar la cola se inicializa llenandola con ceros
public void iniciarcola(){
    
    /*esta parte llena un número aleatorio de espacios (entre 5 y 8) con datos
    aleatorios*/
    int pro=(int)(Math.random()*8+5);
    for (int i = 0; i < cola.length; i++) {
        //insertar(i+1);
        for(int j=0;j<cola[0].length; j++){
            //Random X:limite superior, Y:limite inferior(X-Y+1)+Y;
            if(pro>i){
                if(j==0){
                    //Los número de cuenta en cola[i][0] serán aleatorios entre 10001 y 99999
                    cola[i][j]=(int)(Math.random()*(999-100+1)+100);
                }
                if(j==1){
                    cola[i][j]=(int)(Math.random()*1000);
                }
                if(j==2){
                    cola[i][j]=(int)(Math.random()*1000);
                }
                if(j==3){
                    cola[i][j]=cola[i][1]+cola[i][2];
                }
            }else{
                cola[i][j]=0;
                if(j==3)
                    cima--;
            }
        }
        cima++;
    }
}

//insertar datos
public void insertar(int z){
    //revisa que la cola no esté llena
    if(cima==maximo){
        cadena="la cola esta llena";
        JOptionPane.showMessageDialog(null, cadena);
    }else{
        //Pide los dato a ingresar
        int ncuenta=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un el número de cuenta:"));
        int deposito=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad del deposito:"));
        int saldoanterior=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el saldo anterior:"));
        //calcula el nuevo saldo
        int saldonuevo=deposito+saldoanterior;
        cola[cima][0]=ncuenta;
        cola[cima][1]=deposito;
        cola[cima][2]=saldoanterior;
        cola[cima][3]=saldonuevo;
        cima++;
    } 
       
}

//Mostrar
public void mostrar(){
    cadena="No.Cuenta  // Deposito // Saldo anterior  //  Saldo Nuevo  \n";
    for (int i = 0; i < cola.length; i++) {
        cadena+=(i+1)+".-    ";
        for(int j=0;j<cola[0].length; j++){
            if(cola[i][1]!=0){
                cadena+=cola[i][j] + "  ||    ";
            }   
            //si el espacio no está ocupado no lo imprime para hacer más limpia
            //la pantalla y no saturarla de datos
            if(cola[i][1]==0){
               // cadena+="00000    ||    ";    
            }
            
        }
        cadena+="\n";
    }
    JOptionPane.showMessageDialog(null, cadena);
}

//Eliminar
public void eliminar(){
    //Revisa que la cola no esté llena o vacia
    
    if(cima==0||frente==10||cola[frente][0]==0){
        cadena="La cola está vacia";
        JOptionPane.showMessageDialog(null, cadena);
    }else{
        //muestra los datos a eliminar, los elimina y recorre el frente
        cadena="El número de cuenta a eliminar es: "+cola[frente][0]+" \nCon un ultimo deposito de: "+cola[frente][1]+" \nSaldo antes del movimiento: "+cola[frente][2]+"\nSaldo actual: "+cola[frente][3];
        for(int j=0;j<cola[0].length; j++){
            cola[frente][j]=0;
        }
        frente++;
        JOptionPane.showMessageDialog(null,cadena);
        
    }
}

//vaciar
//Repite eliminar() hasta que esté vacia la cola
public void vaciar(){
    do{
        eliminar();
    }while(frente!=10);
}


//Bus
public void modificar(){
    int cuenta = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el número de cuenta que deseas modificar:"));
    for (int i = 0; i < cola.length; i++) {
        if(cola[i][0]==cuenta){
            int deposito=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad del deposito:"));
            int saldoanterior=cola[i][3];
            int saldonuevo=deposito+saldoanterior;
            cola[i][1]=deposito;
            cola[i][2]=saldoanterior;
            cola[i][3]=saldonuevo;
        }
    }
}
    public static void main(String[] args) {
       int opcion =0;
       Colas objeto=new Colas();
       objeto.iniciarcola();
       do{
    
            try {
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null, "1. Insertar elemento\n"+
                                                                     "2. Eliminar elemento\n"+
                                                                     "3. Vaciar cola \n"+
                                                                     "4. Mostrar cola\n"+
                                                                     "5. Modificar\n"+
                                                                     "6. Salir\n" +
                                                                     "ingrese la opcion [1-5]"));
            } catch (Exception e) {
                opcion=10;
            }
      
            switch(opcion){
            case 1 : objeto.insertar(0);
                    break;
            case 2 : objeto.eliminar();
                    break;
            case 3 : objeto.vaciar();
            break;
            case 4 : objeto.mostrar();
            break;
            case 5: objeto.modificar();
                break;
            case 6 : System.exit(0);
            break;
          default : JOptionPane.showMessageDialog(null, "ingrese una opcion valida" + JOptionPane.WARNING_MESSAGE);
      }
       
       }while(true);
    }
    
}
