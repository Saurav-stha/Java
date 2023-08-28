import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.*;
class GUI{
	public static void main(String args[]){
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(420,420);
		frame.setTitle("THis is me!!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //default is HIDE_ON_CLOSE
		frame.setResizable(false);

		ImageIcon image = new ImageIcon("./wlppr.jpg");
		frame.setIconImage(image.getImage());

		frame.getContentPane().setBackground(new Color(100,22,100));

		
	}
}
