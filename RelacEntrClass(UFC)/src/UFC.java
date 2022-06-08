public class UFC {
    public static void main(String[] args) throws Exception {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Charles do Bronx","Brasil",31,1.78f,
                                70.2f,11,2,1);
        l[1] = new Lutador("Dustin Poirier","Estados Unidos",31,1.75f,
                                70.2f,8,2,5);
        l[2] = new Lutador("Israel Adesanya","Nigérias",30,1.93f,
                                83.2f,15,6,1);
        l[3] = new Lutador("Robert Whittaker","Australia",29,1.82f,
                                82.9f,12,0,2);
        l[4] = new Lutador("Ciryl Gane","França",30,1.95f,
                                120.2f,2,2,3);
        l[5] = new Lutador("Augusto Sakai","Brasil",30,1.90f,
                                120.1f,15,4,1);
        
        
        /*for(int i =0;i<6;i++){
            l[i].status();
        } */
        Luta UFC01 = new Luta();
        UFC01.marcarLuta(l[0], l[1]);
        UFC01.lutar();
        
        



        
    }
}
