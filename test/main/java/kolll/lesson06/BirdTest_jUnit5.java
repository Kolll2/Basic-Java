package main.java.kolll.lesson06;

import kolll.lesson06.bird.Bird;
import kolll.lesson06.bird.Crow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
import org.junit.jupiter.api.Test;

public class BirdTest_jUnit5 {

    private final Bird bird = new Crow("Dag");

    @Test
    void nameTest(){
//        Old version
        assertEquals("Dag", bird.getName());
//        New version
        assertAll("bird",
                () -> assertEquals("Dag", bird.getName()));

        assertAll("bird",
                () -> assertEquals("Dag", bird.getName()),
                () -> assertEquals("Dag", bird.getName())
        );
    }
}
