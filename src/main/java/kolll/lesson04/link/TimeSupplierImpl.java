package kolll.lesson04.link;



public class TimeSupplierImpl implements TimeSupplierInterface {
    public long getTime() {
        return System.currentTimeMillis()/1000;
    }
}
