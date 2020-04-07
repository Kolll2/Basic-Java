package kolll.lesson04._extends.test01;

public class Main {
    public static void main(String[] args) {
        A aB = new B();
        A aC = new C();
        B bB = new B();
        B bC = new C();
        C cC = new C();
        System.out.println(aB.sum(1,1) == 2);
//        System.out.println(bC.mult(1,2) == 2); not compiled
        System.out.println(aC.sum(1,1) == 2);
        System.out.println(bB.diff(1,2) == 1);
        System.out.println(bC.diff(1, 2) == 1);
    }
}
