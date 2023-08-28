import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class mousePointer{
	public static void main(String [] args){
		JFrame jf = new JFrame("Mouse Pointer");
		jf.setSize(400,400);
		jf.setLayout(new FlowLayout());
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JTextField inOrOutMouse = new JTextField("mouse out");
		inOrOutMouse.setEditable(false);

		JTextField whereMouse = new JTextField("x:0000,y:0000");
		whereMouse.setEditable(false);

		jf.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent me){
				inOrOutMouse.setText("Mouse in");
			}
			public void mouseExited(MouseEvent me){
				inOrOutMouse.setText("Mouse out");
			}
		});
		jf.addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseMoved(MouseEvent e){
				int x = e.getX();
				int y = e.getY();
				whereMouse.setText("x:"+x+",y: "+y);
			}
		});

		jf.add(inOrOutMouse);
		jf.add(whereMouse);
		jf.setVisible(true);
	}
}