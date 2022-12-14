package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqr.csv")

    public void test(int lowLimit, int topLimit, int countExpected){
        SQRService service = new SQRService();
        int countActual = service.countOfSqrFor(lowLimit, topLimit);
        Assertions.assertEquals(countExpected, countActual);
    }
}
