package lambda;

import java.util.function.Supplier;

public class ExerciceSupplier {
    public static void main(String[] args) {

        // Supplier : ne prend aucun argument (), mais retourne un résultat
        Supplier<Double> generateurAleatoire = () -> Math.random();

        // On utilise .get() pour déclencher le supplier et obtenir la valeur
        System.out.println("Nombre aléatoire généré : " + generateurAleatoire.get());

        // On peut l'appeler plusieurs fois
        System.out.println("Autre nombre : " + generateurAleatoire.get());
    }
}