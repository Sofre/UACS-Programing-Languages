import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ActivityManager manager = new ActivityManager();

        manager.add_activity(new Club());
        manager.add_activity(new SportsTeam());
        manager.add_activity(new AcademicSociety());

        manager.manage_activity(new AcademicSociety(),"Shit");




    }
}