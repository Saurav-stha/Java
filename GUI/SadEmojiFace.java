import javax.swing.*;
import java.awt.*;

public class SadEmojiFace extends JPanel {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Sad Emoji Face");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(200, 200);
            frame.add(new SadEmojiFace());
            frame.setVisible(true);
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        // Draw a yellow circle for the face
        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, width - 100, height - 100);

        // Draw sad eyes
        g.setColor(Color.BLACK);
        g.fillOval(80, 80, 30, 20);
        g.fillOval(150, 80, 30, 20);

        // Draw a sad mouth
        g.setColor(Color.BLACK);
        g.drawArc(90, 130, 100, 50, 0, -180);
    }
}
