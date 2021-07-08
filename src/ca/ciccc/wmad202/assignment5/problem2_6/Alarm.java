package ca.ciccc.wmad202.assignment5.problem2_6;


public class Alarm {
    private int hour;
    private int minute;

    public Alarm(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getMinute() {
        return minute;
    }

    public void alarmTime(){
        String hour = String.valueOf(getHour());
        String minute = String.valueOf(getMinute());
        if(minute.length() == 1){
            minute = "0" + minute;
        }

        System.out.println(hour + " : " + minute);
    }
}