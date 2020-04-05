package kolll.lesson03;

import java.util.HashMap;

public class TestString {

    public static void main(String[] args) {
        String s = "Hello";
        String t = new String(s);
        int i = 0;

        HashMap<Object, String > hashMap;
        int[] im;


        System.out.println(s);
        System.out.println(t);

        if ("Hello".equals(s)) System.out.println("one");
        if (t == s) System.out.println("two");
        if (t.equals(s)) System.out.println("three");
        if ("Hello" == s) System.out.println("four");
        if ("Hello" == t) System.out.println("five");
    }

    /**
     * Object
     *  == and equals()
     *  hashCode();
     *  array[], arrayArray[][]
     *  array primitive variables is Object (linked type)
     *
     */



}
