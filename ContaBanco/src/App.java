public class App {
    public static void main(String[] args) throws Exception {
        
        Conta p1 = new Conta();
        p1.setNumConta(1111);
        p1.setDono("Rodrigo");
        p1.abrirConta(("CC"));
        p1.depositar(300);
        p1.estadoAtual();


        Conta p2 = new Conta();
        p2.setNumConta(2222);
        p2.setDono("Maria");
        p2.abrirConta(("CP"));
        p2.depositar(500);
        p2.estadoAtual();










    }
}
