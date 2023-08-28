import javax.swing.*;
import java.awt.event.*;

public class myButton extends JFrame implements ActionListener{

	JButton button;
	myButton(){
		// ImageIcon icon = new ImageIcon("./sth.jpg");

		button = new JButton();
		button.setBounds(10,10,200,400);
		button.addActionListener(this);
		button.setText("Does this work?");
		button.setFocusable(false);
		// button.setIcon(icon);


		this.setVisible(true);
		this.setSize(800,800);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(button);
	}
	public void actionPerformed(ActionEvent e){
		if (e.getSource()==button){
			System.out.println("yolo this works!!");

		}
	}
	public static void main(String [] args){
		new myButton();
	}
}