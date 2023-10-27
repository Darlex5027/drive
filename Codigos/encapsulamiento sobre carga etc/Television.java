
/*Creado por Alejandro Resendiz Reyes 1ero C Ing. Computación
    *Dedicado a Ximena Cruz Báez que me aguanta en todo momento
*/
public class Television extends Electrodomestico{
  
    //Constantes, otra vez, no me gustan las constantes pero ok
    private final static int RESOLUCION_DEF=20;
  
    private int resolucion;
    private boolean sintonizadorTDT;
  
    //Métodos publicos
  
    public double precioFinal(){
        //Invoca el método precioFinal del método padre
        double simp=super.precioFinal();
  
        //Añade el codigo necesario
        if (resolucion>40){
            simp+=precioBase*0.3;
        }
        if (sintonizadorTDT){
            simp+=50;
        }
  
        return simp;
    }
  
    //Constructor
  
    public Television(){
        this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF, RESOLUCION_DEF, false);
    }
  
    public Television(double precioBase, double peso){
        this(precioBase, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF, RESOLUCION_DEF, false);
    }
  
    public Television(double precioBase, double peso, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT){
        super(precioBase, peso, consumoEnergetico, color);
        this.resolucion=resolucion;
        this.sintonizadorTDT=sintonizadorTDT;
    }
}