import java.applet.Applet;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClockApplet extends Applet {
    private Label timeLabel;

    public void init() {
        timeLabel = new Label();
        timeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(timeLabel);

        Thread clockThread = new Thread(this);
        clockThread.start();
    }
    public void run(){
        while(true){
            updateTime();
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ie){ System.out.println(e.getMessage());}
        }
    }

    private void updateTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String time = sdf.format(new Date());
        timeLabel.setText(time);
    }
}