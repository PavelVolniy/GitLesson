import account.Viewer;
import account.ViewerStatistics;

import java.util.ArrayList;
import java.util.List;

public class CinemaApplicationRun {
    public static void main(String[] args) {
        List<Viewer> list = new ArrayList<>();
        list.add(new Viewer("name_1", 20, 10));
        list.add(new Viewer("name_2", 25, 2));
        list.add(new Viewer("name_3", 30, 40));
        list.add(new Viewer("name_4", 70, 100));
        list.add(new Viewer("name_5", 12, 10));

        ViewerStatistics.averageAge(list);
    }
}
