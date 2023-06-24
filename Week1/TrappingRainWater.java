import java.util.*;

public class TrappingRainWater {
    public static int TrappedWater(int arr[]) {
        int n = arr.length;
        int left_max = arr[0];
        int right_max = arr[n - 1];
        int start = 1, end = n - 2;
        int trappedWater = 0;
        while (start <= end) {
            if (left_max < right_max) {
                if (arr[start] > left_max) {
                    left_max = arr[start];
                } else {
                    trappedWater += left_max - arr[start];
                }
                start++;
            } else {
                if (right_max < arr[end]) {
                    right_max = arr[end];
                } else {
                    trappedWater += right_max - arr[end];
                }
                end--;
            }
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = TrappedWater(arr);
        System.out.println("Trapped Water: " + ans);
    }
}
