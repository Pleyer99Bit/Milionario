public class Quesito{
    private String domanda;
    private String[] risposte = new String [3];
    private String rispostaGiusta;
    private int diff;
    public Quesito(){
        domanda = "";
        rispostaGiusta = "";
        diff = 0;
    }
    public Quesito(String domanda, String[] risposte, String rispostaGiusta,int diff){
        this.domanda = domanda;
        this.risposte = risposte;
        this.rispostaGiusta = rispostaGiusta;
        this.diff = diff;
    }
    public void setDomanda(String domanda) {
        this.domanda=domanda;
    }
    public void setRispostaGiusta(String rispostaGiusta) {
        this.rispostaGiusta = rispostaGiusta;
    }
    public void setRisposte(String[] risposte) {
        this.risposte = risposte;
    }
    public void setDiff(int diff){
        this.diff = diff;
    }
    public String getDomanda(){
        return this.domanda;
    }
    public String[] getRisposte(){
        return this.risposte;
    }
    public String getRispostaGiusta(){
        return this.rispostaGiusta;
    }
    public int getDiff(){
        return this.diff;
    }
}
