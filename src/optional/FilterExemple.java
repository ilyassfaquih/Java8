package optional;

import java.util.Optional;

public class FilterExemple {
    public static void main(String[] args) {

        String name = "ilyas";
        Optional<String> optName = Optional.ofNullable(name);

        String  result = optName
                .filter(s -> s.length() > 4)
                .map(s -> s.toUpperCase())
                .orElse("Refusé ");

        System.out.println("resultat: " + result);
    }
}