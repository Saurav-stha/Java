import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class checkNumber extends JFrame implements ActionListener{
	JPanel jp = new JPanel();
	JTextField jtf = new JTextField("Enter a number(only):");
	JTextField jtf1 = new JTextField("(odd or even?)");
	JButton jb = new JButton("Check");
	checkNumber(){
		jp.setBounds(50,50,400,400);
		jtf1.setEditable(false);
		jb.addActionListener(this);
		jp.add(jtf);
		jp.add(jtf1);
		jp.add(jb);

		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.add(jp);
	}
	public static void main(String [] args){
		new checkNumber().setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		if (e.getSource()==jb){
			int k = Integer.parseInt(jtf.getText());
			if(k%2==0){
				jtf1.setText("Even");
			}
			else
				jtf1.setText("Odd");
		}	
	}
}