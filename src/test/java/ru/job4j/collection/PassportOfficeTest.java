package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

public class PassportOfficeTest {
    @Test
    public void whenTestAddMethod() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport())).isEqualTo(citizen);
    }

    @Test
    public void whenDuplicateUsername() {
        Citizen citizenFirst = new Citizen("2f44a", "Petr Arsentev");
        Citizen citizenSecond = new Citizen("2f44a", "Alex Johns");
        PassportOffice office = new PassportOffice();
        office.add(citizenFirst);
        assertThat(office.add(citizenSecond)).isFalse();
    }
}