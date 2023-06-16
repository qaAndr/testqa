package org.example.test;

import org.example.Calc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @ParameterizedTest(name = "#{index} - сложение {0} и {1}, ожидаем {2}")
    @CsvSource({"1, 2, 3", "3, 4, 7", "2, 3, 5"})
    @DisplayName("Проверка сложения")
    @Tag("TestSuite1")
    void summ1(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int result = calc.summ1(a, b);
        Assertions.assertEquals(expectedResult, result, "Не тот ответ");
    }

    @ParameterizedTest(name = "#{index} - вычитание {0} и {1}, ожидаем {2}")
    @CsvSource({"5, 2, 3", "8, 4, 4", "9, 7, 2"})
    @DisplayName("Проверка вычитания")
    @Tag("TestSuite2")
    void summ2(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int result = calc.summ2(a, b);
        Assertions.assertEquals(expectedResult, result, "Не тот ответ");
    }
}