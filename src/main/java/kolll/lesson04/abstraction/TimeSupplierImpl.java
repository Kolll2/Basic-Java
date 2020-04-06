package kolll.lesson04.abstraction;

public class TimeSupplierImpl implements TimeSupplierInterface {
    public long getTime() {
        return System.currentTimeMillis()/1000;
    }
}
