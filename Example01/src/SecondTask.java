import java.util.Scanner;

/**
 * 2020 04 20 Andrius Paškauskas Uzdavinys 02
 * Jonukas mokykloje gavo užduotį patikrinti ar duoti terminai yra polindromai. Jam sunku pačiam tai padaryti todėl jis
 * prašo Jūsų pagalbos. Parašykite metodą kuris patikrintų ar duotas žodis yra polindromas (žodis ar sakinys kurį
 * skaitant nuo galo gaunamas tas pats žodis ar sakinys, pvz. “KOL EINU ŠUNIE LOK”, “ARGI TEN NE TIGRA” ,
 * “SĖDĖK UŽU KĖDĖS”). Užuomina: pašalinti tarpus ir tuomet keliauti per pusę žodžio iš abiejų pusių tikrinant ar
 * sutampa raidės.
 */

public class SecondTask {
    public static void main(String[] args) {
        System.out.println("Polindromą, o mezs patikrinsime: ");
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine().replaceAll(" ", "");
        if (isPalindrome(word)) {
            System.out.println("Polindromas");

        } else {
            System.out.println("Zodis nera palindromas");
        }
    }

    private static boolean isPalindrome(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

