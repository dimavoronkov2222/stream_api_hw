package src;
import java.util.*;
public class task3 {
    public static void main(String[] args) {
        List<Device> devices = Arrays.asList(
                new Device("Phone", 2020, 699.99, "Black", "Smartphone"),
                new Device("Laptop", 2019, 1200.00, "Silver", "Computer"),
                new Device("Tablet", 2021, 499.99, "White", "Tablet")
        );
        devices.stream().forEach(System.out::println);
        System.out.println("Devices of color Black:");
        devices.stream().filter(d -> d.color.equalsIgnoreCase("Black")).forEach(System.out::println);
        System.out.println("Devices from 2020:");
        devices.stream().filter(d -> d.year == 2020).forEach(System.out::println);
        System.out.println("Devices more expensive than 600:");
        devices.stream().filter(d -> d.price > 600).forEach(System.out::println);
        System.out.println("Devices of type 'Tablet':");
        devices.stream().filter(d -> d.type.equalsIgnoreCase("Tablet")).forEach(System.out::println);
        System.out.println("Devices released between 2019 and 2021:");
        devices.stream().filter(d -> d.year >= 2019 && d.year <= 2021).forEach(System.out::println);
    }
}
