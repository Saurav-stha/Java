import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class appletDemo extends Applet implements ActionListener{
	
	Button button = new Button("click ds");
	String str = "";
	public void init(){
		add(button);
		button.addActionListener(this);
	}
	public void paint(Graphics g){
		g.drawString(str,100,100);
	}
	public void actionPerformed(ActionEvent ae){
		str = "Rick Rolled!! ROFL";
		repaint();
	}
}