package Pamoka03;

import Pamoka02.NumberUtils;

import java.util.Scanner;

public class SecondTask {
    private double kilometras;
    private double litras;
    public static void main(String[] args) {

        SecondTask secondTask = new SecondTask();
        secondTask.readRequiredUserData();
        System.out.println("Jusu automobilio kuro vidurkis: " + secondTask.countVidurkis());
    }
    private void readRequiredUserData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite kiek nuvaziuojate kilometru: ");
        kilometras = NumberUtils.getCorrectNumber(scanner);
        System.out.println("Iveskite koks yra sunaudoto kuro kiekis: ");
        litras = NumberUtils.getCorrectNumber(scanner);
    }
    private double countVidurkis() {

        return ((litras * 100) / kilometras);
    }
}
