package kolll.lesson05.good;

public abstract class Bird {
    private final String name;

    private boolean isFlying;


    public Bird(String name) {
        this.name = name;
        this.isFlying = false;
    }

    protected boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }

    public abstract void feed();

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", isFlying=" + isFlying +
                '}';
    }
}
