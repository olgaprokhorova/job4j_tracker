package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("tolstoyln@gmail.com", "Lev Tolstoy");
        map.put("dostoevsky@yandex.ru", "Fedor Dostoevsky");
        map.put("nashevse@mail.ru", "Alexander Pushkin");

        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
