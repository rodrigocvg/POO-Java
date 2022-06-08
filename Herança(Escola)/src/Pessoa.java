//Classe mãe, progenitora ou superclasse
public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;


//Métodos

public void fazerAniv(){
    this.idade++;
    //this.setIdade(getIdade() +1);
}

public int getIdade() {
    return idade;
}
public String getNome() {
    return nome;
}
public String getSexo() {
    return sexo;
}
public void setIdade(int idade) {
    this.idade = idade;
}
public void setNome(String nome) {
    this.nome = nome;
}
public void setSexo(String sexo) {
    this.sexo = sexo;
}

@Override
public String toString() {
    // TODO Auto-generated method stub
    return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "}";
}


}