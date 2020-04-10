package main.java.kolll.lesson06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class JUnit5Annotation {

    /*
    Эта аннотация означает, что метод является тестовым методом, не принимающий параметров.
     */
    @Test
    void helloJUnit5(){
        assertEquals(10, 5+5);
    }

    /*
    Параметризированные тесты позволяют выполнять тесты несколько раз с разными аргументами.
    Они объявляются так же, как и обычные методы @Test, но вместо этого используют аннотацию  @ParameterizedTest

    Кроме того, необходимо объявить, как минимум один источник, который будет предоставлять аргументы для
    каждого вызова, а затем использовать аргументы в методе тестирования.
     */

    @ParameterizedTest
    @ValueSource(strings = {"cali", "bali", "dani"})
    void endsWithI(String str){
        assertTrue(str.endsWith("i"));
    }
}
