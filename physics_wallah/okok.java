package physics_wallah;
import java.util.Scanner;

public class okok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input strings
        String stringSent = scanner.nextLine();
        String stringRec = scanner.nextLine();

        // Find the missing character
        char missingChar = findMissingCharacter(stringSent, stringRec);

        // Print the missing character
        System.out.println(missingChar);
    }

    public static char findMissingCharacter(String stringSent, String stringRec) {
        int minLength = Math.min(stringSent.length(), stringRec.length());

        for (int i = 0; i < minLength; i++) {
            if (stringSent.charAt(i) != stringRec.charAt(i)) {
                return stringSent.charAt(i);
            }
        }

        // If we reach this point, the missing character is the last character in stringSent
        return stringSent.charAt(stringSent.length() - 1);
    }
}