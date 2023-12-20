package DateTimeAPI;

import java.time.LocalTime;

public class LocalTimeProgram {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();//No Constructor in the LocalTime class
        System.out.println(time);

        int hour=time.getHour();
        int minute=time.getMinute();
        int second=time.getSecond();
        int nano=time.getNano();

        System.out.println(hour+":"+minute+":"+second+":"+nano);
    }
}
