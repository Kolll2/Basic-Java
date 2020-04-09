package kolll.lesson06.bird;

public class Crow extends Bird {

    public Crow(String name) {
        super(name);
    }

    @Override
    public void feed() {
        setFlying(false);
    }
}
