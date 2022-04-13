package exercise_james.behavioral_design_pattern.implements_strategy;

import java.util.List;

public interface SortStrategy {
    <T> void sort(List<T> items);
}
