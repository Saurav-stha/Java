import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class myButton extends JFrame implements ActionListener{

	JButton button;
	JLabel label;
	myButton(){
		// ImageIcon icon = new ImageIcon("./sth.jpg");

		label = new JLabel();
		label.setText("Peek-a-boo");
		label.setBounds(150,180,100,100);
		label.setVisible(false);

		button = new JButton();
		button.setBounds(100,100,200,100);
		button.addActionListener(this);
		button.setText("Does this work?");
		button.setFocusable(false); //disables box of text of button
		// button.setIcon(icon);
		button.setForeground(Color.CYAN);
		button.setBackground(Color.GRAY);
		button.setFont(new Font("Comic Sans",Font.BOLD,15));
		button.setBorder(BorderFactory.createEtchedBorder());
		//button.setEnable(false);

		this.setVisible(true);
		this.setSize(400,400);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(button);
		this.add(label);
	}
	public void actionPerformed(ActionEvent e){
		if (e.getSource()==button){
			// System.out.println("yolo this works!!");
			label.setVisible(true);

		}
	}
	public static void main(String [] args){
		new myButton();
	}
}