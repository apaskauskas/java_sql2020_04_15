import java.util.Scanner;

/**
 * 2020 04 15 Andrius Paskauskas pirma uzduotis
 */
public class Example {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String word;
        do {
            System.out.println("Iveskite zodi, jei ivesite zodi pabaiga programa baigsis: ");
            word = sc.nextLine();
            checkIfWordIsEven(word);
            System.out.println("A raidziu zodyje yra: " + countLetter(word, 'a'));

        } while (!"pabaiga".equalsIgnoreCase(word));
    }

    private static void checkIfWordIsEven(String word) {
        if (word.length() % 2 == 0) {
            System.out.println(String.format("Ivestas zodis %s yra lyginis", word));
        } else {
            System.out.println(String.format("Ivestas zodis %s yra nelyginis", word));
        }
    }

    private static int countLetter(String word, char letter) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (letter == word.charAt(i)) {
                count++;
            }
        }
        return count;
    }


}
