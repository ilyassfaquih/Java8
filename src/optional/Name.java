package optional;

import java.util.Optional;

public class Name {
    public static void main(String[] args) {

        String name = null;


        Optional<String> optName = Optional.ofNullable(name);


        if (optName.isPresent()) {

            System.out.println("name : " + optName.get().toUpperCase());

        } else {

            System.out.println("makaynach");
        }
    }
}