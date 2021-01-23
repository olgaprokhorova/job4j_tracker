package ru.job4j.pojo;

public class Shop {
    public static int indexOfNull(Product[] product) {
        int index = -1;
        for (int i = 0; i < product.length; i++) {
            if (product[i] == null) {
                index = i;
                break;
            }
        }
        return index;
    }
}
