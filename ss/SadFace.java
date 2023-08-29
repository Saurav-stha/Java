import java.awt.*;
import java.awt.event.*;
public class SadFace extends Frame{
    public SadFace(){
        setSize(400,400);
        // setBackground(Color.GRAY);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });
    }
    public void paint(Graphics g){
        super.paint(g);

        //yellow round face
        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 200, 200);

        //black round eyes
        g.setColor(Color.BLACK);
        g.fillOval(95, 100, 20, 20); // change 90+x 100-x to change distance betwn eyes
        g.fillOval(185, 100, 20, 20);

        //upside down arc( frown )
        int x = 100;
        int y = 160;
        int width = 100;
        int height = 40;
        int startAngle = 180;// 0 for smileyface 180 for das
        int arcAngle = -180;
        g.drawArc(x, y, width, height, startAngle, arcAngle);
        
        }
    public static void main(String[] args) {
        new SadFace().setVisible(true);
    }
}