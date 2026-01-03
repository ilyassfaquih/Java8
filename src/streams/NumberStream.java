package streams;

import java.util.*;
import java.util.stream.Collectors;

public class NumberStream {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 10)
                .collect(Collectors.toList());

        System.out.println("result is : " + result);
    }
}