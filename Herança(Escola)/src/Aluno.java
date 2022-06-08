public class Aluno extends Pessoa{
    private int matr;
    private String curso;


    //Métodos
    public void cancelarMatr(){
            System.out.println("Matrícula será cancelada");
    }

    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade de aluno " + this.getNome());
    }

    //Métodos especiais
    public String getCurso() {
        return curso;
    }
    public int getMatr() {
        return matr;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setMatr(int matr) {
        this.matr = matr;
    }

}
