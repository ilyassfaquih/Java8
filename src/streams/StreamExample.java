package streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ali", "Brahim", "Anas", "Said","Ayman");

        List<String> result = names.stream()
                .filter(s -> s.startsWith("A"))
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}