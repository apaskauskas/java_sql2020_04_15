/**
 *
 */
package homework;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite kiek norite ivesti skaiciu: ");
        int elementLength = scanner.nextInt();

        int[] mas = new int[elementLength];

        for (int i = 0; i < mas.length; i++) {
            System.out.println(String.format("Iveskite %d elementa: ", i));
            mas[i] = scanner.nextInt();
        }
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > 100) {
                System.out.println(mas[i]);
            }
        }

    }

}
