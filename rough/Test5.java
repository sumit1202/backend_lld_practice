package rough;

import java.util.ArrayList;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // Populate the 'capacity' list with server capacities
        list.add(20);
        list.add(5);
        list.add(5);
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(1);
        list.add(11);
        list.add(8);
        list.add(20);
        list.add(40);
        list.add(12);
        list.add(8);
        list.add(8);
        list.add(12);
        list.add(40);

        int result = countStableSegments(list);
        System.out.println("Number of Stable Segments: " + result);
    }

    static int countStableSegments(List<Integer> capacity) {
        int n = capacity.size();
        int count = 0;
        int sum = 0;
        int stablecount = 0;
        for (int l = 0; l < n - 2; l++) {
            int a = capacity.get(l);
            sum += a;
            count++;
            for (int i = l + 1; i < n; i++) {
                int b = capacity.get(i);
                sum += capacity.get(i);
                count++;
                if (sum == (a * 3) && count > 2 && a == b) {
                    stablecount++;
                } else {
                    continue;
                }
            }
            sum = 0;
            count = 0;
        }

        return stablecount;
    }
}
