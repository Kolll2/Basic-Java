package kolll.lesson04.generics;

public class GenericExample<T> {
    private T value;

    public GenericExample(T value) {
        this.value = value;
    }

    public T getValue(){
        return value;
    }
}
