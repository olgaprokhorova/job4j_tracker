package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class SortItemTest {

    @Test
    public void whenSortById() {
        Tracker tracker = new Tracker();
        List<Item> items = Arrays.asList(
                tracker.add(new Item("One")),
                tracker.add(new Item("Two")),
                tracker.add(new Item("Three"))
                );
        Collections.sort(items, new SortByIdItem());
        assertThat(items.get(0).getName(), is("One"));
    }

    @Test
    public void whenSortByIdReverse() {
        Tracker tracker = new Tracker();
        List<Item> items = Arrays.asList(
                tracker.add(new Item("One")),
                tracker.add(new Item("Two")),
                tracker.add(new Item("Three"))
        );
        Collections.sort(items, new SortByIDReverseItem());
        assertThat(items.get(0).getName(), is("Three"));
    }

    @Test
    public void whenSortByName() {
        Tracker tracker = new Tracker();
        List<Item> items = Arrays.asList(
                tracker.add(new Item("One")),
                tracker.add(new Item("Two")),
                tracker.add(new Item("Three"))
        );
        Collections.sort(items, new SortByNameItem());
        assertThat(items.get(0).getName(), is("One"));
    }

    @Test
    public void whenSortByNameReverse() {
        Tracker tracker = new Tracker();
        List<Item> items = Arrays.asList(
                tracker.add(new Item("One")),
                tracker.add(new Item("Two")),
                tracker.add(new Item("Three"))
        );
        Collections.sort(items, new SortByNameReverseItem());
        assertThat(items.get(0).getName(), is("Two"));
    }
}