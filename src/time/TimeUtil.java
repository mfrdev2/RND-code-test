package time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Timer;
import java.util.TimerTask;

public class TimeUtil {
    public static final DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("mm:ss");

    public static final Long milliToNano = 1000000L;
    public static final Long timeInMilli = 179000L;
    public static final Long timeInSec = 179L;

    private Timer timer;

    public static void main(String[] args) {


        LocalTime localTime = LocalTime.ofNanoOfDay(timeInMilli * milliToNano);
        //  LocalTime localTime = LocalTime.ofSecondOfDay(timeInSec);
        System.out.println(localTime.getLong(ChronoField.MILLI_OF_DAY));

        LocalTime localTime1 = localTime.minusSeconds(200);


        System.out.println(localTime1.format(TIME_FORMAT));

        System.out.println(localTime1.getLong(ChronoField.MILLI_OF_DAY));

        new TimeUtil().countDownStart(60000);

    }

    private void countDownStart(long timeInMilli){
        if(timeInMilli == 0 || timeInMilli<0){
            return;
        }
        timer = new Timer();
        timer.schedule(new CustomTimer(timeInMilli),1000,1000);
    }

    public static String toDuration(long duration) {

        StringBuffer res = new StringBuffer();
        for (int i = 0; i < TimeAgo.times.size(); i++) {
            Long current = TimeAgo.times.get(i);
            long temp = duration / current;
            if (temp > 0) {
                res.append(temp).append(" ").append(TimeAgo.timesString.get(i)).append(temp != 1 ? "s" : "").append(" ago");
                break;
            }
        }
        if ("".equals(res.toString()))
            return "0 seconds ago";
        else
            return res.toString();
    }


    class CustomTimer extends TimerTask {
        LocalTime localTime;
        public CustomTimer(long timeInMilli) {
            localTime = LocalTime.ofNanoOfDay(timeInMilli * milliToNano);
        }

        public void run() {
            localTime = localTime.minusSeconds(1);
            System.out.println("Time Is "+localTime.format(TIME_FORMAT));
            long aLong = localTime.getLong(ChronoField.MILLI_OF_DAY);
            if(aLong == 0){
                System.out.println("Timer cancel");
                TimeUtil.this.timer.cancel();
            }
        }
    }

}
