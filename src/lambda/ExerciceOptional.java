package lambda;

import java.util.Optional;

public class ExerciceOptional {

    public static void main(String[] args) {

        // ---------------------------------------------------------
        // ETAPE 1 : La donnée dangereuse (c'est null !)
        // ---------------------------------------------------------
        String emailInterdit = null;
        System.out.println("1. J'ai un email qui est : " + emailInterdit);


        // ---------------------------------------------------------
        // ETAPE 2 : On met la donnée dans la BOÎTE (Optional)
        // ---------------------------------------------------------
        // "ofNullable" veut dire : "Met le truc dans la boîte, même si c'est null"
        Optional<String> laBoite = Optional.ofNullable(emailInterdit);

        System.out.println("2. J'ai mis l'email dans la boîte de sécurité.");


        // ---------------------------------------------------------
        // ETAPE 3 : On récupère la valeur en toute sécurité
        // ---------------------------------------------------------
        // "orElse" veut dire : "Ouvre la boîte. Si elle est vide, donne-moi le texte entre parenthèses".
        String resultat = laBoite.orElse("Email par défaut (car c'était vide)");


        // ---------------------------------------------------------
        // ETAPE 4 : On affiche le résultat final
        // ---------------------------------------------------------
        System.out.println("3. Résultat final : " + resultat);
    }
}