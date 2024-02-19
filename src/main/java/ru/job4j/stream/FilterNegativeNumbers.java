package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNegativeNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-10, -5, -1, 1, 5, 10, 15);
        List<Integer> positive = numbers.stream().filter(
                x -> x > 0
        ).collect(Collectors.toList());
        positive.forEach(System.out::println);
    }
}
