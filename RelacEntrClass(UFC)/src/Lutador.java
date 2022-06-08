public class Lutador {
        private String nome;
        private String nacionalidade;
        private int idade;
        private float altura;
        private float peso;
        private String categoria;
        private int vitorias;
        private int derrotas;
        private int empates;

//Métodos Públicos
public void apresentar(){
    System.out.println("Lutador: " + this.getNome());
    System.out.println("Diretamente de: " + this.getNacionalidade());
    System.out.println("Com " + this.getIdade() + " anos e " + this.getAltura() + " de altura");
    System.out.println("Pesando " + this.getPeso() + " kg");
    System.out.println(this.getVitorias() + " vitórias");
    System.out.println(this.getDerrotas() + " derrotas");
    System.out.println(this.getEmpates() + " empates");


}   

public void status(){
    System.out.println(this.getNome() + "é um peso " + this.getCategoria());
    System.out.println("Ganhou " + this.getVitorias() + " vezes");
    System.out.println("Perdeu " + this.getDerrotas() + " vezes");
    System.out.println("Empatou " + this.getEmpates() + " vezes");
}

public void ganharLuta(){
    this.setVitorias(this.getVitorias()+1);
}

public void perderLuta(){
    this.setDerrotas(this.getDerrotas()+1);
}

public void empatarLuta(){
    this.setEmpates(this.getEmpates()+1);
}
//Métodos especiais
public Lutador(String no,String na,int id,float al,float pe,int vi,int de,int em){
    this.nome = no;
    this.nacionalidade = na;
    this.idade = id;
    this.altura = al;
    this.setPeso(pe);
    this.vitorias = vi;
    this.derrotas = de;
    this.empates = em;
}
public float getAltura() {
    return altura;
}

public String getCategoria() {
    return categoria;
}

public int getDerrotas() {
    return derrotas;
}

public int getEmpates() {
    return empates;
}

public int getIdade() {
    return idade;
}

public String getNacionalidade() {
    return nacionalidade;
}

public String getNome() {
    return nome;
}

public float getPeso() {
    return peso;
}

public int getVitorias() {
    return vitorias;
}

public void setAltura(float altura) {
    this.altura = altura;
}

private void setCategoria() {
    if(this.getPeso()<52.2){
    this.categoria = "Inválido";
    }
    else if(this.getPeso()<=70.3){
        this.categoria = "Leve";
    }
    else if(this.getPeso()<=83.9){
        this.categoria = "Médio";
    }
     else if(this.getPeso()<=120.2){
         this.categoria = "Pesado";
     }
     else{
         this.categoria = "Inválido";
     }
}

public void setDerrotas(int derrotas) {
    this.derrotas = derrotas;
}

public void setEmpates(int empates) {
    this.empates = empates;
}

public void setIdade(int idade) {
    this.idade = idade;
}

public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
}

public void setNome(String nome) {
    this.nome = nome;
}

public void setPeso(float peso) {
    this.peso = peso;
    this.setCategoria();
}

public void setVitorias(int vitorias) {
    this.vitorias = vitorias;
}

}