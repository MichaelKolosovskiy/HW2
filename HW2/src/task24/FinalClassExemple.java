package task24;

public class FinalClassExemple {

    private final String name;

    private final int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    FinalClassExemple(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
