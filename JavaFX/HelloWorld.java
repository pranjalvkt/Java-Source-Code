import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorld
{
    public static void main(String[] args) {
        Hello obj = new Hello();
        obj.setVisible(true);
    }
}

class Hello extends JFrame
{
    public Hello()
    {
        JLabel l = new JLabel("Hello World !");
        add(l);

        setSize(400, 400);
    }
}