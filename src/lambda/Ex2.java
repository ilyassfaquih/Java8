package lambda;

import java.util.*;

public class Ex2 {
    public static void main(String[] args) {
        List<String> mots = new ArrayList<>(Arrays.asList("Java", "c", "Python", "C++", "ada"));
        mots.sort((a, b) -> a.compareToIgnoreCase(b));
        mots.forEach(s -> System.out.println(s));
    }
}
