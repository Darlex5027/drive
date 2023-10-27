/*Creado por Alejandro Resendiz Reyes 1ero C Ing. Computación
    *Dedicado a Ximena Cruz Báez que me aguanta en todo momento
*/
public class Lavadora extends Electrodomestico{
  
    //Constantes 

    private final static int CARGA_DEF=5;
  
    //Atributos

    private int carga;
  
    //Métodos publicos

    public int getCarga() {
        return carga;
    }
  

    public double precioFinal(){
        //Invoca el método precioFinal del método padre
        double simp=super.precioFinal();
  
        //Añade el código necesario
        if (carga>30){
            simp+=50;
        }
  
        return simp;
    }
  
    //Constructor
  
    public Lavadora(){
        this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF, CARGA_DEF);
    }
  
    
    public Lavadora(double precioBase, double peso){
        this(precioBase, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF, CARGA_DEF);
    }

    public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga){
        super(precioBase,peso, consumoEnergetico,color);
        this.carga=carga;
    }
}