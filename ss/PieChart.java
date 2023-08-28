// In a class of 48 students, 20 of them aspire to become a web developer,
// 12 prefer to become a mobile app developer, 10 want to pursue a career in
// game development and the remaining wants to become a data scientist.
// Illustrate this data in a pie chart.

import javax.swing.*;
import java.awt.*;

public class PieChart extends JFrame{
    final int [] data = {20,12,10,6};
    final int sum = 48;

    PieChart(){
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paint(Graphics g){
        int startAngle = 0;

        //to convert data to angles
        int[] angles = new int[data.length];
        for(int i=0;i<data.length;i++){
            angles[i] = (int) (360 * data[i] / sum);
        }

        Color [] colors = {Color.red,Color.black,Color.green,Color.pink};
        //red color denotes web dev aspirant


        for(int i=0;i<data.length;i++){
            g.setColor(colors[i]);
            g.fillArc(50,50,200,200,startAngle, angles[i]);
            startAngle += angles[i];
        }
    }
    public static void main(String []args){
        new PieChart();
    }
}