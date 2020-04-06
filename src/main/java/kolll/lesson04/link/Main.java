package kolll.lesson04.link;

public class Main {
    public static void main(String[] args) {
        TimeSupplierInterface timeSupplier = new TimeSupplierImpl();
        TimeHolder timeHolder = new TimeHolder(timeSupplier);
        timeHolder.printTime();
    }
}
