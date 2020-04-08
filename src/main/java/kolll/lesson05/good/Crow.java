package kolll.lesson05.good;

public class Crow extends Bird {

    public Crow(String name) {
        super(name);
    }

    @Override
    public void feed() {
        setFlying(false);
    }
}
