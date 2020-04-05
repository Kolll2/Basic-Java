package kolll.lesson04.polymorphism;

public class POSIXTimeSupplier extends TimeSupplier {
    @Override
    public long getTime() {
        return super.getTime() / 1000;
    }
}
