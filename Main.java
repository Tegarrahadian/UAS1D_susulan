import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan Angka &  ");
        String input = scanner.nextLine();
        scanner.close();

        String[] pairs = input.split(",");
        for (String pair : pairs) {
            String[] parts = pair.split("=");
            String key = parts[0].trim();
            String value = parts[1].trim();
            numbers.add(key + "=" + value);
        }

        Collections.sort(numbers);

        System.out.println("ASCII table:");
        System.out.println("Dec  Char");
        System.out.println("---  ---");
        for (String number : numbers) {
            String[] parts = number.split("=");
            String key = parts[0].trim();
            int value = Integer.parseInt(parts[1].trim());
            System.out.printf("%3d   %c%n", value, value);
        }
        }
}
