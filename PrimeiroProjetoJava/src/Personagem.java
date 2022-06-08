public class Personagem {
    String nome;
    int força;
    int nivel;
    int hp;


    void printPersonagem(){
        System.out.format("Personagem %s, força %d e nível %d",nome,força,nivel);
        
    }

    void atacar(String alvo){
        System.out.format("\nPersonagem %s atacou %s",nome,alvo,nivel);
    }

}
