package timerdemo;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo2 {

    public static void main(String[] args) {
        int interval = 10000; // 10 sec
        Date timeToRun = new Date(System.currentTimeMillis() + interval);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                // Task here ...  
            }

        }, timeToRun);

    }

}
