package ru.job4j.collection;

import java.util.HashMap;

public class Article {
    /**
     * Метод принимает на вход два текста. Из оригинального текста вырезают слова
     * и составляют новый текст.
     * @param origin оригинальный текст
     * @param line новый текст
     * @return возвращает true, если новый текст был получен из оригинального,
     * в противном случае возвращает false
     */
    public static boolean generateBy(String origin, String line) {
        boolean rsl = true;
        String[] originArr = origin.split("[., :;!]");
        String[] lineArr = line.split("[., :;!]");
        HashMap<String, Integer> originText = new HashMap<>();
        for (String o : originArr) {
            if (!originText.containsKey(o)) {
               originText.put(o, 1);
            } else {
                originText.put(o, originText.get(o) + 1);
            }
        }
        for (String l : lineArr) {
            if (!originText.containsKey(l) || originText.get(l) < 1) {
                rsl = false;
                break;
            } else {
                originText.put(l, originText.get(l) - 1);
            }
        }
        return rsl;
    }
}
