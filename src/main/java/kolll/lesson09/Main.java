package kolll.lesson09;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        System.out.println("Warning");
        System.err.println("Error");

        log.log(Level.INFO,"Info message");
    }
}
