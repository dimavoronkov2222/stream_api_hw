package src;
import java.util.*;
public class task4 {
    public static void main(String[] args) {
        List<Projector> projectors = Arrays.asList(
                new Projector("ProjA", 2023, 599.99, "Sony"),
                new Projector("ProjB", 2022, 499.99, "Epson"),
                new Projector("ProjC", 2023, 799.99, "Sony")
        );
        projectors.stream().forEach(System.out::println);
        System.out.println("Projectors by Sony:");
        projectors.stream().filter(p -> p.manufacturer.equalsIgnoreCase("Sony")).forEach(System.out::println);
        System.out.println("Projectors from 2023:");
        projectors.stream().filter(p -> p.year == 2023).forEach(System.out::println);
        System.out.println("Projectors more expensive than 600:");
        projectors.stream().filter(p -> p.price > 600).forEach(System.out::println);
        System.out.println("Projectors sorted by price ascending:");
        projectors.stream().sorted(Comparator.comparingDouble(p -> p.price)).forEach(System.out::println);
        System.out.println("Projectors sorted by price descending:");
        projectors.stream().sorted((p1, p2) -> Double.compare(p2.price, p1.price)).forEach(System.out::println);
        System.out.println("Projectors sorted by year ascending:");
        projectors.stream().sorted(Comparator.comparingInt(p -> p.year)).forEach(System.out::println);
        System.out.println("Projectors sorted by year descending:");
        projectors.stream().sorted((p1, p2) -> Integer.compare(p2.year, p1.year)).forEach(System.out::println);
    }
}
