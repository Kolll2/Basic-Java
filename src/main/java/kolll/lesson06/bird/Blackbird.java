package kolll.lesson06.bird;

public class Blackbird extends Bird {

    public Blackbird(String name) {
        super(name);
    }

    @Override
    public void feed() {
        setFlying(true);
    }
}
