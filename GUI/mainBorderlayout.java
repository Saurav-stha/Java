import java.awt.BorderLayout;
import java.awt.*;
import javax.swing.*;

class mainBorderlayout {
	public static void main(String [] args){

		//BORDERLAYOUT = places components in north south west east and center
		//					all extra space stored in center 


		JFrame frame = new JFrame();
		frame.setSize(420,420);
		frame.setTitle("THis is me!!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //default is HIDE_ON_CLOSE

		frame.setLayout(new BorderLayout(10,10));

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel();

		p1.setBackground(Color.BLUE);
		p2.setBackground(Color.RED);
		p3.setBackground(Color.GREEN);
		p4.setBackground(Color.YELLOW);
		p5.setBackground(Color.ORANGE);

		p1.setPreferredSize(new Dimension(100,100));
		p2.setPreferredSize(new Dimension(100,100));
		p3.setPreferredSize(new Dimension(100,100));
		p4.setPreferredSize(new Dimension(100,100));
		p5.setPreferredSize(new Dimension(100,100));

		//can make sub-panels

		frame.add(p1,BorderLayout.NORTH);
		frame.add(p2,BorderLayout.EAST);
		frame.add(p3,BorderLayout.WEST);
		frame.add(p4,BorderLayout.CENTER);
		frame.add(p5,BorderLayout.SOUTH);

		frame.setVisible(true);

	}
}