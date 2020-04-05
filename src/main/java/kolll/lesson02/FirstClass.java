package kolll.lesson02;

/**
 * repeating classes and their interactions
 */

public class FirstClass {

    int size = 8;

    public void  printBinary (long value){
        for (int i = size-1; i >= 0 ; i--) {
            long mask = 1 << i;
            long result = (mask & value) >> i;
            System.out.print(result);
        }

        System.out.println( " => " + value);
    }
}
