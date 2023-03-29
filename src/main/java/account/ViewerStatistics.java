package account;

import java.util.List;

public class ViewerStatistics {

    public static void averageAge(List<Viewer> list) {
        if (list != null && !list.isEmpty()) {
            double averageAge = 0;
            for (Viewer item : list) {
                averageAge += item.getAge();
            }
            System.out.println(averageAge / list.size());
        } else System.out.println("List is empty or null");
    }
}
