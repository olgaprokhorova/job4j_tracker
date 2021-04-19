package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;

public class Article {
    /**
     * Метод принимает на вход два текста. Из оригинального текста вырезают слова
     * и составляют из них новый текст.
     * @param origin оригинальный текст
     * @param line новый текст
     * @return возвращает true, если новый текст был получен из оригинального,
     * в противном случае возвращает false
     */
    public static boolean generateBy(String origin, String line) {
        boolean rsl = true;
        String[] originArr = origin.split("[., :;!]");
        String[] lineArr = line.split("[., :;!]");
        HashSet<String> originText = new HashSet<>(Arrays.asList(originArr));
        for (String l : lineArr) {
            if (!originText.contains(l)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
