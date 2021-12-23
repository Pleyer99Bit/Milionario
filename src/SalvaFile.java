import java.io.*;
import java.util.*;
public class SalvaFile extends Creazione {
    public SalvaFile(){
        super();
    }
    public SalvaFile(String domanda, String[] risposte, String rispostaGiusta, int diff,ArrayList quesiti){
        super(domanda, risposte, rispostaGiusta, diff, quesiti);
    }
    public void recupera(){
        try {//In teoria qua si dovrebbe leggere e impostare i valori letti in "quesiti"
            FileInputStream fis = new FileInputStream("Quesiti.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Quesito r;
            ArrayList quesitiLetti = new ArrayList<Quesito>();//??
            while(fis.available()>0){
                r=(Quesito)ois.readObject();
                quesitiLetti.add(r);//??
            }
            super.setQuesiti(quesitiLetti);//??
        }catch(Exception e) {
            System.out.println(e);
        }
    }
    public void salva(){//in questo caso recupero i valori di "quesiti" ... 
        ArrayList q = new ArrayList<Quesito>();
        q = super.getQuesiti();
        try {//... e qua l'inserisco all'interno del file 
            FileOutputStream fos = new FileOutputStream("Quesiti.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for(int i=0;i<q.size();i++){
                Object r=q.get(i);
                oos.writeObject(r);
            }
            oos.close ();
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
