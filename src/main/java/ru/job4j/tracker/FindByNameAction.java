package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find items by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item[] itemsByName = tracker.findByName(name);
        if (itemsByName.length > 0) {
            for (Item i : itemsByName) {
                System.out.println(i);
            }
        } else {
            System.out.println("Items with this name not found");
        }
        return true;
    }
}
