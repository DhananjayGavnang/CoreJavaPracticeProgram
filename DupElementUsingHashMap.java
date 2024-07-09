import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 1, 6, 2, 7, 3, 8};

        //////////////////Using hashset
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = Arrays.stream(numbers)
            .filter(n -> !set.add(n))
            .collect(Collectors.toSet());

        System.out.println("Duplicate numbers: " + duplicates);

        //////////////////////Using HashMap
        Map<Integer, Long> numberCounts = Arrays.stream(numbers)
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        System.out.println(numberCounts);

        Set<Integer> duplicates = numberCounts.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

        System.out.println("Duplicate numbers: " + duplicates);
    }
}
