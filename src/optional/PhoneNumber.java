package optional;

import java.util.Optional;

public class PhoneNumber {
    public static void main(String[] args) {

        // 1. هادي هي النمرة (مرة ديرها null، ومرة كتب فيها نمرة حقيقية باش تجرب)
        String numeroPhone = "0611223344";

        System.out.println("start");

        // المرحلة الأولى: حط النمرة وسط الصندوق
        // استعملنا ofNullable حيت النمرة تقدر تكون null
        Optional<String> sandouk = Optional.ofNullable(numeroPhone);

        // المرحلة الثانية: بغينا النمرة، وإلا ماكانتش، عطيني النمرة دالشركة
        // orElse كتعني: "يا إما عطيني لي فالصندوق، وإلا ماكانش خخود هادي"
        String finalNumber = sandouk.orElse("0522000000");

        // المرحلة الثالثة: طبع النتيجة
        System.out.println("your number is : " + finalNumber);

        System.out.println("End");
    }
}