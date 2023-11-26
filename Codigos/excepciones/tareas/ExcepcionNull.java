 class ExcepcionNull {
    String s = "ejercico 2 sobre Excepciones";
      String getString() {
      return s;
    }
       
    public static void main(String[] args) {
        ExcepcionNull en = null;
      try {
        en.getString();
      } catch (Exception e){
        System.out.println("Se produjo una exceción. " + e.getMessage());
      }
    }
}