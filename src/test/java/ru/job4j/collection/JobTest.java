package ru.job4j.collection;

import org.junit.jupiter.api.Test;
import java.util.Comparator;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class JobTest {

    @Test
    public void whenAscByName() {
        Comparator<Job> nameAsc = new JobAscByName();
        int rsl = nameAsc.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenDescByName() {
        Comparator<Job> nameDesc = new JobDescByName();
        int rsl = nameDesc.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenAscByPriority() {
        Comparator<Job> priorityAsc = new JobAscByPriority();
        int rsl = priorityAsc.compare(
                new Job("Impl task", 1),
                new Job("Fix bug", 0)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenDescByPriority() {
        Comparator<Job> priorityDesc = new JobDescByPriority();
        int rsl = priorityDesc.compare(
                new Job("Impl task", 1),
                new Job("Fix bug", 0)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenAscByNameAndPriority() {
        Comparator<Job> nameAndPriorityAsc = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = nameAndPriorityAsc.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(0);
    }
}