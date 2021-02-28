package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = false;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String o : origin) {
            check.add(o);
        }
        int count = 0;
        for (String t : text) {
            if (check.contains(t)) {
               count++;
            }
        }
        if (count == text.length) {
            rsl = true;
        }
        return rsl;
    }
}
