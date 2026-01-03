package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        List<String> noms = new ArrayList<>();
        noms.add("Ilyas");
        noms.add("Jo");
        noms.add("Mohammed");

// Predicate : Est-ce que la longueur du nom est supérieure à 3 ?
// removeIf utilise une lambda qui retourne Vrai ou Faux
        noms.removeIf(nom -> nom.length() <= 3);

        System.out.println(noms); // Il ne restera que "Ilyas" et "Mohammed"
    }
}
