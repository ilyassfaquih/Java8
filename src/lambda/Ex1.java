package lambda;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Pomme", "Banane", "Orange");

// Consumer : prend un fruit 'f' et l'affiche
        fruits.forEach(f -> System.out.println("J'aime la " + f));
    }
}
