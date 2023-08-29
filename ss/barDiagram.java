import java.awt.*;
import javax.swing.*;

public class barDiagram extends JPanel{
	public void paint(Graphics g){
		super.paint(g);

		int barWidth = 50;
		int startX = 100;
		int maxHeight = 550;
		int barSpacing = 50;

		int[] data = { 65,50,75,90 }; 
		int total = 280;
		String[] names = { "JAVA", "PHP", "PYTHON", "goLANG" }; 
		Color[] colors = { Color.RED, Color.GREEN, Color.BLUE, Color.BLACK }; 
    
	    for (int i = 0; i < data.length; i++) {
            int h = (maxHeight * data[i]) / total;
            g.setColor(colors[i]);
            g.fillRect(startX, maxHeight - h, barWidth, h);
            g.drawString(names[i], startX, maxHeight + 15);
            startX += barWidth + barSpacing;
        }
		drawScale(g, startX + barWidth + barSpacing, maxHeight);
	}
	private void drawScale(Graphics g, int x, int maxHeight) {
		g.setColor(Color.BLACK);
		for (int i = 0; i <= 10; i+=2) {
    		int y = maxHeight - (maxHeight * i / 28);
    		g.drawLine(x, y, x + 10, y);
	   		g.drawString(Integer.toString(i * 10), x + 15, y);
		}
	}
	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.setSize(700,700);
		barDiagram bd = new barDiagram();
		frame.add(bd);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}