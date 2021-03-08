package ru.job4j.tracker;

import java.util.Comparator;

public class SortByIdItem implements Comparator<Item> {

    @Override
    public int compare(Item first, Item second) {
        Integer firstId = first.getId();
        Integer secondId = second.getId();
        return firstId.compareTo(secondId);
    }
}
