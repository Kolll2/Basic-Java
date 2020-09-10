package kolll.lesson11;

// Формат даты и времени

// SimpleDateFormat

import java.text.SimpleDateFormat;

/**
 * Look up test folder
 */

public class Main {
    public static void main(String[] args) {

        SimpleDateFormatTest sdft = new SimpleDateFormatTest();

        for (int i = 0; i < 30 ; i++) {
            System.out.println(sdft.getRandomDate());
        }


    }
}
