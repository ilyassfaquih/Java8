package product2;

import java.util.Arrays;
import java.util.List;
import java.util.Map; // ضروري
import java.util.stream.Collectors;

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

        // هنا السحر كلو: GroupingBy
        Map<String, List<Produit>> groups = stock.stream()
                .collect(Collectors.groupingBy(p -> p.getCategorie()));

        // نشوفو النتيجة
        System.out.println(groups);

        // غير باش نوريك كيفاش تقرا النتيجة بوضوح (ماشي ضروري تكتبها)
        groups.forEach((categorie, produits) -> {
            System.out.println("القسم: " + categorie);
            System.out.println("   السلعة: " + produits);
        });
    }
}