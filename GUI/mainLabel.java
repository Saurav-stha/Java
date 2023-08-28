import javax.swing.*;
import java.awt.*;// has "Color"

class mainLabel{
	public static void main(String [] args){

		//jpanel == a gui component that functions as a container to hold other components
		JPanel redPanel =new JPanel();
		redPanel.setBackground(Color.RED);
		redPanel.setBounds(0,0,150,150);

		JPanel bPanel =new JPanel();
		bPanel.setBackground(Color.BLUE);
		bPanel.setBounds(150,0,150,150);

		JPanel gPanel =new JPanel();
		gPanel.setBackground(Color.GREEN);
		gPanel.setBounds(0,150,300,150);
		gPanel.setLayout(new BorderLayout());

		JLabel label = new JLabel();
		label.setText("YOLO!!");
		label.setVerticalAlignment(JLabel.BOTTOM);
		label.setHorizontalAlignment(JLabel.RIGHT);

		JFrame jf = new JFrame();
		jf.setVisible(true);
		jf.setSize(450,450);
		jf.setLayout(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		gPanel.add(label);
		jf.add(redPanel);
		jf.add(bPanel);
		jf.add(gPanel);

	}
}