/*Creado por Alejandro Resendiz Reyes 1ero C Ing. Computación
    *Dedicado a Ximena Cruz Báez que me aguanta en todo momento
*/
public class Electrodomestico {
   
  	//Sinceramente no me gusta usar constante pero ok:

    //Constantes
   
    //Color por defecto
    protected final static String COLOR_DEF="blanco";
   
    //Consumo energetico por defecto
    protected final static char CONSUMO_ENERGETICO_DEF='F';
   
    //Precio base por defecto
    protected final static double PRECIO_BASE_DEF=100;
   
   	//Peso por defecto
    protected final static double PESO_DEF=5;
   
    //Atributos
   	//El precio base del electrodomestico
    protected double precioBase;
   
    //Color del electrodomestico
	protected String color;
   
    //Indica el consumo energetico del electrodomestico
    protected char consumoEnergetico;
   
    Peso del electrodomestico
	//protected double peso;
   
    //Métodos privados
   
    private void comprobarColor(String color){
   
        //Colores disponibles
        String colores[]={"blanco", "negro", "rojo", "azul", "gris"};
        boolean encontrado=false;
  
        for(int i=0;i<colores.length && !encontrado;i++){
              
            if(colores[i].equals(color)){
                encontrado=true;
            }
              
        }
          
        if(encontrado){
            this.color=color;
        }else{
            this.color=COLOR_DEF;
        }
          
          
    }
      

	//Comprueba el consumo energetico

    public void comprobarConsumoEnergetico(char consumoEnergetico){
          
        if(consumoEnergetico>=65 && consumoEnergetico<=70){
            this.consumoEnergetico=consumoEnergetico;
        }else{
            this.consumoEnergetico=CONSUMO_ENERGETICO_DEF;
        }
          
    }
   
    //Métodos
   //Devuelve el peso del electrodomestico
     
    public double getPeso() {
        return peso;
    }
    
 	// Devuelve el color del electrodomestico
    public String getColor() {
        return color;
    }
   
    

    // Devuelve el precio base del electrodomestico
    public double getPrecioBase() {
        return precioBase;
    }
    //Devuelve el consumo energetico del electrodomestico
 
    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }
    

    //Precio final
    public double precioFinal(){
        double plus=0;
        switch(consumoEnergetico){
            case 'A':
                plus+=100;
                break;
            case 'B':
                plus+=80;
                break;
            case 'C':
                plus+=60;
                break;
            case 'D':
                plus+=50;
                break;
            case 'E':
                plus+=30;
                break;
            case 'F':
                plus+=10;
                break;
        }
   
        if(peso>=0 && peso<19){
            plus+=10;
        }else if(peso>=20 && peso<49){
            plus+=50;
        }else if(peso>=50 && peso<=79){
            plus+=80;
        }else if(peso>=80){
            plus+=100;
        }
   
        return precioBase+plus;
    }
   
   //Constructores :V

    public Electrodomestico(){
        this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF);
    }

    public Electrodomestico(double precioBase, double peso){
        this(precioBase, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF);
    }
   

    public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color){
        this.precioBase=precioBase;
        this.peso=peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
    }  
}