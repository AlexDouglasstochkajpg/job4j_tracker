package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ConvertListTest {

    @Test
    public void whenTwoList() {
        List<int[]> list = new ArrayList<>();
        list.add(new int[] {1});
        list.add(new int[] {2, 3});
        List<Integer> result = ConvertList.convert(list);
        List<Integer> expected = Arrays.asList(1, 2, 3);
        assertThat(result).containsAll(expected);
    }
}