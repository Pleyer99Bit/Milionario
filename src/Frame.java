import java.awt.*;
import javax.swing.*;
public class Frame extends JFrame{
    private JFrame f;
    public String domanda ,r1 ,r2 ,r3 ,r4;
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
        JLabel l = new JLabel(domanda);
        p.add(l);
        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        c.add(p1,BorderLayout.SOUTH);
        p1.add(new JButton(r1));
        p1.add(new JButton(r2));
        p1.add(new JButton(r3));
        p1.add(new JButton(r4));
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
    }
    public void setR1(String r1){
        this.r1 = r1;
    }
    public void setR2(String r2){
        this.r2 = r2;        
    }
    public void setR3(String r3){
        this.r3 = r3;
    }
    public void setR4(String r4){
        this.r4 = r4;
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
}
