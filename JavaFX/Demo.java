import javax.swing.JFrame;
import javax.swing.JLabel;

public class Demo
{
    public static void main(String[] args) {
        NewClass obj = new NewClass();
    }
}
class NewClass extends JFrame
{
    public NewClass()
    {
        JLabel l = new JLabel("Hello");
        add(l);
        

        setVisible(true);
        
    }
}