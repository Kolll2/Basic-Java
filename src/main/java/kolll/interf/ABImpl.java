package kolll.interf;

import java.util.Hashtable;

public class ABImpl implements A, B {

    public static void main(String[] args) {
        ABImpl temp = new ABImpl();
        A tempA = new ABImpl();
        B tempB = (B) new ABImpl();

        System.out.println("Cast to A " + tempA.getInner());
        System.out.println("Cast to B " + tempB.getInner());
        System.out.println(temp.getInner());

        Object obj = new Object();
        Hashtable<Object, Integer> hashtable = new Hashtable<>();

        nodeListTest();
    }

    private static void nodeListTest() {

        NodeList nodeList1 = new NodeList(1);
        NodeList nodeList2 = new NodeList(2);
        NodeList nodeList3 = new NodeList(3);
        NodeList nodeList4 = new NodeList(4);

        System.out.println(nodeList1 + " " + nodeList2 + " " + nodeList3 + " " + nodeList4);

        nodeList1.setNext(nodeList2); // to 2
        nodeList2.setNext(nodeList3); // to 3
        nodeList3.setNext(nodeList4); // to null


        NodeList.reverse(nodeList1);
        System.out.println(nodeList1 + " " + nodeList2 + " " + nodeList3 + " " + nodeList4);
    }

    @Override
    public int getInner() {
        return (A.INNER + B.INNER) / 2;
    }
}
