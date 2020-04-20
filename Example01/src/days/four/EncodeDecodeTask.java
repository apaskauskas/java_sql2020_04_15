package days.four;

import org.w3c.dom.ls.LSOutput;

import javax.sound.sampled.Line;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EncodeDecodeTask {

    private static Map<Integer, String> encode = new HashMap<>();

    public static void main(String[] args) {
        readcode(); // fill map with parameters
        List<Integer> letters = readLetter();
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer l : letters) {
            String value = encode.get(l);
            if (value != null) {
                stringBuilder.append(value.equals("tarpas") ? " " : value);
            }
        }
        System.out.println(stringBuilder.toString());
    }

    private static List<Integer> readLetter() {
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader bf = new BufferedReader(new FileReader("laiskas.txt"))) {
            String line;
            while ((line = bf.readLine()) != null) {
                String[] items = line.split(" ");
                for (String item : items) {
                    numbers.add(Integer.valueOf(item));
                }
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
        return numbers;
    }

    private static void readcode() {
        // read file from road directory
        // try () using for close stream in any case
        try (BufferedReader bf = new BufferedReader(new FileReader("koduote.txt"))) {
            String line;
            //read line by line
            while ((line = bf.readLine()) != null) {
                //Split by line
                String[] items = line.split(" ");
                //Integer.valueOf convert String to Integer
                encode.put(Integer.valueOf(items[0]), items[1]);
            }
        } catch (IOException e) {
            System.out.println("Klaida nuskaitant faila " + e.getMessage());
        }
    }


}
