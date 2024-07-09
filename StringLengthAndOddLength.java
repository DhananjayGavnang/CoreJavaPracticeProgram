import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Dhananjay","Rasika","Dhiraj","Renukaa");

        Map<String, Integer> collect1 = stringList.stream()
          .collect(Collectors.toMap(s -> s, s -> s.length()));
        System.out.println(collect1);

        List<String> collect = stringList.stream()
          .filter(s -> s.length() % 2 != 0)
          .collect(Collectors.toList());
        System.out.println(collect);
    }
}
