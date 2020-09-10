package kolll.lesson11;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class SimpleDateFormatTestTest {
    SimpleDateFormatTest sdft = new SimpleDateFormatTest();
    String datePattern = "(\\d{1,4})-(1[012]|[1-9])-(3[01]|2[0-9]|1[0-9]|[1-9])";

    @Test
    @RepeatedTest(value = 30, name = "{displayName} {currentRepetition}/{totalRepetitions}")
    void getRandomDate() {
        assertTrue(Pattern.matches(String.valueOf(datePattern), sdft.getRandomDate()));
    }
}