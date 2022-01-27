package aula05;
public class ContaBanco {
    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    // Métodos Personalizados
    public void estadoAtual(){
        System.out.println("----------------------------------");
        System.out.println("CONTA: " + this.getNumConta());
        System.out.println("TIPO CONTA: " + this.getTipo());
        System.out.println("DONO: " + this.getDono());
        System.out.println("SALDO: " + this.getSaldo());
        System.out.println("STATUS: " + this.getStatus());
        System.out.println("-------------------------------------");
    }
    
    
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        }else if ( t == "CP"){
            this.setSaldo(150);
        }
        System.out.println("CONTA ABERTA COM SUCESSO!");
     
    }
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("CONTA COM DINHEIRO! CONTA NÃO PODE SER FECHADA");
        }else if ( this.getSaldo() < 0){
            System.out.println("CONTA EM DÉBITO! CONTA NÃO PODE SER FECHADA");
        }else {
            this.setStatus(false);
            System.out.println("CONTA FECHADA COM SUCESSO!");

        }
    }
    public void depositar(float v){
       if (this.getStatus()){
           this.setSaldo(this.getSaldo() + v);
           System.out.println("DEPOSITO REALIZADO NA CONTA DE " + this.getDono());
       } else {
           System.out.println("IMPOSSÍVEL DEPOSITAR EM UM CONTA FECHADA!");
       }
    }
   public void sacar(float v){
       if (this.getStatus()){
           if (this.getSaldo() >= v){
               this.setSaldo(this.getSaldo() - v);
               System.out.println("SAQUE REALIZADO DA CONTA DE " + this.getDono());
           }else {
               System.out.println("SALDO INSUFICIENTE PARA SAQUE!");
           }
       }else{
           System.out.println("IMPOSSÍVEL SACAR DE UMA CONTA FECHADA!");
       }
   }
     
   public void pagarMensalidade(){
       int v = 0;
       if (this.getTipo() == "CC") {
           v = 12;
       } else if (this.getTipo() == "CP"){
           v = 20;
       }
       if (this.getStatus()){
           this.setSaldo(this.getSaldo() - v);
           System.out.println("MENSALIDADE PAGA COM SUCESSO POR " + this.getDono());
       } else{
           System.out.println("IMPOSSIVEL PAGAR UMA CONTA FECHADA");
       }
    }
   
   //Métodos Especiais
    public ContaBanco(){
        this.saldo = 0.0f;
        this.status = false;
    }
   
   

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
  

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }
    
    

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
   
   
}
