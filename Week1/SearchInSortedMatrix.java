import java.util.*;

public class SearchInSortedMatrix {
    public static boolean isExist(int mat[][], int target) {
        int n = mat.length - 1;
        int m = mat[0].length - 1;
        int i = 0, j = m;
        while (i <= n && j >= 0) {
            if (mat[i][j] == target) {
                return true;
            }
            if (mat[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        // int n = sc.nextInt(), m = sc.nextInt();
        // int mat[][] = new int[n][m];
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // mat[i][j] = sc.nextInt();
        // }
        // }
        int mat[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        int n = mat.length;
        int m = mat[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        boolean ans = isExist(mat, target);
        System.out.println(ans);
    }
}
