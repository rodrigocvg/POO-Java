import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada; 

    /* Regras da luta
        - Só pode ser marcada entre lutadores da mesma categoria
        - Desafiado e Desafiante devem ser lutadores diferentes
        - Só pode acontecer se estiver aprovada
        - Só pode ter como resultado a vitória, derrota ou empate
    */
    

    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria()==l2.getCategoria() && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }
        else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }

        
    }

    public void lutar(){
        if(this.aprovada){
            System.out.println("### DESAFIADO: ");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE: ");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            System.out.println("====== RESULTADO DA LUTA ==========");
            switch(vencedor){
                case 0: //Empate
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: //Desafiado vence
                    System.out.println("Vitória do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: //Desafiante vence
                System.out.println("Vitória do " + this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            } 
        }
        else{
            System.out.println("Luta não pode acontecer");
        }





    }

    //Métodos Especiais
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }







}
