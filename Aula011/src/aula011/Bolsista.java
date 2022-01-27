package aula011;
public class Bolsista extends Aluno {
    private float bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.getNome());
    }
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " É bolsista. Pagamento realizado com sucesso!");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public String toString() {
        return "Bolsista{" + " de nome = " + this.getNome() + ", idade = " + this.getIdade() + ", sexo = " + this.getSexo() + " ,de matricula = " + this.getMatricula() + ", curso = " + this.getCurso() + " ,e de bolsa de = " + bolsa + "%" + '}';
    }
    
}
