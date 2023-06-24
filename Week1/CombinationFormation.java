import java.util.*;

public class CombinationFormation {
    public static void DecodeString(String str, String output) {
        if (str.length() == 0) {
            System.out.println(output);
            return;
        }
        String firstCharacter = str.substring(0, 1);
        int first_number = Integer.parseInt(firstCharacter);
        if (first_number != 0) {
            char character = (char) ('a' + first_number - 1);
            DecodeString(str.substring(1), output + character);
        }

        if (str.length() <= 1)
            return;
        int first_twonumber = Integer.parseInt(str.substring(0, 2));
        if (first_twonumber <= 26) {
            if (first_twonumber <= 0) {
                DecodeString(str.substring(2), output + "");
                return;
            }
            char character = (char) ('a' + first_twonumber - 1);
            DecodeString(str.substring(2), output + character);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        DecodeString(input, "");

    }
}
