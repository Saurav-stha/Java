import java.awt.*;
import java.awt.event.*;

class flag extends Frame{
	flag(){
		setSize(500,500);
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}
	int x[]={10,80,30,80,10};
	int y[]={40,90,90,150,150};
	public void paint(Graphics g){
		super.paint(g);

		g.setColor(Color.green);
		g.fillRect(0,0,300,350);
		//flag
		//red polygons
		g.setColor(Color.RED);
		g.fillPolygon(x,y,5);
		//blue borders
		g.setColor(Color.BLUE);
		g.drawPolygon(x,y,5);
		//sun
		g.setColor(Color.white);
		g.fillOval(20,120,20,20);
		//moon
		g.drawArc(20,60,20,20,0,-180);
		//line
		g.setColor(Color.BLACK);
		g.drawLine(10,150,10,180);

		//my nepal writing
		Font f = new Font("Arial",Font.BOLD,24);
		g.setFont(f);
		g.drawString("MY NEPAL",10,200);

	}
	public static void main(String [] args){
		new flag().setVisible(true);
	}
}