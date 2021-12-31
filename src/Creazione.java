import java.io.Serializable;
import java.util.*;
public class Creazione extends Quesito implements Serializable{
    private ArrayList<Quesito> quesiti = new ArrayList<Quesito>();
    public Creazione(){
        super();
    }
    public Creazione(String domanda, String[] risposte, String rispostaGiusta, int diff,ArrayList quesiti){
        super(domanda,risposte,rispostaGiusta,diff);
        this.quesiti = quesiti;
    }
    public void setQuesiti(ArrayList quesiti){
        this.quesiti =  quesiti;
    }
    public ArrayList getQuesiti(){
        return this.quesiti;
    }
    public void Crea(String d,String[] r, String rg,int diff1){
        Quesito q = new Quesito(d,r,rg,diff1);
        quesiti.add(q);
    }
    public void Random(){
        double rand = Math.random();
        Frame f = new Frame();
        int i = (int)(rand * this.quesiti.size());
        Quesito q = new Quesito();
        q = this.quesiti.get(i);
        f.setDomanda(q.getDomanda());
        String[] risposte = new String[3];
        risposte = q.getRisposte();
        f.setR1(risposte[0]);
        f.setR2(risposte[1]);
        f.setR3(risposte[2]);
        f.setR4(q.getRispostaGiusta());
        f.setGiusto(q.getRispostaGiusta());
    }

}
