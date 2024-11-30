package physics_wallah;
public class me{
    public static void main(String[] args) {
        // Example 4
        String input4 = "PBL";
        int input2 = 0;
        String output4 = findCharsOrDigitSum(input4, input2);
        System.out.println(output4);  // Output: "ZERO"
    }

    public static String findCharsOrDigitSum(String input1, int input2) {
        if (input1 == null || input1.isEmpty()) {
            return "NULL";
        }

        if (input2 == 0) {
            // Find the sum of digits
            int digitSum = 0;
            for (char c : input1.toCharArray()) {
                if (Character.isDigit(c)) {
                    digitSum += Character.getNumericValue(c);
                }
            }
            if (digitSum == 0) {
                return "ZERO";
            }
            return String.valueOf(digitSum);
        } else if (input2 == 1) {
            // Extract alphabets
            StringBuilder result = new StringBuilder();
            for (char c : input1.toCharArray()) {
                if (Character.isLetter(c)) {
                    result.append(c);
                }
            }
            if (result.length() == 0) {
                return "ZERO";
            }
            return result.toString();
        } else {
            // Invalid input2 value
            return null;
        }
    }
}