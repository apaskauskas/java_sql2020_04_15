package days.four;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        listExample();
        setExample();
        mapExample();

        User user = new User();
    }

    private static void mapExample() {
        Map<Integer, String> cars = new HashMap<>();

        cars.put(1999, "Audi");
        cars.put(2000, "BMW");

        cars.keySet().forEach(k -> System.out.println("Metai " + k + " Markė " + cars.get(k)));
        System.out.println(cars.size());
        System.out.println(cars.containsValue("BMW"));

    }

    private static void setExample() {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(9);
        numbers.add(8);
        numbers.add(5);
        numbers.add(2);
        numbers.add(9);

        numbers.forEach(System.out::println);
    }

    private static void listExample() {
        List<String> names = new ArrayList<>();

        names.add("Andrius");
        names.add("Tadas");
        names.add("Jonas");
        names.add("Airina");

        System.out.println(names.size());
        System.out.println();
        System.out.println(names.get(2));
        System.out.println();
        names.forEach(System.out::println);
        System.out.println();
        System.out.println(names.contains("Jonas"));

    }
}
