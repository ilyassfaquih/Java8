package optional;

import java.util.Optional;

public class NameLength {
    public static void main(String[] args) {

        String name = null;
        Optional<String> optName = Optional.ofNullable(name);


        Integer result = optName.map(s -> s.length()).orElse(0);


        System.out.println(" resultat: " + result);
    }
}