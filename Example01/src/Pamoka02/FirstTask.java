package Pamoka02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 2020 04 16 Andrius Paskauskas
 */
public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FirstTask firstTask = new FirstTask();

        int selection = 0;
        while (selection != 5) {
            System.out.println("1. Staciojo trikampio plotas\n2. Staciakampio plotas\n3. Kvadrato plotas\n4. Apskritimo plotas\n5. Baigti");
            selection = (int) NumberUtils.getCorrectNumber(scanner);
            switch (selection) {
                case 1:
                    firstTask.countTriangle(scanner);
                    break;
                case 2:
                    firstTask.countStaciakampis(scanner);
                    break;
                case 3:
                    firstTask.countKvadratas(scanner);
                    break;
                case 4:
                    firstTask.countApskritimas(scanner);
                    break;
                case 5:
                    System.out.println("Viso gero!");
                    break;
                default:
                    System.out.println("Tokio veiksmo nera!");
            }
        }
    }

    private void countTriangle(Scanner scanner) {
        System.out.println("Iveskite pirma statini: ");
        double a = NumberUtils.getCorrectNumber(scanner);
        System.out.println("Iveskite antra statini: ");
        double b = NumberUtils.getCorrectNumber(scanner);

        System.out.println("Trikampio plotas: " + a * b / 2);
    }

    private void countStaciakampis(Scanner scanner) {
        System.out.println("Iveskite pirma statini: ");
        double a = NumberUtils.getCorrectNumber(scanner);
        System.out.println("Iveskite antra statini: ");
        double b = NumberUtils.getCorrectNumber(scanner);

        System.out.println("Staciakampio plotas: " + a * b);
    }

    private void countKvadratas(Scanner scanner) {
        System.out.println("Iveskite statini: ");
        double a = NumberUtils.getCorrectNumber(scanner);

        System.out.println("Kvadrato plotas: " + a * 2);
    }

    private void countApskritimas(Scanner scanner) {
        System.out.println("Iveskite apskritimo ilgi: ");
        double a = NumberUtils.getCorrectNumber(scanner);
        double pi = 3.145;
        System.out.println("Apskritimo plotas: " + pi * (a * a));
    }


}