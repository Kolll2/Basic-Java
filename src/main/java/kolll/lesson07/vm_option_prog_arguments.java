package kolll.lesson07;

import java.lang.ref.SoftReference;
import java.util.Arrays;

public class vm_option_prog_arguments {
    public static void main(String[] args) {
        //  Program arguments
        Arrays.stream(args).forEach(System.out::println);

        //VM option
        String threadCount = System.getProperty("threadCount", "5");
        System.out.println(threadCount);



        //VM option -Xmx128m (на все приложение с виртуальной машиной выделено 128 Мб оперативной памяти)
            //  Есть еще один параметр -Xms128m - стартовое колличество памяти
        //C:\Program Files\Java\jdk1.8.0_241\bin\java.exe" -DthreadCount=10 -Dsize=1000 -Xmx128m
        //Заполняет heap большими объектами по 4 Мб
        // выбрасывает исключение Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        //успевает инициализировать 29 объектов по 4 Мб = 116 Мб отведено на объекты,
        // остальное на поддержание Виртуальной машины и окружения
        //---------------------------
        //Исследуем работу сборщика мусора
        //-verbosegc параметр для вывода лога работы GC
        //Для наглядности смоделированы 2 ситуации
        //  1. Заполняем мвссив большими объектами связанные сильными ссылками, эмулируем утечку памяти
        //  2. Заполняем массив объектами связанные мягкими ссылками, которые
        //  при возникновении нехватки памяти убираются

        //-XX:+PrintFlagsFinal -version | grep -iE 'HeapSize|PermSize|ThreadStackSize'
        //  uintx InitialHeapSize                          := 134217728                           {product}
        //  uintx MaxHeapSize                              := 2116026368                          {product}
        //  uintx MaxMetaspaceExpansion                     = 5451776                             {product}
        //  uintx MaxMetaspaceSize                          = 4294901760                          {product}
        //  uintx MaxNewSize                               := 705167360                           {product}
        //  uintx YoungPLABSize                             = 4096                                {product}
        String stringSize = System.getProperty("size", "30");
        Integer size = Integer.valueOf(stringSize);
//        BigObject[] bigObjects = new BigObject[size];
        SoftReference[] softReferences = new SoftReference[size];

        for (int i = 0; i < size ; i++) {
            System.out.println(i);
            System.out.println((Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory())/1048576 + " Мб");
//            bigObjects[i] = new BigObject();
            softReferences[i] = new SoftReference(new BigObject());
        }

    }

    private static class BigObject {
        int [] bigArray = new int [1024*1024];

        public int[] getBigArray() {
            return bigArray;
        }
    }
}
