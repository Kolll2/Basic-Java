package kolll.lesson02;

public class Main {


    public static void main(String[] args) {

        //create link FirstClass type, 32 bit (4 byte) on stack function Main
        FirstClass firstClass = null;

        //create in heap class FirstClass and 
        firstClass = new FirstClass();

        System.out.println(firstClass);

        System.out.println(firstClass.size);

        firstClass.printBinary(11);
    }

}
