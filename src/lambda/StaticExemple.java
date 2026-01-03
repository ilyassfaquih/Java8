package lambda;

public class StaticExemple {
    private static Integer counter = 0;
    private String name;
    private Integer objectCounter = 1000;
    public StaticExemple(String name) {
        this.name = name;
        this.counter++;
        this.objectCounter++;

    }

    public Integer getObjectCounter() {
        return objectCounter;
    }

    public static void main(String[] args) {
        StaticExemple staticExemple = new StaticExemple("James Cameron");
        StaticExemple staticExemple2 = new StaticExemple("James");
        StaticExemple staticExemple3 = new StaticExemple("James");
        System.out.println(staticExemple2.getObjectCounter());
        System.out.println(StaticExemple.counter);
    }
}
