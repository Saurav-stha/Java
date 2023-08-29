import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class menubar
{
	public static void main(String arg[])
	{
		// SwingUtilities.invokeLater( () ->{
			JFrame jf = new JFrame("Swing");
			jf.setSize(500,500);
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			// JMenuBar jmb = new JMenuBar();
			jf.setJMenuBar(new JMenuBar());

			JMenu file = new JMenu("File");
			jmb.add(file);

			JMenuItem sum = new JMenuItem("Add");
			file.add(sum);

			JMenuItem subtract = new JMenuItem("Subtract");
			file.add(subtract);

			JMenuItem close = new JMenuItem("Close");
			close.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					JOptionPane.showMessageDialog(null, "Exiting from program", "title of dialog box", JOptionPane.WARNING_MESSAGE);
				}
			});
			file.add(close);

			jf.setVisible(true);	
		// });
		
	}
}