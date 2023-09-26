package ru.netology.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class RestTimeServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/testData.csv")
    public void testCalculationRestTime(int expected, int income, int expenses, int threshold) {
        RestTimeService restTimeService = new RestTimeService();

        int actual = restTimeService.calculate(income, expenses, threshold);

        assertEquals(expected, actual);
    }

}