package strings.timeconversion;

import java.text.DecimalFormat;

import static java.lang.Integer.parseInt;

public class TimeConversion {
    public static String timeConversion(String s) {
        final var clockTypeIndex = 8;
        final var timeType = s.substring(clockTypeIndex);
        final var time = s.substring(0, clockTypeIndex);
        final var timeSplit = time.split(":");
        return convertToMilitary(timeType, timeSplit);
    }

    private static String convertToMilitary(String timeType, String[] timeSplit) {
        int hours = parseInt(timeSplit[0]);
        int minutes = parseInt(timeSplit[1]);
        int seconds = parseInt(timeSplit[2]);
        hours = updateHours(timeType, hours);
        return formatTimeString(hours, minutes, seconds);
    }

    private static String formatTimeString(int hours, int minutes, int seconds) {
        final var formatter = new DecimalFormat("00");
        return formatter.format(hours) + ":" + formatter.format(minutes) + ":" + formatter.format(seconds);
    }

    private static int updateHours(String timeType, int hours) {
        if ("AM".equals(timeType) && hours == 12) {
            hours = 0;
        } else if ("PM".equals(timeType) && hours != 12) {
            hours = hours + 12;
        }
        return hours;
    }

}
