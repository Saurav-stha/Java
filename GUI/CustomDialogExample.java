import javax.swing.*;

public class CustomDialogExample {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Custom Dialog Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create and show the dialog
        showCustomDialog(frame);

        // Set frame properties
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void showCustomDialog(JFrame parentFrame) {
        // Create a custom dialog
        JDialog dialog = new JDialog(parentFrame, "Custom Dialog", true);
        dialog.setLayout(new BoxLayout(dialog.getContentPane(), BoxLayout.Y_AXIS));

        // Add components to the dialog
        JLabel label = new JLabel("This is a custom dialog box.");
        label.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        dialog.add(label);

        JButton closeButton = new JButton("Close");
        closeButton.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        closeButton.addActionListener(e -> dialog.dispose());
        dialog.add(closeButton);

        // Set dialog properties
        dialog.setSize(300, 150);
        dialog.setLocationRelativeTo(parentFrame);
        dialog.setVisible(true);
    }
}