package src;
import java.util.*;
import java.util.stream.*;
public class task1 {
    public static void main(String[] args) {
        List<Integer> numbers = new Random().ints(50, -100, 100).boxed().collect(Collectors.toList());
        long positiveCount = numbers.stream().filter(n -> n > 0).count();
        long negativeCount = numbers.stream().filter(n -> n < 0).count();
        long twoDigitCount = numbers.stream().filter(n -> Math.abs(n) >= 10 && Math.abs(n) < 100).count();
        long mirrorCount = numbers.stream()
                .filter(n -> {
                    String str = String.valueOf(Math.abs(n));
                    return new StringBuilder(str).reverse().toString().equals(str);
                })
                .count();
        System.out.println("Positive count: " + positiveCount);
        System.out.println("Negative count: " + negativeCount);
        System.out.println("Two-digit count: " + twoDigitCount);
        System.out.println("Mirror count: " + mirrorCount);
    }
}