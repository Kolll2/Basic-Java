package kolll.lesson11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class SimpleDateFormatTest {

    Random random = new Random();

    public static void test1() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        String dateString = format.format(new Date());
        Date date = format.parse("2009-12-31");
    }

    public String getRandomDate() {
        Integer year = random.nextInt(9999);
        Integer mouth = random.nextInt(11) + 1;
        Integer day = getRandomDay(year, mouth);
        return null;
    }

    private Integer getRandomDay(Integer year, Integer mouth) {
        switch (mouth) {
            case (1):
            case (3):
            case (5):
            case (7):
            case (8):
            case (10):
            case (12):
                return random.nextInt(30) + 1;
            case (4):
            case (6):
            case (9):
            case (11):
                return random.nextInt(29) + 1;
        }
        return getRandomFebruaryDay(year);
    }

    private Integer getRandomFebruaryDay (Integer year){

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            return random.nextInt(28) + 1;
        }
        return random.nextInt(27)+1;
    }
}
