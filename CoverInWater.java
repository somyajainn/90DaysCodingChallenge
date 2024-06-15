import java.util.Scanner;

public class CoverInWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        sc.nextLine(); 
        
        for (int i = 0; i < a; i++) {
            int n = sc.nextInt(); 
            sc.nextLine();
            String line = sc.nextLine();
            
            char[] arr = line.toCharArray();

            boolean foundThreeConsecutiveDots = false;
            int totalDots = 0;
            int consecutiveDots = 0;

            for (int k = 0; k < n; k++) {
                if (arr[k] == '.') {
                    consecutiveDots++;
                    totalDots++;
                } else {
                    consecutiveDots = 0;
                }
                if (consecutiveDots == 3) {
                    foundThreeConsecutiveDots = true;
                    break;
                }
            }

            if (foundThreeConsecutiveDots) {
                System.out.println(2);
            } else {
                System.out.println(totalDots);
            }
        }
        sc.close();
    }
}
