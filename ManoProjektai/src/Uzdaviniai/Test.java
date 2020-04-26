package Uzdaviniai;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite prasau du skaicius ir veiksma koki norite su jais atlikti, pvz. 2 + 2: ");
        String linija = scanner.nextLine();
        String[] naria = linija.split(" ");

        int pirmasSkaicius = (int) NumberUtils.getCorrectNumber(scanner, naria[0]);
        int antrasSkaicius = (int) NumberUtils.getCorrectNumber(scanner, naria[2]);

        reikalingaAkcija(naria[1], pirmasSkaicius, antrasSkaicius, scanner);

    }

    private static void reikalingaAkcija(String action, int pirmasSkaicius, int antrasSkaicius, Scanner scanner) {
        Skaiciuotuvas calculator = new Skaiciuotuvas(pirmasSkaicius, antrasSkaicius);
        switch (action) {
            case "+":
                System.out.println("Pridejus pirma ir antra skaicius gausime: " + calculator.sudetis(scanner));
                break;
            case "-":
                System.out.println("Atemus pirma is antro skaiciu gausime: " + calculator.atimtis(scanner));
                break;
            default:
                System.out.println("Tokio veiksmo nera, programos pabaga!");
                break;
        }
    }

}


