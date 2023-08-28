import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
	

public class internalBorderlayout{
	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.setSize(300,150);
		frame.setLayout(new BorderLayout());

		JLabel label1 = new JLabel();
		JPanel panel1 = new JPanel();
		label1.setText("Label 1");
		panel1.add(label1);
		frame.add(panel1,BorderLayout.WEST);

		JLabel label2 = new JLabel();
		JPanel panel2 = new JPanel();
		label2.setText("Label 2");
		panel2.add(label2);
		frame.add(panel2,BorderLayout.EAST);

		JPanel panel3 = new JPanel();
		panel3.add(new JButton("Button 1"));
		frame.add(panel3,BorderLayout.CENTER);
		JPanel panel4 = new JPanel();
		panel4.add(new JButton("Button 2"));
		frame.add(panel4, BorderLayout.NORTH);
		JPanel panel5 = new JPanel();
		panel5.add(new JButton("Button 3"));
		frame.add(panel5,BorderLayout.SOUTH);
		frame.setVisible(true);
	}
}