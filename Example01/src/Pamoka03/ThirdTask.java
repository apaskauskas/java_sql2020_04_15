package Pamoka03;

import java.util.Scanner;

/**
 * 2020 04 17 Andrius Paškauskas
 * Onutei sunkei sekasi mokytis matematiką ir ji neturi skaičiuotuvo, padėkite Onutei ir sukurkite skaičiuotuvą kuris
 * atliktu:
 * a.       Sumos
 * b.      Skirtumo
 * c.       Dalybos, nepamirškite, kad dalyba iš nulio negalima!
 * d.      Daugybos
 * e.       Kėlimas laipsniu
 * Skaičiuoto veiksmų skaičiavimai turi būti atskiroje klasėje. Onutei negalima leisti įvesti blogą skaičių ir netinkamą
 * operaciją reikia prašyti pakartoti įvedimą. Onutė įvedinės veiksmus tokiu formatu : „12 + 12“, „50 - 15“ ir t.t.
 */
public class ThirdTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite skaicius su veiksmu kuri norite atlikti: ");
        String line = scanner.nextLine();

        String[] items = line.split(" ");
        int firstNumber = Integer.parseInt(items[0]);
        int secondNumber = Integer.parseInt(items[2]);

        callRequiredAction(items[1], firstNumber, secondNumber);

    }

    private static void callRequiredAction(String action, int firstNumber, int secondNumber) {
        Calculator calculator = new Calculator(firstNumber, secondNumber);
        switch (action) {
            case "+":
                System.out.println("Suma yra: " + calculator.sum());
                break;
            case "-":
                System.out.println("Atemus yra: " + calculator.atimtis());
                break;
            case "/":
                if(secondNumber == 0){
                    System.out.println("Veiksmas negalimas");
                }else {
                    System.out.println("Padalinus yra: " + calculator.dalyba());
                }break;
            case "*":
                System.out.println("Padalinus yra: " + calculator.daugyba());
                break;
            case "^":
                System.out.println(String.format("Pakelus %d yra: %f", secondNumber, calculator.laipsnis()));
                break;
            default:
                System.out.println("Tokio veiksmo nera");
                break;
        }
    }

}
