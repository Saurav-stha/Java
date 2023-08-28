import javax.swing.*;

public class SimpleCustomDialogExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton openDialogButton = new JButton("Open Custom Dialog");
        openDialogButton.addActionListener(e -> showDialog(frame));

        frame.add(openDialogButton);
        frame.setVisible(true);
    }

    private static void showDialog(JFrame parent) {
        JOptionPane.showMessageDialog(
                parent,
                "This is a custom dialog!",
                "Custom Dialog",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
