import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClockApp extends JFrame {
    private JLabel timeLabel;

    public DigitalClockApp() {
        setTitle("Digital Clock");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setLayout(new FlowLayout());

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(timeLabel);

        Thread clockThread = new Thread(() -> {
            while (true) {
                updateTime();
                try {
                    Thread.sleep(1000); // Update every 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        clockThread.start();
    }

    private void updateTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String time = sdf.format(new Date());
        timeLabel.setText(time);
    }

    public static void main(String[] args) {
        new DigitalClockApp().setVisible(true);
    }
}