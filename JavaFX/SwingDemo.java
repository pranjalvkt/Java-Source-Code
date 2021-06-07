import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingDemo
{
    public static void main(String[] args) {
        Abc obj = new Abc();
    }
}
class Abc extends JFrame // card layout
{
    public Abc()
    {
        //setLayout(); // flow, grid
        JLabel l = new JLabel("Namaste!");
        JLabel l1 = new JLabel("Hello");
        
        add(l);
        add(l1);

        setVisible(true);

        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}