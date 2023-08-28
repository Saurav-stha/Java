import javax.swing.*;

public class SimpleDialogExample {

    // public static void main(String[] args) {
    //     SwingUtilities.invokeLater(() -> {
    //         createAndShowDialog();
    //     });
    // }

    // private static void createAndShowDialog() {
    //     // Parent frame (can be null for standalone dialogs)
    //     JFrame parentFrame = new JFrame();

    //     // Show a message dialog
    //     JOptionPane.showMessageDialog(parentFrame, "This is a simple dialog box.", "Dialog Box", JOptionPane.INFORMATION_MESSAGE);

    //     // Show an input dialog and get user input
    //     String name = JOptionPane.showInputDialog(parentFrame, "Enter your name:");
    //     if (name != null && !name.isEmpty()) {
    //         JOptionPane.showMessageDialog(parentFrame, "Hello, " + name + "!", "Greeting", JOptionPane.INFORMATION_MESSAGE);
    //     }
    // }

    public static void main(String args[]){
      JDialog dialog = new JDialog();
      JOptionPane.showMessageDialog(null,"cause i am happy");
      dialog.setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);
      // dialog.setSize(400,400);  
      // dialog.setVisible(true);
   }
}
