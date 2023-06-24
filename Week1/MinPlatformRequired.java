import java.util.*;

public class MinPlatformRequired {
    public static int CountPlatform(int arr[], int dep[]) {
        int result = 1;
        int n = arr.length;
        int start = 1;
        int end = 0;
        int platform = 1;
        while (start < n && end < n) {
            if (arr[start] <= arr[end]) {
                platform++;
                start++;
            } else {
                platform--;
                end++;
            }
            result = Math.max(result, platform);

        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int dep[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            dep[i] = sc.nextInt();
        }
        // int n = 3;
        // int arr[] = { 900, 905, 1100 };
        // int dep[] = { 910, 940, 1200 };
        int ans = CountPlatform(arr, dep);
        System.out.println(ans);
    }

}
