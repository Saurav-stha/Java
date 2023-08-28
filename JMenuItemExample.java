import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMenuItemExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("JMenuItem Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JMenuBar menuBar = new JMenuBar();
            JMenu fileMenu = new JMenu("File");
            JMenuItem openMenuItem = new JMenuItem("Open");

            openMenuItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Add your functionality here
                    JOptionPane.showMessageDialog(null, "Open menu item clicked!");
                }
            });

            fileMenu.add(openMenuItem);
            menuBar.add(fileMenu);
            frame.setJMenuBar(menuBar);

            frame.setSize(300, 200);
            frame.setVisible(true);
        });
    }
}
