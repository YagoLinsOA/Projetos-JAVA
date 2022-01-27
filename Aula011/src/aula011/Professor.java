package aula011;
public class Professor extends Pessoa {
    private String especialidade;
    private float salario;
    private float aumento;
    
    public void receberAumento(){
        System.out.println("Sálario antigo: " + this.getSalario());
        this.salario = this.salario + this.aumento;
        System.out.println("Aumento de salário de " + this.getAumento());
        System.out.println("Novo sálario após aumento: " + this.getSalario());
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getAumento() {
        return aumento;
    }

    public void setAumento(float aumento) {
        this.aumento = aumento;
    }

    @Override
    public String toString() {
        return "Professor{" + " de nome = " + this.getNome() + " ,idade = " + this.getIdade() + " ,sexo = " + this.getSexo() + " ,de especialidade = " + especialidade + ", e de salario = " + salario + " ,com o aumento = " + aumento + '}';
    }
    
    
}
