public class ClaseGeneraExcepciones  {
     public static void main(String[] args){
         try {
             throw new Exception("Esto es una ExcepciÃ³n");
         } catch(Exception e) {
             System.out.println("Se produjo un excepciÃ³n: " + e.getMessage());
         } finally {
             System.out.println("Esto se ejecuta sin importar si se presentan errores");
      }
   }
}