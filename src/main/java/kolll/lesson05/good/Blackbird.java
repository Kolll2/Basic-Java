package kolll.lesson05.good;

public class Blackbird extends Bird {

    public Blackbird(String name) {
        super(name);
    }

    @Override
    public void feed() {
        setFlying(true);
    }
}
