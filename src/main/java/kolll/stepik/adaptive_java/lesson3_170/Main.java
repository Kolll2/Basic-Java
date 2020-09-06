package kolll.stepik.adaptive_java.lesson3_170;

/*
    3.170 Behaviour parametrization with lambda expressions
    You have a class Account (number: String, balance: Long, isLocked: boolean), the list accounts of type List<Account> and the method filter(List<T> elems, Predicate<T> predicate) for filtering the given list of type T by the predicate.

    The class Account has the next methods: getNumber(), getBalance(), isLocked() for getting the values of the corresponding fields.

    Write a code for filtering the accounts list in two ways:

    get list with all non-empty accounts (balance > 0) and save it to the variable nonEmptyAccounts
    get all non-locked accounts with too much money (balance >= 100 000 000) and save it to the variable accountsWithTooMuchMoney
    The class Account, the list accounts (List<Account>) and the method filter(...) will be available during testing.

    Important. Use the given code template for your solution. Do not change it!

    Example of use the filter method. The code below gets only even number from the list.

    List<Integer> numbers = ...List<Integer> evenNumbers = filter(numbers, number -> number % 2 == 0);

    PS: it's often called behaviour parametrization because behaviour of the method filter is dependent of the given predicate.
 */

import kolll.lesson04._extends.test01.A;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    static List<Account> accounts = new ArrayList<>();

    public static void main(String[] args) {
        // you need to filter List<Account> accounts
    Main main = new Main();
    main.init();
    List<Account> nonEmptyAccounts = filter(accounts, a -> a.getBalance()>0);

    List<Account> accountsWithTooMuchMoney = filter(accounts, a -> !a.isLocked()&&a.getBalance()>=100000000);

   // nonEmptyAccounts.forEach(Account::printAccount);
    accountsWithTooMuchMoney.forEach(Account::printAccount);

//    with using separate predicates

//    List<Account> nonEmptyAccounts = filter(accounts, acc -> acc.getBalance() > 0L);
//
//    Predicate<Account> notLocked = acc -> !acc.isLocked();
//    Predicate<Account> tooMuch = acc -> acc.getBalance() >= 100_000_000L;
//
//    List<Account> accountsWithTooMuchMoney = filter(accounts,
//            notLocked.and(tooMuch));

    }


    private static List<Account> filter (List<Account> elems, Predicate<Account> predicate){
        return elems.stream().filter(predicate).collect(Collectors.toList());
    }

    private void init (){
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            accounts.add(new Account(String.valueOf(i), random.nextLong(), random.nextBoolean()));
        }
    }
}
