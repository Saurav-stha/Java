import java.awt.*;
import javax.swing.*;

class mainGridlayout {
	public static void main(String [] args){

		//Gridlayout =  places components in grid of cells.
		//				each comp takes all available space within its cell
		//				and all cell are of same size.

		JFrame frame = new JFrame();
		frame.setSize(420,420);
		frame.setTitle("THis is me!!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //default is HIDE_ON_CLOSE

		frame.setLayout(new GridLayout(6,1));

		frame.add(new JButton("b1"));
		frame.add(new JButton("b2"));
		frame.add(new JButton("b3"));
		frame.add(new JButton("b4"));
		frame.add(new JButton("b5"));
		frame.add(new JButton("b6"));

		frame.setVisible(true);

	}
}
