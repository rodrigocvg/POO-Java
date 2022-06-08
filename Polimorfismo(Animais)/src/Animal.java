public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int membros;

    public abstract void locomover();     // POLIFORMISMO DE SOBREPOSIÇÃO (MESMA ASSINATURA)
    public abstract void alimentar();
    public abstract void emitirSom();

    public int getIdade() {
        return idade;
    }
    public float getPeso() {
        return peso;
    }
    public int getMembros() {
        return membros;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setMembros(int membros) {
        this.membros = membros;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    
}
