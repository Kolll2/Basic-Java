package kolll.interf;

public interface B {
    final int INNER = 20;

    default int getInner(){
        return INNER;
    }
}
