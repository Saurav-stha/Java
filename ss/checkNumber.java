import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class checkNumber extends JFrame implements ActionListener{
	JTextField jtf = new JTextField("44");
	JTextField jtf1 = new JTextField("(odd or even?)");
	JButton jb = new JButton("Check");
	checkNumber(){
		JPanel jp = new JPanel();

		jb.addActionListener(this);
		jp.add(new JLabel("Enter number only:: "));
		jp.add(jtf);
		jp.add(jtf1);
		jp.add(jb);

		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.add(jp);
	}
	public static void main(String [] args){
		new checkNumber().setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		if (e.getSource()==jb){
			try{
				int k = Integer.parseInt(jtf.getText());
				if(k%2==0){
					jtf1.setText("Even");
				}
				else
					jtf1.setText("Odd");	
			}catch(Exception ee){
				ee.printStackTrace();
			}
			
		}	
	}
}