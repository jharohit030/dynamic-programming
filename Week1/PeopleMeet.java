import java.util.*;

public class PeopleMeet {
    private static boolean isMeet(int p1, int p2, int s1, int s2) {
        if (p1 > p2 && s1 > s2)
            return false;
        if (p2 > p1 && s2 > s1)
            return false;

        while (p1 >= p2) {
            if (p1 == p2)
                return true;
            p1 = p1 + s1;
            p2 = p2 + s2;
        }
        return false;
    }

    // optimization on the isMeet function
    private static boolean isMeetOptimized(int p1, int p2, int s1, int s2) {
        if (p1 > p2 && s1 > s2)
            return false;
        if (p2 > p1 && s2 > s1)
            return false;

        int distanceNeedToCover = p1 - p2;
        int speedNeedToUse = s1 - s2;
        if (distanceNeedToCover % speedNeedToUse == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        boolean result = isMeet(p1, p2, s1, s2);
        boolean result1 = isMeetOptimized(p1, p2, s1, s2);
        if (result == true && result1 == true) {
            System.out.println("They will meet each other");
        } else {
            System.out.println("They will not meet each other");
        }

    }

}
