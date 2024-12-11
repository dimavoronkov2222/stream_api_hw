package src;
import java.util.*;
public class task2 {
    public static void main(String[] args) {
        List<String> products = Arrays.asList("Milk", "Bread", "Cheese", "Milk", "Butter");
        Scanner scanner = new Scanner(System.in);
        products.stream().forEach(System.out::println);
        System.out.println("Products with less than 5 characters:");
        products.stream().filter(p -> p.length() < 5).forEach(System.out::println);
        System.out.print("Enter product name to count: ");
        String input = scanner.nextLine();
        long count = products.stream().filter(p -> p.equalsIgnoreCase(input)).count();
        System.out.println("Count of " + input + ": " + count);
        System.out.print("Enter starting letter: ");
        char letter = scanner.nextLine().charAt(0);
        products.stream().filter(p -> p.startsWith(String.valueOf(letter))).forEach(System.out::println);
        System.out.println("Products in category 'Milk':");
        products.stream().filter(p -> p.equalsIgnoreCase("Milk")).forEach(System.out::println);
    }
}