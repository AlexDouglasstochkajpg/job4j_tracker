package ru.job4j.lombok;

public class LombokUsage {
    public static void main(String[] args) {
        var permission = Permission.of()
                .id(1)
                .name("Name")
                .rules("create")
                .rules("read")
                .rules("update")
                .rules("delete")
                .build();
        System.out.println(permission);
    }
}
