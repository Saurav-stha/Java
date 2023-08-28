import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class sumSwing extends JFrame implements ActionListener{
	JTextField n1,n2,ans;
	JButton find;
	sumSwing(){
		n1 = new JTextField("Enter fisrt number: ");
		n2= new JTextField("Enter second number: ");
		ans=new JTextField("Answer is: ");
		ans.setEditable(false);
		find=new JButton("Find sum");
		
		find.addActionListener(this);
		setSize(400,400);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(n1);add(n2);add(ans);add(find);
	}
	public void actionPerformed(ActionEvent e){
		int a=Integer.parseInt(n1.getText());
		int b=Integer.parseInt(n2.getText());
		int s = a+b;
		ans.setText("Answer is: "+Integer.toString(s));
	}
	public static void main(String [] args){
		new sumSwing().setVisible(true);
	}
}