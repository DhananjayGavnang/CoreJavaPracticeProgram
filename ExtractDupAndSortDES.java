package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Main {
    public static void main(String[] args) {

        int arr[] = {2,0,1,4,3};
        Set<Integer> temSet = new HashSet<>();
        int[] array = Arrays.stream(arr).boxed()
                .filter(i -> !temSet.add(i))
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        if(array.length==0){
            array=new int[]{-1};
        }
        System.out.println(Arrays.toString(array));
    }
}
