package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class FactorialTest {

    @Test
    public void whenExceptionFactorial() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new Factorial().calc(-2);
                });
        assertThat(exception.getMessage()).isEqualTo("N could not be less than 0");
    }
}