import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class button extends JFrame implements ActionListener{
	JButton blck,ble;
	button(){
		setSize(200,200);
		setLayout(new FlowLayout());

		blck = new JButton("Black");
		ble = new JButton("Blue");

		blck.addActionListener(this);
			
		ble.addActionListener(this);
		add(blck);
		add(ble);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==blck){
			getContentPane().setBackground(Color.BLACK);
		}
		if(ae.getSource()==ble){
			getContentPane().setBackground(Color.BLUE);
		}
	}
	public static void main(String [] a){
		new button();	
	}
}