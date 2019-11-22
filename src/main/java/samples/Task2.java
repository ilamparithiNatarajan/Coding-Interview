package samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task2 {

    public static void main(String[] args) {
        String S = "Sun 10:00-20:00\nFri 05:00-10:00\nFri 16:30-23:50\nSat 10:00-24:00\nSun 01:00-04:00\nSat 02:00-06:00\nTue 03:30-18:15\nTue 19:00-20:00\nWed 04:25-15:14\nWed 15:14-22:40\nThu 00:00-23:59\nMon 05:00-13:00\nMon 15:00-21:00";
        String[] days = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        Map<String, Integer> daysValue = new HashMap<>();
        daysValue.put("Mon", 0);
        daysValue.put("Tue", 1);
        daysValue.put("Wed", 2);
        daysValue.put("Thu", 3);
        daysValue.put("Fri", 4);
        daysValue.put("Sat", 5);
        daysValue.put("Sun", 6);
        String[] array = S.split("\n");
        System.out.println("Array of rows : " + Arrays.toString(array));
        //lets convert the string to int(minutes) and put the free time in array
        int scheduleLength = array.length;
        // int[] meetingTimes = new int[scheduleLength*2];
        // System.out.println(Arrays.toString(meetingTimes));

        List<Integer> freeTime = new ArrayList<>();
        int lastMeetingEnded = 0;
        for (String s : array) {
            String day = s.substring(0, 3);
            System.out.println("Day : " + day);
            int meetingStartTime = (daysValue.get(day) * 24 * 60) + ((Integer.parseInt(s.substring(4, 6))) * 60) + (Integer.parseInt(s.substring(7, 9)));
            System.out.println(" hour " + Integer.parseInt(s.substring(4, 6)));
            System.out.println(" mins " + Integer.parseInt(s.substring(7, 9)));
            System.out.println("meetingStartTime : " + meetingStartTime);
            freeTime.add(meetingStartTime);
            int meetingEndTime = (daysValue.get(day) * 24 * 60) + ((Integer.parseInt(s.substring(10, 12))) * 60) + (Integer.parseInt(s.substring(13, 15)));
            freeTime.add(meetingStartTime);

        }
        //return dummy value until code is ready
        System.out.println("finished");
    }
}
