package kolll.lesson04.generics;

/**
 * Дженерики в рантайме отсутствуют
 * При разработке определенного участка кода, вместо заренее
 * заданной сигнатуры класса мы используем параметр, который
 * может принять может принять значение типа данных (сигнатуру)
 *
 * + написание универсальных алгоритмов
 * + облегчает проверку типов на этапе компиляции
 *
 * - Дженерики не позволяют работать с примитивными типами (можно работать со ссылочными типами (Integer, Long))
 */
public class Main {
    public static void main(String[] args) {
        GenericExample<Integer> integerGeneric = new GenericExample<Integer>(100);
        System.out.println(integerGeneric.getValue());
        GenericExample<String> stringGeneric = new GenericExample<String>("Hello");
        System.out.println(stringGeneric.getValue());

    }
}
