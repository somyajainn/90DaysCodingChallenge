import java.util.Scanner;

public class jaggedSwaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            boolean anySwap;
            do {
                anySwap = false;
                for (int i = 1; i < n - 1; i++) {
                    if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                        int temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                        anySwap = true;
                    }
                }
            } while (anySwap);

            System.out.println(isSorted(arr) ? "YES" : "NO");
        }
        sc.close();
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
