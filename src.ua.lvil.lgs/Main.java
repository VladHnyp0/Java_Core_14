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

        List<Obbj> sortedList = new ArrayList<>(mySet);

        Collections.sort(sortedList);

        System.out.println("Відсортований список:");
        for (Obbj obj : sortedList) {
            System.out.println(obj);
        }
    }
}