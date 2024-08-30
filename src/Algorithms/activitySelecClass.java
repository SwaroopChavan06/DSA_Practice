package Algorithms;

import java.util.Arrays;
import java.util.Comparator;

class Activity{

    int start;
    int end;

    Activity(int start,int end) {
        this.start = start;
        this.end = end;
    }

}

public class activitySelecClass {


    public static void activitySelection(Activity[] activities) {
        Arrays.sort(activities, new Comparator<Activity>() {
            public int compare(Activity o1, Activity o2) {
                return Integer.compare(o1.end, o2.end);
            }
        });

        System.out.println("All Activities (sorted by end time):");
        for (Activity activity : activities) {
            System.out.println("Start: " + activity.start + ", End: " + activity.end);
        }
        System.out.println();

        System.out.println("Selected Activities:");
        int lastEndTime = activities[0].end;
        System.out.println("Start: " + activities[0].start + ", End: " + activities[0].end);

        for (int i = 1; i < activities.length; i++) {
            if (activities[i].start >= lastEndTime) {
                System.out.println("Start: " + activities[i].start + ", End: " + activities[i].end);
                lastEndTime = activities[i].end;
            }
        }
    }

    public static void main(String[] args) {

        Activity activity[] = {
                new Activity(5,6),
                new Activity(7,8),
                new Activity(1,2),
                new Activity(3,6)
        };

        activitySelection(activity);

    }
}