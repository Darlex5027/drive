/*Creado por Alejandro Resendiz Reyes 1ero C Ing. Computación
    *Dedicado a Ximena Cruz Báez que me aguanta en todo momento
*/

public class Principal {
 
    public static void main(String[] args) {
   
        //Crea el array de electrodomesticos
        Electrodomestico listaElectrodomesticos[]=new Electrodomestico[10];
   
        //Llena las pisiciones del array usando los diferentes constructores
        listaElectrodomesticos[0]=new Electrodomestico(200, 60, 'C', "Verde");
        listaElectrodomesticos[1]=new Lavadora(150, 30);
        listaElectrodomesticos[2]=new Television(500, 80, 'E', "negro", 42, false);
        listaElectrodomesticos[3]=new Electrodomestico();
        listaElectrodomesticos[4]=new Electrodomestico(600, 20, 'D', "gris");
        listaElectrodomesticos[5]=new Lavadora(300, 40, 'Z', "blanco", 40);
        listaElectrodomesticos[6]=new Television(250, 70);
        listaElectrodomesticos[7]=new Lavadora(400, 100, 'A', "verde", 15);
        listaElectrodomesticos[8]=new Television(200, 60, 'C', "naranja", 30, true);
        listaElectrodomesticos[9]=new Electrodomestico(50, 10);
   
        //Crea las variables para almacenar las sumas
        double sumaElectrodomesticos=0;
        double sumaTelevisiones=0;
        double sumaLavadoras=0;
        double sumaTodo=0;
   
        //Recorre el array obteniendo el precio final
        for(int i=0;i<listaElectrodomesticos.length;i++){
            if(listaElectrodomesticos[i] instanceof Electrodomestico){
                sumaElectrodomesticos+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Lavadora){
                sumaLavadoras+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Television){
                sumaTelevisiones+=listaElectrodomesticos[i].precioFinal();
            }
        }
        //Sumamos todas las sumas para tener el total
        sumaTodo=sumaElectrodomesticos+sumaTelevisiones+sumaLavadoras;
        
        //Mostramos los resultados
        System.out.println("La suma total es de: "+sumaTodo);
        System.out.println("La suma del precio de los electrodomesticos es de "+sumaElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de "+sumaLavadoras);
        System.out.println("La suma del precio de las televisiones es de "+sumaTelevisiones);
   
    }
   
}
