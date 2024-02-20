import java.util.*;
public class Main {
    public static void main(String[] args) {
        LinkedList<Fruit> fruits = new LinkedList<>();

        fruits.add(new Fruit("Mela"));
        fruits.add(new Fruit("Pera"));
        fruits.add(new Fruit("Pesca"));

        System.out.println(fruits);

        fruits.addFirst(new Fruit("Banana"));
        fruits.addLast(new Fruit("Arancia"));

        System.out.println(fruits);
    }
}