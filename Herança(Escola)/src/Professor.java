public class Professor extends Pessoa {
    
    private String especialidade;
    private float salario;

    //Métodos
    public void receberAum(float valor){
        this.salario += valor;
        //this.setSalario(this.getSalario() + valor);
    }
    //Métodos especiais
    public String getEspecialidade() {
        return especialidade;
    }
    public float getSalario() {
        return salario;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    



}
