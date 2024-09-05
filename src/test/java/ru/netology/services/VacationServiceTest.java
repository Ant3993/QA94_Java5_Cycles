package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class VacationServiceTest {
    @Test
    public void testVacationServiceType1() {
        VacationService service = new VacationService();
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;

        int result = service.calculate(income, expenses, threshold);
        int expected = 3;
        Assertions.assertEquals(result, expected);
    }

    @Test
    public void testVacationServiceType2() {
        VacationService service = new VacationService();
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;

        int result = service.calculate(income, expenses, threshold);
        int expected = 2;
        Assertions.assertEquals(result, expected);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "data_testParams.csv")
    public void testParams(int income, int expenses, int threshold, int expected) {
        VacationService service = new VacationService();
        int result = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(result, expected);
    }

}