package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ivanivanov@yandex.ru", "Ivanov Ivan Ivanovich");
        map.put("alexeyalexeev@yandex.ru", "Alexeev Alexey Alexeevich");
        map.put("alexanderalexandrov@yandex.ru", "Alexandrov Alexander Alexandrovich");
        map.put("ivanivanov@yandex.ru", "Ivanov Ivan Petrovich");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " : " + value);
        }
    }

}
