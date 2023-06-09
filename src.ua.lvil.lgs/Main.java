import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Obbj> mySet = new HashSet<>();

        mySet.add(new Obbj("Object1", 5));
        mySet.add(new Obbj("Object2", 2));
        mySet.add(new Obbj("Object3", 9));
        mySet.add(new Obbj("Object4", 1));

        System.out.println("Невідсортований список:");
        for (Obbj obj : mySet) {
            System.out.println(obj);
        }

        Set<Obbj> mySet1 = new TreeSet<Obbj>();

        mySet1.add(new Obbj("Object1", 5));
        mySet1.add(new Obbj("Object2", 2));
        mySet1.add(new Obbj("Object3", 9));
        mySet1.add(new Obbj("Object4", 1));

        System.out.println("Відсортований список:");
        for (Obbj arbitrarilyClassItem : mySet1) {
            System.out.println(arbitrarilyClassItem);
        }
    }
}