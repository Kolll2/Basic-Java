package kolll.lesson01;

public class BitwiseOperation {
    public static void main(String[] args) {

       // bitwiseLogicalOperators();

        bitwiseShifts();

    }

    private static void bitwiseShifts() {

        int a = 1;

        printBinary(a,8);

        a = a << 1;

        printBinary(a,8);

        a = a << 4;

        printBinary(a,8);

        a= ~a;

        printBinary(a, 8);

    }

    private static void bitwiseLogicalOperators() {
        int a = 9;
        printBinary(a,4);
        int b = 5;
        printBinary(b,4);
        System.out.println(" & ");
        printBinary(a,4);
        printBinary(b,4);
        printBinary(a & b, 4);

        System.out.println(" | ");
        printBinary(a,4);
        printBinary(b,4);
        printBinary(a | b, 4);
        System.out.println(" ^ ");
        printBinary(a,4);
        printBinary(b,4);
        printBinary(a ^ b, 4);

        System.out.println(" Swap ");

        printBinary(a,4);
        printBinary(b,4);

        a = a^b;
        b = a^b;
        a = a^b;

        printBinary(a,4);
        printBinary(b,4);
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
