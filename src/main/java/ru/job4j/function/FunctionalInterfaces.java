package ru.job4j.function;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> biConsumer = (number, string) -> map.put(number, string);
        biConsumer.accept(1, "one");
        biConsumer.accept(2, "two");
        biConsumer.accept(3, "three");
        biConsumer.accept(4, "four");
        biConsumer.accept(5, "five");
        biConsumer.accept(6, "six");
        biConsumer.accept(7, "seven");

        BiPredicate<Integer, String> biPredicate = (number, string) -> number % 2 == 0 || string.length() == 4;
        for (Integer k : map.keySet()) {
            if (biPredicate.test(k, map.get(k))) {
                System.out.println("key: " + k + " value: " + map.get(k));
            }
        }

        Supplier<List<String>> supplier = () -> new ArrayList<>(map.values());
        List<String> strings = supplier.get();

        Consumer<String> consumer = (string) -> System.out.println(string);
        Function<String, String> function = (string1) -> string1.toUpperCase();
        for (String string : strings) {
            consumer.accept(function.apply(string));
        }
    }
}
