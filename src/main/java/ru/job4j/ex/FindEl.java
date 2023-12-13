package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                result = i;
            }
        }
        if (result == -1) {
            throw new ElementNotFoundException("Этого элемента нет в массиве");
        }
        return result;
    }

    public static void main(String[] args) {
        String[] values = {"Hi", "Hello"};
        try {
            indexOf(values, "Goodbye");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
