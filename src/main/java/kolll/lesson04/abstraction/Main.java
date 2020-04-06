package kolll.lesson04.abstraction;

public class Main {
    public static void main(String[] args) {
        TimeSupplierInterface timeSupplier = new TimeSupplierImpl();
        printTime(timeSupplier);
    }

    public static void printTime(TimeSupplierInterface timeSupplier) {
        System.out.println("Time " + timeSupplier.getTime());
    }
}
