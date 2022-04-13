package exercise_james.behavioral_design_pattern.implements_strategy;

import java.util.ArrayList;
import java.util.List;

public class SortedList {
    private SortStrategy sortStrategy;
    private List<String> items = new ArrayList<>();

    public void setSortStrategy(SortStrategy strategy) {
        this.sortStrategy = strategy;
    }

    public void add(String name) {
        items.add(name);
    }

    public void sort() {
        sortStrategy.sort(items);
    }
}
