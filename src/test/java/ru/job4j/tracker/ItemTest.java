package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ItemTest {

    @Test
    void whenAscendSortItems() {
        Item first = new Item("first", 1);
        Item second = new Item("second", 2);
        Item third = new Item("third", 3);
        List<Item> items = Arrays.asList(second, third, first);
        items.sort(new ItemAscByName());
        List<Item> expected = Arrays.asList(first, second, third);
        assertThat(items).isEqualTo(expected);
    }

    @Test
    void whenDescendSortItems() {
        Item first = new Item("first", 1);
        Item second = new Item("second", 2);
        Item third = new Item("third", 3);
        List<Item> items = Arrays.asList(second, third, first);
        items.sort(new ItemDescByName());
        List<Item> expected = Arrays.asList(third, second, first);
        assertThat(items).isEqualTo(expected);
    }
}
