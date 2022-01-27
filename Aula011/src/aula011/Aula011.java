package aula011;
public class Aula011 {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();
        Visitante v1 = new Visitante();
        v1.setNome("Ruben");
        v1.setIdade(28);
        v1.setSexo("Masculino");
        v1.fazerAniver();
        System.out.println(v1.toString());
        System.out.println("---------------------");
        
        Aluno a1 = new Aluno();
        
        a1.setNome("Paulo");
        a1.setMatricula(1212);
        a1.setCurso("Matemática");
        a1.setIdade(18);
        a1.setSexo("M");
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        System.out.println("----------------------");
       
        Bolsista b1 = new Bolsista();
        
        b1.setNome("Gustavo");
        b1.setCurso("Informática");
        b1.setIdade(22);
        b1.setSexo("M");
        b1.setMatricula(2233);
        b1.setBolsa(22.5f);
        b1.pagarMensalidade();
        System.out.println(b1.toString());
        System.out.println("----------------------");
        
        Técnico t1 = new Técnico();
        
        t1.setNome("Maria");
        t1.setCurso("Contabilidade");
        t1.setIdade(19);
        t1.setSexo("F");
        t1.setMatricula(2234);
        t1.registroProfissionalPratico();
        System.out.println(t1.toString());
        System.out.println("------------------------------");
        
        Professor p1 = new Professor();
        
        p1.setNome("Leda");
        p1.setIdade(65);
        p1.setSexo("F");
        p1.setEspecialidade("Colegial");
        p1.setSalario(5320.50f);
        p1.setAumento(1500.30f);
        p1.receberAumento();
        p1.setAumento(500f);
        System.out.println(p1.toString());
        
        
       
        
    }
    
}
