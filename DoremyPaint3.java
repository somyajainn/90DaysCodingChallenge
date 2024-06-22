import java.util.HashMap;
import java.util.Scanner;

public class DoremyPaint3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            HashMap<Integer, Integer> dp = new HashMap<>();
            for (int item : arr) {
                dp.put(item, dp.getOrDefault(item, 0) + 1);
            }

            if (dp.size() == 1) {
                // All elements are the same
                System.out.println("YES");
            } else if (dp.size() == 2) {
                // If there are exactly two distinct elements, we need to check their counts
                int[] counts = new int[2];
                int index = 0;
                for (int value : dp.values()) {
                    counts[index++] = value;
                }
                // We can form a good array if the counts of these two distinct elements differ by at most 1
                int diff = Math.abs(counts[0] - counts[1]);
                if (diff <= 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                // More than two distinct elements, cannot form a good array
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
