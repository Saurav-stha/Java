import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomDialogExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Custom Dialog Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(100,100);

        JButton showCustomDialog = new JButton("Show Custom Dialog");
        showCustomDialog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CustomDialog dialog = new CustomDialog(frame);
                dialog.setSize(100,100);
                dialog.setVisible(true);
            }
        });

        frame.add(showCustomDialog);
        frame.setVisible(true);
    }
}

class CustomDialog extends JDialog {
    public CustomDialog(JFrame parent) {
        super(parent, "Custom Dialog", true); // true for modal

        JPanel panel = new JPanel(new FlowLayout());

        JLabel label = new JLabel("This is a custom dialog!");
        panel.add(label);

        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close the dialog
            }
        });
        panel.add(closeButton);
        add(panel);
    }
}
