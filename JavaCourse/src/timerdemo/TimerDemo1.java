package timerdemo;

import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo1 {

    public static void main(String[] args) {
        int delay = 5000; // Eelay for 5 sec.
        int interval = 1000; // Iterate every sec.
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                // Task here ... 
            }
        }, delay, interval);
    }
}
