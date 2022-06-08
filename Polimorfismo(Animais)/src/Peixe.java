public class Peixe extends Animal{

    private String corEscama;


    public void soltarBolha(){
        System.out.println("Soltar bolha");
    }

    @Override
    public void locomover() {
        // TODO Auto-generated method stub
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        // TODO Auto-generated method stub
        System.out.println("Comendo substâncias");
    }

    @Override
    public void emitirSom() {
        // TODO Auto-generated method stub
        System.out.println("Peixe não faz som");
    }

    public String getCorEscama() {
        return corEscama;
    }
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
