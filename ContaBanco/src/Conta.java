public class Conta {
    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private Boolean status;
    
    
    //Métodos
    public void Caneta(){    //Método Construtor
        this.saldo = 0;
        this.status = false;
    }

    public void estadoAtual(){
        System.out.println("--------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    void abrirConta(String tipoConta){
        this.setTipo(tipoConta);
        this.setStatus(true);
        if(tipoConta == "CC"){
            this.setSaldo(50);
        }
        if(tipoConta == "CP"){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");

    }

    void fecharConta(){
        if(this.status == true && this.saldo == 0){
            this.setStatus(false);
        }
        else if(this.getSaldo()>0){
            System.out.print("Conta com dinheiro");
        }
        else{ 
            System.out.print("Conta em débito");
        }
    }
    
    void depositar(float v){
        if(this.getStatus()){
        // this.saldo = this.saldo + v
        this.setSaldo( this.getSaldo() + v );
        }
        else{
            System.out.print("Ocorreu um erro, essa conta não está ativa");
        }
    }

    void sacar(float v){
        if(this.getStatus()){
            if(this.saldo > 0){
            // this.saldo = this.saldo - v
            this.setSaldo( this.getSaldo() - v);
            }
            else{
                System.out.print("Conta sem saldo");
            }
        }
        else{
            System.out.print("Ocorreu um erro, essa conta não está ativa");
        }
        

            
    }

    void pagarMensal(){
        float v;
        if(this.getTipo() == "CC"){
        v = 12;
        }
        else{
            v = 20;
        }
        if(this.getStatus()){ 
            if(this.getSaldo() > v){
                this.setSaldo( this.getSaldo() - v);
                }
        }
        else{
            System.out.print("Ocorreu um erro, essa conta não está ativa");
        }
    }
    public String getDono() {
        return dono;
    }
    public int getNumConta() {
        return numConta;
    }
    public float getSaldo() {
        return saldo;
    }
    public Boolean getStatus() {
        return status;
    }
    public String getTipo() {
        return tipo;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}

