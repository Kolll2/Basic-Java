package kolll.interf;

public interface A {
    final int INNER = 10;

    default int getInner(){
        return INNER;
    }
}
