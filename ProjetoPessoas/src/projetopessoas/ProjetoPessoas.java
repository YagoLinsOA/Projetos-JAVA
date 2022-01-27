package projetopessoas;
public class ProjetoPessoas {
    public static void main(String[] args) {
        //Programa Principal
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Paulo");
        p2.setNome("Ruben");
        p3.setNome("Tarcizo");
        p4.setNome("Maria");
        
        p1.setIdade(22);
        p2.setIdade(34);
        p3.setIdade(56);
        
        p4.setSexo("F");
        p3.setSexo("M");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
                                         
    }
    
}
