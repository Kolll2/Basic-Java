package kolll.lesson04.generics;

import java.util.List;

public class GenericMethod {
    public <T> T getFirstList (List<T> list){
        return list.get(0);
    }
}
