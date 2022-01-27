package aula09;
public class Aula09 {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro [] l = new Livro[3];
        
        p[0] = new Pessoa("Ruben", 26, "M");
        p[1] = new Pessoa("Maria", 24, "F");
        
        l[0] = new Livro("A guerra", "Carlos Queiroz", 200, p[0]);
        l[1] = new Livro("Na raça", "José Pedro", 350, p[1]);
        l[2] = new Livro("JAVA", "Toninho", 120, p[1]);
        
        l[1].abrir();
        l[1].avançarPag();
        l[1].folhear(380);
        p[1].fazerAniver();
        System.out.println(l[1].detalhes());
        
        l[2].abrir();
        l[2].folhear(140);
        System.out.println(l[2].detalhes());
        
        
        
        
    }
    
}
