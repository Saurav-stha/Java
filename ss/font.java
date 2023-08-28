import java.awt.*;
import java.awt.event.*;
class font extends Frame{
	font(){
		setSize(400,400);
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}
	public void paint(Graphics g){
		super.paint(g);

		Font font = new Font("Sans Serif",Font.BOLD,24);
		g.setFont(font);
		g.setColor(Color.BLUE);
		g.drawString("saurav shrestha",100,100);
	}

	public static void main(String [] args){
		new font().setVisible(true);
	}	

}