package aula05;
public class Aula05 {
    public static void main(String[] args) {
        
        ContaBanco p1 = new ContaBanco();
        p1.abrirConta("CC");
        p1.setNumConta(1234);
        p1.setDono("RUBENS");
        
        p1.sacar(25);
        
        p1.estadoAtual();
        
        
        ContaBanco p2 = new ContaBanco();
        p2.abrirConta("CP");
        p2.setNumConta(4567);
        p2.setDono("Maria");
        
        p2.depositar(100);
        p2.fecharConta();
        p2.sacar(250);
        p2.fecharConta();
        
        p2.estadoAtual();
        
        
    }
    
}
