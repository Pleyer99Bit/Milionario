public class App {
    public static void main(String[] args) throws Exception {
        Frame f = new Frame();
        Creazione c = new Creazione();
        String[] r = new String[3];//Creazione domandande di prova
        r[0] ="TestRisposta";
        r[1] ="TestRisposta";
        r[2] ="TestRisposta";
        c.Crea("TestDomanda1", r, "TestRispGiust", 1);
        String[] r1 = new String[3];
        r[0] ="TestRisposta";
        r[1] ="TestRisposta";
        r[2] ="TestRisposta";
        c.Crea("TestDomanda2", r1, "TestRispGiust", 1);
        Quesito q = new Quesito();
        q = c.Random();
        f.setDomanda(q.getDomanda());
        String[] risposte = new String[3];
        risposte = q.getRisposte();
        f.setR1(risposte[0]);
        f.setR2(risposte[1]);
        f.setR3(risposte[2]);
        f.setR4(q.getRispostaGiusta());
        //System.out.println(q);
       // System.out.println(q.getDomanda());
        //System.out.println(c.Random());
        
    }
}
