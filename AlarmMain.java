/**
 * Created by Felix on 12/16/2015.
 */
public class AlarmMain {
    public static void main(String[] args) {

        AlarmClock alarm = new AlarmClock(23,48); // creating an alarm clock

        alarm.displayTime();                    //shows time
        alarm.setAlarm(6,15);                   // sets alarm
        int minutes = 0;
        do {                                    //sleeps for 500minutes
            alarm.timeTick();
            minutes++;

        }while(minutes<500);

        alarm.displayTime();                    // checks time again



    }
}
