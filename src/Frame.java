import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Frame extends JFrame{
    private JFrame f;
    public String domanda ,r1 ,r2 ,r3 ,r4;
    private JLabel l = new JLabel(domanda);
    private JButton b1, b2, b3,b4;
    private int k = 0;
    public Frame(){
        Container c = this.getContentPane();
        JMenuBar b = new JMenuBar();
        setJMenuBar(b);
        b.add(new JMenu("Reset"));
        b.add(new JMenu("Impostazioni"));
        c.setLayout(new BorderLayout());
        JPanel p = new JPanel();
        c.add(p,BorderLayout.NORTH);
        p.setLayout(new FlowLayout());
        p.add(l);
        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        c.add(p1,BorderLayout.SOUTH);
        b1 = new JButton(r1);
        b2 = new JButton(r2);
        b3 = new JButton(r3);
        b4 = new JButton(r4);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        //ActionListener
        class AscoltatoreR1 implements ActionListener {
            public void actionPerformed(ActionEvent e){
                Creazione c = new Creazione();
                if(getR1() == c.getRispostaGiusta())
                    System.out.println("Risposta Giusta");
                else
                    System.out.println("Risposta Sbagliata");
                    k++;
                    if(kappa() == true){
                        System.out.println("Tentativi Finiti!");
                        k=0;
                    }
            } 
        }
        class AscoltatoreR2 implements ActionListener {
            public void actionPerformed(ActionEvent e){
                Creazione c = new Creazione();
                if(getR1() == c.getRispostaGiusta())
                    System.out.println("Risposta Giusta");
                else
                    System.out.println("Risposta Sbagliata");
                    k++;
                    if(kappa() == true){
                        System.out.println("Tentativi Finiti!");
                        k=0;
                    }
            } 
        }
        class AscoltatoreR3 implements ActionListener {
            public void actionPerformed(ActionEvent e){
                Creazione c = new Creazione();
                if(getR1() == c.getRispostaGiusta())
                    System.out.println("Risposta Giusta");
                else
                    System.out.println("Risposta Sbagliata");
                    k++;
                    if(kappa() == true){
                        System.out.println("Tentativi Finiti!");
                        k=0;
                    }
            } 
        }
        class AscoltatoreR4 implements ActionListener {
            public void actionPerformed(ActionEvent e){
                Creazione c = new Creazione();
                if(getR1() == c.getRispostaGiusta())
                    System.out.println("Risposta Giusta");
                else
                    System.out.println((String)getR1());
                    System.out.println("Risposta Sbagliata");
                    k++;
                    if(kappa() == true){
                        System.out.println("Tentativi Finiti!");
                        k=0;
                    }
            } 
        }

        b1.addActionListener(new AscoltatoreR1() );
        b2.addActionListener(new AscoltatoreR2() );
        b3.addActionListener(new AscoltatoreR3() );
        b4.addActionListener(new AscoltatoreR4() ); 

        setVisible(true);
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public Frame(String domanda, String r1, String r2, String r3, String r4){
        this.domanda = domanda;
        this.r1 = r1;
        this.r2 = r2;
        this.r3 = r3;
        this.r4 = r4;
    }
    public void setDomanda(String domanda){
        this.domanda = domanda;
        l.setText(domanda);
    }
    public void setR1(String r1){
        this.r1 = r1;
        b1.setText(r1);
    }
    public void setR2(String r2){
        this.r2 = r2;
        b2.setText(r2);        
    }
    public void setR3(String r3){
        this.r3 = r3;
        b3.setText(r3);
    }
    public void setR4(String r4){
        this.r4 = r4;
        b4.setText(r4);
    }
    public String getDomanda(){
        return this.domanda;
    }
    public String getR1(){
        return this.r1;
    }
    public String getR2(){
        return this.r2;
    }
    public String getR3(){
        return this.r3;
    }
    public String getR4(){
        return this.r4;
    }
    public Boolean kappa(){
        if(k == 3){
            return true;
        }
        return false;
    }
}