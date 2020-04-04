package kolll.lesson01;

/**Первое занятие
 * Разбираем примитивные переменные
 * 8 примитивный типов данных
 * ---------------------------
 * Размеры примитивных переменных
 *  byte(1), short(2), int(4), long(8),
 *  float(), double(),
 *  boolean() 
 */

public class PrimitiveVariables {
    public static void main(String[] args) {

        printByte();

        printInteger();

        printBoolean();

        printFloat();

        printDouble();

    }

    private static void printFloat() {
        float a = 0.123456789f;
        System.out.println("float a = > " + a);

    }

    private static void printDouble() {
        double a = 0.1234567890123456789d;
        System.out.println("double a = > " + a);
    }

    private static void printBoolean() {
        boolean a = true;
        System.out.println("a => " + a);
        boolean b = true;
        System.out.println("b => " + b);
    }

    private static void printInteger() {
        System.out.println(" ==== Print Integer ==== " );
        int a = 0;
        printBinary(a, 32);
        a = 32;
        printBinary(a, 32);
        a = Integer.MIN_VALUE;
        printBinary(a, 32);
        a = Integer.MAX_VALUE;
        printBinary(a, 32);
        a = -1;
        printBinary(a, 32);
    }

    private static void printByte() {
        System.out.println(" ==== Print Byte ==== " );
        byte a = 0;
        printBinary(a, 8);
        a = 64;
        printBinary(a, 8);
        a = 127;
        printBinary(a, 8);
        a = -1;
        printBinary(a, 8);
        a = -128;
        printBinary(a, 8);
    }

    private static void  printBinary (long value, int size){
        for (int i = size-1; i >= 0 ; i--) {
            long mask = 1 << i;
            long result = (mask & value) >> i;
            System.out.print(result);
        }

        System.out.println( " => " + value);
    }
}
