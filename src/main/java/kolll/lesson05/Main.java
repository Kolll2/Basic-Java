package kolll.lesson05;

//import kolll.lesson05.bad.Bird;
import kolll.lesson05.good.Bird;
import kolll.lesson05.good.Blackbird;
import kolll.lesson05.good.Crow;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = new Bird[]{
                new Crow("Crow"),
                new Blackbird("Blackbird")
        };
        new Main().printBirds(birds);

    }

    private void printBirds(Bird[] birds){
        for (int i=0; i< birds.length; i++){
            System.out.println(birds[i]);
            birds[i].feed();
            System.out.println(birds[i]);
        }
    }
}
