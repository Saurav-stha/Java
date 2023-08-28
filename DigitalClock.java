import java.awt.*;
import java.util.Calendar;
public class DigitalClock extends Frame implements Runnable{
    private Thread thread;
    private Calendar calendar;
    private int hours,minutes,seconds;
    DigitalClock(){
        calendar=Calendar.getInstance();
        hours=calendar.get(calendar.HOUR_OF_DAY);
        minutes=calendar.get(calendar.MINUTE);
        seconds=calendar.get(calendar.SECOND);
        thread=new Thread(this);
        thread.start();
    }
    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.drawString(String.format("%02d:%02d:%02d",hours,minutes,seconds),50,50);
    }
    @Override
    public void run(){
        while(true){
            try{
                thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println("error occured!!!");
            }
            calendar=Calendar.getInstance();
            hours=calendar.get(calendar.HOUR_OF_DAY);
            minutes=calendar.get(calendar.MINUTE);
            seconds=calendar.get(calendar.SECOND);
            repaint();
        }
    }
    public static void main(String[] args) {
        DigitalClock newFrame= new DigitalClock();
        newFrame.setVisible(true);
        newFrame.setSize(500, 500);
    }
}