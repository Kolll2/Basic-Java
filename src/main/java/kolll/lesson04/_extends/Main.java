package kolll.lesson04._extends;

public class Main {
    public void printTime(LocalTimeSupplier timeSupplier){
        System.out.println("POSIX time: " + timeSupplier.getTime());
    }

    public static void main(String[] args) {
        LocalTimeSupplier timeSupplier = new LocalTimeSupplier();
        new Main().printTime(timeSupplier);
    }
}
