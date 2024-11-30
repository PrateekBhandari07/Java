package physics_wallah;
public class a{
    public static void main(String[] args) {
        int input1 = 3521;
        int input2 = 2452;
        int input3 = 1352;


        int key = findKey(input1, input2, input3);
        System.out.println("Key: " + key);
    }

    public static int findKey(int input1, int input2, int input3) {
        // Extract the largest and smallest digits from each input
        int[] digits1 = extractDigits(input1);
        int[] digits2 = extractDigits(input2);
        int[] digits3 = extractDigits(input3);
//        System.out.println(digits1[1]);

        int sumOfLargestDigits = sumOfLargest(digits1, digits2, digits3);
        int sumOfSmallestDigits = sumOfSmallest(digits1, digits2, digits3);

        // Calculate the Key using the formula
        int key = sumOfLargestDigits + sumOfSmallestDigits;

        return key;
    }

    public static int[] extractDigits(int number) {
        int[] digits = new int[4];
        for (int i = 0; i < 4; i++) {
            digits[i] = number % 10;
//            System.out.println(digits[i]);
            number /= 10;
        }
        return digits;

    }

    public static int sumOfLargest(int[]... digitArrays) {
        System.out.println(digitArrays[0][0]);
        int sum = 0;
        for (int[] digits : digitArrays) {
            int maxDigit = 0;
            for (int digit : digits) {
                if (digit > maxDigit) {
                    maxDigit = digit;
                }
            }
            sum += maxDigit;
        }
        return sum;
    }

    public static int sumOfSmallest(int[]... digitArrays) {
        int sum = 0;
        for (int[] digits : digitArrays) {
            int minDigit = 9;
            for (int digit : digits) {
                if (digit < minDigit) {
                    minDigit = digit;
                }
            }
            sum += minDigit;
        }
        return sum;
    }
}
