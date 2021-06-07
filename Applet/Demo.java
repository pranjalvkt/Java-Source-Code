import java.applet.*;
import java.awt.*;

/* 
<applet code="Demo.class" width="300" height="300"> 
</applet> 
*/

public class Demo extends Applet {

    public void paint(Graphics graphics) {
        graphics.drawString("Hello World", 150, 150);
        graphics.drawOval(40, 40, 130, 170);
        graphics.setColor(Color.BLACK); 
        graphics.fillOval(80, 80, 15, 15); 
        graphics.fillOval(140, 80, 15, 15); 
 
        graphics.drawArc(90, 150, 50, 20, 180, 180); 
    }

}
