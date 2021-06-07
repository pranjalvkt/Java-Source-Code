import java.util.EventListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;



public class AddGUI
{
    public static void main(String[] args) {
        Addition obj = new Addition();
    }
   
}
class Addition extends JFrame implements ActionListener
{
    public Addition()
    {
        
        JTextField t1 = new JTextField(20);
        JTextField t2 = new JTextField(20);

        JButton b = new JButton();

        JLabel l = new JLabel("Result");

        add(t1);
        add(t2);
        add(b);
        add(l);

        b.addActionListener(null);


        setVisible(true);
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(actionEvent ae)
    {

    }
}