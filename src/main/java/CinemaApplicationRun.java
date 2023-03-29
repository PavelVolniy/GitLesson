import account.Viewer;
import account.ViewerStatistics;
import cinema.Cinema;

import java.util.ArrayList;
import java.util.List;

public class CinemaApplicationRun {
    public static void main(String[] args) {
        List<Viewer> list = new ArrayList<>();
        list.add(new Viewer("name_1", 20));
        list.add(new Viewer("name_2", 25));
        list.add(new Viewer("name_3", 30));
        list.add(new Viewer("name_4", 70));
        list.add(new Viewer("name_5", 12));
        Cinema cinema = new Cinema("film1", "action", 2);
        Cinema cinema2 = new Cinema("film2", "action", 2);
        Cinema cinema3 = new Cinema("film3", "action", 2);

        list.get(0).addCinema(cinema);
        list.get(0).addCinema(cinema2);
        list.get(0).addCinema(cinema3);
        list.get(1).addCinema(cinema3);
        list.get(2).addCinema(cinema3);
        list.get(2).addCinema(cinema2);
        list.get(2).addCinema(cinema);

        for (Viewer item : list) {
            System.out.println(item);
            for (Cinema i : item.getListOfViewedCinema()) {
                System.out.println(i);
            }
        }
        ViewerStatistics.averageAge(list);
    }
}
