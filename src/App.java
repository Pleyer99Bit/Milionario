public class App {
    public static void main(String[] args) throws Exception {
        Creazione c = new Creazione();
        String[] r = new String[3];//Creazione domandande di prova
        r[0] ="TestRisposta";
        r[1] ="TestRisposta";
        r[2] ="TestRisposta";
        c.Crea("TestDomanda1", r, "TestRispGiust", 1);
        String[] r1 = new String[3];
        r1[0] ="TestRisposta";
        r1[1] ="TestRisposta";
        r1[2] ="TestRisposta";
        c.Crea("TestDomanda2", r1, "TestRispGiust", 1);
        c.Random();
    }
}
