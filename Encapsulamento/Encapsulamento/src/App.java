//import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        ControleRemoto c = new ControleRemoto();
         c.ligar();
        c.maisVolume();
        c.ligarMudo();
        c.play();
        c.abrirMenu();
        c.fecharMenu();
        /*
        Scanner x = new Scanner(System.in);
        c.volume = x.nextInt();
        x.close()
        System.out.println(c.volume);
        */

        

    }
}
