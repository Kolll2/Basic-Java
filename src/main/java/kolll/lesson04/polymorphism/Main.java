package kolll.lesson04.polymorphism;


public class Main {
    public static void main(String[] args) {
        TimeSupplier timeSupplier = new TimeSupplier();
        TimeSupplier posixTimeSupplier = new POSIXTimeSupplier();
        new Main().printTime(timeSupplier);
        new Main().printTime(posixTimeSupplier);
    }

    public void printTime(TimeSupplier timeSupplier) {
        System.out.println("POSIX time: " + timeSupplier.getTime());
    }
}
