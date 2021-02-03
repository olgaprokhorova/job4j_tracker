package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    private final Output out;

    public FindByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find items by name ====");
        String name = input.askStr("Enter name: ");
        Item[] itemsByName = tracker.findByName(name);
        if (itemsByName.length > 0) {
            for (Item i : itemsByName) {
                out.println(i);
            }
        } else {
            out.println("Items with this name not found");
        }
        return true;
    }
}
