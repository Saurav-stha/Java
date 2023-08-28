import java.awt.*;
import javax.swing.*;

public class boxToBorder{
	public static void main(String [] a){
		JFrame jf = new JFrame("Convert to Border Layout from Box");
		jf.setSize(500,500);

		JPanel jp = new JPanel();
		jp.setLayout(new BoxLayout(jp,BoxLayout.Y_AXIS));

		JPanel top = new JPanel();
		JButton b1 = new JButton("North");
		top.add(b1);

		JPanel mid = new JPanel();
		mid.setLayout(new BoxLayout(mid,BoxLayout.X_AXIS));
		JButton b2=new JButton("West");
		JButton b3 = new JButton("Center");
		JButton b4= new JButton("East");
		mid.add(b2);mid.add(b3);mid.add(b4);

		JPanel bot = new JPanel();
		JButton b5 = new JButton("South");
		bot.add(b5);
 
		jp.add(top);
		jp.add(mid);
		jp.add(bot);

		jf.add(jp);
		jf.setVisible(true);
	}
}