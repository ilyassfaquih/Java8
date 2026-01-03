package product1;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {

        List<Produit> stock = Arrays.asList(
                new Produit(1, "PC Portable", 8000, "HighTech"),
                new Produit(2, "Souris", 150, "HighTech"),
                new Produit(3, "Chaise Bureau", 1200, "Meuble"),
                new Produit(4, "Clavier Gamer", 400, "HighTech"),
                new Produit(5, "Ecran 24", 1800, "HighTech"),
                new Produit(6, "Table", 900, "Meuble")
        );


        Double total = stock.stream()

                .mapToDouble(e -> e.getPrix())


                .average()
                .orElse(0.0);

        System.out.println( "total: " + total + " DH");
    }
}