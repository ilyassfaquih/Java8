package lambda;

import java.util.function.Consumer;

public class Exemple6 {
    public static void main(String[] args) {
        Consumer<String> afficheMajuscule = (str) -> System.out.println(str.toUpperCase());

        afficheMajuscule.accept("oussama"); // Affiche "JAVA"   // false
    }

}
