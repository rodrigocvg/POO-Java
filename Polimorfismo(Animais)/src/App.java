

public class App {
    public static void main(String[] args) throws Exception {




        Mamífero m = new Mamífero();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();

        m.setPeso(85.3f);
        m.setIdade(2);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom(); 

        System.out.println("-------------------------");

        c.setPeso(68.2f);
        c.setIdade(5);
        c.setMembros(4);
        c.locomover();
        c.alimentar();
        c.emitirSom(); 
        c.usarBolsa();

        System.out.println("-------------------------");

        k.setPeso(8);
        k.setIdade(2);
        k.setMembros(4);
        k.locomover();
        k.alimentar();
        k.emitirSom(); 
        k.abanarRabo();

        System.out.println("-------------------------");
        k.reagir("Olá");
        k.reagir("Vai apanhar");
        k.reagir(11,45);
        k.reagir(21,00);
        k.reagir(true);
        k.reagir(false);
        k.reagir(2,12.5f);
        k.reagir(17,4.5f);









        
       /*
       Mamífero m = new Mamífero();
       Réptil r = new Réptil();
       Peixe p = new Peixe();
       Ave a = new Ave();

        m.setPeso(85.3f);
        m.setIdade(2);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();


        p.setPeso(0.35f);
        p.setIdade(1);
        p.setMembros(0);
        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.soltarBolha();


        a.setPeso(0.89f);
        a.setIdade(2);
        a.setMembros(2);
        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();
        */








    }
}
