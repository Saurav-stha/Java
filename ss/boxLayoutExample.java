import javax.swing.*;
import javax.swing.BoxLayout; // only layout in swing , all others in awt
import java.awt.*;

public class boxLayoutExample{
	public static void main(String [] a){
		JFrame jf = new JFrame("Box layout - yAxis");
		jf.setSize(200,200);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
            
		JButton b1= new JButton("Button :1");
		JButton b4 = new JButton("agadi duita same as b1 and this is Long button ");
		JButton b5 = new JButton("5");

		b1.setAlignmentX(Component.CENTER_ALIGNMENT);
		b4.setAlignmentX(Component.CENTER_ALIGNMENT);
		b5.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(b1);panel.add(b4);panel.add(b5);

		jf.add(panel);
		jf.setVisible(true);

	}
}