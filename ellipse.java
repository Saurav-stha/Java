import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class ellipse extends Frame{
	ellipse(){
		setSize(700,700);
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	public void paint(Graphics g){
		g.drawOval(100,100,540,440);
		g.setFont(new Font("Sans Serif",Font.ITALIC,40));
		g.drawString("Pokhara University",240,290);
	}
	public static void main(String [] args){
		new ellipse().setVisible(true);
	}
}