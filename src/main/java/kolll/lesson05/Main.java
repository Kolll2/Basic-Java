package kolll.lesson05;

import kolll.lesson04._extends.test01.B;
import kolll.lesson05.bad.Bird;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = new Bird[]{
                new Bird("Crow"),
                new Bird("Blackbird")
        };
        new Main().printBirds(birds);
    }

    private void printBirds(Bird[] birds){
        for (int i=0; i< birds.length; i++){
            System.out.println(birds[i]);
        }
    }
}
