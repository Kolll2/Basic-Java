package main.java.kolll.lesson06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import kolll.lesson06.bird.Bird;
import kolll.lesson06.bird.Crow;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class BirdTest {

    @Test
    @DisplayName("name == Mag")
    public void nameTest(){
        Bird bird = new Crow("Mag");
        assertEquals("Mag", bird.getName());
    }
}
