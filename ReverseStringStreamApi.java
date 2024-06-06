package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String str = "My name is Dhananjay";

        //Reverse String
        String[] strArr = str.split(" ");
        String s3 = Arrays.asList(strArr)
                .stream()
                .reduce(((s1, s2) -> s2 + " " + s1))
                .orElse("");

        System.out.println(s3);

        //Reverse string along with word
        String s = str.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .reduce((s1, s2) -> s2 + s1)
                .orElse("");
        System.out.println(s);


    }
}
