import java.util.Scanner;
public class HalloumiBoxes {

    public static boolean isSorted(int[] arr,int n){
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of k");
        int k=sc.nextInt();
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.err.println("Enter the values of array");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if (isSorted(arr, n) || k >= 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
