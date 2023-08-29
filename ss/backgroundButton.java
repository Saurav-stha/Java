import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class backgroundButton extends JFrame implements ActionListener{
	JButton b1;
	JButton b2;
	backgroundButton(){
		b1= new JButton();
		b1.setText("RED");
		b1.addActionListener(this);

		b2= new JButton();
		b2.setText("BLUE");
		b2.addActionListener(this);

		setVisible(true);
		setSize(360,100);
		setLayout(new FlowLayout());
		setTitle("Java Application for testing");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(b1);
		add(b2);
	}
	public void actionPerformed(ActionEvent ae){
		if (ae.getSource()==b1){
			this.getContentPane().setBackground(Color.RED);

		}if(ae.getSource()==b2){
			this.getContentPane().setBackground(Color.BLUE);
		}
	}
	public static void main(String [] args){
		new backgroundButton();
	}
}