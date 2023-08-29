import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class borderLayoutExample extends JFrame{
	public borderLayoutExample(){

		add("North",new Button("top ma"));
		add("South",new Button("bot"));
		add("East",new Button("right side"));
		add("West",new Button("left"));
		add("Center",new Button("bich"));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// this.addWindowListener(new WindowAdapter(){ //closable frame
		// 	public void windowClosing(WindowEvent e){
		// 		dispose();
		// 	}
		// });

	}
	public static void main(String [] args){
		borderLayoutExample bl = new borderLayoutExample();
		bl.setSize(300,400);
		bl.setTitle("border layout");
		bl.setVisible(true);
	}
}