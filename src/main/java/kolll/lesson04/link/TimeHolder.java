package kolll.lesson04.link;

//design patterns strategy

public class TimeHolder {
    private TimeSupplierInterface timeSupplier;

    public TimeHolder(TimeSupplierInterface timeSupplier) {
        this.timeSupplier = timeSupplier;
    }

    public void printTime() {
        System.out.println("POSIX: " + timeSupplier.getTime());
    }
}
