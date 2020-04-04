package kolll.lesson01;

public class TypeConversion {
    public static void main(String[] args) {

        byteToAll();

    }

    public static void byteToAll() {
        byte a = 125;
        System.out.println("byte a = " + a);
        short aShort = a;
        System.out.println("byte = > short = " + aShort);
        int aInt = a;
        System.out.println("byte = > integer = " + aInt);
        long aLong = a;
        System.out.println("byte = > long = " + aLong);
        double aFloat = a;
        System.out.println("byte = > float = " + aFloat);
        double aDouble = a;
        System.out.println("byte = > double = " + aDouble);
    }
}
