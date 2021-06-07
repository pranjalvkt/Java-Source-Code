public class SecAndMin
{
    public static void main(String[] args) 
    {
        System.out.println(getDurationString(120, 0 ));
        System.out.println(getDurationString(380));
    }

    public static String getDurationString(int minute, int second)
    {
        if((minute < 0) || (second < 0) || (second > 59))
        {
            return "Invalid value";
        }

        int hours = minute / 60;
        int remainingMinute = minute % 60;

        String hourString = hours + "h ";
        if(hours < 10)
        {
            hourString = "0" + hourString;
        }

        String remainingMinuteString = minute + "m ";
        if(minute < 10)
        {
            remainingMinuteString = "0" + remainingMinuteString;
        }

        String secondString = second + "s ";
        if(second < 10)
        {
            secondString = "0" + secondString;
        }

        return hourString + remainingMinuteString + secondString;
    }

    public static String getDurationString(int second)
    {
        if(second < 0)
        {
            return "invalid value";
        }

        int minute = second / 60;
        int remainingSecond = second % 60;

        return getDurationString(minute, remainingSecond);

    }


}