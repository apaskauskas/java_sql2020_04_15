package Pamoka03;

import Pamoka02.NumberUtils;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FirstTask {
    private double ugis;
    private double svoris;

    public static void main(String[] args) {

        FirstTask firsttask = new FirstTask();
        firsttask.readRequiredUserData();
        DecimalFormat decimalFormat = new DecimalFormat("00.00");
        System.out.println("Jusu KMI " + decimalFormat.format(firsttask.countKmi()));

    }

    private void readRequiredUserData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite savo ugi: ");
        ugis = NumberUtils.getCorrectNumber(scanner);
        System.out.println("Iveskite savo svori: ");
        svoris = NumberUtils.getCorrectNumber(scanner);
    }

    private double countKmi() {

        return svoris / Math.pow(ugis, 2);
    }

}
