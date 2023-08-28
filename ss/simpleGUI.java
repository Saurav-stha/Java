import java.awt.*;
import javax.swing.*;

public class simpleGUI extends Frame{
	public simpleGUI(){
		setSize(800,800);
	}
	public void paint(Graphics g){
		super.paint(g);

		// g.setColor(Color.RED);
		// g.fillRect(50,0,240,200);
		
		// g.setColor(Color.RED);
		// g.fillOval(80,80,150,150);


		//pentagon
		g.setColor(Color.BLUE);
		int[] xValues = {200, 300, 400, 350, 250};
        int[] yValues = {100, 50, 100, 200, 200};
		Polygon polygon1 = new Polygon(xValues, yValues, 5);
		g.fillPolygon(polygon1);

		//text below the figure
        Font timesNewRomanFont = new Font("Times New Roman", Font.PLAIN, 24);
		g.setFont(timesNewRomanFont);
		g.drawString("Circle and Rectangle",200,400);
	}
	public static void main(String [] args){
		new simpleGUI().setVisible(true);
	}
}