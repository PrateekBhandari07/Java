import java.util.*;
import java.util.stream.Collectors;

public class sha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int N = scanner.nextInt();
        List<Integer> elements = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int element = scanner.nextInt();
            elements.add(element);
        }

        // Create a frequency map for the elements
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int element : elements) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        // Sort the elements based on frequency and original order
        Collections.sort(elements, (a, b) -> {
            int freqCompare = Integer.compare(frequencyMap.get(b), frequencyMap.get(a));
            return (freqCompare != 0) ? freqCompare : Integer.compare(elements.indexOf(a), elements.indexOf(b));
        });

        // Print the sorted elements
        for (int element : elements) {
            System.out.print(element + " ");
        }
    }
}
