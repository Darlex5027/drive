public class SobrecargaMetodos {

    public static void main(String[] args) {
        Persona persona1 = new Persona ("Alejandro", 19);
        persona1.correr();
        
        Persona persona2 = new Persona ("123123");
        persona2.correr(100);
    }
}