package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class ListStream {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Ali","Mohammed", "Samia", "X", "Ilyas");
        List<String> smiyat = name.stream()
                .filter(e -> e.length() > 3 )
                .map(e -> e.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(smiyat);

    }
}
