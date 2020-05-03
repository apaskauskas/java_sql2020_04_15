package Uzdaviniai;


public class TestMyApp {
    public static void main(String[] args) {
        Person person = new Person("Andrius", 12);
        System.out.println(person);
    }
}

public class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        age = age;
    }
   }
