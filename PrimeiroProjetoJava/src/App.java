public class App {
    public static void main(String[] args) throws Exception {
        
        Personagem heroi = new Personagem();
        heroi.nome = "Ragnar";
        heroi.força = 100;
        heroi.nivel = 25;

        heroi.printPersonagem();

        Personagem vilao = new Personagem();
        vilao.nome = "Ivar";
        vilao.força = 98;
        heroi.nivel = 20;

        heroi.atacar(vilao.nome);

    }
}
