package ru.netology.javaqa.HoweWork5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class aMonthRestTest {

    @Test
    public void aMonthRestTest() {
        aMonthsRest service = new aMonthsRest();
        int expected = 3;
        int actual = service.calculate(10_000, 3_000 , 20_000);

        Assertions.assertEquals(expected, actual);
    }


}
