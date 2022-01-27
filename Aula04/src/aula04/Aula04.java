package aula04;
public class Aula04 {
    public static void main(String[] args) {
       Caneta c1 = new Caneta("Melin", 0.5f,"Azul");
       c1.status();
        System.out.println();
        System.out.println("OUTRO MODELO DE CANETA");
        System.out.println();
       Caneta c2 = new Caneta("BIC", 1.8f, "Vermelha");
       c2.status();
        
    }
    
}
