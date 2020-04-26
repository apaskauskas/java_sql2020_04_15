package Uzdaviniai;


import java.util.Scanner;

public class Skaiciuotuvas {
    private int pirmasSkaicius;
    private int antrasSkaicius;

    public Skaiciuotuvas(int pirmasSkaicius, int antrasSkaicius) {
        this.pirmasSkaicius = pirmasSkaicius;
        this.antrasSkaicius = antrasSkaicius;
    }

    public int sudetis(Scanner scanner) {
        while (antrasSkaicius == 0){
            System.out.println("Suvedete antra skaiciu kaip 0, prasau iveskite skaiciu is naujo: ");
        antrasSkaicius = (int) NumberUtils.getCorrectNumber(scanner);
        }
        return pirmasSkaicius + antrasSkaicius;
    }

    public int atimtis(Scanner scanner) {
        if (antrasSkaicius == 0){
            System.out.println("Suvedete antra skaiciu kaip 0, prasau iveskite skaiciu is naujo: ");
            antrasSkaicius = (int) NumberUtils.getCorrectNumber(scanner);}
        return pirmasSkaicius - antrasSkaicius;
    }

}


