package aula011;
public class Técnico extends Aluno {
       public void registroProfissionalPratico(){
           System.out.println("Número do Registro Profissioanal: 2255");
       }

    @Override
    public String toString() {
        return "Técnico{" +  " de nome = " + this.getNome() + ", idade = " + this.getIdade() + ", sexo = " + this.getSexo() + " ,de matricula = " + this.getMatricula() + ", curso = " + this.getCurso() + '}';

    }
       
}
