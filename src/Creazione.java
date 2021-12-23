import java.io.Serializable;
import java.util.*;
public class Creazione extends Quesito implements Serializable{
    private ArrayList quesiti = new ArrayList<Quesito>();
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
    public Object Random(){
        double rand = Math.random();
        int i = (int)rand * this.quesiti.size();
        return this.quesiti.get(i);
    }

}
