import java.util.*;

public class KSmallestElement {
    public static void KElement(int arr[], int k) {
        for (int index = k; index < arr.length; index++) {
            int currElement = arr[index];
            int max = arr[k - 1];
            int maxPosition = k - 1;
            for (int revIndex = k - 2; revIndex >= 0; revIndex--) {
                if (arr[revIndex] > max) {
                    max = arr[revIndex];
                    maxPosition = revIndex;
                }
            }
            if (currElement < max) {
                while (maxPosition < k - 1) {
                    arr[maxPosition] = arr[maxPosition + 1];
                    maxPosition++;
                }
                arr[k - 1] = currElement;
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        KElement(arr, k);
    }

}