import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class buttonXtextfield{
	public static void main(String [] args){
		JFrame jf = new JFrame("Super Button");
		jf.setSize(400,400);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(null);

		JTextField jtf = new JTextField("Enter any thing");
		jtf.setBounds(20,20,200,50);

		JButton jb = new JButton("Change Everything!");
		jb.setBounds(20,90,200,50);

		jb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				jtf.setBackground(Color.BLUE);
				jtf.setText(jtf.getText().toUpperCase());
			}
		});

		jf.add(jtf);
		jf.add(jb);
		jf.setVisible(true);
	}
}