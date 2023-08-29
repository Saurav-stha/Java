import javax.swing.*;
import java.awt.*;

public class GridBagLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBagLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5); // Padding

        constraints.gridx = 0;
        constraints.gridy = 0;
        frame.add(new JButton("Button 1"), constraints);

        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.gridwidth = 2; // Span 2 columns
        frame.add(new JButton("Button 2 (span 2)"), constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1; // Reset to 1 column
        constraints.anchor = GridBagConstraints.CENTER; // Center alignment
        frame.add(new JButton("Button 3 (center)"), constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.anchor = GridBagConstraints.EAST; // Right alignment
        frame.add(new JButton("Button 4 (right)"), constraints);

        frame.pack();
        frame.setVisible(true);
    }
}
