public class Funcionario extends Pessoa{
    
    private String setor;
    private boolean trabalhando;

    //Métodos
    public void mudarTrabalho(String set){
        if(this.trabalhando){
        this.setSetor(set);
        }
        else{
            System.out.println("Esse funcionário não está trabalhando");
        }
    }
    //Métodos especiais
    public String getSetor() {
        return setor;
    }
    public boolean getTrabalhando() {
        return trabalhando;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
