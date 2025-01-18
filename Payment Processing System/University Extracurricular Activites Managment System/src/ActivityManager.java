import java.util.ArrayList;
import java.util.List;

public class ActivityManager {

    private List<Activity> activityList;

    public ActivityManager(){
        activityList = new ArrayList<>();
    }

    public void  add_activity(Activity activity){
        activityList.add(activity);

    }
    public void manage_activity(Activity activity,String details){
        for ( Activity activity1 : activityList ){
            activity1.registerStudent("Mark");
            activity1.scheduledEvent("23.05.2001");
            System.out.println(activity1.getActivityDetails());
        }


    };
    }

