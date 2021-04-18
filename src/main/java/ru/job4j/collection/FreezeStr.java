package ru.job4j.collection;

import java.util.HashMap;

public class FreezeStr {
    /**
     * Метод принимает на вход две строки. Из символов первой строки
     * составляется вторая строка.
     * @param left первая строка
     * @param right вторая строка
     * @return возвращает true, если вторая строка получилась методом
     * перестановок символов в первой строке, иначе возвращает false
     */
    public static boolean eq(String left, String right) {
        boolean rsl = true;
        char[] leftArr = left.toCharArray();
        char[] rightArr = right.toCharArray();
        HashMap<Character, Integer> leftMap = new HashMap<>();
        for (char l : leftArr) {
            if (!leftMap.containsKey(l)) {
                leftMap.put(l, 1);
            } else {
                leftMap.put(l, leftMap.get(l) + 1);
            }
        }
        for (char r : rightArr) {
            if (!leftMap.containsKey(r) || leftMap.get(r) < 1) {
                rsl = false;
                break;
            } else {
                leftMap.put(r, leftMap.get(r) - 1);
            }
        }
        return rsl;
    }
}
