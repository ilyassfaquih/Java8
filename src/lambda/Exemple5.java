package lambda;
import java.util.function.Predicate;
public class Exemple5 {
    public static void main(String[] args) {
        Predicate<String> estTropLong = (str) -> str.length() > 5;

        System.out.println(estTropLong.test("Bonjour")); // true
        System.out.println(estTropLong.test("Java"));    // false
    }
}
