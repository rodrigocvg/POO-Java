public class App {
    public static void main(String[] args) throws Exception {
        
        //Pessoa p1 = new Pessoa(); // ERRO ----- CLASSE ABSTRATA NÃO PODE SER INSTANCIADA
        Aluno a1 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        Visitante v1 = new Visitante();
        
        //p1.setNome("Pedro");
        a1.setNome("Maria");
        p3.setNome("Cláudio");
        p4.setNome("Fabiana");


        //p1.setSexo("Masculino");
        a1.setSexo("Feminino");

        a1.setIdade(18);

        a1.setCurso("Informática");

        p3.setSalario(2500);

        p4.setSetor("Estoque");
        
        
        v1.setIdade(22);
        v1.setNome("Juvenal");
        v1.setSexo("Masculino");

        a1.pagarMensalidade();
        Bolsista b1 = new Bolsista();
        b1.setIdade(17);
        b1.setNome("Lucas");
        b1.setSexo("Masculino");
        b1.setMatr(1122);
        b1.setBolsa(500f);
        b1.pagarMensalidade();

        //System.out.println(p1.toString());
        System.out.println(a1.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(v1.toString());

    }
}
